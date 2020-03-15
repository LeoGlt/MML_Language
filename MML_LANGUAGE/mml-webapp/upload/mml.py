#!/usr/bin/env python3
# -*- coding: utf-8 -*-
import pandas as pd 
import numpy as np
import json
import warnings
from sklearn.model_selection import train_test_split
from sklearn.metrics import accuracy_score
from sklearn.metrics import recall_score
from sklearn.metrics import precision_score
from sklearn import tree
from sklearn.svm import SVC
from sklearn.linear_model import LogisticRegression
from sklearn.ensemble import RandomForestClassifier
warnings.filterwarnings("ignore")
mml_data = pd.read_csv("upload/Spotify.csv", sep=';', engine='python')
y = mml_data.loc[:,['like']]
X =  mml_data.loc[:,['NumId','acousticness','danceability','duration','energy','instrumentalness','key','liveness','loudness','mode','speechiness','tempo','time_signature','valence']]
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
recall = recall_score(y_test, y_pred, average = 'weighted')
results[0]["output"].append({"metric" : "recall", "value" : recall})
precision = precision_score(y_test, y_pred, average='weighted')
results[0]["output"].append({"metric" : "precision", "value" : precision})
results.append({})
results[1]["output"] = []
results[1]["model"] = "SVM"
clf = SVC(gamma='auto',C=1, kernel = "rbf")
clf.fit(X_train, y_train)
y_pred=clf.predict(X_test)
accuracy = accuracy_score(y_test, y_pred)
results[1]["output"].append({"metric" : "accuracy", "value" : accuracy})
recall = recall_score(y_test, y_pred, average = 'weighted')
results[1]["output"].append({"metric" : "recall", "value" : recall})
precision = precision_score(y_test, y_pred, average='weighted')
results[1]["output"].append({"metric" : "precision", "value" : precision})
results.append({})
results[2]["output"] = []
results[2]["model"] = "Logistic Regression"
clf = LogisticRegression(penalty="l2", tol=0.0001, C=1,random_state=0, multi_class='auto')
clf.fit(X_train, y_train)
y_pred=clf.predict(X_test)
accuracy = accuracy_score(y_test, y_pred)
results[2]["output"].append({"metric" : "accuracy", "value" : accuracy})
recall = recall_score(y_test, y_pred, average = 'weighted')
results[2]["output"].append({"metric" : "recall", "value" : recall})
precision = precision_score(y_test, y_pred, average='weighted')
results[2]["output"].append({"metric" : "precision", "value" : precision})
results.append({})
results[3]["output"] = []
results[3]["model"] = "SVM"
clf = RandomForestClassifier(criterion = "gini", n_estimators = 10,random_state = 42)
clf.fit(X_train, y_train)
y_pred=clf.predict(X_test)
accuracy = accuracy_score(y_test, y_pred)
results[3]["output"].append({"metric" : "accuracy", "value" : accuracy})
recall = recall_score(y_test, y_pred, average = 'weighted')
results[3]["output"].append({"metric" : "recall", "value" : recall})
precision = precision_score(y_test, y_pred, average='weighted')
results[3]["output"].append({"metric" : "precision", "value" : precision})
print(json.dumps(results))
