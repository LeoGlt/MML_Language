#!/usr/bin/env python3
# -*- coding: utf-8 -*-
import pandas as pd 
import numpy as np
import json
from sklearn.model_selection import cross_val_score
import numpy as np
from sklearn import tree
from sklearn.svm import SVC
mml_data = pd.read_csv("upload/iris.csv", sep=',', engine='python')
y = mml_data.loc[:,['variety']]
X =  mml_data.drop(['variety'],axis = 1)
results = []
results.append({})
results[0]["output"] = []
results[0]["model"] = "Decision tree"
clf = tree.DecisionTreeClassifier(criterion = "gini", max_depth = 1)
accuracy = cross_val_score(clf, X, y, cv=5)
results[0]["output"].append({"metric" : "accuracy", "value" : str(np.mean(accuracy))})
recall = cross_val_score(clf, X, y, cv=5, scoring='recall_weighted')
results[0]["output"].append({"metric" : "recall", "value" : str(np.mean(recall))})
precision = cross_val_score(clf, X, y, cv=10, scoring='precision_weighted')
results[0]["output"].append({"metric" : "precision", "value" : str(np.mean(precision))})
f1score = cross_val_score(clf, X, y, cv=5, scoring='f1_weighted')
results[0]["output"].append({"metric" : "f1 score", "value" : str(np.mean(f1score))})
balanced_accuracy = cross_val_score(clf, X, y, cv=5, scoring='balanced_accuracy')
results[0]["output"].append({"metric" : "balanced accuracy", "value" : str(np.mean(balanced_accuracy))})
results.append({})
results[1]["output"] = []
results[1]["model"] = "SVM"
clf = SVC(gamma='auto',C=1, kernel = "rbf")
accuracy = cross_val_score(clf, X, y, cv=5)
results[1]["output"].append({"metric" : "accuracy", "value" : str(np.mean(accuracy))})
recall = cross_val_score(clf, X, y, cv=5, scoring='recall_weighted')
results[1]["output"].append({"metric" : "recall", "value" : str(np.mean(recall))})
precision = cross_val_score(clf, X, y, cv=10, scoring='precision_weighted')
results[1]["output"].append({"metric" : "precision", "value" : str(np.mean(precision))})
f1score = cross_val_score(clf, X, y, cv=5, scoring='f1_weighted')
results[1]["output"].append({"metric" : "f1 score", "value" : str(np.mean(f1score))})
balanced_accuracy = cross_val_score(clf, X, y, cv=5, scoring='balanced_accuracy')
results[1]["output"].append({"metric" : "balanced accuracy", "value" : str(np.mean(balanced_accuracy))})
print(json.dumps(results))
