liRbrary(utils)
library(dplyr)library(caret)data <- read.csv('iris.csv', sep=',')
y <- data %>% select('variety')
X <- data %>% select(-'variety')
mat_conf <- table(y_pred,y_test)
 first_row = mat_conf[1,1] / (mat_conf[1,1] + mat_conf[1,2])  
 second_row <- mat_conf[2,2] / (mat_conf[2,1] + mat_conf[2,2])  
 balanced_accuracy = (first_row + second_row)/2