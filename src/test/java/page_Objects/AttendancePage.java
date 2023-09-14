package page_Objects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AttendancePage {

	public WebDriver driver;

	public AttendancePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	By AttendanceLink = By.linkText("Attendance");
	By title = By.xpath("//label[contains(text(), 'Student Details Page')]");

	By dropDown1 = By.xpath("//*[@id='Select Student Name']");
	By dropDown2 = By.xpath("//*[@id='Select Batch Id']");
	// By searchbox = By.xpath("//select[@input]");

	By searchBox1 = By.xpath("//*[@id='Select Student Name']/*[@type='input']");
	By searchBox2 = By.xpath("//*[@id='Select Batch Id']/*[@type='input']");
	By LMStitle = By.xpath("//table//th[3]");

	@FindBy(xpath = "//div[@class=\"Delete icon\"]")
	WebElement deletebutton;
	
	
	By anyCheckBoxChecked = By.xpath("//input[@type='checkbox' and @checked]");
	
	
	@FindBy(xpath = "//tbody/tr/td[1]")
	List<WebElement> checkboxes;
	

	public void AttendancePageclick() {
		driver.findElement(AttendanceLink).click();

	}

	public void checkTitle() {
		String actualOutput = driver.findElement(title).getText();
		Assert.assertEquals(actualOutput, "Manage Attendance");

	}

	public void verifyNavigationtime(int i) {
		long startTime = System.currentTimeMillis();
		driver.get("https://dasboardpage-url.com");
		long endTime = System.currentTimeMillis();
		long navigationTime = endTime - startTime;
		if (navigationTime <= i) {
			System.out.println("Navigation time is less or equal to +i " + navigationTime + " ms");
		} else {
			System.out.println("Navigation time is greater than +i " + navigationTime + " ms");
		}

	}

	public void verifyLMStitle() {

		String expectedtitle = "LMS-Learning Management system";
		String actualtitle = driver.findElement(LMStitle).getText();
		if (actualtitle.equalsIgnoreCase(expectedtitle)) {
			System.out.println("Title is matched");
			Assert.assertEquals(actualtitle, expectedtitle);
		} else {
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


	public void checkDeleteButton() {
		Assert.assertTrue(deletebutton.isEnabled());

	}

	public void clickDelete() {

		boolean deleteButtonPresent = false;

		Assert.assertTrue(deleteButtonPresent = deletebutton.isEnabled());

		if (deleteButtonPresent) {
			deletebutton.click();
		}

	}

	public void checkAlertPopUp() {

		Assert.assertNotEquals(null, driver.switchTo().alert());

	}

	public void getAlertValue(String value) {

		Alert alert = driver.switchTo().alert();
		
		

		if (value.equalsIgnoreCase("yes")) {
			alert.accept();
			Assert.assertTrue("The User clicked on No", alert.getText().equalsIgnoreCase("Class ID Deleted"));
		} else if (value.equalsIgnoreCase("no")) {
			alert.dismiss();
			Assert.assertTrue("The User clicked on Yes", driver.switchTo().alert()==null);
		} else if (value.equalsIgnoreCase("deleted")) {
			Assert.assertTrue("The User clicked on Yes", value.equalsIgnoreCase("deleted"));
		}

		
		
		/*
		 * String option = value; if (option.equalsIgnoreCase("yes")) { alert.accept();
		 * } else if (option.equalsIgnoreCase("No")) { alert.dismiss(); }
		 */

	}

	public void checkTableData() {
		
		Alert alert = driver.switchTo().alert();
		String studentID = alert.getText().substring(0, alert.getText().lastIndexOf(" "));
		alert.dismiss();
		
		Assert.assertTrue("No data found for studentID", (driver.findElement(By.xpath("//*[text()='"+ studentID +"']"))) !=null);
		
		
		
	}

	public void checkDeleteButtons(String val) {
		
		

		
		boolean result = false; 
		//driver.findElement(anyCheckBoxChecked)!=null ? true:false;
		
		
		for(int i=0; i < checkboxes.size(); i++) {
			if(checkboxes.get(i).isSelected()) {
				result = true;
				break;
			}
		}
		
		
		
		if(val.equalsIgnoreCase("NONE")) {
		
			Assert.assertTrue("The test fails, atleast one of the checkbox is selected", !result);
			
		} else if(val.equalsIgnoreCase("ONE")) {
			Assert.assertTrue("The test fails, none of the checkbox is selected", result);
		} else if(val.equalsIgnoreCase("MULTIPLE")) {
			
			result = (checkMultipleCheckbox()>1) ? true:false;
			
			Assert.assertTrue("The test fails, less than 2 checkbox is selected", result);
		} 
			

		
	}
	
	
	private int checkMultipleCheckbox() {
		
		
		int count = 0;
		for(int i=0; i < checkboxes.size(); i++) {
			if(checkboxes.get(i).isSelected()) {
				count++;
			}
		}
		
		return count;
	}
	
	

}
