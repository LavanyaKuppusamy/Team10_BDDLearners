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
<<<<<<< Updated upstream

public class Driver_Factory {

	public static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
=======
import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver_Factory {

	public static WebDriver dr;

	public static WebDriver getDriver() {
		return dr;
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
		
		mybrowser = property.getProperty("browser");

		if (mybrowser.equalsIgnoreCase("chrome")) {
		
			driver = new ChromeDriver();
			driver.manage().window().maximize();
=======
		/*
		 * try { property.load(reader); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */
		mybrowser = property.getProperty("browser");

		if (mybrowser.equalsIgnoreCase("chrome")) {
			// System.setProperty("webdriver.chrome.driver",
			// ".\\src\\test\\resources\\driver\\chromedriver.exe");
			// DesiredCapabilities dc3 = new DesiredCapabilities();
			// dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
			// UnexpectedAlertBehaviour.IGNORE);

			dr = new ChromeDriver();
			dr.manage().window().maximize();
>>>>>>> Stashed changes
		} else if (mybrowser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver", ".\\src\\test\\resources\\driver\\geckodriver.exe");
			DesiredCapabilities dc3 = new DesiredCapabilities();
			// dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
			// UnexpectedAlertBehaviour.IGNORE);

<<<<<<< Updated upstream
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
=======
			dr = new FirefoxDriver();
			dr.manage().window().maximize();
>>>>>>> Stashed changes
		} else if (mybrowser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", ".\\src\\test\\resources\\driver\\msedgedriver.exe");
			DesiredCapabilities dc3 = new DesiredCapabilities();
			// dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
			// UnexpectedAlertBehaviour.IGNORE);

<<<<<<< Updated upstream
			driver = new EdgeDriver();
			driver.manage().window().maximize();
=======
			dr = new EdgeDriver();
			dr.manage().window().maximize();
>>>>>>> Stashed changes
		} else {
			System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\driver\\chromedriver.exe");
			DesiredCapabilities dc3 = new DesiredCapabilities();
			// dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
			// UnexpectedAlertBehaviour.IGNORE);

<<<<<<< Updated upstream
			driver = new ChromeDriver();
			driver.manage().window().maximize();
=======
			dr = new ChromeDriver();
			dr.manage().window().maximize();
>>>>>>> Stashed changes

		}

	}

<<<<<<< Updated upstream
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
=======
}

//	public WebDriver init_driver(String browserName) {
//		
//
//
//
//
//	if(browserName.equals("chrome")) {
//	System.out.print("reached drivefactory");
//	WebDriverManager.chromedriver().setup();
//	tlDriver.set(new ChromeDriver());
//	}
//	else if(browserName.equals("firefox")) {
//	WebDriverManager.firefoxdriver().setup();
//	tlDriver.set(new FirefoxDriver());
//	}
//	else if(browserName.equals("safari")) {
//	//tlDriver.set(new SafariDriver());
//	}
//	else {
//	System.out.println("Please pass correct browser");
//	}
//
//	//getDriver().manage().deleteAllCookies();
//	//getDriver().manage().window().maximize();
//	return getDriver();
//
//	}

//	public static synchronized WebDriver getDriver() {
//	return tlDriver.get();
//
//	}
//	public static void setUpDriver() {
//	if (getDriver()== null) {
//	//LoggerLoad.info("Driver is NULL");
//	//getchromeDriver();
//	//tlDriver.set(new ChromeDriver());
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		
//
//	}
>>>>>>> Stashed changes
