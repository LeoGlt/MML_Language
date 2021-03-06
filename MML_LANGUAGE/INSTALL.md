# Installing the MML application 
This document gives the instructions to install the MML application and all the dependencies required.

## All systems (Linux, Mac OS X, and Windows)
1. Install an Eclipse distribution which support Xtext : http://www.eclipse.org/downloads/eclipse-packages/, choose "Eclipse IDE for Java and DSL Developers"

2. Clone the MML repository from Github :

	git clone https://github.com/LeoGlt/MML_Language.git

3. In Eclipse, import the projects of the repository into your workspace :
 
	File > Import > General > Existing Projects into Workspace > Browse and select the repository folder > select all the projects > Finish

4. Launch the server : in the mml-webapp project, go to src/main/java > default package > run Main.java

5. Start the web client : in a web browser, go to http://localhost:8080/

## Dependencies 
The following librairies are required :

- Java
- Python 3.5
- Numpy
- scikit-learn
- pandas
- json
- R 
- dplyr
- rpart
- randomForest
- questionr
- caret
- e1071
- lattice
- ggplot2
- rjson
- utils

