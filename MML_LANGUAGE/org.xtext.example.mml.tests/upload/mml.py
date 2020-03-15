#!/usr/bin/env python3
# -*- coding: utf-8 -*-
import pandas as pd 
import numpy as np
import json
import warnings
from sklearn.model_selection import cross_val_score
import numpy as np
from sklearn.ensemble import RandomForestClassifier
warnings.filterwarnings("ignore")
mml_data = pd.read_csv("upload/iris.csv", sep=',', engine='python')
y = mml_data.iloc[:,len(mml_data.columns)-1]
X =  mml_data.drop(mml_data.columns[len(mml_data.columns)-1], axis=1)
results = []
results.append({})
results[0]["output"] = []
results[0]["model"] = "SVM"
clf = RandomForestClassifier(criterion = "gini", n_estimators = 100,random_state = 42)
print(json.dumps(results))
