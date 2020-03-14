#!/usr/bin/env python3
# -*- coding: utf-8 -*-
import pandas as pd 
import numpy as np
from sklearn.model_selection import cross_val_score
import numpy as np
from sklearn.svm import SVC
mml_data = pd.read_csv("upload/iris.csv", sep=',', engine='python')
y = mml_data.loc[:,['variety']]
X =  mml_data.drop(['variety'],axis = 1)
results = []
results.append({})
clf = SVC(gamma='auto',C=0.3, kernel = "linear")
balanced_accuracy = cross_val_score(clf, X, y, cv=2, scoring='balanced_accuracy')
results[0]['balanced_accuracy'] = str(np.mean(balanced_accuracy))
print(results)
