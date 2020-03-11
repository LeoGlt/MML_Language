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

import org.python.util.PythonInterpreter;
import org.python.core.PyObject;

public class MMLCompiler {
	MMLModel mml;
	public MMLCompiler(MMLModel mml) {
		this.mml = mml;
	}
	
	public String generate_code() {
		
		
		
		DataInput dataInput = mml.getInput();
		String fileLocation = dataInput.getFilelocation();
	
		
		String pythonImport = "import pandas as pd \n"; 
		String RImport = "library(utils)\nlibrary(dplyr)";
		
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
			String var_codeR = "y <- data %>% select('"+var_Y+"')\n" +
							 "X <- data %>% select(-'"+var_Y+"')";
			Rcode += var_codeR;
			
		}
		else {
			//Formula for Python
			String var_code = "y = mml_data.iloc[:,len(mml_data.columns)-1]\n" +
							 "X =  mml_data.drop(mml_data.columns[len(mml_data.columns)-1], axis=1)\n";
			pandasCode += var_code;
			//Formula for R
			String var_codeR = "y <- data[,ncol(data)]\n" +
							  "X <- data[,c(1:ncol(data)-1)]\n";
			Rcode += var_codeR;
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
			//RImport+= "from sklearn.model_selection import train_test_split\n";
			String CodeValidationR = "set <- sample(1:nrow(X),floor("+prop_train+"*nrow(X)))\n"+
									"X_train <- X[set,]\nX_test <- X[-set,]"+
									"y_train <- y[set]\ny_test = y[-set]\n";
			Rcode += CodeValidationR;
			
			
		}
		else{
			int nb_fold = validation_method.getNumber();
			//Crossval with Python
			pythonImport+="from sklearn.model_selection import cross_val_score\n"+
						"import numpy as np\n";
			//Crossval with R
			
		}
		
