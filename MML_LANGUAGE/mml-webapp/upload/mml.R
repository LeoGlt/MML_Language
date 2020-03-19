library(utils)
library(dplyr, warn.conflicts = FALSE)
library(caret)
library(e1071)
library(rpart)
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
print(toJSON(results))
