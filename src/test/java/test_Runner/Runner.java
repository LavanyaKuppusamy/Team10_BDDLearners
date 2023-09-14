package test_Runner;

	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			
			plugin = {"pretty","html:target/cucumberreport.html",
					"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
					
					
			features="src/test/resources/feature",
<<<<<<< HEAD
			glue="HomePage_stepdef",
=======
			glue="step_Definitions",
>>>>>>> 0231b05d1cb4762228f957018f1bc4f3d2e8f1ae
			dryRun=true,
			monochrome=true,
			publish=true
			
			
			
			)


	public class Runner { 

	

}
