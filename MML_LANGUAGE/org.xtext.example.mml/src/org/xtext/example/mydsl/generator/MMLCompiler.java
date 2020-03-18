package org.xtext.example.mydsl.generator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
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
import org.xtext.example.mydsl.mml.XFormula;
import org.xtext.example.mydsl.mml.regPenalty;

public class MMLCompiler {
	MMLModel mml;
	public MMLCompiler(MMLModel mml) {
		this.mml = mml;
	}
	
	public List<String> generate_code() {
		
		DataInput dataInput = mml.getInput();
		String fileLocation = dataInput.getFilelocation();
	
		
		String pythonImport = "#!/usr/bin/env python3\n" + 
				"# -*- coding: utf-8 -*-\n"
				+ "import pandas as pd \n"+
				"import numpy as np\n" +
				"import json\n" + 
				"import warnings\n"; 
		String RImport = "library(utils)\nlibrary(dplyr)\nlibrary(caret)\nlibrary(e1071)\n";
		
		//Data import
		String DEFAULT_COLUMN_SEPARATOR = ","; // by default
		String csv_separator = DEFAULT_COLUMN_SEPARATOR;
		CSVParsingConfiguration parsingInstruction = dataInput.getParsingInstruction();
		
		if (parsingInstruction != null) {			
			//System.out.println("parsing instruction..." + parsingInstruction);
			csv_separator = parsingInstruction.getSep().toString();
		}
		
		String csvReading = "mml_data = pd.read_csv(\"upload/" + fileLocation + "\", sep=" + mkValueInSingleQuote(csv_separator) + ", engine='python')\n";						
		String pandasCode = csvReading;
		
		String csvReadingR = "data <- read.csv(" + mkValueInSingleQuote(fileLocation) + ", sep=" + mkValueInSingleQuote(csv_separator) + ")\n";
		String Rcode = csvReadingR;
		
		//Formula
		RFormula formula = mml.getFormula();
		
		if (formula != null) {
			FormulaItem var_Y = formula.getPredictive();
			String nom_y = var_Y.getColName();
			XFormula X = formula.getPredictors();
			EList<EObject> predictors = X.eContents();
			
			//Formula for Python
			if (predictors.size() > 0) {
				String Xpython = "[";
				for(int i =0; i <= predictors.size()-1; i++) {
					FormulaItem predictor = (FormulaItem) predictors.get(i);
					if (i != predictors.size()-1) {
						Xpython += "'" + predictor.getColName() + "',";
					}
					else {
						Xpython += "'" + predictor.getColName() + "']";
					}
				}
				String var_code = "y = mml_data.loc[:,['" + nom_y +"']]\n" +
								 "X =  mml_data.loc[:,"+ Xpython + "]\n";
				pandasCode += var_code;
			}
			else {
				String var_code = "y = mml_data.loc[:,['" + nom_y +"']]\n" +
						 "X =  mml_data.drop(['"+ nom_y +"'],axis = 1)\n";
				pandasCode += var_code;
			}
			
			//Formula for R
			if (predictors.size() > 0) {
				String XR = "c(";
				for(int i =0; i <= predictors.size()-1; i++) {
					FormulaItem predictor = (FormulaItem) predictors.get(i);
					if (i != predictors.size()-1) {
						XR += "'" + predictor.getColName() + "',";
					}
					else {
						XR += "'" + predictor.getColName() + "')";
					}
				}
				String var_codeR = "y <-\""+nom_y+"\"\n" +
						 "X <- "+XR+"\n" +
						"formula = as.formula(paste(y, paste(X,collapse = \" + \"), sep = \" ~ \"))\n";
				Rcode += var_codeR;
			}
			else {
				String var_codeR = "y <- \""+nom_y+"\"\n" +
						 "X <- colnames(data %>% select(-\""+nom_y+"\"))\n" +
						"formula = as.formula(paste(y, paste(X,collapse = \" + \"), sep = \" ~ \"))\n";
				Rcode += var_codeR;
			}			
			
		}
		else {
			//Formula for Python
			String var_code = "y = mml_data.iloc[:,len(mml_data.columns)-1]\n" +
							 "X =  mml_data.drop(mml_data.columns[len(mml_data.columns)-1], axis=1)\n";
			pandasCode += var_code;
			//Formula for R
			String var_codeR = "y <- colnames(data)[ncol(data)]\n" +
							  "X <- colnames(data)[c(1:ncol(data)-1)]\n" +
							  "formula = as.formula(paste(y, paste(X,collapse = \" + \"), sep = \" ~ \"))\n";
			Rcode += var_codeR;
		}
		
		//Model results initialisation
		pandasCode+= "results = []\n";
		
		Rcode+= "results = list()\n";
		
		//Validation imports and data split 
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
			String CodeValidationR = "set <- sample(1:nrow(data),floor("+prop_train+"*nrow(data)))\n"+
									"dataTrain <- data[set,]\n"+
									"dataTest <- data[-set,]\n";
			Rcode += CodeValidationR;
			
			
		}
		else{
			int nb_fold = validation_method.getNumber();
			//Crossval with Python
			pythonImport+="from sklearn.model_selection import cross_val_score\n"+
						"import numpy as np\n";
			//Crossval with R
			Rcode += "fit.control <- trainControl(method = \"cv\", number = "+nb_fold+")\n";

			
		}
		
