#!/usr/bin/env python3
# -*- coding: utf-8 -*-
import pandas as pd 
import numpy as np
import json
import warnings
from sklearn.model_selection import train_test_split
from sklearn.metrics import accuracy_score
from sklearn.svm import SVC
from sklearn.ensemble import RandomForestClassifier
warnings.filterwarnings("ignore")
mml_data = pd.read_csv("upload/iris.csv", sep=',', engine='python')
y = mml_data.loc[:,['variety']]
X =  mml_data.drop(['variety'],axis = 1)
results = []
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.19999999, random_state=0)
results.append({})
results[0]["output"] = []
results[0]["model"] = "SVM"
clf = SVC(gamma='auto',C=1, kernel = "rbf")
clf.fit(X_train, y_train)
y_pred=clf.predict(X_test)
accuracy = accuracy_score(y_test, y_pred)
results[0]["output"].append({"metric" : "accuracy", "value" : accuracy})
results.append({})
results[1]["output"] = []
results[1]["model"] = "Random Forest"
clf = RandomForestClassifier(criterion = "gini", n_estimators = 10,random_state = 42)
clf.fit(X_train, y_train)
y_pred=clf.predict(X_test)
accuracy = accuracy_score(y_test, y_pred)
results[1]["output"].append({"metric" : "accuracy", "value" : accuracy})
print(json.dumps(results))
