package org.xtext.example.mydsl.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.xtext.example.mydsl.mml.CSVParsingConfiguration;
import org.xtext.example.mydsl.mml.DT;
import org.xtext.example.mydsl.mml.DataInput;
import org.xtext.example.mydsl.mml.FormulaItem;
import org.xtext.example.mydsl.mml.FrameworkLang;
import org.xtext.example.mydsl.mml.LogisticRegression;
import org.xtext.example.mydsl.mml.MLAlgorithm;
import org.xtext.example.mydsl.mml.MLChoiceAlgorithm;
import org.xtext.example.mydsl.mml.MMLModel;
import org.xtext.example.mydsl.mml.RFormula;
import org.xtext.example.mydsl.mml.RandomForest;
import org.xtext.example.mydsl.mml.SVM;
import org.xtext.example.mydsl.mml.SVMClassification;
import org.xtext.example.mydsl.mml.SVMKernel;
import org.xtext.example.mydsl.mml.StratificationMethod;
import org.xtext.example.mydsl.mml.TrainingTest;
import org.xtext.example.mydsl.mml.Validation;
import org.xtext.example.mydsl.mml.ValidationMetric;

import com.google.common.io.Files;
import com.google.inject.Inject;

@ExtendWith(InjectionExtension.class)
@InjectWith(MmlInjectorProvider.class)
public class MmlParsingJavaTest {

	@Inject
	ParseHelper<MMLModel> parseHelper;
	
	@Test
	public void loadModel() throws Exception {
		MMLModel result = parseHelper.parse("datainput \"foo.csv\"\n"
				+ "mlframework scikit-learn\n"
				+ "algorithm DT\n"
				+ "TrainingTest { percentageTraining 70 }\n"
				+ "recall\n"
				+ "");
		Assertions.assertNotNull(result);
		EList<Resource.Diagnostic> errors = result.eResource().getErrors();
		Assertions.assertTrue(errors.isEmpty(), "Unexpected errors");			
		Assertions.assertEquals("foo.csv", result.getInput().getFilelocation());			
		
	}		
	
