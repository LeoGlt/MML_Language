package org.xtext.example.mydsl.generator;

import org.eclipse.emf.common.util.EList;
import org.xtext.example.mydsl.mml.CSVParsingConfiguration;
import org.xtext.example.mydsl.mml.DT;
import org.xtext.example.mydsl.mml.DTCriterion;
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
import org.xtext.example.mydsl.mml.SVMKernel;
import org.xtext.example.mydsl.mml.StratificationMethod;
import org.xtext.example.mydsl.mml.TrainingTest;
import org.xtext.example.mydsl.mml.Validation;
import org.xtext.example.mydsl.mml.ValidationMetric;
import org.xtext.example.mydsl.mml.regPenalty;

public class MMLCompiler {
	MMLModel mml;
	public MMLCompiler(MMLModel mml) {
		this.mml = mml;
	}
	
	public String generate_code() {
		
		DataInput dataInput = mml.getInput();
		String fileLocation = dataInput.getFilelocation();
	
		
		String pythonImport = "import pandas as pd\n"; 
		String RImport = "library(utils)\n";
		
		String DEFAULT_COLUMN_SEPARATOR = ","; // by default
		String csv_separator = DEFAULT_COLUMN_SEPARATOR;
		CSVParsingConfiguration parsingInstruction = dataInput.getParsingInstruction();
		if (parsingInstruction != null) {			
			System.err.println("parsing instruction..." + parsingInstruction);
			csv_separator = parsingInstruction.getSep().toString();
		}
		String csvReading = "mml_data = pd.read_csv(" + mkValueInSingleQuote(fileLocation) + ", sep=" + mkValueInSingleQuote(csv_separator) + ")\n";						
		String pandasCode = csvReading;
		
		String csvReadingR = "data <- read.csv(" + mkValueInSingleQuote(fileLocation) + ", sep=" + mkValueInSingleQuote(csv_separator) + ")\n";
		String Rcode = csvReadingR;

		RFormula formula = mml.getFormula();
		
		if (formula != null) {
			//Formula for Python
			FormulaItem var_Y = formula.getPredictive();
			String nom_y = var_Y.getColName();	
			String var_code = "y = mml_data.loc[:,['" + var_Y +"']]\n" +
							 "X =  mml_data.drop(['"+ var_Y +"'], axis=1)\n";
			pandasCode += var_code;
			//Formula for R
		}
		else {
			//Formula for Python
			String var_code = "y = mml_data.iloc[:,len(mml_data.columns)-1]\n" +
							 "X =  mml_data.drop(mml_data.columns[len(mml_data.columns)-1], axis=1)\n";
			pandasCode += var_code;
			//Formula for R
		}
		
		
		Validation validation = mml.getValidation();
		StratificationMethod validation_method =  validation.getStratification();
		
		if (validation_method instanceof TrainingTest) {
			//Train test with Python
			float percent_train = validation_method.getNumber();
			float prop_train = (float) percent_train / 100;
			pythonImport+= "from sklearn.model_selection import train_test_split\n";
			String CodeValidation = "X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=" + Float.toString(1-prop_train) + ", random_state=0)\n";
			pandasCode += CodeValidation;
			//Train test with R
			
			
			
		}
		else{
			//Crossval with Python
			int nb_fold = validation_method.getNumber();
			String CodeValidation = "";
			pandasCode += CodeValidation;
			//Crossval with R
			
		}
		
		
		
		
		EList<MLChoiceAlgorithm> algos = mml.getAlgorithms();
		for (MLChoiceAlgorithm algo:algos) {
			MLAlgorithm mlalgo = algo.getAlgorithm();
			FrameworkLang framework = algo.getFramework();
			
			if (framework == FrameworkLang.SCIKIT) {
				System.out.println("Scikit-learn is targeted");
				if (mlalgo instanceof DT) {
					DT dt = (DT) mlalgo;
					int maxDepth = dt.getMax_depth();
					DTCriterion criterion = dt.getCriterion();
	
					pythonImport+= "from sklearn import tree\n";
					
					
					if (dt.isMaxdepthSpecified()) {
						String algoTraining = "clf = tree.DecisionTreeClassifier(criterion = \"" 
								+ criterion + "\", max_depth = " + maxDepth +")\n" + 
								"clf = clf.fit(X_train, y_train)\n" +
								"y_pred = clf.predict(X_test)\n";
						pandasCode += algoTraining;
					}
					else {
						String algoTraining = "clf = tree.DecisionTreeClassifier(criterion = \"" 
								+ criterion + "\")\n" + 
								"clf = clf.fit(X_train, y_train)\n" +
								"y_pred = clf.predict(X_test)\n";
						pandasCode += algoTraining;
					}
					
					
				}
				if (mlalgo instanceof SVM) {
					pythonImport+= "from sklearn.svm import SVC\n";
					SVM svm = (SVM) mlalgo;
					SVMKernel kernel = svm.getKernel();
					//SVMClassification classification = svm.getSvmclassification();
					String codeC = "1.0";
					if (svm.isCSpecified()) {
						codeC = svm.getC();  
					}
					String codeGamma = "'auto'";
					if (svm.isGammaSpecified()) {
						codeGamma = svm.getGamma();
					}
					String algoTraining = "clf = SVC(gamma=" + codeGamma +",C=" +codeC + ", kernel = \""+ kernel +"\")\n" + 
							"clf.fit(X_train, y_train)\n" +
							"y_pred=clf.predict(X_test)\n";
					pandasCode += algoTraining;
				}
				if (mlalgo instanceof RandomForest) {
					RandomForest randomforest = (RandomForest) mlalgo;
					pythonImport+= "from sklearn.ensemble import RandomForestClassifier\n";
					int Nestim = 100;
					if (randomforest.isNestimSpecified()) {
						Nestim = randomforest.getN_estimators();
					}
					
					int maxDepth = randomforest.getMax_depth();
					DTCriterion criterion = randomforest.getCriterion();
					System.out.println(criterion);
					if (randomforest.isMaxdepthSpecified()) {
						String algoTraining = "clf = RandomForestClassifier(criterion = \"" + criterion +"\", n_estimators = "
								+ Nestim+",max_depth="+ maxDepth + " ,random_state = 42)\n"
								+ "clf.fit(X_train,y_train)\n" +
								"y_pred=clf.predict(X_test)\n";
						pandasCode += algoTraining;
					}
					else {
						String algoTraining = "clf = RandomForestClassifier(criterion = \"" + criterion +"\", n_estimators = "
								+ Nestim+",random_state = 42)\n"
								+ "clf.fit(X_train,y_train)\n" +
								"y_pred=clf.predict(X_test)\n";
						pandasCode += algoTraining;
					}
					
				}
				if (mlalgo instanceof LogisticRegression) {
					pythonImport += "from sklearn.linear_model import LogisticRegression\n";
					LogisticRegression logisticregression = (LogisticRegression) mlalgo;
					String tol = "0.0001";
					if (logisticregression.isTolSpecified()) {
						tol = logisticregression.getTol();
					}
					String C = "1.0";
					if (logisticregression.isCSpecified()) {
						C = logisticregression.getC();
					}
					regPenalty penalty = logisticregression.getPenalty();
					
					String algoTraining = "clf = LogisticRegression(penalty=\""+ penalty +
							", tol=" + tol +
							", C=" + C +
							
							",random_state=0, multi_class='auto')\n"
							+ "clf.fit(X_train, y_train)\n"
							+ "y_pred=clf.predict(X_test)\n";
					pandasCode+= algoTraining;
							
				}
			}
			if (framework == FrameworkLang.R) {
				System.out.println("R is targeted");
				if (mlalgo instanceof DT) {
					DT dt = (DT) mlalgo;
					RImport += "\n";
					Rcode += "\n";
				}
				if (mlalgo instanceof SVM) {
					SVM svm = (SVM) mlalgo;
					RImport += "\n";
					Rcode += "\n";
					
				}
				if (mlalgo instanceof RandomForest) {
					RandomForest randomforest = (RandomForest) mlalgo;
					RImport += "\n";
					Rcode += "\n";
					
				}
				if (mlalgo instanceof LogisticRegression) {
					LogisticRegression logisticregression = (LogisticRegression) mlalgo;
					RImport += "\n";
					Rcode += "\n";
							
				}

			}
			
			else {
				System.out.println("FRAMEWORK NOR SUPPORTED");
			}
		}
		
		
		
		EList<ValidationMetric> metrics = validation.getMetric();
		
		for (ValidationMetric metric:metrics) {
			if (metric == ValidationMetric.RECALL) {
				// Recall for Python
				pythonImport+="from sklearn.metrics import recall_score\n";
				String validationCode = "recall = recall_score(y_test, y_pred, average = None)\n"+
									"print(recall)\n";
				pandasCode+= validationCode;
				// Recall for R

			}
			if (metric == ValidationMetric.ACCURACY) {
				// Accuracy for Python

				pythonImport+="from sklearn.metrics import accuracy_score\n";
				String validationCode = "accuracy = accuracy_score(y_test, y_pred)\n"+
									"print(accuracy)\n";
				pandasCode+= validationCode;
				// Accuracy for R

			}
			if (metric == ValidationMetric.BALANCED_ACCURACY) {
				//BALANCED_ACCURACY for Python
				
				//BALANCED_ACCURACY for R
			}
			if (metric == ValidationMetric.F1) {
				//F1 score for Python
				
				//F1 score for R
			}
		}
		
		//Final Python Code
		pandasCode = pythonImport + pandasCode;
		
		//Final R Code
		Rcode = RImport + Rcode;
		
		return pandasCode + Rcode;
	}
	
	private String mkValueInSingleQuote(String val) {
		return "'" + val + "'";
	}
	
}
