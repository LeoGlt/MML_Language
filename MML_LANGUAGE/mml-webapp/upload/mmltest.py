#!/usr/bin/env python3
# -*- coding: utf-8 -*-
import pandas as pd 
from sklearn.model_selection import cross_val_score
import numpy as np
from sklearn import tree
mml_data = pd.read_csv("upload/iris.csv", sep=',')
y = mml_data.loc[:,['variety']]
X =  mml_data.drop(['variety'],axis = 1)
clf = tree.DecisionTreeClassifier(criterion = "gini", max_depth = 10)
balanced_accuracy = cross_val_score(clf, X, y, cv=5, scoring='balanced_accuracy')
print("Balanced accuracy_1 : " + str(np.mean(balanced_accuracy)))
