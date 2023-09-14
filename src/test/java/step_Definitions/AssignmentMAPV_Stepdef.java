package step_Definitions;

import page_Objects.AssignmentMAPV;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignmentMAPV_Stepdef {
	
	WebDriver driver;
	AssignmentMAPV Assignment= new AssignmentMAPV(driver);
	private static final Logger LOGGER = LogManager.getLogger(AssignmentMAPV_Stepdef.class);
	
	@When("Admin clicks {string} button on the navigation bar")
	public void admin_clicks_button_on_the_navigation_bar(String string) {
		
		Assignment.clicksonAssignment();
	    
	}

	@Then("Admin should see URL with {string}")
	public void admin_should_see_url_with(String string) {
	    
		Assignment.verifyAssignmentPage();
	}

	@Then("Get the response time for navigation from dashboard page to manage assignment page")
	public void get_the_response_time_for_navigation_from_dashboard_page_to_manage_assignment_page() {
	      Assignment.verifyNavigationtime(30);
	    
	}

	@Then("Admin should see header with {string}")
	public void admin_should_see_header_with(String string) {
	    
		Assignment.verifyheader();
		
	}

	@Then("Admin should see correct spelling for the all the fields")
	public void admin_should_see_correct_spelling_for_the_all_the_fields() {
	    
		Assignment.Spellcheck();
		
	}

	@Then("Admin should see disabled delete icon below the_ASSIGNMENT {string}")
	public void admin_should_see_disabled_delete_icon_below_the_ASSIGNMENT(String string) {
	    Assignment.verifyDeleteIcon();
	}

	@Then("Admin should see search bar on the manage assignment page")
	public void admin_should_see_search_bar_on_the_manage_assignment_page() {
	    
		Assignment.verifySearchbar();
		
	}

	@Then("Admin should see +Add New assignment button on the manage assignment page")
	public void admin_should_see_add_new_assignment_button_on_the_manage_assignment_page() {
	    
		Assignment.verifyAddNewbutton();
	}

	@Then("Admin should see data table on the manage assignment page With following column headers")
	public void admin_should_see_data_table_on_the_manage_assignment_page_with_following_column_headers() {
		
	   Assignment.verifyColumnheaders();
		
	}

	@Then("Edit Icon in each row of data table only  when entries are available")
	public void edit_icon_in_each_row_of_data_table_only_when_entries_are_available() {
	    
		Assignment.verifyEditIcon();
		
	}

	@Then("Edit Icon will not be present in data table")
	public void edit_icon_will_not_be_present_in_data_table() {
		
		Assignment.verifyEditIcon();
	    
	}

	@Then("Delete Icon in each row of data table only  when entries are available_ASSIGNMENT")
	public void delete_icon_in_each_row_of_data_table_only_when_entries_are_available_ASSIGNMENT() {
		
		Assignment.VerifyDeleteIcon2();
	    
	}

	@Then("Delete Icon will not be present in data table")
	public void delete_icon_will_not_be_present_in_data_table() {
		
		Assignment.VerifyDeleteIcon2();
	    
	}

	@Then("Admin should see sort icon near the column headers except for Edit and Delete")
	public void admin_should_see_sort_icon_near_the_column_headers_except_for_edit_and_delete() {
	    
		Assignment.Sortbutton();
	}

	@Then("Admin should see check box in the all rows  of data table when entries available")
	public void admin_should_see_check_box_in_the_all_rows_of_data_table_when_entries_available() {
		
		Assignment.SeeCheckboxAll();
	    
	}

	@Then("Above the footer Admin should see the text as {string} below the table.")
	public void above_the_footer_admin_should_see_the_text_as_below_the_table(String string) {
		
		Assignment.verifyfooter();
	    
	}

	@Then("Admin should see the text with total number assignments in the data table.")
	public void admin_should_see_the_text_with_total_number_assignments_in_the_data_table() {
		
		Assignment.verifyPagination();
	   
	}

	@Given("Admin is on manage assignment page")
	public void admin_is_on_manage_assignment_page() {
		Assignment.clicksonAssignment();
		
	    
	}

	@When("Admin enters {string} into search box")
	public void admin_enters_into_search_box(String Searchtext) {
		
		Assignment.EnterTextSearchbox(Searchtext);
		
	    
	}

	@Then("Displays entries with that {string}")
	public void displays_entries_with_that(String Searchtext, DataTable Message) {
		
		Assignment.validatetable(Searchtext,Message);
	    
	}
	
	@Given("Admin is in manage assignment page")
	public void admin_is_in_manage_assignment_page() {
	   
		Assignment.verifyAssignmentPage();
	}

	@When("Admin clicks single  row level check box in the data table")
	public void admin_clicks_single_row_level_check_box_in_the_data_table() {
	    
		Assignment.ClicksonsingleRow();
	}

	@Then("Admin should see delete icon below the header is enabled")
	public void admin_should_see_delete_icon_below_the_header_is_enabled() {
	   
		Assignment.ValidateDelete();
	}

	

@When("Admin clicks Options button")
public void admin_clicks_options_button() {
	
	LOGGER.info("Admins clicks on Alert");
	
}


@Then("Redirected to assignment page and selected assignment details are {string} from the data table")
public void redirected_to_assignment_page_and_selected_assignment_details_are_from_the_data_table(String alertmsg, DataTable Message) {
	
	Assignment.HandleAlert(alertmsg,Message);
		
	   
	}

	@Given("Admin Clicks single row")
	public void admin_clicks_single_row() {
		
	   Assignment.ClicksonsingleRow();
	}

	

	@Given("Admin Clicks Multiple row")
	public void admin_clicks_multiple_row() {
		
		Assignment.ClickonMultipleRow();
	    
	}
	
	@When("Admin clicks delete button in data table row level")
	public void admin_clicks_delete_button_in_data_table_row_level() {
	   
		Assignment.ClicksonsingleRow();
		
	}

	@Then("Admin should see dialog box")
	public void admin_should_see_dialog_box() {
		
		Assignment.PopupAlert();
	    
	}

	@Then("Alert should have {string} button to accept and Records deleted from table")
	public void alert_should_have_button_to_accept_and_records_deleted_from_table(String Accept) {
	    
		Assignment.AcceptAlert(Accept);
		
	}

	@Then("Alert should have {string} button to accept and Records are Not deleted from table")
	public void alert_should_have_button_to_accept_and_records_are_not_deleted_from_table(String Reject) {
		
		Assignment.RejectAlert(Reject);
	    
		
	}
	

}