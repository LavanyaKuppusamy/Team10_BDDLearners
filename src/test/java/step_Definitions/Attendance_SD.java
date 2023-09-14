package step_Definitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_Objects.AttendancePage1;
import utilities.CrossBrowser;
import webdriverManager.DriverManager;

public class Attendance_SD {
	
	public WebDriver driver = CrossBrowser.getDriver();
	Students_SD students = new Students_SD();
	AttendancePage1 attendancepage = new AttendancePage1(driver);
	
	@Given("Admin is on dashboard page after Login page")
	public void admin_is_on_dashboard_page_after_login_page() {
		DriverManager.openPage("https://LMSportalapp.herokuapp.com/login");
	}

	@When("Admin clicks {string} on the navigation bar")
	public void admin_clicks_on_the_navigation_bar(String string) {
	attendancepage.AttendancePageclick();
	}

	@Then("Admin should see the Manage attendance in header")
	public void admin_should_see_the_manage_attendance_in_header() {
		attendancepage.checkTitle();

	}

	@Then("Maximum navigation time in milliseconds, defaults to {int} seconds")
	public void maximum_navigation_time_in_milliseconds_defaults_to_seconds(Integer int1) {
		attendancepage.verifyNavigationtime(30);
	}

	@Then("HTTP response >= {int}. Then the link is broken")
	public void http_response_then_the_link_is_broken(Integer int1) {
	   
	}

