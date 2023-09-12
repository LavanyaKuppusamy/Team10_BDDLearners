package driver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import utilities.*;

public class Driver_Factory {

	public static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public void setDriver() {
		FileReader reader = null;
		String mybrowser;

		try {
			reader = new FileReader("/DsAlgoProject/src/test/resources/Config/config.properties");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties property = new Properties();
		
		mybrowser = property.getProperty("browser");

		if (mybrowser.equalsIgnoreCase("chrome")) {
		
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (mybrowser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver", ".\\src\\test\\resources\\driver\\geckodriver.exe");
			DesiredCapabilities dc3 = new DesiredCapabilities();
			// dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
			// UnexpectedAlertBehaviour.IGNORE);

			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else if (mybrowser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", ".\\src\\test\\resources\\driver\\msedgedriver.exe");
			DesiredCapabilities dc3 = new DesiredCapabilities();
			// dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
			// UnexpectedAlertBehaviour.IGNORE);

			driver = new EdgeDriver();
			driver.manage().window().maximize();
		} else {
			System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\driver\\chromedriver.exe");
			DesiredCapabilities dc3 = new DesiredCapabilities();
			// dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
			// UnexpectedAlertBehaviour.IGNORE);

			driver = new ChromeDriver();
			driver.manage().window().maximize();

		}

	}

	public  static void openPage(String url) {
		Loggerload.info("current page :"+url);
		getDriver().get(url);
	}
	public  static String getdriverTitle() {
		return getDriver().getTitle();
	}
	public  static void NavBack() {
		getDriver().navigate().back();
	}
	
	
	public void setUpDriver(String browser) {
		//if (getDriver()==null) {
		System.out.println("inside setupdriver"+browser);
		//browsertype = browser;
			//getchromeDriver();
		//}
		}

	
	public  static void tearDown() {
		if(getDriver()!=null) {
			Loggerload.info("enter teardown");
			getDriver().close();
			getDriver().quit();
			driver=null;
		}
		
		
	}
	
	
	
	

}
