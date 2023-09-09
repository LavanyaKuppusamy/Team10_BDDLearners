package page_Objects;

import java.util.List;

import org.jsoup.internal.FieldsAreNonnullByDefault;
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
	
	@FindBy(xpath = "//tbody/tr/td[1]")
	List<WebElement> checkboxes;


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

	public boolean checkAddUser_button() {
		return addNewUserButton.isDisplayed();
	}
	public boolean checkAssignStaff_button() {
		return addAssignStaffButton.isDisplayed();
	}
	public boolean checkSearchField() {
		return searchField.isDisplayed();
	}
	
	public void hasCheckBox() {
		
	}
}