	@Test
	public void compileDataInput() throws Exception {
		MMLModel result = parseHelper.parse("datainput \"iris.csv\" separator ,\n"
				+ "mlframework scikit-learn\n"
				+ "algorithm SVM\n"
				+ "TrainingTest { percentageTraining 70 }\n"
				+ "accuracy\n"
				+ "recall\n"
				+ "");
		DataInput dataInput = result.getInput();
		String fileLocation = dataInput.getFilelocation();
		String pythonImport = "import pandas as pd\n"; 
		String DEFAULT_COLUMN_SEPARATOR = ","; // by default
		String csv_separator = DEFAULT_COLUMN_SEPARATOR;
		CSVParsingConfiguration parsingInstruction = dataInput.getParsingInstruction();
		if (parsingInstruction != null) {			
			System.err.println("parsing instruction..." + parsingInstruction);
			csv_separator = parsingInstruction.getSep().toString();
		}
		String csvReading = "mml_data = pd.read_csv(" + mkValueInSingleQuote(fileLocation) + ", sep=" + mkValueInSingleQuote(csv_separator) + ")\n";						
		String pandasCode = csvReading;

		RFormula formula = result.getFormula();
		
		if (formula != null) {
			FormulaItem var_Y = formula.getPredictive();
			String nom_y = var_Y.getColName();	
			String var_code = "y = mml_data.loc[:,['" + var_Y +"']]\n" +
							 "X =  mml_data.drop(['"+ var_Y +"'], axis=1)\n";
			pandasCode += var_code;
		}
		else {
			String var_code = "y = mml_data.iloc[:,len(mml_data.columns)-1]\n" +
							 "X =  mml_data.drop(mml_data.columns[len(mml_data.columns)-1], axis=1)\n";
			pandasCode += var_code;
		}
		
		
		Validation validation = result.getValidation();
		StratificationMethod validation_method =  validation.getStratification();
		
		if (validation_method instanceof TrainingTest) {
			float percent_train = validation_method.getNumber();
			float prop_train = (float) percent_train / 100;
			pythonImport+= "from sklearn.model_selection import train_test_split\n";
			String CodeValidation = "X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=" + Float.toString(1-prop_train) + ", random_state=0)\n";
			pandasCode += CodeValidation;
		}
		else{
			int nb_fold = validation_method.getNumber();
			String CodeValidation = "";
			pandasCode += CodeValidation;
		}
		
		
		
		
		EList<MLChoiceAlgorithm> algos = result.getAlgorithms();
		for (MLChoiceAlgorithm algo:algos) {
			MLAlgorithm mlalgo = algo.getAlgorithm();
			FrameworkLang framework = algo.getFramework();
			
			if (framework == FrameworkLang.SCIKIT) {
				System.out.println("Scikit-learn in targeted");
				if (mlalgo instanceof DT) {
					DT dt = (DT) mlalgo;
					pythonImport+= "from sklearn import tree\n";
					String algoTraining = "clf = tree.DecisionTreeClassifier()\n" + 
											"clf = clf.fit(X_train, y_train)\n" +
											"y_pred = clf.predict(X_test)\n";
					pandasCode += algoTraining;
				}
				if (mlalgo instanceof SVM) {
					pythonImport+= "from sklearn.svm import SVC\n";
					SVM svm = (SVM) mlalgo;
					SVMKernel kernel = svm.getKernel();
					SVMClassification classification = svm.getSvmclassification();
					String algoTraining = "clf = SVC(gamma='auto')\n" + 
							"clf.fit(X_train, y_train)\n" +
							"y_pred=clf.predict(X_test)\n";
					pandasCode += algoTraining;
				}
				if (mlalgo instanceof RandomForest) {
					RandomForest randomforest = (RandomForest) mlalgo;
					pythonImport+= "from sklearn.ensemble import RandomForestClassifier\n";
					String algoTraining = "clf = RandomForestClassifier(n_estimators = 1000, random_state = 42)\n"
							+ "clf.fit(X_train,y_train)\n" +
							"y_pred=clf.predict(X_test)\n";
					pandasCode += algoTraining;
				}
				if (mlalgo instanceof LogisticRegression) {
					pythonImport += "from sklearn.linear_model import LogisticRegression\n";
					LogisticRegression logisticregression = (LogisticRegression) mlalgo;
					String algoTraining = "clf = LogisticRegression(random_state=0, multi_class='auto', solver='lbfgs')\n"
							+ "clf.fit(X_train, y_train)\n"
							+ "y_pred=clf.predict(X_test)\n";
					pandasCode+= algoTraining;
							
				}
			}
			else {
				System.out.println("FRAMEWORK NOR SUPPORTED");
			}
		}
		
		
		
		EList<ValidationMetric> metrics = validation.getMetric();
		
		for (ValidationMetric metric:metrics) {
			if (metric == ValidationMetric.RECALL) {
				pythonImport+="from sklearn.metrics import recall_score\n";
				String validationCode = "recall = recall_score(y_test, y_pred, average = None)\n"+
									"print(recall)\n";
				pandasCode+= validationCode;
			}
			if (metric == ValidationMetric.ACCURACY) {
				pythonImport+="from sklearn.metrics import accuracy_score\n";
				String validationCode = "accuracy = accuracy_score(y_test, y_pred)\n"+
									"print(accuracy)\n";
				pandasCode+= validationCode;
			}
			
			
		}
		
		pandasCode = pythonImport + pandasCode;
		
		Files.write(pandasCode.getBytes(), new File("mml.py"));		
		
		/*
		 * Calling generated Python script (basic solution through systems call)
		 * we assume that "python" is in the path
		 */
		Process p = Runtime.getRuntime().exec("python mml.py");
		BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line; 
		while ((line = in.readLine()) != null) {
			System.out.println(line);
	    }

		
		
	}

	private String mkValueInSingleQuote(String val) {
		return "'" + val + "'";
	}


}