package page_Objects;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.FindBys;

public class AttendanceEditPage {
	
	WebDriver driver;
	Actions action;
		
	public AttendanceEditPage(WebDriver wdriver) {
		driver=wdriver;
		action =new Actions(driver);
		PageFactory.initElements(driver,this);
		
	}
	
	
	//Create
	
	@FindBy(xpath = "//*[text()='A New Attendance']")
	@CacheLookup
	WebElement btnNewAttandance;
	
	
	@FindBy(xpath = "//input[@id='Program Name']")WebElement ProgramName;
	@FindBy(xpath = "//input[@id='Class Name']")WebElement ClassName;
	@FindBy(xpath = "//input[@id='Student Name']")WebElement StudentName;
	@FindBy(xpath = "//input[@id='Attendance']")WebElement Attendance;
	@FindBy(xpath = "//input[@id='attendance_date']")WebElement AttendDate;
	@FindBy(xpath = "//*[text()='Cancel']")
	@CacheLookup
	WebElement btnCancel;
	
	@FindBy(xpath = "//*[text()='Save']")
	@CacheLookup
	WebElement btnSave;
	
	public void clickAddAttendance()
	{
		btnNewAttandance.click();
		}
	
	
	
	public void setProgName(String progName) {
	     Select se= new Select(ProgramName);
	     se.selectByVisibleText(progName);
	     ProgramName.getText();
	}
	
	public void setClassName(String className) {
	     Select se1= new Select(ClassName);
	     se1.selectByVisibleText(className);
	     ClassName.getText();
	}
	
	public void setStudName(String studName) {
	     Select se2= new Select(StudentName);
	     se2.selectByVisibleText(studName);
	     StudentName.getText();
	}
	
	public void setAttendance(String attendance) {
	     Select se3= new Select(Attendance);
	     se3.selectByVisibleText(attendance);
	     Attendance.getText();
	}
	
	public void clickAttendDate()
	{
		AttendDate.click();
		}
	@FindBy(xpath = "//div[@class='ui-datepicker-inline]/span")
	List<WebElement> datePicker;
	@FindBy(xpath = "//div[@class='ui-datepicker-inline']/div[2]/table/tbody/tr/td/a")
	List<WebElement> day;
	
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
	
	public void EnterAttendanceDetails(String programName,String className,String studentName,String attendance,String attendanceDate) {
		ProgramName.clear();
		ProgramName.sendKeys(programName);
		ClassName.sendKeys(className);
		StudentName.sendKeys(studentName);
		Attendance.sendKeys(attendance);
		AttendDate.sendKeys(attendanceDate);
		
	}
	
	public void ClickConfirmation(String status)   {
		if (status.equalsIgnoreCase("Save")) {
			action.moveToElement(btnSave).click().build().perform();
		}
		if (status.equalsIgnoreCase("Cancel")){
			action.moveToElement(btnCancel).click().build().perform();
		}
	}
	
	//Table Body Element
			@FindBys({
				@FindBy(xpath = "//table//tbody//tr") 
			})List<WebElement> PageGridDetail;
	
	public int GetRecordCount() {
		return PageGridDetail.size();
	}
	
	@FindBys({
		@FindBy(xpath = "//button[@icon='pi pi-pencil']") 
	})List<WebElement> iconEdit;
	
	public void ClickEditButton(int index) {
		action.moveToElement(iconEdit.get(index)).click().build().perform();
	}
	
	
	public int getRandomIndex(int limit) {
		Random random =new Random();
		return random.nextInt(limit-1);
	}
	
	//Success Message Popup
	
			public String GetSuccessMessage() {
				WebElement MsgElement = driver.findElement(By.xpath("//p-toast//p-toastitem"));
				String Msg = MsgElement.getText();
				return Msg;
			}

}
