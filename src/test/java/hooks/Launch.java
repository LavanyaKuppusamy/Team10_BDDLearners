package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.CommonUtils;
import webdriverManager.DriverManager;

public class Launch {
	
	WebDriver driver;

	 @Before
		public void beforeScenario() {
			
			
			try {
			
				CommonUtils commonutils=new CommonUtils();
							commonutils.loadProperties();
								
				if(DriverManager.getDriver()==null) {
							
				DriverManager.launchBrowser();
					
			}}
			catch(Exception e) {
			
		}	
				
			}
			
	   @AfterStep
	   public void attachScreenshot(Scenario scenario) {
	    	
	    	if(scenario.isFailed()) {
	    		final byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
	    	scenario.attach(screenshot, "image/png", scenario.getName());
	    		
	    	}}
	    	
	    	@After
	    	public void teardown(){
	    		
	    		driver.close();
	    	}
	    	
	    	
	    	
	    }

	
	
	
	
	
	
	