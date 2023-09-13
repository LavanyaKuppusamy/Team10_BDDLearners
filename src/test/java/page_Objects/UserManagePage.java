package page_Objects;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Loggerload;

public class UserManagePage {

	public UserManagePage(WebDriver driver) {
		Loggerload.info("Entered into User Main Page");
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[text()=\"Manage User\"]")
	WebElement manageUser;

	@FindBy(xpath = "//span[@class =\"Pagination__StyledSpan-sc-sq3l8r-5 geUUhj\"]")
	WebElement pagenation;
	
	@FindBy(xpath = "//span[@class =\"Pagination__StyledSpan-sc-sq3l8r-5 Next\"]")
	WebElement pagenationNext;
	
	@FindBy(xpath = "//span[@class =\"Pagination__StyledSpan-sc-sq3l8r-5 Previous\"]")
	WebElement pagenationPrevious;

	@FindBy(xpath = "//tbody/tr/th")
	List<WebElement> tableHeaders;

	@FindBy(xpath = "//div[@class=\"Delete icon\"]")
	WebElement deletebutton;

	@FindBy(xpath = "//button[text() = \"+ A New user \"]")
	WebElement addNewUserButton;

	@FindBy(xpath = "//button[text() = \"+ A Assign staff \"]")
	WebElement addAssignStaffButton;

	@FindBy(id = "lms-search-input")
	WebElement searchField;

	@FindBy(xpath = "//tbody/tr/td[1]")
	List<WebElement> checkboxes;
	
	@FindBy(xpath = "//tbody/tr/td[6]")
	List<WebElement> editIcon;
	
	@FindBy(xpath = "//tbody/tr/td[7]")
	List<WebElement> deleteIcon;

	public String getHeader() {
		return manageUser.getText();
	}

	public boolean checkPagination() {
		return pagenation.isDisplayed();
	}
     
	public boolean ForwardPagenationControl() {
		if(pagenationNext.isEnabled()) 
			{pagenationNext.click();}
		return true;
	}
	public boolean backwardPagenationControl() {
		if(pagenationPrevious.isEnabled()) 
			{pagenationPrevious.click();}
		return true;
	}
	public List<WebElement> getTableHeaders() {
		return tableHeaders;

	}

	public boolean checkDeleteButton() {
		return deletebutton.isEnabled();
	}

	public void clickDelete() {
		deletebutton.click();
	}

	public boolean checkAddUser_button() {
		return addNewUserButton.isDisplayed();
	}

	public boolean checkAssignStaff_button() {
		return addAssignStaffButton.isDisplayed();
	}

	public boolean checkSearchField() {
		return searchField.isDisplayed();
	}

	public void selectCheckBox() {
		for (int i = 0; i < checkboxes.size(); i++) {
			checkboxes.get(i).click();
			break;
		}
	}

	public void selectmultipleCheckBox() {
		for (int i = 0; i < checkboxes.size(); i++) {
			while (i < 2) {
				checkboxes.get(i).click();
			}
		}
	}

	public void getAlertPopUp(WebDriver driver, String value) {

		Alert alert = driver.switchTo().alert();
		String option = value;
		if (option.equalsIgnoreCase("yes")) {
			alert.accept();
		} else if (option.equalsIgnoreCase("No")) {
			alert.dismiss();
		}
	}

	public List<WebElement> hasCheckBox() {
     	return checkboxes;
	}

	public boolean checkEditIcon() {
		boolean flag = editIcon.stream().anyMatch(c -> c.isEnabled());
		return flag;
	}

	public boolean checkDeleteIcon() {
		boolean flag = deleteIcon.stream().anyMatch(c -> c.isEnabled());
		return flag;
	}

	public void addNewUser_chk() {
		addNewUserButton.click();
		
	}

	public void clickEditIcon() {
		for(int i=0;i<editIcon.size();i++) {
			editIcon.get(i).click();
			break;
		}
		
	}

	

	
}
