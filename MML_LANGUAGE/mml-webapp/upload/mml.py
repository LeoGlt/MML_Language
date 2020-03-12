#!/usr/bin/env python3
# -*- coding: utf-8 -*-
import pandas as pd 
from sklearn.model_selection import train_test_split
from sklearn.metrics import balanced_accuracy_score
from sklearn.metrics import accuracy_score
from sklearn import tree
from sklearn.ensemble import RandomForestClassifier
mml_data = pd.read_csv("upload/iris.csv", sep=',')
y = mml_data.loc[:,['variety']]
X =  mml_data.drop(['variety'],axis = 1)
results = []
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.19999999, random_state=0)
results.append({})
clf = tree.DecisionTreeClassifier(criterion = "gini", max_depth = 10)
clf.fit(X_train, y_train)
y_pred=clf.predict(X_test)
balanced_accuracy = balanced_accuracy_score(y_test, y_pred) 
results[0]['balanced_accuracy'] = balanced_accuracy
accuracy = accuracy_score(y_test, y_pred)
results[0]['accuracy'] = accuracy
results.append({})
clf = RandomForestClassifier(criterion = "gini", n_estimators = 10,max_depth=10 ,random_state = 42)
clf.fit(X_train, y_train)
y_pred=clf.predict(X_test)
balanced_accuracy = balanced_accuracy_score(y_test, y_pred) 
results[1]['balanced_accuracy'] = balanced_accuracy
accuracy = accuracy_score(y_test, y_pred)
results[1]['accuracy'] = accuracy
print(results)
