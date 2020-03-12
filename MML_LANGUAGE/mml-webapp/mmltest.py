#!/usr/bin/env python3
# -*- coding: utf-8 -*-
import pandas as pd 
from sklearn.model_selection import train_test_split
from sklearn.metrics import accuracy_score
from sklearn import tree
mml_data = pd.read_csv("upload/iris.csv", sep=',')
y = mml_data.loc[:,['variety']]
X =  mml_data.drop(['variety'],axis = 1)
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.19999999, random_state=0)
clf = tree.DecisionTreeClassifier(criterion = "gini", max_depth = 10)
clf.fit(X_train, y_train)
y_pred=clf.predict(X_test)
accuracy = accuracy_score(y_test, y_pred)
print("Accuracy : " + str(accuracy))
