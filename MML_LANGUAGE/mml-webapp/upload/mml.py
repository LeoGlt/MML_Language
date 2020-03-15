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
clf = SVC(gamma='auto',C=1.0, kernel = "rbf")
accuracy = cross_val_score(clf, X, y, cv=8)
results[0]['accuracy'] = str(np.mean(accuracy))
print(results)
