#!/usr/bin/env python3
# -*- coding: utf-8 -*-
import pandas as pd 
from sklearn.model_selection import train_test_split
from sklearn.metrics import accuracy_score
from sklearn.svm import SVC
mml_data = pd.read_csv("upload/full-corpus.csv", sep=',')
y = mml_data.loc[:,['Sentiment']]
X =  mml_data.loc[:,['Topic','TweetText']]
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.19999999, random_state=0)
clf = SVC(gamma=null,C=1.0, kernel = "linear")
clf.fit(X_train, y_train)
y_pred=clf.predict(X_test)
accuracy = accuracy_score(y_test, y_pred)
print("Accuracy_1 : " + str(accuracy))
