package page_Objects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Loggerload;
import webdriverManager.DriverManager;

public class AttendancePage1 {

	private static final Object Attendance_PAGE_TITLE = null;
	public WebDriver driver;

	public AttendancePage1(WebDriver driver) {
		this.driver = driver;

	}
	
	By AttendanceLink = By.linkText("Attendance");
	By title = By.xpath("//label[contains(text(), 'Student Details Page')]");
	
	By dropDown1 = By.xpath("//*[@id='Select Student Name']");
	By dropDown2 = By.xpath("//*[@id='Select Batch Id']");
    //By searchbox = By.xpath("//select[@input]");
    
    By searchBox1 = By.xpath("//*[@id='Select Student Name']/*[@type='input']");
    By searchBox2 = By.xpath("//*[@id='Select Batch Id']/*[@type='input']");
    By LMStitle=By.xpath("//table//th[3]");
	
	public void AttendancePageclick() {
		driver.findElement(AttendanceLink).click();
		
	}

	public void checkTitle() {
		String actualOutput = driver.findElement(title).getText();
		 Assert.assertEquals(actualOutput,Attendance_PAGE_TITLE);
		
	}

	public void verifyNavigationtime(int i) {
		 long startTime = System.currentTimeMillis(); 
		    driver.get("https://dasboardpage-url.com");
		    long endTime = System.currentTimeMillis();
		    long navigationTime = endTime - startTime; 
		    if(navigationTime <= i) {
		    	 System.out.println("Navigation time is less or equal to +i " + navigationTime + " ms");
		    }else
		    {
		   	 System.out.println("Navigation time is greater than +i " + navigationTime + " ms");
		   }
		
	}

	public void verifyLMStitle() {
		
		String expectedtitle="LMS-Learning Management system";
		String actualtitle=driver.findElement(LMStitle).getText();
		if(actualtitle.equalsIgnoreCase(expectedtitle)) {
			System.out.println("Title is matched");
			Assert.assertEquals(actualtitle, expectedtitle);
		}else {
				System.out.println("Title is not matched");
		}
	}

	public void verifyLMSAlign() {
		WebElement LMS = driver.findElement(By.xpath("//table//tr[2]/td[3]")); 
		String textAlignment = LMS.getCssValue("text-align");

		if (textAlignment.equals("Top-left")) {
		    System.out.println("Text is Top-left.");
		} else if (textAlignment.equals("left")) {
		    System.out.println("Text is left-aligned.");
		} else if (textAlignment.equals("right")) {
		    System.out.println("Text is right-aligned.");
		} else if (textAlignment.equals("justify")) {
		    System.out.println("Text is justified.");
		} else {
		    System.out.println("Unknown text alignment: " + textAlignment);
		}
	}

	public void checkdeleteicon() {
		 {
			AttendancePage1 attendancePage;
		//	System.out.println(attendancePage.checkdeleteicon());
			Loggerload.info("Delete icon is present in Attendance Main Page");
		}
	}

	
		
	
	public void clickDelete() {
		
		
	}

	public void addnewattendance() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
