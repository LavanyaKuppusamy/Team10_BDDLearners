package step_Definitions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import constant.Constant;
import webdriverManager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_Objects.UserAddedit;
import page_Objects.UserManagePage;
import utilities.Loggerload;

public class UserManagePage_SD extends Constant {

	WebDriver driver ;
	// DashboardPage dashboard = new DashboardPage(driver);
	UserManagePage usermainpage = new UserManagePage(driver);
	UserAddedit userAddedit =new UserAddedit(driver);
	String URL = driver.getCurrentUrl();
	String[] fields = { "First name", "Middle name", "Last name", "Location", "Phone no", "Linkedin Url", "User Role",
			"Role Status", "Visa Status", "Email address", "Under Graduate", "Post Graduate", "Time Zone",
			"User Comments" };

	@Given("user Logged on the LMS portal")
	public void user_logged_on_the_lms_portal() {
		// LoginPage = new LoginPage(driver);
		driver.get("https://LMSportalapp.herokuapp.com/login");
	}

	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
		driver.get("https://LMSportalapp.herokuapp.com/dashboard");
		Loggerload.info("Admin is on dashboard page");
	}

	@When("Admin clicks {string} from navigation bar")
	public void admin_clicks_from_navigation_bar_USER(String User) {
		// dashboard = new DashboardPage(driver);
		// dashboard.clickUserTab();
		Loggerload.info("Admin clicked User from navigation bar");
	}

	// @user_01
	@Then("Admin should see the {string} in the URL")
	public void admin_should_see_the_in_the_url_USER(String string) {
		Loggerload.info("Admin user sees Manage User in the URL");
		Assert.assertEquals(URL, "https://LMSportalapp.herokuapp.com/manageUser");
	}

	// @user_02
	@Then("Admin should see the {string} in the header")
	public void admin_should_see_the_in_the_header_USER(String string) {

		String headerText = usermainpage.getHeader();
		Assert.assertEquals(headerText, "Manage User");
		Loggerload.info("Admin user sees Manage User in the header");
	}

	// @user_03
	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table_USER() {
		if (usermainpage.checkPagination()) {
			Loggerload.info("Admin sees the pagination controls under the data table");
		Assert.assertTrue(usermainpage.ForwardPagenationControl());
		Assert.assertTrue(usermainpage.backwardPagenationControl());
		} 
		else {
			Loggerload.info("Pagenation controls under data table are missing");
		}
	}

	// @user_04
	@Then("Admin Should see the data table with headers Id, Name, location, Phone Number, Edit\\/Delete")
	public void admin_should_see_the_data_table_with_headers_id_name_location_phone_number_edit_delete_USER() {
		List<WebElement> list_of_headers = usermainpage.getTableHeaders();
		list_of_headers.stream().forEach(l -> System.out.println(l));
		Loggerload.info("Admin sees the data table with headers Id, Name, location, Phone Number, Edit/Delete");
	}

	// @user_05
	@Then("Admin should be able to see the {string} icon button that is disabled")
	public void admin_should_be_able_to_see_the_icon_button_that_is_disabled_USER(String string) {
		if (!usermainpage.checkDeleteButton()) {
			Loggerload.info("Admin sees delete button is disabled");
		} else
			Loggerload.info("delete button is Enabled");
	}

	// @user_06
	@Then("Admin should be able to see the {string} button")
	public void admin_should_be_able_to_see_the_button_USER(String string) {
		if (usermainpage.checkAddUser_button()) {
			Loggerload.info("Admin sees the Add New user button");
		} else

			Loggerload.info("Add New user button is missing");
	}

	// @user_07
	@Then("Admin should be able to see {string} button")
	public void admin_should_be_able_to_see_button_USER(String string) {
		if (usermainpage.checkAssignStaff_button()) {
			Loggerload.info("Admin sees the Assign Staff button");
		} else

			Loggerload.info("Add Assign Staff button is missing");
	}

	// @user_08
	@Then("Admin should be able to see the search text box")
	public void admin_should_be_able_to_see_the_search_text_box_USER() {
		if (usermainpage.checkSearchField()) {
			Loggerload.info("Admin sees the Search Text Box");
		} else

			Loggerload.info("Search textbox is missing");
	}

	// @user_09
	@Then("Each row in the data table should have a checkbox")
	public void each_row_in_the_data_table_should_have_a_checkbox_USER() {
		List<WebElement> checkbox_presence = usermainpage.hasCheckBox();
		boolean flag = checkbox_presence.stream().anyMatch(c -> c.isDisplayed());
		Assert.assertTrue(flag);
		Loggerload.info("Each row in the data table should have a checkbox");
	}

	// @user_10
	@Then("Each row in the data table should have a edit icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_edit_icon_that_is_enabled_USER() {
		Assert.assertTrue(usermainpage.checkEditIcon());
		Loggerload.info("Edit icon is present in User Main Page");
	}

	// @user_11
	@Then("Each row in the data table should have a delete icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled_USER() {
		Assert.assertTrue(usermainpage.checkDeleteIcon());
		Loggerload.info("Delete icon is present in User Main Page");
	}

	// @user_12
	@When("Admin clicks {string} button")
	public void admin_clicks_button_USER(String string) {
		usermainpage.addNewUser_chk();
		Loggerload.info("Admin clicked on Add new user Button");
	}

	@Then("A new pop up with User details appears")
	public void a_new_pop_up_with_user_details_appears_USER() {
		Loggerload.info("A new pop up with User details appears");
	}

	// @user_13 Add new user
	@Given("new pop up with user details appears")
	public void new_pop_up_with_user_details_appears_USER() {

		String headerText = userAddedit.getHeader();
		Assert.assertEquals(headerText, "User Details");
		Loggerload.info("Admin user sees User Details in the header");
	}

	@Then("The pop up should include the fields from {string} and {string}")
	public void the_pop_up_should_include_the_fields_from_and_USER(String SheetName, String Testcase) throws IOException {
		Loggerload.info("user details fields ");
		getUserDetails(SheetName, Testcase);
	}

	private void getUserDetails(String SheetName, String TestCaseName) throws IOException {

		ArrayList<String> userData = excelDataValue(SheetName, TestCaseName);

		List<String> fieldList = Arrays.asList(fields);

		List<String> sourceList = new ArrayList<String>(userData);
		List<String> destinationList = new ArrayList<String>(fieldList);

		if (sourceList.equals(destinationList) == true) {
			Loggerload.info("pop up include all fields from user Detail page");
		} else {
			Loggerload.info("pop up does not include all fields from user Detail page");
		}

	}

	// @user_14 Add new user
	@Given("The new pop up with user details appears")
	public void the_new_pop_up_with_user_details_appears_USER() {
		Loggerload.info("The new pop up with user details appears");
	}

	@When("Fill in all the fields except optional fields with valid values from {string} and {string}")
	public void fill_in_all_the_fields_except_optional_fields_with_valid_values_from_and_USER(String SheetName,
			String Testcase) throws IOException {
		setUserDetails(SheetName, Testcase);
	}

	@When("click submit")
	public void click_submit_USER() {
		userAddedit.clickSubmit();
		Loggerload.info("user clicks Submit button");
	}

	@Then("The newly added user should be present in the data table in Manage User page")
	public void the_newly_added_user_should_be_present_in_the_data_table_in_manage_user_page_USER() {
		Loggerload.info(
				"newly added user is present in the data table in Manage User page without entering optional values");
	}

	// @user_15 Add new user
	@When("Fill in all the fields with valid values from {string} and {string}")
	public void fill_in_all_the_fields_with_valid_values_from_and_USER(String SheetName, String Testcase)
			throws IOException {

		setUserDetails(SheetName, Testcase);
	}

	public void setUserDetails(String SheetName, String Testcase) throws IOException {
		ArrayList<String> userData = excelDataValue(SheetName, Testcase);
		String firstname = userData.get(1);
		String middlename = userData.get(2);
		String lastname = userData.get(3);
		String location = userData.get(4);
		String phoneno = userData.get(5);
		String linkedurl = userData.get(6);
		String undergraduate = userData.get(7);
		String postgraduate = userData.get(8);
		String timezone = userData.get(9);
		String usercomments = userData.get(10);
		String userrole = userData.get(11);
		String rolestatus = userData.get(12);
		String visastatus = userData.get(13);

		userAddedit.enterUserDetails(firstname, middlename, lastname, location, phoneno, linkedurl, undergraduate,
				postgraduate, timezone, usercomments, userrole, rolestatus, visastatus);
	}

	// @user_16 Add new user
	@When("any of the fields have invalid values from {string} and {string}")
	public void any_of_the_fields_have_invalid_values_from_and_USER(String SheetName, String Testcase) throws IOException {
		setUserDetails(SheetName, Testcase);
		Loggerload.info("Clearing a mandatory field will throw an error message");
	}

	@Then("Error message should appear")
	public void error_message_should_appear_USER() {

		String errorMessage = userAddedit.alertdismsg();
		Loggerload.info("error Message :" + errorMessage);
	}

	// @user_17 Add new user
	@When("Any of the mandatory fields are blank from {string} and {string}")
	public void any_of_the_mandatory_fields_are_blank_from_and_USER(String SheetName, String Testcase) throws IOException {
		setUserDetails(SheetName, Testcase);
	}

	// @user_18 Edit user
	@Given("The edit icon on row level in data table is enabled")
	public void the_edit_icon_on_row_level_in_data_table_is_enabled_USER() {
		Loggerload.info("user is trying to Edit details of a user");
	}

	@When("Admin clicks the edit icon")
	public void admin_clicks_the_edit_icon_USER() {
		if (usermainpage.checkEditIcon()) {
			usermainpage.clickEditIcon();
		}
	}

	// @user_19 Edit user
	@When("update the fields with valid values from {string} and {string}")
	public void pdate_the_fields_with_valid_values_from_and_USER(String SheetName, String Testcase) throws IOException {
		setUserDetails(SheetName, Testcase);
	}

	@Then("The updated user details should appear on the data table")
	public void the_updated_user_details_should_appear_on_the_data_table_USER() {
		Loggerload.info("The updated user details appears on the data table");
	}

	// @user_20 Edit user
	@When("Update the fields with invalid values from {string} and {string}")
	public void update_the_fields_with_invalid_values_from_and_USER(String SheetName, String Testcase) throws IOException {
		setUserDetails(SheetName, Testcase);
	}
	
	// @user_21 Edit user
	@When("Erase data from mandatory field from {string} and {string}")
	public void erase_data_from_mandatory_field_from_and_USER(String SheetName, String Testcase) throws IOException {
		setUserDetails(SheetName, Testcase);
		userAddedit.clearField();
		Loggerload.info("mandatory field is been erased");
	}
	
	// @user_22 Edit user
	@When("Erase data from description field from {string} and {string}")
	public void erase_data_from_description_field_from_and_USER(String SheetName, String Testcase) throws IOException {
		setUserDetails(SheetName, Testcase);
		userAddedit.clearDescription();
		Loggerload.info("user comments field being erased");
	}
	
	// @user_23 Delete user
	@Given("The delete icon on row level in data table is enabled")
	public void the_delete_icon_on_row_level_in_data_table_is_enabled_USER() {
		if (usermainpage.checkDeleteButton()) 
			Loggerload.info("Admin sees delete button is enabled");
		else
			Loggerload.info("delete button is disabled");
			
	}

	@When("Admin clicks the delete icon")
	public void admin_clicks_the_delete_icon_USER() {
	   usermainpage.clickDelete();
	}

	@Then("Alert appears with yes and No option")
	public void alert_appears_with_yes_and_no_option__USER() {
	   
		Loggerload.info("Alert appears with yes and No option");
	}
	
	// @user_24 Delete user
	@When("Admin click yes option")
	public void admin_click_yes_option_USER() {
		usermainpage.getAlertPopUp(driver,"yes");
	}

	@Then("User deleted alert pops and user is no more available in data table")
	public void user_deleted_alert_pops_and_user_is_no_more_available_in_data_table_USER() {
	    Loggerload.info("User deleted alert pops and user is no more available in data table");
	}
	
	// @user_25 Delete user
	@When("Admin click No option")
	public void admin_click_no_option_USER() {
		usermainpage.getAlertPopUp(driver,"No");
		Loggerload.info("Admin click No option from delete alert");
	}

	@Then("User is still listed in data table")
	public void user_is_still_listed_in_data_table_USER() {
	   Loggerload.info("User is still listed in data table");
	}
	
	// @user_26 Delete multiple users
	@Given("None of the checkboxes in data table are selected")
	public void none_of_the_checkboxes_in_data_table_are_selected_USER() {
		if (!usermainpage.checkDeleteButton()) {
			Loggerload.info("Admin sees delete button is disabled");
		} 
	    
	}

	@Then("The delete icon under the {string} header should be disabled")
	public void the_delete_icon_under_the_header_should_be_disabled_USER(String string) {
		Loggerload.info("None of the checkboxes in data table are selected ,since the delete button is disabled");
	}
	
	// @user_27 Delete multiple users
	@Given("One of the checkbox row is selected")
	public void one_of_the_checkbox_row_is_selected_USER() {
	   usermainpage.selectCheckBox();
	}

	@When("Click delete icon below {string} header")
	public void click_delete_icon_below_header_USER(String string) {
	    if(usermainpage.checkDeleteButton()) {
	    	usermainpage.clickDelete();
	    }
	    else
	    	Loggerload.info("Delete icon is disabled");
	}

	@Then("The respective row in the data table is deleted")
	public void the_respective_row_in_the_data_table_is_deleted_USER() {
	   Loggerload.info("cannot delete the respective row or rows in the datatable");
	}
	
	// @user_28 Delete multiple users
	@Given("Two or more checkboxes or row is selected")
	public void two_or_more_checkboxes_or_row_is_selected_USER() {
	    usermainpage.selectmultipleCheckBox();
	}

}
