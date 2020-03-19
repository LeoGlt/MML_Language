library(utils)
library(dplyr, warn.conflicts = FALSE)
library(caret)
library(e1071)
library(rpart)
library(SVM)
library(questionr)library(randomForest)
library(rjson)
data <- read.csv("upload/iris.csv", sep=',')
y <- "variety"
X <- colnames(data %>% select(-"variety"))
formula = as.formula(paste(y, paste(X,collapse = " + "), sep = " ~ "))
results = list()
set <- sample(1:nrow(data),floor(0.8*nrow(data)))
dataTrain <- data[set,]
dataTest <- data[-set,]
results[[1]] = list(model=c(), output=list())
results[[1]]$model = "Decision tree"
clf = rpart(formula = formula,data = dataTrain, method = "class",control = (maxdepth = 1),parms = list(split ="gini"))
y_pred = predict(clf, dataTest, type = "class")
mat_conf <- table(y_pred,unlist(dataTest %>% select(y)))
accuracy = sum(diag(mat_conf))/sum(mat_conf)
results[[1]]$output[[1]] = list(metric = "accuracy", value = accuracy)
results[[2]] = list(model=c(), output=list())
results[[2]]$model = "SVM"
if ("rbf"=="rbf"){
clf = svm(formula, gamma= 1/length(X),C=1, kernel = "radial", data = dataTrain,  type = "C-classification")
}else{
clf = svm(formula, gamma= 1/length(X),C=1, kernel = "rbf", data = dataTrain,  type = "C-classification")
}
y_pred=predict(clf,dataTest,type = "response")
mat_conf <- table(y_pred,unlist(dataTest %>% select(y)))
accuracy = sum(diag(mat_conf))/sum(mat_conf)
results[[2]]$output[[1]] = list(metric = "accuracy", value = accuracy)
results[[3]] = list(model=c(), output=list())
results[[3]]$model = "Logistic Regression"
clf = glmnet(formula, data = dataTrain, family = binomial(logit))
y_pred=predict(clf,type = "response", newdata = dataTest)
mat_conf <- table(y_pred,unlist(dataTest %>% select(y)))
accuracy = sum(diag(mat_conf))/sum(mat_conf)
results[[3]]$output[[1]] = list(metric = "accuracy", value = accuracy)
results[[4]] = list(model=c(), output=list())
results[[4]]$model = "Random Forest"
clf = randomForest(y = as.factor(dataTrain[,y]), x = dataTrain[,X], ntree = 10)
y_pred=predict(clf,dataTest, type = "class")
mat_conf <- table(y_pred,unlist(dataTest %>% select(y)))
accuracy = sum(diag(mat_conf))/sum(mat_conf)
results[[4]]$output[[1]] = list(metric = "accuracy", value = accuracy)
print(writeLines(toJSON(results)))
