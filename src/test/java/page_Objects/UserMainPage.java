package page_Objects;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Loggerload;

public class UserMainPage {

	public UserMainPage(WebDriver driver) {
		Loggerload.info("Entered into User Main Page");
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[text()=\"Manage User\"]")
	WebElement manageUser;

	@FindBy(xpath = "//span[@class =\"Pagination__StyledSpan-sc-sq3l8r-5 geUUhj\"]")
	WebElement pagenation;

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

	@FindBy(xpath = "//tbody/tr/td/div[@role=\"checkbox\"]")
	List<WebElement> checkboxes;

	@FindBy(xpath = "//tbody/tr/td/img[1]")
	WebElement editIcon;

	@FindBy(xpath = "//tbody/tr/td/img[2]")
	WebElement deleteIcon;
	
	

	public String getHeader() {
		return manageUser.getText();
	}

	public boolean checkPagination() {
		return pagenation.isDisplayed();
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

	public List<WebElement> hasCheckBox() {
		return checkboxes;
	}

	public boolean checkEditIcon() {
		return editIcon.isEnabled();
	}
    public void clickEditIcon() {
    	editIcon.click();
    }
	public boolean checkDeleteIcon() {
		return deleteIcon.isEnabled();
	}
	public void addNewUser_chk() {
		addNewUserButton.click();
	}

	public void getAlertPopUp(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		boolean accept = true;
		if(accept) {
	    alert.accept();
		}
		else if(!accept) {
			alert.dismiss();
		}
	}
	public void selectCheckBox() {
		for(int i=0;i<checkboxes.size();i++) {
			checkboxes.get(i).click();
			break;
		}
	}
	public void selectmultipleCheckBox() {
		for(int i=0;i<checkboxes.size();i++) {
			while(i<2)
			{
				checkboxes.get(i).click();
			}
			
		}
	}
}
