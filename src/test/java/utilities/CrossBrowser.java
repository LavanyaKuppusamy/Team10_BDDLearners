package utilities;

import utilities.Loggerload;
import java.time.Duration;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	
	public static WebDriver driver;
	
	public WebDriver setupDriver (String browser) throws Throwable {
		
				
		if(browser.equalsIgnoreCase("Chrome")) {
			Loggerload.info("Testing in Chrome browser");
			ChromeOptions ops = new ChromeOptions();
			
			WebDriverManager.chromedriver().setup();
			
			ops.addArguments("--remote-allow-origins=*");
			// this will make sure that alters does not close automatically 
			//and allow us to handle alert in code.
			ops.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);
			driver = new ChromeDriver(ops);
			
		}
		
		else if(browser.equalsIgnoreCase("Firefox")) {
			
			Loggerload.info("Testing in Firefox browser");
			
			
			WebDriverManager.firefoxdriver().setup();
			// this will make sure that alters does not close automatically 
						//and allow us to handle alert in code.
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability(CapabilityType.UNHANDLED_PROMPT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
			
			FirefoxOptions opt = new FirefoxOptions(dc);
			driver = new FirefoxDriver(opt);
			
		}
		
		else if(browser.equalsIgnoreCase("Edge")) {
			
			Loggerload.info("Testing in Edge browser");
			WebDriverManager.edgedriver().setup();
			// this will make sure that alters does not close automatically 
						//and allow us to handle alert in code.
			EdgeOptions opts = new EdgeOptions();
			opts.setCapability(CapabilityType.UNHANDLED_PROMPT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
			driver = new EdgeDriver(opts);
			
		}
		else {
			throw new IllegalArgumentException("Invalid browser name");
		}
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public static WebDriver getDriver() {
		
		return driver;
	}
	
	public static void closeDriver() {
		
		driver.quit();
	}
	

}
