#!/usr/bin/env python3
# -*- coding: utf-8 -*-
import pandas as pd 
import numpy as np
from sklearn.model_selection import cross_val_score
import numpy as np
from sklearn.ensemble import RandomForestClassifier
mml_data = pd.read_csv("upload/iris.csv", sep=',', engine='python')
y = mml_data.loc[:,['variety']]
X =  mml_data.drop(['variety'],axis = 1)
results = []
results.append({})
clf = RandomForestClassifier(criterion = "gini", n_estimators = 10,random_state = 42)
accuracy = cross_val_score(clf, X, y, cv=5)
results[0]['accuracy'] = str(np.mean(accuracy))
print(results)
