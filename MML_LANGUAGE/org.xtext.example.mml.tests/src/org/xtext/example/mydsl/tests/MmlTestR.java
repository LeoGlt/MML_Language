package org.xtext.example.mydsl.tests;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.xtext.example.mydsl.generator.MMLCompiler;
import org.xtext.example.mydsl.mml.MMLModel;

import com.google.inject.Inject;

@ExtendWith(InjectionExtension.class)
@InjectWith(MmlInjectorProvider.class)
public class MmlTestR{

	@Inject
	ParseHelper<MMLModel> parseHelper;
	
	@Test
	public void loadModel() throws Exception {
		MMLModel result = parseHelper.parse("datainput \"iris.csv\"\n"
				+ "mlframework R\n"
				+ "algorithm DT\n"
				+ "TrainingTest { percentageTraining 70 }\n"
				+ "recall\n"
				+ "");
		Assertions.assertNotNull(result);
		EList<Resource.Diagnostic> errors = result.eResource().getErrors();
		Assertions.assertTrue(errors.isEmpty(), "Unexpected errors");			
		Assertions.assertEquals("iris.csv", result.getInput().getFilelocation());			
		
	}	
	
	@Test
	public void compileDT() throws Exception {
		MMLModel result = parseHelper.parse("datainput \"iris.csv\" separator ,\n"
				+ "mlframework R\n"
				+ "algorithm DT max_depth=10 criterion=gini\n"
				+ "TrainingTest { percentageTraining 70 }\n"
				+ "accuracy\n"
				+ "recall\n"
				+ "");
		
		MMLCompiler mmlCompiler = new MMLCompiler(result);
		List<String> output = mmlCompiler.generate_code();
		String metrics = output.get(2);
		String errors = output.get(4);
		Assertions.assertTrue(metrics != "");
		Assertions.assertTrue(errors == "");
	}
	
	@Test
	public void compileSVM() throws Exception {
		MMLModel result = parseHelper.parse("datainput \"iris.csv\" separator ,\n"
				+ "mlframework R\n"
				+ "algorithm SVM gamma=auto C=1 kernel=rbf\n"
				+ "TrainingTest { percentageTraining 70 }\n"
				+ "accuracy\n"
				+ "recall\n"
				+ "");
		
		MMLCompiler mmlCompiler = new MMLCompiler(result);
		List<String> output = mmlCompiler.generate_code();
		String metrics = output.get(2);
		String errors = output.get(4);
		Assertions.assertTrue(metrics != "");
		Assertions.assertTrue(errors == "");
	}
	
	@Test
	public void compileLogit() throws Exception {
		MMLModel result = parseHelper.parse("datainput \"iris.csv\" separator ,\n"
				+ "mlframework R\n"
				+ "algorithm LR penalty=l2 tol=0.0001 C=1\n"  
				+ "TrainingTest { percentageTraining 70 }\n"
				+ "accuracy\n"
				+ "recall\n"
				+ "");
		
		MMLCompiler mmlCompiler = new MMLCompiler(result);
		List<String> output = mmlCompiler.generate_code();
		String metrics = output.get(2);
		String errors = output.get(4);
		Assertions.assertTrue(metrics != "");
		Assertions.assertTrue(errors == "");
	}
	
	@Test
	public void compileRF() throws Exception {
		MMLModel result = parseHelper.parse("datainput \"iris.csv\" separator ,\n"
				+ "mlframework R\n"
				+ "algorithm RF n_estimators=10 max_depth=100 criterion=gini\n"
				+ "TrainingTest { percentageTraining 70 }\n"
				+ "accuracy\n"
				+ "recall\n"
				+ "");
		
		MMLCompiler mmlCompiler = new MMLCompiler(result);
		List<String> output = mmlCompiler.generate_code();
		String metrics = output.get(2);
		String errors = output.get(4);
		Assertions.assertTrue(metrics != "");
		Assertions.assertTrue(errors == "");
	}
	
	@Test
	public void testFormula() throws Exception {
		MMLModel result = parseHelper.parse("datainput \"iris.csv\" separator ,\n" + 
				"mlframework R\n" + 
				"algorithm RF n_estimators=10 max_depth=100 criterion=gini\n" + 
				"formula \"variety\" ~ \"sepal.length\" + \"sepal.width\" + \"petal.width\" \n" + 
				"TrainingTest { percentageTraining 80 } \n" + 
				"accuracy");
		
		MMLCompiler mmlCompiler = new MMLCompiler(result);
		List<String> output = mmlCompiler.generate_code();
		String metrics = output.get(2);
		String errors = output.get(4);
		Assertions.assertTrue(metrics != "");
		Assertions.assertTrue(errors == "");
	}
	
	@Test
	public void testMetricsTrainTest() throws Exception {
		MMLModel result = parseHelper.parse("datainput \"iris.csv\" separator ,\n" + 
				"mlframework R\n" + 
				"algorithm RF n_estimators=10 max_depth=100 criterion=gini\n" + 
				"formula \"variety\" ~ \"sepal.length\" + \"sepal.width\" + \"petal.width\" \n" + 
				"TrainingTest { percentageTraining 80 } \n" + 
				"accuracy recall precision F1 balanced_accuracy ");
		
		MMLCompiler mmlCompiler = new MMLCompiler(result);
		List<String> output = mmlCompiler.generate_code();
		String metrics = output.get(2);
		String errors = output.get(4);
		Assertions.assertTrue(metrics != "");
		Assertions.assertTrue(errors == "");
	}
	
	@Test
	public void testMetricsCrossVal() throws Exception {
		MMLModel result = parseHelper.parse("datainput \"iris.csv\" separator ,\n" + 
				"mlframework R\n" + 
				"algorithm RF n_estimators=10 max_depth=100 criterion=gini\n" + 
				"formula \"variety\" ~ \"sepal.length\" + \"sepal.width\" + \"petal.width\" \n" + 
				"CrossValidation { numRepetitionCross 5 } \n" + 
				"accuracy recall precision F1 balanced_accuracy \n");
		
		MMLCompiler mmlCompiler = new MMLCompiler(result);
		List<String> output = mmlCompiler.generate_code();
		String metrics = output.get(2);
		String errors = output.get(4);
		Assertions.assertTrue(metrics != "");
		Assertions.assertTrue(errors == "");
	}
	
	@Test
	public void testWrongSeparator() throws Exception {
		//The separator for the dataset iris is ",", choose ";" should return an error
		MMLModel result = parseHelper.parse("datainput \"iris.csv\" separator ;\n" + 
				"mlframework R\n" + 
				"algorithm RF\n" + 
				"CrossValidation { numRepetitionCross 5 } \n" + 
				"accuracy \n");
		
		MMLCompiler mmlCompiler = new MMLCompiler(result);
		List<String> output = mmlCompiler.generate_code();
		String metrics = output.get(2);
		String errors = output.get(4);
		Assertions.assertTrue(metrics == "");
		Assertions.assertTrue(errors != "");
	}
	

	private String mkValueInSingleQuote(String val) {
		return "'" + val + "'";
	}


}