package step_Definitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import webdriverManager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_Objects.UserMainPage;
import utilities.Loggerload;

public class UserManinPage_SD {

	WebDriver driver = DriverManager.getDriver();
	// DashboardPage dashboard = new DashboardPage(driver);;
    UserMainPage usermainpage = new UserMainPage(driver);;
	String URL = driver.getCurrentUrl();

	@Given("user Logged on the LMS portal")
	public void user_logged_on_the_lms_portal() {
		// LoginPage = new LoginPage(driver);
		DriverManager.openPage("https://LMSportalapp.herokuapp.com/login");
	}

	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
		DriverManager.openPage("https://LMSportalapp.herokuapp.com/dashboard");
		Loggerload.info("Admin is on dashboard page");
	}

	@When("Admin clicks {string} from navigation bar")
	public void admin_clicks_from_navigation_bar(String User) {
		// dashboard = new DashboardPage(driver);
		// dashboard.clickUserTab();
	}

	// @user_01
	@Then("Admin should see the {string} in the URL")
	public void admin_should_see_the_in_the_url(String string) {
		Loggerload.info("Admin user sees Manage User in the URL");
		Assert.assertEquals(URL, "https://LMSportalapp.herokuapp.com/manageUser");
	}

	// @user_02
	@Then("Admin should see the {string} in the header")
	public void admin_should_see_the_in_the_header(String string) {
		// usermainpage = new UserMainPage(driver);
		String headerText = usermainpage.getHeader();
		Assert.assertEquals(headerText, "Manage User");
		Loggerload.info("Admin user sees Manage User in the header");
	}

	// @user_03
	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {
		if (usermainpage.checkPagination()) {
			Loggerload.info("Admin sees the pagination controls under the data table");
		} else {
			Loggerload.info("Pagenation controls under data table are missing");
		}
	}

	// @user_04
	@Then("Admin Should see the data table with headers Id, Name, location, Phone Number, Edit\\/Delete")
	public void admin_should_see_the_data_table_with_headers_id_name_location_phone_number_edit_delete() {
		List<WebElement> list_of_headers = usermainpage.getTableHeaders();
		list_of_headers.stream().forEach(l -> System.out.println(l));
		Loggerload.info("Admin sees the data table with headers Id, Name, location, Phone Number, Edit/Delete");
	}

	// @user_05
	@Then("Admin should be able to see the {string} icon button that is disabled")
	public void admin_should_be_able_to_see_the_icon_button_that_is_disabled(String string) {
		if (!usermainpage.checkDeleteButton()) {
			Loggerload.info("Admin sees delete button is disabled");
		} else
			Loggerload.info("delete button is Enabled");
	}

	// @user_06
	@Then("Admin should be able to see the {string} button")
	public void admin_should_be_able_to_see_the_button(String string) {
		if (usermainpage.checkAddUser_button()) {
			Loggerload.info("Admin sees the Add New user button");
		} else

			Loggerload.info("Add New user button is missing");
	}

	// @user_07
	@Then("Admin should be able to see {string} button")
	public void admin_should_be_able_to_see_button(String string) {
		if (usermainpage.checkAssignStaff_button()) {
			Loggerload.info("Admin sees the Assign Staff button");
		} else

			Loggerload.info("Add Assign Staff button is missing");
	}

	// @user_08
	@Then("Admin should be able to see the search text box")
	public void admin_should_be_able_to_see_the_search_text_box() {
		if (usermainpage.checkSearchField()) {
			Loggerload.info("Admin sees the Search Text Box");
		} else

			Loggerload.info("Search textbox is missing");
	}
	
	//@user_09
	@Then("Each row in the data table should have a checkbox")
	public void each_row_in_the_data_table_should_have_a_checkbox() {
	   
	}

	//@user_10
	@Then("Each row in the data table should have a edit icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_edit_icon_that_is_enabled() {
	    
	}

	//@user_11
	@Then("Each row in the data table should have a delete icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled() {
	    
	}

}
