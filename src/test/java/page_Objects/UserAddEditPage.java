package page_Objects;

import java.util.List;

import org.jsoup.internal.FieldsAreNonnullByDefault;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;
import utilities.Loggerload;

public class UserAddEditPage {

	public UserAddEditPage(WebDriver driver) {
		Loggerload.info("Entered into User Main Page");
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[text()=\"User Details\"]")
	WebElement userDetails;
	
	@FindBy(xpath = "//form[@name='something']/*")
	List<WebElement> allFormElements;
	
	@FindBy(id = "FirstName")	WebElement firstname;
	@FindBy(id = "MiddleName")	WebElement middlename;
	@FindBy(id = "LastName")	WebElement lastname;
	@FindBy(id = "Location")	WebElement location;
	@FindBy(id = "PhoneNumber")	WebElement phoneno;
	@FindBy(id = "Linledlisturl")	WebElement linkedurl;
	@FindBy(id = "UnderGraduate")	WebElement undergraduate;
	@FindBy(id = "postGraduate")	WebElement postgraduate;
	@FindBy(id = "TimeZone")	WebElement timezone;
	@FindBy(id = "UserComments")	WebElement usercomments;
	@FindBy(xpath = "//select[@id=\"userRole\"]")	WebElement userrole;
	@FindBy(xpath = "//select[@id=\"RoleStatus\"]")	WebElement rolestatus;
	@FindBy(xpath = "//select[@id=\"VisaStatus\"]")	WebElement visastatus;
	
	@FindBy(xpath = "//input[@type =\"submit\"]") WebElement submitButton;
	@FindBy(xpath = "//div[@role='alert']") WebElement alertmsg;
	
	public String getHeader() {
		return userDetails.getText();
	}
    public List<WebElement> userDetails() {
    	return allFormElements;
    }
    
    public void enterUserDetails(String firstname2, String middlename2, String lastname2, String location2,
			String phoneno2, String linkedurl2, String undergraduate2, String postgraduate2, String timezone2,
			String usercomments2, String userrole2, String rolestatus2, String visastatus2) {
		firstname.sendKeys(firstname2);
		middlename.sendKeys(middlename2);
		lastname.sendKeys(lastname2);
		location.sendKeys(location2);
		phoneno.sendKeys(phoneno2);
		linkedurl.sendKeys(linkedurl2);
		undergraduate.sendKeys(undergraduate2);
		postgraduate.sendKeys(postgraduate2);
		timezone.sendKeys(timezone2);
		usercomments.sendKeys(usercomments2);
		userrole.sendKeys(userrole2);
		rolestatus.sendKeys(rolestatus2);
		visastatus.sendKeys(visastatus2);
		
		
	}
    public void clickSubmit() {
    	submitButton.click();
    }
    public String alertdismsg() {
		return alertmsg.getText();
	}
    //clearing a mandatory field while updating
    public void clearField() {
    	location.clear();
    }
   //erase data from description field
    public void clearDescription() {
    	usercomments.clear();
    }
}