	@When("dmin clicks {string} on the navigation bar")
	public void dmin_clicks_on_the_navigation_bar(String string) {
		attendancepage.verifyLMStitle();
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see LMS -Learning management system  as title")
	public void admin_should_see_lms_learning_management_system_as_title() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin is on dashboard page after Login page page")
	public void admin_is_on_dashboard_page_after_login_page_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Manage attendance header should be in left side of the page")
	public void manage_attendance_header_should_be_in_left_side_of_the_page() {
		attendancepage.verifyLMSAlign();
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks {string} button on the navigation bar and get all text from the portal page")
	public void admin_clicks_button_on_the_navigation_bar_and_get_all_text_from_the_portal_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see correct spelling for the all the fields")
	public void admin_should_see_correct_spelling_for_the_all_the_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see disabled delete icon below the {string}")
	public void admin_should_see_disabled_delete_icon_below_the(String string) {
		attendancepage.checkdeleteicon();
	}

	@Then("Admin should see search bar on the attendance page")
	public void admin_should_see_search_bar_on_the_attendance_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see +Add New Attendance button on the attendance page")
	public void admin_should_see_add_new_attendance_button_on_the_attendance_page() {
	   
		attendancepage.addnewattendance();
	}

	@Then("Admin should see data table on the Manage Attendance Page With following column headers. \\(Check box symbol,Class ID, Student Id,Preasent, Edit \\/Delete\\)")
	public void admin_should_see_data_table_on_the_manage_attendance_page_with_following_column_headers_check_box_symbol_class_id_student_id_preasent_edit_delete() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Edit Icon in each row of data table only  when entries are available")
	public void edit_icon_in_each_row_of_data_table_only_when_entries_are_available() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Edit Icon will not be present in data table")
	public void edit_icon_will_not_be_present_in_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Delete Icon in each row of data table only  when entries are available")
	public void delete_icon_in_each_row_of_data_table_only_when_entries_are_available() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin cant see delete  Icon in data table")
	public void admin_cant_see_delete_icon_in_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see sort icon near the column headers except for Edit and Delete")
	public void admin_should_see_sort_icon_near_the_column_headers_except_for_edit_and_delete() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see check box in the all rows  of data table")
	public void admin_should_see_check_box_in_the_all_rows_of_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Above the footer Admin should see the text as {string} below the table. x- starting record number on that page,y-ending record number on that page z-Total number of records")
	public void above_the_footer_admin_should_see_the_text_as_below_the_table_x_starting_record_number_on_that_page_y_ending_record_number_on_that_page_z_total_number_of_records(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the text with total number classes in the data table. \\( {string})")
	public void admin_should_see_the_text_with_total_number_classes_in_the_data_table(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin is in manage attendance page")
	public void admin_is_in_manage_attendance_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks + a new attendance button")
	public void admin_clicks_a_new_attendance_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see correct spellings in the label")
	public void admin_should_see_correct_spellings_in_the_label() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("{int} dropdown should be present")
	public void dropdown_should_be_present(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see  close button on the attendance details popup window")
	public void admin_should_see_close_button_on_the_attendance_details_popup_window() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Close button should on the top right corner")
	public void close_button_should_on_the_top_right_corner() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("First dropdown box {string} text  should be present")
	public void first_dropdown_box_text_should_be_present(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Second dropdown box {string} text  should be present")
	public void second_dropdown_box_text_should_be_present(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Third dropdown box {string} text  should be present")
	public void third_dropdown_box_text_should_be_present(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Fourth dropdown box {string} text  should be present")
	public void fourth_dropdown_box_text_should_be_present(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin  should text in gray color")
	public void admin_should_text_in_gray_color() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see  save button in the class detail popup window")
	public void admin_should_see_save_button_in_the_class_detail_popup_window() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see  cancel button in the class detail popup window")
	public void admin_should_see_cancel_button_in_the_class_detail_popup_window() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Order of the label should be Program name, Class Name, Student Name, Attendance, Attendance Date.")
	public void order_of_the_label_should_be_program_name_class_name_student_name_attendance_attendance_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Program Name in the drop down should match with  program name in  manage program page table")
	public void program_name_in_the_drop_down_should_match_with_program_name_in_manage_program_page_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Class Name in the drop down should match with  class name in  manage class page table")
	public void class_name_in_the_drop_down_should_match_with_class_name_in_manage_class_page_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Attendance field should have keywords such as - present, absent, late, excused")
	public void attendance_field_should_have_keywords_such_as_present_absent_late_excused() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see correct spellings in dropdown text")
	public void admin_should_see_correct_spellings_in_dropdown_text() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("selected date should be their in class date text box")
	public void selected_date_should_be_their_in_class_date_text_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("selected date should be in  mm\\/dd\\/yyyy formatsv")
	public void selected_date_should_be_in_mm_dd_yyyy_formatsv() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Next month calender should visible")
	public void next_month_calender_should_visible() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("previous month calender should visible")
	public void previous_month_calender_should_visible() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see current date is highled in the date picker")
	public void admin_should_see_current_date_is_highled_in_the_date_picker() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin is in  attendance details popup window")
	public void admin_is_in_attendance_details_popup_window() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks date picker button and selects future date")
	public void admin_clicks_date_picker_button_and_selects_future_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see selected date is highled in the date picker")
	public void admin_should_see_selected_date_is_highled_in_the_date_picker() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin fills the values for add attendance page with program1, class1, student1, present, {int}\\/{int}\\/{int}")
	public void admin_fills_the_values_for_add_attendance_page_with_program1_class1_student1_present(Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks on Save")
	public void admin_clicks_on_save() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin gets save confirmation New attendance added")
	public void admin_gets_save_confirmation_new_attendance_added() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin fills the values for add attendance page with , class2, student2, present, {int}\\/{int}\\/{int}")
	public void admin_fills_the_values_for_add_attendance_page_with_class2_student2_present(Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin gets save confirmation program name is missing")
	public void admin_gets_save_confirmation_program_name_is_missing() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin fills the values for add attendance page with program3, , student3, absent, {int}\\/{int}\\/{int}")
	public void admin_fills_the_values_for_add_attendance_page_with_program3_student3_absent(Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks on save")
	public void admin_clicks_on_save1() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin gets save confirmation class name is missing")
	public void admin_gets_save_confirmation_class_name_is_missing() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin fills the values for add attendance page with program4, Class4, , present, {int}\\/{int}\\/{int}")
	public void admin_fills_the_values_for_add_attendance_page_with_program4_class4_present(Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin gets save confirmation student name is missing")
	public void admin_gets_save_confirmation_student_name_is_missing() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin fills the values for add attendance page with program5, class5, student5, , {int}\\/{int}\\/{int}")
	public void admin_fills_the_values_for_add_attendance_page_with_program5_class5_student5(Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin gets save confirmation attendance is missing")
	public void admin_gets_save_confirmation_attendance_is_missing() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin fills the values for add attendance page with program6, class6, student6, present, ")
	public void admin_fills_the_values_for_add_attendance_page_with_program6_class6_student6_present() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin gets save confirmation attendance date is missing")
	public void admin_gets_save_confirmation_attendance_date_is_missing() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin fills the values for add attendance page with program7, class7, student7, present, {int}\\/{int}\\/{int}")
	public void admin_fills_the_values_for_add_attendance_page_with_program7_class7_student7_present(Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin gets save confirmation Invalidate attendance date")
	public void admin_gets_save_confirmation_invalidate_attendance_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin gets save confirmation Successfully updated")
	public void admin_gets_save_confirmation_successfully_updated() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin fills the values for add attendance page with program1, class1, student1, absent, {int}\\/{int}\\/{int}")
	public void admin_fills_the_values_for_add_attendance_page_with_program1_class1_student1_absent(Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks on cancel")
	public void admin_clicks_on_cancel() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin gets save confirmation NA")
	public void admin_gets_save_confirmation_na() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin clicks {string} button")
	public void admin_clicks_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin should see alert open with  {string}")
	public void admin_should_see_alert_open_with(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin gets following {string}")
	public void admin_gets_following(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	/*@Given("user Logged on the LMS portal")
	public void user_logged_on_the_lms_portal() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/

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
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks the delete icon")
	/*public void admin_clicks_the_delete_icon() {
		attendancepage.clickDelete();
	}*/

	@Then("Alert appears with yes and No option")
	public void alert_appears_with_yes_and_no_option() {
		
	}

	
	@When("Admin click yes option")
	public void admin_click_yes_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User deleted alert pops and user is no more available in data table")
	public void user_deleted_alert_pops_and_user_is_no_more_available_in_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin click No option")
	public void admin_click_no_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User is still listed in data table")
	public void user_is_still_listed_in_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("None of the checkboxes in data table are selected")
	public void none_of_the_checkboxes_in_data_table_are_selected() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The delete icon under the {string} header should be disabled")
	public void the_delete_icon_under_the_header_should_be_disabled(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("One of the checkbox row is selected")
	public void one_of_the_checkbox_row_is_selected() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Click delete icon below {string} header")
	public void click_delete_icon_below_header(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The respective row in the data table is deleted")
	public void the_respective_row_in_the_data_table_is_deleted() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Two or more checkboxes or row is selected")
	public void two_or_more_checkboxes_or_row_is_selected() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
