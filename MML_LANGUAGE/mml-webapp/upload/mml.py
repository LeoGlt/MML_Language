#!/usr/bin/env python3
# -*- coding: utf-8 -*-
import pandas as pd 
import numpy as np
import json
import warnings
from sklearn.model_selection import cross_val_score
import numpy as np
from sklearn import tree
from sklearn.svm import SVC
warnings.filterwarnings("ignore")
mml_data = pd.read_csv("upload/iris.csv", sep=',', engine='python')
y = mml_data.loc[:,['variety']]
X =  mml_data.drop(['variety'],axis = 1)
results = []
results.append({})
results[0]["output"] = []
results[0]["model"] = "Decision tree"
clf = tree.DecisionTreeClassifier(criterion = "gini", max_depth = 1)
accuracy = cross_val_score(clf, X, y, cv=10)
results[0]["output"].append({"metric" : "accuracy", "value" : str(np.mean(accuracy))})
recall = cross_val_score(clf, X, y, cv=10, scoring='recall_weighted')
results[0]["output"].append({"metric" : "recall", "value" : str(np.mean(recall))})
results.append({})
results[1]["output"] = []
results[1]["model"] = "SVM"
clf = SVC(gamma='auto',C=1, kernel = "rbf")
accuracy = cross_val_score(clf, X, y, cv=10)
results[1]["output"].append({"metric" : "accuracy", "value" : str(np.mean(accuracy))})
recall = cross_val_score(clf, X, y, cv=10, scoring='recall_weighted')
results[1]["output"].append({"metric" : "recall", "value" : str(np.mean(recall))})
results.append({})
results[2]["output"] = []
accuracy = cross_val_score(clf, X, y, cv=10)
results[2]["output"].append({"metric" : "accuracy", "value" : str(np.mean(accuracy))})
recall = cross_val_score(clf, X, y, cv=10, scoring='recall_weighted')
results[2]["output"].append({"metric" : "recall", "value" : str(np.mean(recall))})
print(json.dumps(results))
