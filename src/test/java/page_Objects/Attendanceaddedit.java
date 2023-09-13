package page_Objects;

public class Attendanceaddedit {
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import utilities.Loggerload;

	public class Attendanceaddedit {

		public UserAddedit(WebDriver driver) {
			Loggerload.info("Entered into User Delete Page");
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath = "//h1[text()=\"User Details\"]")	WebElement header;
		@FindBy(xpath = "//button[text()=\"Submit\"]")	WebElement submitButton;
		@FindBy(xpath = "//input[@id=\"First\"]") WebElement fname;
		@FindBy(xpath = "//input[@id=\"last\"]") WebElement lname;
		@FindBy(xpath = "//input[@id=\"middle\"]") WebElement mname;
		@FindBy(xpath = "//input[@id=\"location\"]") WebElement place;
		@FindBy(xpath = "//input[@id=\"phone\"]") WebElement phone;
		@FindBy(xpath = "//input[@id=\"linkedinUrl\"]") WebElement linkedUrl;
		@FindBy(xpath = "//input[@id=\"undergraduate\"]") WebElement ug;
		@FindBy(xpath = "//input[@id=\"postgraduate\"]") WebElement pg;
		@FindBy(xpath = "//input[@id=\"timezone\"]") WebElement timeZone;
		@FindBy(xpath = "//input[@id=\"usercomments\"]") WebElement comments;
		@FindBy(xpath = "//div[@class='userRole dropdown']/a") WebElement userRole;
		@FindBy(xpath = "//div[@class='roleStatus dropdown']/a") WebElement roleStatus;
		@FindBy(xpath = "//div[@class='visaStatus dropdown']/a") WebElement visaStatus;
		
		@FindBy(xpath = "//div[@role='alert']")	WebElement alertmsg;
		
		public String getHeader() {
			return header.getText();
		}

		public void clickSubmit() {
			submitButton.click();
			
		}
ocatio
		public void enterAttendanceDetails(String programname, String classname, String studentname, String Attendance, String phoneno,
				String linkedurl, String undergraduate, String postgraduate, String timezone, String usercomments,
				String userrole, String rolestatus, String visastatus) {
			
			fname.sendKeys(firstname);
			mname.sendKeys(middlename);
			lname.sendKeys(lastname);
			place.sendKeys(location);
			phone.sendKeys(phoneno);
			linkedUrl.sendKeys(linkedurl);
			ug.sendKeys(undergraduate);
			pg.sendKeys(postgraduate);
			timeZone.sendKeys(timezone);
			comments.sendKeys(usercomments);
			userRole.sendKeys(userrole);
			roleStatus.sendKeys(rolestatus);
			visaStatus.sendKeys(visastatus);
		}

		public String alertdismsg() {
			return alertmsg.getText();
		}

		public void clearField() {
			userRole.clear();
			
		}

		public void clearDescription() {
			comments.clear();
			
		}
		
	}
}
