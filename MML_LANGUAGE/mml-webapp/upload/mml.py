#!/usr/bin/env python3
# -*- coding: utf-8 -*-
import pandas as pd 
import numpy as np
import json
import warnings
from sklearn.model_selection import train_test_split
from sklearn.metrics import accuracy_score
from sklearn import tree
warnings.filterwarnings("ignore")
mml_data = pd.read_csv("upload/Spotify.csv", sep=',', engine='python')
y = mml_data.loc[:,[like']]
X =  mml_data.loc[:,['NumId','danceability','energy','mode','tempo','time_signature']]
results = []
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.19999999, random_state=0)
results.append({})
results[0]["output"] = []
results[0]["model"] = "Decision tree"
clf = tree.DecisionTreeClassifier(criterion = "gini", max_depth = 1)
clf.fit(X_train, y_train)
y_pred=clf.predict(X_test)
accuracy = accuracy_score(y_test, y_pred)
results[0]["output"].append({"metric" : "accuracy", "value" : accuracy})
print(json.dumps(results))