		EList<ValidationMetric> metrics = validation.getMetric();
		for (ValidationMetric metric:metrics) {
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
		
		
		boolean Ralgo = false;
		boolean pythonalgo = false;
		EList<MLChoiceAlgorithm> algos = mml.getAlgorithms();
		int ipyth = 0;
		int iR = 0;
		for (MLChoiceAlgorithm algo:algos) {
			int j = 1;

			
			

			
			
			MLAlgorithm mlalgo = algo.getAlgorithm();
			FrameworkLang framework = algo.getFramework();
			
			if (framework == FrameworkLang.SCIKIT) {
				
				System.out.println("Scikit-learn is targeted");
				pythonalgo = true;
				// Resultats pour Python
				pandasCode += "results.append({})\n" +
						"results[" + ipyth + "][\"output\"] = []\n";
				if (mlalgo instanceof DT) {
					pandasCode+= "results[" + ipyth + "][\"model\"] = \"Decision tree\"\n";
					
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
					pandasCode+= "results[" + ipyth + "][\"model\"] = \"SVM\"\n";
					pythonImport+= "from sklearn.svm import SVC\n";
					SVM svm = (SVM) mlalgo;
					SVMKernel kernel = svm.getKernel();
					//SVMClassification classification = svm.getSvmclassification();
					String codeC = "1.0";
					if (svm.isCSpecified()) {
						codeC = svm.getC();  
					}
					String codeGamma = "auto";
					if (svm.isGammaSpecified()){
						codeGamma = svm.getGamma().getName();
					}
					String algoTraining = "clf = SVC(gamma='" + codeGamma +"',C=" +codeC + ", kernel = \""+ kernel +"\")\n";
					pandasCode += algoTraining;
				}
				if (mlalgo instanceof RandomForest) {
					pandasCode+= "results[" + ipyth + "][\"model\"] = \"Random Forest\"\n";
					RandomForest randomforest = (RandomForest) mlalgo;
					pythonImport+= "from sklearn.ensemble import RandomForestClassifier\n";
					int Nestim = 100;
					if (randomforest.isNestimSpecified()) {
						Nestim = randomforest.getN_estimators();
					}
					
					int maxDepth = randomforest.getMax_depth();
					DTCriterion criterion = randomforest.getCriterion();
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
					pandasCode+= "results[" + ipyth + "][\"model\"] = \"Logistic Regression\"\n";
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
							"\", tol=" + tol +
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
				Ralgo = true;
				Rcode += "results[["+(iR+1)+"]] = list(model=c(), output=list())\n";;

				
				if (validation_method instanceof TrainingTest) {
					
					if (mlalgo instanceof DT) {
						Rcode+= "results[[" + (iR+1) + "]]$model = \"Decision tree\"\n";
						DT dt = (DT) mlalgo;
						int maxDepth = dt.getMax_depth();
						DTCriterion criterion = dt.getCriterion(); // criterion = information si pas gini
						RImport += "library(rpart)\n";
						if (dt.isMaxdepthSpecified()) {
							String algoTraining = "clf = rpart(formula = formula," +
									"data = dataTrain, method = \"class\"," + 
									"control = (maxdepth = " + maxDepth +")," +
									"parms = list(split =\""+ criterion + "\"))\n" + 
									"y_pred = predict(clf, dataTest, type = \"class\")\n";
							Rcode += algoTraining;
						}
						else {
							String algoTraining = "clf = rpart(formula = formula," +
									"data = dataTrain, method = \"class\"," + 
									"parms = list(split =\""+ criterion + "\"))\n" + 
									"y_pred = predict(clf, dataTest, type = \"class\")\n";
							Rcode += algoTraining;

						
						}
					}
					if (mlalgo instanceof SVM) {
						Rcode+= "results[[" + (iR+1) + "]]$model = \"SVM\"\n";
						RImport+= "library(SVM)";
						SVM svm = (SVM) mlalgo;
						SVMKernel kernel = svm.getKernel();
						//SVMClassification classification = svm.getSvmclassification();
						String codeC = "1.0";
						if (svm.isCSpecified()) {
							codeC = svm.getC();  
						}
						String algoTraining = "if (\""+kernel+"\"==\"rbf\"){\n"
								+ "clf = svm(formula, gamma= 1/length(X),C=" +codeC + ", kernel = \"radial\", data = dataTrain,  type = \"C-classification\")\n}"
								+ "else{\nclf = svm(formula, gamma= 1/length(X),C=" +codeC + ", kernel = \""+ kernel +"\", data = dataTrain,  type = \"C-classification\")\n}\n" + 
									"y_pred=predict(clf,dataTest,type = \"response\")\n";
						Rcode += algoTraining;
						
					}
					if (mlalgo instanceof RandomForest) {
						Rcode+= "results[[" + (iR+1) + "]]$model = \"Random Forest\"\n";
						RandomForest randomforest = (RandomForest) mlalgo;
						RImport += "library(randomForest)\n";
						int Nestim = 100;
						if (randomforest.isNestimSpecified()) {
							Nestim = randomforest.getN_estimators();
						}
											
						String algoTraining = "clf = randomForest(y = as.factor(dataTrain[,y]), x = dataTrain[,X], ntree = "+Nestim+")\n" + 
								"y_pred=predict(clf,dataTest, type = \"class\")\n";
						Rcode += algoTraining;
						
					}
					if (mlalgo instanceof LogisticRegression) {
						Rcode+= "results[[" + (iR+1) + "]]$model = \"Logistic Regression\"\n";
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
						
						RImport += "library(questionr)";
						String algoTraining = "clf = glmnet(formula, data = dataTrain, family = binomial(logit))\n" + 
								"y_pred=predict(clf,type = \"response\", newdata = dataTest)\n";
						Rcode += algoTraining;
											
								
					}
				}
				else {
					if (mlalgo instanceof DT) {
						Rcode+= "results[[" + (iR+1) + "]]$model = \"Decision tree\"\n";
						DT dt = (DT) mlalgo;
						int maxDepth = dt.getMax_depth();
						DTCriterion criterion = dt.getCriterion(); // criterion = information si pas gini
						RImport += "library(rpart)\n";
						if (dt.isMaxdepthSpecified()) {
							String algoTraining = "clf = train(formula = formula," +
									"data = dataTrain, method = \"rpart\"," + 
									"control = (maxdepth = " + maxDepth +")," +
									"parms = list(split =\""+ criterion + "\", trControl = fit.control))\n" + 
									"y_pred = predict(clf, dataTest, type = \"class\")\n";
							Rcode += algoTraining;
						}
						else {
							String algoTraining = "clf = rpart(formula = formula," +
									"data = dataTrain, method = \"class\"," + 
									"parms = list(split =\""+ criterion + "\", trControl = fit.control))\n" + 
									"y_pred = predict(clf, dataTest, type = \"class\")\n";
							Rcode += algoTraining;

						
						}
					}
					if (mlalgo instanceof SVM) {
						Rcode+= "results[[" + (iR+1) + "]]$model = \"SVM\"\n";
						SVM svm = (SVM) mlalgo;
						SVMKernel kernel = svm.getKernel();
						//SVMClassification classification = svm.getSvmclassification();
						String codeC = "1.0";
						if (svm.isCSpecified()) {
							codeC = svm.getC();  
						}
						String codeGamma = "'auto'";
						if (svm.isGammaSpecified()) {
							codeGamma = svm.getGamma().getName();
						}
						String algoTraining = "clf = train(gamma=" + codeGamma +",C=" +codeC + ", kernel = \""+ kernel +"\", data = dataTrain, trControl = fit.control)\n" + 
								"y_pred=predict(clf,dataTest, type = \"class\")\n";
						pandasCode += algoTraining;
						
					}
					if (mlalgo instanceof RandomForest) {
						Rcode+= "results[[" + (iR+1) + "]]$model = \"Random Forest\"\n";
						RandomForest randomforest = (RandomForest) mlalgo;
						RImport += "library(randomForest)\n";
						int Nestim = 100;
						if (randomforest.isNestimSpecified()) {
							Nestim = randomforest.getN_estimators();
						}
											
						String algoTraining = "clf = train(dataTrain[,y]), x = dataTrain[,X], data = dataTrain, method = \"rf\", trControl = fit.control)\n" + 
								"y_pred=predict(clf,dataTest, type = \"class\")\n";
						Rcode += algoTraining;
						
					}
					if (mlalgo instanceof LogisticRegression) {
						Rcode+= "results[[" + (iR+1) + "]]$model = \"Logistic Regression\"\n";
						LogisticRegression logisticregression = (LogisticRegression) mlalgo;
						String tol = "0.0001";
						regPenalty penalty = logisticregression.getPenalty();
						
						RImport += "library(questionr)";
						String algoTraining = "clf = train(formula, data = dataTrain, method = \"glm\", trControl = fit.control)\n" + 
								"y_pred=predict(clf,type = \"response\", newdata = dataTest)\n";
						Rcode += algoTraining;
											
								
					}
					
			
				}
				
		
			
			}
			
			
			else {
				System.out.println("FRAMEWORK NOR SUPPORTED");
			}
		
			// R confusion table
			Rcode += "mat_conf <- table(y_pred,unlist(dataTest %>% select(y)))\n";


			for (ValidationMetric metric:metrics) {
				
				if (metric == ValidationMetric.RECALL) {
					if(framework == FrameworkLang.SCIKIT) {
						// Recall for Python
						
						if (validation_method instanceof TrainingTest) {
							String validationCode = "recall = recall_score(y_test, y_pred, average = 'weighted')\n";
							pandasCode+= validationCode;
							pandasCode+= "results[" + ipyth + "][\"output\"].append({\"metric\" : \"recall\", \"value\" : recall})\n";
						}
						else {
							String validationCode = "recall = cross_val_score(clf, X, y, cv="+validation_method.getNumber() +", scoring='recall_weighted')\n";
							pandasCode+=validationCode;
							pandasCode+= "results[" + ipyth + "][\"output\"].append({\"metric\" : \"recall\", \"value\" : str(np.mean(recall))})\n";
						}
					}
					else {
						// Recall for R
						String validationCodeR = "recall = mat_conf[2,2]/sum(mat_conf[,2])\n";
						Rcode += validationCodeR;
						Rcode += "results[[" + (iR+1) + "]]$output[["+j+"]] = list(metric = \"recall\", value = recall)\n";
						
					}
					

				}
				if (metric == ValidationMetric.ACCURACY) {
					if(framework == FrameworkLang.SCIKIT) {
						// Accuracy for Python
						if (validation_method instanceof TrainingTest) {
							String validationCode = "accuracy = accuracy_score(y_test, y_pred)\n";
							pandasCode+= validationCode;
							pandasCode+= "results[" + ipyth + "][\"output\"].append({\"metric\" : \"accuracy\", \"value\" : accuracy})\n";

						}
						else {
							String validationCode = "accuracy = cross_val_score(clf, X, y, cv="+validation_method.getNumber() +")\n";
							pandasCode+=validationCode;
							pandasCode+= "results[" + ipyth + "][\"output\"].append({\"metric\" = \"accuracy\", \"value\" : str(np.mean(accuracy))})\n";
						}
					}
					else {
						// Accuracy for R
						String validationCodeR = "accuracy = sum(diag(mat_conf))/sum(mat_conf)\n";
						Rcode += validationCodeR;
						Rcode += "results[[" + (iR+1) + "]]$output[["+j+"]] = list(metric = \"accuracy\", value = accuracy)\n";					
					}
					
				}
				if (metric == ValidationMetric.BALANCED_ACCURACY) {
					if(framework == FrameworkLang.SCIKIT) {
						//BALANCED_ACCURACY for Python
						if (validation_method instanceof TrainingTest) {
							String validationCode = "balanced_accuracy = balanced_accuracy_score(y_test, y_pred) \n";
							pandasCode+=validationCode;
							pandasCode+= "results[" + ipyth + "][\"output\"].append({\"metric\" : \"Balanced accuracy\", \"value\" : balanced_accuracy})\n";

						}
						else {
							String validationCode = "balanced_accuracy = cross_val_score(clf, X, y, cv="+validation_method.getNumber() +", scoring='balanced_accuracy')\n";
							pandasCode+=validationCode;
							pandasCode+= "results[" + ipyth + "][\"output\"].append({\"metric\" : \"balanced accuracy\", \"value\" : str(np.mean(balanced_accuracy))})\n";


						}
					}
					
					else {
						//BALANCED_ACCURACY for R
						String validationCodeR = " first_row = mat_conf[1,1] / (mat_conf[1,1] + mat_conf[1,2])  \n" + 
								" second_row <- mat_conf[2,2] / (mat_conf[2,1] + mat_conf[2,2])  \n" + 
								" balanced_accuracy = (first_row + second_row)/2\n";
						Rcode += validationCodeR;
						Rcode += "results[[" + (iR+1) + "]]$output[["+j+"]] = list(metric = \"balanced accuracy\", value = balanced_accuracy)\n";
						
					}
					
				}
				if (metric == ValidationMetric.F1) {
					if(framework == FrameworkLang.SCIKIT) {
						//F1 score for Python
						if (validation_method instanceof TrainingTest) {
							String validationCode = "f1score = f1_score(y_test, y_pred, average='weighted')\n";
							pandasCode+=validationCode;
							pandasCode+= "results[" + ipyth + "][\"output\"].append({\"metric\" : \"f1 score\", \"value\" : f1score})\n";


						}
						else {
							
							String validationCode = "f1score = cross_val_score(clf, X, y, cv="+validation_method.getNumber() +", scoring='f1_weighted')\n";
							pandasCode+= validationCode;
							pandasCode+= "results[" + ipyth + "][\"output\"].append({\"metric\" : \"f1 score\", \"value\" : str(np.mean(f1score))})\n";	
						}
					}
					else {
						//F1 score for R
						String validationCodeR = "precision = mat_conf[2,2]/sum(mat_conf[2,])\n"
								+ "recall = mat_conf[2,2]/sum(mat_conf[,2])\n"
								+ "F1 = 2*precision*recall/(precision+recall)\n";
						Rcode += validationCodeR;
						Rcode += "results[[" + (iR+1) + "]]$output[["+j+"]] = list(metric = \"f1 score\", value = F1)\n";
					}
					
				}
				if (metric == ValidationMetric.PRECISION) {
					if(framework == FrameworkLang.SCIKIT) {
						//Precision for Python
						if (validation_method instanceof TrainingTest) {
							String validationCode = "precision = precision_score(y_test, y_pred, average='weighted')\n";
							pandasCode+=validationCode;
							pandasCode+= "results[" + ipyth + "][\"output\"].append({\"metric\" : \"precision\", \"value\" : precision})\n";


						}
						else {
							String validationCode = "precision = cross_val_score(clf, X, y, cv=10, scoring='precision_weighted')\n";
							pandasCode+=validationCode;
							pandasCode+= "results[" + ipyth + "][\"output\"].append({\"metric\" : \"precision\", \"value\" : str(np.mean(precision))})\n";
						}
					}
					else {
						//Precision for R
						String validationCodeR = "precision = mat_conf[2,2]/sum(mat_conf[2,])\n";
						Rcode += validationCodeR;
						Rcode += "results[[" + (iR+1) + "]]$output[["+j+"]] = list(metric = \"precision\", value = precision)\n";
					}
					
				}
				j = j + 1;
			}
			if (framework == FrameworkLang.SCIKIT) {
				ipyth+=1;
			}
			else {
				iR+=1;
			}
		}
		

		//Display the results
		pandasCode+="print(json.dumps(results))\n";
		RImport+="library(rjson)\n";
		Rcode+="print(toJSON(results))\n";
				
		
		String pythonOutput = "";
		String pythonErrors = "";
		if (pythonalgo) {
			//Final Python Code
			pandasCode = pythonImport + "warnings.filterwarnings(\"ignore\")\n" + pandasCode;
			
			//Save Python Code to file
			try {
				File file = new File("upload/mml.py");
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write(pandasCode);
				fileWriter.flush();
				fileWriter.close();
				file.setExecutable(true);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			//Exec Python Code
			
			Runtime runtime = Runtime.getRuntime();
			try {
				Process p = Runtime.getRuntime().exec("upload/mml.py");
				BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
				
				BufferedReader errinput = new BufferedReader(new InputStreamReader(p.getErrorStream()));
				
				String read = in.readLine();
				while(read != null) {
					pythonOutput += read + "\n";
					read = in.readLine();
				}
				String read_error = errinput.readLine();
				while(read_error != null) {
					pythonErrors += read_error + "\n";
					read_error = errinput.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}	
			
			System.out.println(pythonErrors);
			System.out.println(pythonOutput);
		}
		else {
			pandasCode = null;
			pythonOutput = null;
			pythonErrors = null;
		}
		
		
		
		String ROutput = "";
		String RErrors = "";

		if (Ralgo) {
			//Final R Code
			Rcode = RImport + Rcode;
			
			//Save R Code to file
			try {
				File fileR = new File("upload/mml.R");
				FileWriter fileWriterR = new FileWriter(fileR);
				fileWriterR.write(Rcode);
				fileWriterR.close();
				fileR.setExecutable(true);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			//Exec R Code
			
			Runtime runtime = Runtime.getRuntime();			
			try{
				Process pR = Runtime.getRuntime().exec("upload/mml.R");      
				BufferedReader inR = new BufferedReader(new InputStreamReader(pR.getInputStream()));
				
				BufferedReader errinput = new BufferedReader(new InputStreamReader(pR.getErrorStream()));
				
		        String read = inR.readLine();
				while(read != null) {
					ROutput += read + "\n";
					read = inR.readLine();
				}
				String read_error = errinput.readLine();
				while(read_error != null) {
					RErrors += read_error + "\n";
					read_error = errinput.readLine();
				}
				
			} catch (IOException ioe){
				ioe.printStackTrace();
			} 
			
			System.out.println(RErrors);
			System.out.println(ROutput);
			
		} else {
			Rcode = null;
			ROutput = null;				
			RErrors = null;
		}
		
		
		
		List<String> code_output = Arrays.asList(pandasCode, Rcode, pythonOutput, ROutput, pythonErrors, RErrors);
		
		
		return code_output;
	}
	
	private String mkValueInSingleQuote(String val) {
		return "'" + val + "'";
	}
	
}

