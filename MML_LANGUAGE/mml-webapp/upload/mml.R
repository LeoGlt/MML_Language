library(utils)
library(dplyr)library(caret)library(caret)data <- read.csv('iris.csv', sep=',')
y <- data %>% select('variety')
X <- data %>% select(-'variety')
set <- sample(1:nrow(X),floor(0.8*nrow(X)))
X_train <- X[set,]
X_test <- X[-set,]y_train <- y[set]
y_test = y[-set]
mat_conf <- table(y_pred,y_test)
accuracy = precision(mat_conf, reference = y_test, relevant = "Relevant")
mat_conf <- table(y_pred,y_test)
accuracy = precision(mat_conf, reference = y_test, relevant = "Relevant")