		EList<ValidationMetric> metrics = validation.getMetric();
		for (ValidationMetric metric:metrics) {
			// R confusion table

			if (metric == ValidationMetric.RECALL) {
				// Recall for Python
				if (validation_method instanceof TrainingTest) {
					pythonImport+="from sklearn.metrics import recall_score\n";
					
				}
				else {
					

				}
				// Recall for R
				
				

			}
			if (metric == ValidationMetric.ACCURACY) {
				// Accuracy for Python
				if (validation_method instanceof TrainingTest) {
					pythonImport+="from sklearn.metrics import accuracy_score\n";
					
				}
				else {
					
				}
				// Accuracy for R
				
				

			}
			if (metric == ValidationMetric.BALANCED_ACCURACY) {
				//BALANCED_ACCURACY for Python
				if (validation_method instanceof TrainingTest) {
					pythonImport+="from sklearn.metrics import balanced_accuracy_score\n";
					
				}
				else {
					
				}
				
				//BALANCED_ACCURACY for R
				
			}
			if (metric == ValidationMetric.F1) {
				//F1 score for Python
				if (validation_method instanceof TrainingTest) {
					pythonImport+="from sklearn.metrics import f1_score\n";
					
				}
				else {
					
				}
				//F1 score for R
				
			}
			if (metric == ValidationMetric.PRECISION) {
				//Precision for Python
				if (validation_method instanceof TrainingTest) {
					pythonImport+="from sklearn.metrics import precision_score\n";
					
				}
				else {
					
				}
				//Precision for R
			}
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
								+ criterion + "\", max_depth = " + maxDepth +")\n";
						pandasCode += algoTraining;
					}
					else {
						String algoTraining = "clf = tree.DecisionTreeClassifier(criterion = \"" 
								+ criterion + "\")\n";
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
					String algoTraining = "clf = SVC(gamma=" + codeGamma +",C=" +codeC + ", kernel = \""+ kernel +"\")\n";
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
								+ Nestim+",max_depth="+ maxDepth + " ,random_state = 42)\n";
						pandasCode += algoTraining;
					}
					else {
						String algoTraining = "clf = RandomForestClassifier(criterion = \"" + criterion +"\", n_estimators = "
								+ Nestim+",random_state = 42)\n";
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
							
							",random_state=0, multi_class='auto')\n";
					pandasCode+= algoTraining;
							
				}
				if (validation_method instanceof TrainingTest) {
					pandasCode+="clf.fit(X_train, y_train)\n" 
							+"y_pred=clf.predict(X_test)\n";
				}
				
				
			}
			if (framework == FrameworkLang.R) {
				System.out.println("R is targeted");
				String modelData = "dataTrain = dataframe(X_train,y_train)\n"+
								  "dataTest = dataframe(X_test,y_test)\n";
				if (mlalgo instanceof DT) {
					DT dt = (DT) mlalgo;
					int maxDepth = dt.getMax_depth();
					DTCriterion criterion = dt.getCriterion(); // criterion = information si pas gini
					RImport += "library(rpart)\n";
					// pas sûre pour "criterion"
					if (dt.isMaxdepthSpecified()) {
						String algoTraining = "clf = rpart(formula = y_train~.," +
								"data = dataTrain, method = \"class\"," + 
								"control = (\"maxdepth = " + maxDepth +")," +
								"parms = list(split =\""+ criterion + "\"))\n" + 
								"y_pred = predict(clf, dataTest)\n";
						Rcode += algoTraining;
					}
					else {
						String algoTraining = "clf = rpart(formula = y_train~.," +
								"data = dataTrain, method = \"class\"," + 
								"parms = list(split =\""+ criterion + "\"))\n" + 
								"y_pred = predict(clf, dataTest)\n";
						Rcode += algoTraining;

					
				}
				if (mlalgo instanceof SVM) {
					RImport+= "library(SVM)";
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
					String algoTraining = "clf = svm(gamma=" + codeGamma +",C=" +codeC + ", kernel = \""+ kernel +"\", data = dataTrain)\n" + 
							"y_pred=predict(clf,dataTest)\n";
					pandasCode += algoTraining;
					
				}
				if (mlalgo instanceof RandomForest) {
					RandomForest randomforest = (RandomForest) mlalgo;
					RImport += "library(randomForest)\n";
					int Nestim = 100;
					if (randomforest.isNestimSpecified()) {
						Nestim = randomforest.getN_estimators();
					}
										
					String algoTraining = "clf = randomForest(y_train~., data = dataTrain, ntree = "+Nestim+")\n" + 
							"y_pred=predict(clf,dataTest)\n";
					Rcode += algoTraining;
					
				}
				if (mlalgo instanceof LogisticRegression) {
					LogisticRegression logisticregression = (LogisticRegression) mlalgo;
					RImport += "library(questionr)";
					String algoTraining = "clf = glm(y_train~., data = dataTrain, family = binomial(logit))\n" + 
							"y_pred=predict(clf,type = \"response\", newdata = dataTest)\n";
					Rcode += algoTraining;
							
				}
				
			}
			
			else {
				System.out.println("FRAMEWORK NOR SUPPORTED");
			}
			
			}
			
			for (ValidationMetric metric:metrics) {
				// R confusion table
				Rcode += "mat_conf <- table(y_pred,y_test)\n";
				RImport += "library(caret)";

				if (metric == ValidationMetric.RECALL) {
					// Recall for Python
					if (validation_method instanceof TrainingTest) {
						String validationCode = "recall = recall_score(y_test, y_pred, average = 'weighted')\n"+
											"print(\"Recall : \" +  str(recall))\n";
						pandasCode+= validationCode;
					}
					else {
						String validationCode = "recall = cross_val_score(clf, X, y, cv="+validation_method.getNumber() +", scoring='recall_weighted')"+
												"print(recall)";
						pandasCode+=validationCode;

					}
					// Recall for R
					String validationCodeR = "recall = recall(mat_conf, reference = y_test, relevant = \"Relevant\")\n";
					Rcode += validationCodeR;
					

				}
				if (metric == ValidationMetric.ACCURACY) {
					// Accuracy for Python
					if (validation_method instanceof TrainingTest) {
						String validationCode = "accuracy = accuracy_score(y_test, y_pred)\n"+
											"print(\"Accuracy : \" + str(accuracy))";
						pandasCode+= validationCode;
					}
					else {
						String validationCode = "accuracy = cross_val_score(clf, X, y, cv="+validation_method.getNumber() +")"+
								"print(\"Accuracy : \" + str(np.mean(accuracy)))\n";
						pandasCode+=validationCode;
					}
					// Accuracy for R
					String validationCodeR = "accuracy = precision(mat_conf, reference = y_test, relevant = \"Relevant\")\n";
					Rcode += validationCodeR;
					

				}
				if (metric == ValidationMetric.BALANCED_ACCURACY) {
					//BALANCED_ACCURACY for Python
					if (validation_method instanceof TrainingTest) {
						String validationCode = "balanced_accuracy = balanced_accuracy_score(y_test, y_pred) \n" + 
								"print(\"Balanced_accuracy : \" +  str(balanced_accuracy))";
						pandasCode+=validationCode;
					}
					else {
						String validationCode = "balanced_accuracy = cross_val_score(clf, X, y, cv="+validation_method.getNumber() +", scoring='balanced_accuracy')"+
								"print(\"Balanced accuracy : \" + str(np.mean(balanced_accuracy)))";
						pandasCode+=validationCode;
					}
					
					//BALANCED_ACCURACY for R
					String validationCodeR = " first_row = mat_conf[1,1] / (mat_conf[1,1] + mat_conf[1,2])  \n" + 
							" second_row <- mat_conf[2,2] / (mat_conf[2,1] + mat_conf[2,2])  \n" + 
							" balanced_accuracy = (first_row + second_row)/2";
					Rcode += validationCodeR;
				}
				if (metric == ValidationMetric.F1) {
					//F1 score for Python
					if (validation_method instanceof TrainingTest) {
						String validationCode = "f1_score = f1_score(y_test, y_pred, average='weighted')\n" + 
								"print(\"f1_score : \" + str(f1_score))";
						pandasCode+=validationCode;
					}
					else {
						
						String validationCode = "f1_score = cross_val_score(clf, X, y, cv="+validation_method.getNumber() +", scoring='f1_weighted')"+ 
						"print(\"F1 score : \" + str(np.mean(f1_score)))";
						
					}
					//F1 score for R
					String validationCodeR = "F1 = F_meas(mat_conf, reference = y_test, relevant = \"Relevant\", beta = 1)\n";
					Rcode += validationCodeR;
				}
				if (metric == ValidationMetric.PRECISION) {
					//Precision for Python
					if (validation_method instanceof TrainingTest) {
						String validationCode = "precision_score = precision_score(y_test, y_pred, average='weighted')\n" + 
								"print(\"precision_score : \" + str(precision_score))";
						pandasCode+=validationCode;
					}
					else {
						String validationCode = "precision = cross_val_score(clf, X, y, cv=10, scoring='precision_weighted')\n" + 
								"print(\"Precision : \" + str(np.mean(precision)))";
						pandasCode+=validationCode;
						
					}
					//Precision for R
				}
			}
		}
		
		
		
		
		//Final Python Code
		pandasCode = pythonImport + pandasCode;
		
		//Final R Code
		Rcode = RImport + Rcode;
		
		
		// execute a function that takes a string and returns a string
		
		return pandasCode;
	}
	
	private String mkValueInSingleQuote(String val) {
		return "'" + val + "'";
	}
	
}

