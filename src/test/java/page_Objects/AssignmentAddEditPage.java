package page_Objects;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.joda.time.format.DateTimeFormat;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AssignmentAddEditPage {

	public AssignmentAddEditPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@role='alert']")
	WebElement alertmsg;

	@FindBy(xpath = "//button[text() = \"+ A New Assignment \"]")
	WebElement addNewAssignmentButton;
	@FindBy(xpath = "//h1[text()=\"Assignment Details\"]")
	WebElement header;
	@FindBy(tagName = "input")
	List<WebElement> inputBox;
	@FindBy(xpath = "//select[@placeholder = \"Batch number\"]")
	WebElement dropDownBatch;
	@FindBy(xpath = "//select[@placeholder = \"Program Name\"]")
	WebElement dropDownProgram;
	@FindBy(xpath = "//*[@id =\"Assignment due date\"]")
	WebElement calender;
	@FindBy(xpath = "//button[text()='save']")
	WebElement savebutton;
	@FindBy(xpath = "//button[text()='cancel']")
	WebElement cancelbutton;
	@FindBy(xpath = "//button[text()='cancel']")
	WebElement closebutton;

	// adding new Assignment
	@FindBy(xpath = "//input[@id=\"program name\"]")
	WebElement programName;
	@FindBy(xpath = "//input[@id=\"batch number\"]")
	WebElement batchNumber;
	@FindBy(xpath = "//input[@id=\"assignment Name\"]")
	WebElement assignmentName;
	@FindBy(xpath = "//input[@id=\"assignment desc\"]")
	WebElement assignmentDesc;
	@FindBy(xpath = "//input[@id=\"grade by\"]")
	WebElement gradeBy;
	@FindBy(xpath = "//input[@id=\"assignment dueDate\"]")
	WebElement assignmentdueDate;
	@FindBy(xpath = "//input[@id=\"assignment file1\"]")
	WebElement assignmentfile1;
	@FindBy(xpath = "//input[@id=\"assignment file2\"]")
	WebElement assignmentfile2;
	@FindBy(xpath = "//input[@id=\"assignment file3\"]")
	WebElement assignmentfile3;
	@FindBy(xpath = "//input[@id=\"assignment file4\"]")
	WebElement assignmentfile4;
	@FindBy(xpath = "//input[@id=\"assignment file5\"]")
	WebElement assignmentfile5;

	@FindBy(xpath = "//div[@class='ui-datepicker-inline]/span")
	List<WebElement> datePicker;
	@FindBy(xpath = "//div[@class='ui-datepicker-inline']/div[2]/table/tbody/tr/td/a")
	List<WebElement> day;
	@FindBy(xpath = "//input[@id='ui-datepicker-text']")
	WebElement inputDate;
	@FindBy(xpath = "//input[@id='ui-datepicker-rightarrow']")
	WebElement monthRightArrow;
	@FindBy(xpath = "//input[@id='ui-datepicker-lefttarrow']")
	WebElement monthLeftArrow;
	
	//Edit
	@FindBy(xpath = "//tbody/tr/td[6]")
	List<WebElement> editIcon;
	
	public void clickEditIcon() {
		for(int i=0;i<editIcon.size();i++) {
			editIcon.get(i).click();
			break;
	}
	}

	public void clkAddNewAssignment() {
		addNewAssignmentButton.click();

	}

	public String getAssignmentHeader() {
		return header.getText();
	}

	public int getInputBoxCount() {
		return inputBox.size();

	}

	public String chkForBatchDropdown() {
		return dropDownBatch.getAttribute("placeholder");

	}

	public String chkForPogramDropdown() {
		return dropDownProgram.getAttribute("placeholder");
	}

	public boolean checkforCalenderIcon() {
		return calender.isDisplayed();
	}
	public void clickCalenderIcon() {
		calender.click();
	}

	public boolean chkSaveButton() {
		return savebutton.isDisplayed();
	}

	public void clickkSaveButton() {
		savebutton.click();
	}

	public boolean chkCancelButton() {
		return cancelbutton.isDisplayed();
	}
	public void clkCancelButton() {
		 cancelbutton.click();
	}

	public boolean chkCloseButton() {
		return closebutton.isDisplayed();
	}

	public void enterAssignmentDetails(String program_name, String batch_number, String assignment_Name,
			String assignment_desc, String grade_by, String assignment_dueDate, String assignment_file1,
			String assignment_file2, String assignment_file3, String assignment_file4, String assignment_file5) {
		programName.sendKeys(program_name);
		batchNumber.sendKeys(batch_number);
		assignmentName.sendKeys(assignment_Name);
		assignmentDesc.sendKeys(assignment_desc);
		gradeBy.sendKeys(grade_by);
		assignmentdueDate.sendKeys(assignment_dueDate);
		assignmentfile1.sendKeys(assignment_file1);
		assignmentfile2.sendKeys(assignment_file2);
		assignmentfile3.sendKeys(assignment_file3);
		assignmentfile4.sendKeys(assignment_file4);
		assignmentfile5.sendKeys(assignment_file5);

	}

	public String alertdismsg() {
		return alertmsg.getText();
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
	
	public String getDate() {
	     //inputDate.getText()---gets the date present in the input box
		return inputDate.getText();
	}		
	public void clkDateRightArrow() {
		monthRightArrow.click();
	}

	public void clkDateLefttArrow() {
		monthLeftArrow.click();
		
	}
	public boolean highlightDate() {
		
		for (WebElement d : day) {

			if (d.isSelected()) {
				break;
			}
		}
		return true;
		
	}
	

}
