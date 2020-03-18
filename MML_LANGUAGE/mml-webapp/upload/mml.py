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
mml_data = pd.read_csv("upload/Spotify.csv", sep=';', engine='python')
y = mml_data.loc[:,['like']]
X =  mml_data.loc[:,['NumId','acousticness','danceability','duration','energy','instrumentalness','key','liveness','loudness','mode','speechiness','tempo','time_signature','valence']]
results = []
results.append({})
results[0]["output"] = []
results[0]["model"] = "Random Forest"
clf = RandomForestClassifier(criterion = "gini", n_estimators = 10,random_state = 42)
accuracy = cross_val_score(clf, X, y, cv=5)
results[0]["output"].append({"metric" : "accuracy", "value" : str(np.mean(accuracy))})
recall = cross_val_score(clf, X, y, cv=5, scoring='recall_weighted')
results[0]["output"].append({"metric" : "recall", "value" : str(np.mean(recall))})
precision = cross_val_score(clf, X, y, cv=10, scoring='precision_weighted')
results[0]["output"].append({"metric" : "precision", "value" : str(np.mean(precision))})
f1score = cross_val_score(clf, X, y, cv=5, scoring='f1_weighted')
results[0]["output"].append({"metric" : "f1 score", "value" : str(np.mean(f1score))})
balanced_accuracy = cross_val_score(clf, X, y, cv=5, scoring='balanced_accuracy')
results[0]["output"].append({"metric" : "balanced accuracy", "value" : str(np.mean(balanced_accuracy))})
print(json.dumps(results))
