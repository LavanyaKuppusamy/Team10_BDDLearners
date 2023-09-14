package step_Definitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_Objects.AttendancePage;
import utilities.CrossBrowser;

public class Attendance_Delete_SD {
	
	public WebDriver driver = CrossBrowser.getDriver();
	AttendancePage attendancePage = new AttendancePage(driver);

	
	@Given("user Logged on the LMS portal")
	public void user_logged_on_the_lms_portal() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks {string} from navigation bar")
	public void admin_clicks_from_navigation_bar(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The delete icon on row level in data table is enabled")
	public void the_delete_icon_on_row_level_in_data_table_is_enabled() {
	    // Write code here that turns the phrase above into concrete actions
		
		attendancePage.checkDeleteButton();
	}

	@When("Admin clicks the delete icon")
	public void admin_clicks_the_delete_icon_for_table_row() {
	    
		attendancePage.clickDelete();
	}

	@Then("Alert appears with yes and No option")
	public void alert_appears_with_yes_and_no_option() {
	    

		attendancePage.checkAlertPopUp();
		
	}

	@Given("Admin clicks the delete icon")
	public void admin_clicks_the_delete_icon() {
	   
		attendancePage.clickDelete();
		
	}

	@When("Admin click yes option")
	public void admin_click_yes_option() {
	    
		attendancePage.getAlertValue("Yes");
	}

	@Then("Student deleted alert pops and student is no more available in data table")
	public void student_deleted_alert_pops_and_student_is_no_more_available_in_data_table() {
		// This use case cannot occur......
	    
		
	}

	@When("Admin click No option")
	public void admin_click_no_option() {
		attendancePage.getAlertValue("No");
	}

	@Then("Student is still listed in data table")
	public void student_is_still_listed_in_data_table() {
		attendancePage.checkTableData();
	}

	@Given("None of the checkboxes in data table are selected")
	public void none_of_the_checkboxes_in_data_table_are_selected() {
	    
		attendancePage.checkDeleteButtons("NONE");
	}

	@Then("The delete icon under the {string} header should be disabled")
	public void the_delete_icon_under_the_header_should_be_disabled(String string) {
	    
		//
		
	}

	@Given("One of the checkbox row is selected")
	public void one_of_the_checkbox_row_is_selected() {
		attendancePage.checkDeleteButtons("ONE");
	}

	@When("Click delete icon below {string} header")
	public void click_delete_icon_below_header(String string) {
	 
		//
	}

	@Then("The respective row in the data table is deleted")
	public void the_respective_row_in_the_data_table_is_deleted() {
	   //
	}

	@Given("Two or more checkboxes or row is selected")
	public void two_or_more_checkboxes_or_row_is_selected() {
	    
		attendancePage.checkDeleteButtons("MULTIPLE");
		
		
	}

	
	
}
