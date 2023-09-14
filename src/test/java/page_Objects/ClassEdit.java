package page_Objects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Loggerload;


public class ClassEdit {
	
	WebDriver driver;
	Actions action;
	
	
	
	@FindBy(xpath = "//a[@href='Class']")WebElement ClassLink;
	@FindBy(xpath = "//div[@type='Edit Icon']")WebElement editIcon;
	@FindBy(xpath = "//div[@value='popup']")WebElement popuptextbox;
	@FindBy(xpath = "//div[@type='Edit Icon']")List<WebElement> editIcons;
	@FindBy(xpath = "//input[@id='batchID']")WebElement batchID;
	@FindBy(xpath = "//input[@id='noofClasses']")WebElement noOfClasses;
	@FindBy(xpath = "//input[@id='classDate']")WebElement classDate ;
	@FindBy(xpath = "//input[@id='StaffId']")WebElement staffId;
	@FindBy(xpath = "//input[@id='Class_Topic ']")WebElement classTopic ;
	@FindBy(xpath = "//input[@id='Class_description']")WebElement classDescr;
	@FindBy(xpath = "//input[@id='Comments']")WebElement comments;
	@FindBy(xpath = "//input[@id='Notes']")WebElement notes;
	@FindBy(xpath = "//input[@id='Recordings']")WebElement recordings;
	@FindBy(xpath = "//div[@class='ui-datepicker-inline]/span")List<WebElement> datePicker;
	@FindBy(xpath = "//div[@class='ui-datepicker-inline']/div[2]/table/tbody/tr/td/a")List<WebElement> day;
	@FindBy(xpath = "//*[text()='Cancel']")WebElement btnCancel;
	@FindBy(xpath = "//*[text()='Save']")WebElement btnSave;
	@FindBy(xpath= "//p-toast//p-toastitem")WebElement MsgElement;
	@FindBy(xpath="//div[@class='alert alert-primary']")WebElement ErrMsg;
	
	
	public void EditclassPage() {
		action =new Actions(driver);
		PageFactory.initElements(driver, this);
	}
	 public void dashboard_classlink() {
 		ClassLink.click();
 		Loggerload.info("User clicks on class link");
 	}
	 public void ClickEditIcon() {
   	  editIcon.click();
     }
	 public boolean CheckPopup() {
		return popuptextbox.isDisplayed();
	 }
	 public void selectSingleEditIcon() {
		 for(int i=0;i< editIcons.size();i++) {
			 editIcons.get(i).click();
			 break;
		 }
	 }
	public void setBatchID(int BatchiD){
		     Select se= new Select(batchID);
		     se.selectByValue("BatchiD");
		     batchID.getText();
		    
		}
		
public void setstaffid(String staffid ) {
		     Select se1= new Select(staffId);
		     se1.selectByVisibleText(staffid);
		     staffId.getText();
		}
public void SetNoOfClasses(String classnos) {
	noOfClasses.click();
	noOfClasses.clear();
	noOfClasses.sendKeys(classnos);
	}
public void SetClassTopic(String classtopic) {
	classTopic.click();
	classTopic.clear();
	classTopic.sendKeys(classtopic);
	}
public void SetClassDescr(String classdescription) {
	classDescr.click();
	classDescr.clear();
	classDescr.sendKeys(classdescription);
}
public void SetComment(String comm) {
	comments.click();
	comments.clear();
	comments.sendKeys(comm);
}
public void SetNotes(String note) {
	notes.click();
	notes.clear();
	notes.sendKeys(note);
}
public void SetRecordings(String recording) {
	recordings.click();
	recordings.clear();
	recordings.sendKeys(recording);
}
public void clickAttendDate()
{
	classDate.click();
	}
public void selectDate(String month_year, String select_day) throws InterruptedException {

	for (int i = 0; i < datePicker.size(); i++) {
		// Selecting the month
		if (datePicker.get(i).getText().equals(month_year))

			// Selecting the date
			for (WebElement d : day) {

				if (d.getText().equals(select_day)) {
					d.click();
					break;
				}
			}
	}
	 
}	 

public void EnterClassDetails(String BatchID, String NoofClasses, String ClassDate , String StaffId ) {
	    
	
	batchID.clear();
	batchID.sendKeys(BatchID);
	noOfClasses.sendKeys(NoofClasses);
	classDate.sendKeys(ClassDate);
	staffId.sendKeys(StaffId);
	
	}
public void ClickConfirmation(String status)   {
	if (status.equalsIgnoreCase("Save")) {
		action.moveToElement(btnSave).click().build().perform();
	}
	if (status.equalsIgnoreCase("Cancel")){
		action.moveToElement(btnCancel).click().build().perform();
	}
}

public void EnterAllClassDetails(String BatchID, String NoofClasses, String ClassDate , String StaffId,String ClassTopic, String Classdescription, String Comments , String Notes , String Recordings) {
     
	batchID.clear();
	batchID.sendKeys(BatchID);
	noOfClasses.sendKeys(NoofClasses);
	classDate.sendKeys(ClassDate);
	staffId.sendKeys(StaffId);
	classTopic.sendKeys(ClassTopic);
	classDescr.sendKeys(Classdescription);
	comments.sendKeys(Comments);
	notes.sendKeys(Notes);
	recordings.sendKeys(Recordings);
}
public String GetSuccessMessage() {
	
	String Msg = MsgElement.getText();
	return Msg;
}
public String verifyErrorMsg() {
	Loggerload.info("verify the error message");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String mes=ErrMsg.getText();
	Loggerload.warn(mes);
	return mes;
}
	public void Clickcancelbtn() {
	btnCancel.click();
	}

}



