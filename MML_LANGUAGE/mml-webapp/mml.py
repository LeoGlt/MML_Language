import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.svm import SVC
from sklearn.metrics import accuracy_score
from sklearn.metrics import recall_score
mml_data = pd.read_csv('iris.csv', sep=',')
y = mml_data.iloc[:,len(mml_data.columns)-1]
X =  mml_data.drop(mml_data.columns[len(mml_data.columns)-1], axis=1)
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.3, random_state=0)
clf = SVC(gamma='auto')
clf.fit(X_train, y_train)
y_pred=clf.predict(X_test)
accuracy = accuracy_score(y_test, y_pred)
print(accuracy)
recall = recall_score(y_test, y_pred, average = None)
print(recall)
