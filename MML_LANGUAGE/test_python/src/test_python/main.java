package test_python;

import org.python.util.PythonInterpreter;

import org.python.core.*; 

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pythonCode = "";
		
		PythonInterpreter interpreter = new PythonInterpreter();
		interpreter.exec(pythonCode);
		PyObject accuracy = interpreter.get("accuracy");
		System.out.println("accuracy: " + accuracy);
		
		


	}

}

