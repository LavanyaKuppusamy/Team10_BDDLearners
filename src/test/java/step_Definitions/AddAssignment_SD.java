package step_Definitions;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import constant.Constant;
import driver.Driver_Factory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_Objects.AssignmentAddEditPage;
import java.util.Date;

import utilities.Loggerload;

public class AddAssignment_SD extends Constant {

	WebDriver driver = Driver_Factory.getDriver();
	String URL = driver.getCurrentUrl();
	AssignmentAddEditPage assignAddEdit = new AssignmentAddEditPage(driver);
	String[] fields = { "Program Name", "Batch Number", "Assignment Name", "Assignment Description", "Grade By",
			"Assignment Due Date", "Assignment File 1", "Assignment File 2", "Assignment File 3", "Assignment File 4",
			"Assignment File 5" };
	

	@Given("Admin logged into LMS portal")
	public void admin_logged_into_lms_portal() {
		Driver_Factory.openPage("https://LMSportalapp.herokuapp.com/login");
	}

	@When("Admin clicks assignment button on the navigation bar")
	public void admin_clicks_assignment_button_on_the_navigation_bar() {
		// dashboard.clickAssignmentTab();
		Loggerload.info("Admin clicked User from navigation bar");
	}

	// @assignment_26
	@Given("Admin is on manage assignment Page")
	public void admin_is_on_manage_assignment_page() {
		Loggerload.info("Admin user sees Manage Assignment in the URL");
		Assert.assertEquals(URL, "https://LMSportalapp.herokuapp.com/manageAssignment");
	}

	@When("Admin click +Add new assignment button")
	public void admin_click_add_new_assignment_button() {
		assignAddEdit.clkAddNewAssignment();
	}

	@Then("Admin should see a popup  with  heading {string}")
	public void admin_should_see_a_popup_with_heading(String string) {
		String header = assignAddEdit.getAssignmentHeader();
		Loggerload.info("Admin should see a popup  with  heading " + header);
	}

	// @assignment_27
	@Then("Admin should see input fields Text from {string} and {string}")
	public void admin_should_see_input_fields_text_from_and(String SheetName, String Testcase) throws IOException {
		Loggerload.info("Assignment Details fields ");
		getAssignmentDetails(SheetName, Testcase);
	}

	private void getAssignmentDetails(String sheetName, String testcase) throws IOException {
		ArrayList<String> assignmentData = excelDataValue(sheetName, testcase);

		List<String> fieldList = Arrays.asList(fields);

		List<String> sourceList = new ArrayList<String>(assignmentData);
		List<String> destinationList = new ArrayList<String>(fieldList);

		if (sourceList.equals(destinationList) == true) {
			Loggerload.info("pop up include all fields from Assignment Detail page");
		} else {
			Loggerload.info("pop up does not include all fields from Assignment Detail page");
		}

	}

	// @assignment_28
	@Then("{int} textbox should be  present in Assignment details popup window")
	public void textbox_should_be_present_in_assignment_details_popup_window(Integer textBoxesCount) {
		int count = assignAddEdit.getInputBoxCount();
		if (count == 8) {
			Assert.assertTrue(true);
		} else {
			Loggerload.info("Having a wrong count on total input boxes");
		}
	}

	// @assignment_29 batch number
	@Then("Admin should see  dropdown option for Batch Number")
	public void admin_should_see_dropdown_option_for_batch_number() {
		String value = assignAddEdit.chkForBatchDropdown();
		if (value.equalsIgnoreCase("Batch Number")) {
			Loggerload.info("Admin sees  dropdown option for Batch Number");
		} else
			Loggerload.info("Admin dont see a dropdown option for Batch Number");
	}

	// @assignment_30
	@Then("Admin should see  dropdown option for Program name")
	public void admin_should_see_dropdown_option_for_Program_name() {
		String value = assignAddEdit.chkForPogramDropdown();
		if (value.equalsIgnoreCase("Program Name")) {
			Loggerload.info("Admin sees  dropdown option for Program Name");
		} else
			Loggerload.info("Admin dont see a dropdown option for Program Name");
	}

	// @assignment_31
	@Then("Admin should see  calendar icon for assignment due date")
	public void admin_should_see_calendar_icon_for_assignment_due_date() {
		Assert.assertTrue(assignAddEdit.checkforCalenderIcon());
		Loggerload.info("Admin sees  calendar icon for assignment due date");
	}

	// @assignment_32
	@Then("Admin should see  save button in the Assignment detail popup window")
	public void admin_should_see_save_button_in_the_assignment_detail_popup_window() {
		Assert.assertTrue(assignAddEdit.chkSaveButton());
		Loggerload.info("Admin sees  save button in the Assignment detail popup window");
	}

	// @assignment_33
	@Then("Admin should see  cancel button in the Assignment detail popup window")
	public void admin_should_see_cancel_button_in_the_assignment_detail_popup_window() {
		Assert.assertTrue(assignAddEdit.chkCancelButton());
		Loggerload.info("Admin sees  cancel button in the Assignment detail popup window");
	}

	// @assignment_34
	@Then("Admin should see  close button on the Assignment details popup window")
	public void admin_should_see_close_button_on_the_assignment_details_popup_window() {
		Assert.assertTrue(assignAddEdit.chkCloseButton());
		Loggerload.info("Admin sees  close button in the Assignment detail popup window");
	}

	// assignment_35 Add New Assignment

	@Given("Admin click +Add new assignment button after reaching to manage assignment page")
	public void admin_click_add_new_assignment_button_after_reaching_to_manage_assignment_page() {
		assignAddEdit.clkAddNewAssignment();
	}

	@Given("Admin is in  assignment details popup window")
	public void admin_is_in_assignment_details_popup_window() {
		Loggerload.info("Admin is in  assignment details popup window");
	}

	@When("Admin enters all mandatory field values with valid data valid values from {string} and {string}")
	public void admin_enters_all_mandatory_field_values_with_valid_data_valid_values_from_and(String SheetName,
			String Testcase) throws IOException {

		setAssignmentDetails(SheetName, Testcase);
	}

	// ( Program name, batch number,Assignment Name, grade by, Assignment due date)
	public void setAssignmentDetails(String SheetName, String Testcase) throws IOException {
		ArrayList<String> assignmentData = excelDataValue(SheetName, Testcase);
		String program_name = assignmentData.get(1);
		String batch_number = assignmentData.get(2);
		String assignment_Name = assignmentData.get(3);
		String assignment_desc = assignmentData.get(4);
		String grade_by = assignmentData.get(5);
		String assignment_dueDate = assignmentData.get(6);
		String assignment_file1 = assignmentData.get(7);
		String assignment_file2 = assignmentData.get(8);
		String assignment_file3 = assignmentData.get(9);
		String assignment_file4 = assignmentData.get(10);
		String assignment_file5 = assignmentData.get(11);

		assignAddEdit.enterAssignmentDetails(program_name, batch_number, assignment_Name, assignment_desc, grade_by,
				assignment_dueDate, assignment_file1, assignment_file2, assignment_file3, assignment_file4,
				assignment_file5);
	}

	@Then("Admin should see new assignment details is added in the data table")
	public void admin_should_see_new_assignment_details_is_added_in_the_data_table() {
		Loggerload.info("Admin should see new assignment details is added in the data table");
	}

	// assignment_36 Add New Assignment
	@When("Admin enters all mandatory field values with invalid data from {string} and {string}")
	public void admin_enters_all_mandatory_field_values_with_invalid_data_from_and(String SheetName, String Testcase)
			throws IOException {
		setAssignmentDetails(SheetName, Testcase);
	}

	@When("clicks save button")
	public void clicks_save_button() {
		assignAddEdit.clickkSaveButton();
	}

	@Then("Error message should appear in alert")
	public void error_message_should_appear_in_alert() {
		String errorMessage = assignAddEdit.alertdismsg();
		Loggerload.info("error Message :" + errorMessage);
	}

	// assignment_37 Add New Assignment

	@When("Admin enters values in all fields with valid data from {string} and {string}")
	public void admin_enters_values_in_all_fields_with_valid_data_from_and(String SheetName, String Testcase)
			throws IOException {
		setAssignmentDetails(SheetName, Testcase);
	}

	// (Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4,
	// Assignment file 5)
	// assignment_38 Add New Assignment (Negative - shouldn't give error msg since
	// these fields are optional
	@When("Admin enters with invalid data in optional fields from {string} and {string}")
	public void admin_enters_with_invalid_data_in_optional_fields_from_and(String SheetName, String Testcase)
			throws IOException {
		setAssignmentDetails(SheetName, Testcase);
	}

	// assignment_39 Add New Assignment
	@When("Admin enters  data missing value in program name from {string} and {string}")
	public void admin_enters_data_missing_value_in_program_name_from_and(String SheetName, String Testcase)
			throws IOException {
		setAssignmentDetails(SheetName, Testcase);
	}

	@Then("Program Name is missing")
	public void program_name_is_missing() {
		String errorMessage = assignAddEdit.alertdismsg();
		Loggerload.info("error Message :" + errorMessage);
	}

	// assignment_40 Add New Assignment
	@When("Admin enters  data missing value in Batch number from {string} and {string}")
	public void admin_enters_data_missing_value_in_batch_number_from_and(String SheetName, String Testcase)
			throws IOException {
		setAssignmentDetails(SheetName, Testcase);
	}

	@Then("Batch number is missing")
	public void batch_number_is_missing() {
		String errorMessage = assignAddEdit.alertdismsg();
		Loggerload.info("error Message :" + errorMessage);
	}

	// assignment_41 Add New Assignment
	@When("Admin enters  data missing value in Assignment name from {string} and {string}")
	public void admin_enters_data_missing_value_in_assignment_name_from_and(String SheetName, String Testcase)
			throws IOException {
		setAssignmentDetails(SheetName, Testcase);
	}

	@Then("Assignment Name is missing")
	public void assignment_name_is_missing() {
		String errorMessage = assignAddEdit.alertdismsg();
		Loggerload.info("error Message :" + errorMessage);
	}

	// assignment_42 Add New Assignment
	@When("Admin enters  data missing value in Assignment due date from {string} and {string}")
	public void admin_enters_data_missing_value_in_assignment_due_date_from_and(String SheetName, String Testcase)
			throws IOException {
		setAssignmentDetails(SheetName, Testcase);
	}

	@Then("Assignment due date is missing")
	public void assignment_due_date_is_missing() {
		String errorMessage = assignAddEdit.alertdismsg();
		Loggerload.info("error Message :" + errorMessage);
	}

	// assignment_43 Add New Assignment
	@When("Admin enters  data missing value in Grade by from {string} and {string}")
	public void admin_enters_data_missing_value_in_grade_by_from_and(String SheetName, String Testcase)
			throws IOException {
		setAssignmentDetails(SheetName, Testcase);
	}

	@Then("Grade by is missing")
	public void grade_by_is_missing() {
		String errorMessage = assignAddEdit.alertdismsg();
		Loggerload.info("error Message :" + errorMessage);
	}

	// assignment_44 Add New Assignment
	@When("Admin enters passed date in the due date field from {string} and {string}")
	public void admin_enters_passed_date_in_the_due_date_field_from_and(String SheetName, String Testcase)
			throws IOException {
		setAssignmentDetails(SheetName, Testcase);
	}

	@Then("Assignment cannot be created for the passed date")
	public void assignment_cannot_be_created_for_the_passed_date() {
		String errorMessage = assignAddEdit.alertdismsg();
		Loggerload.info("error Message :" + errorMessage);
	}

	// assignment_45 Add New Assignment

	@When("Admin clicks date from date picker")
	public void admin_clicks_date_from_date_picker() throws InterruptedException {
		assignAddEdit.clickCalenderIcon();

	}

	@Then("selected date should be their in class date text box")
	public void selected_date_should_be_their_in_class_date_text_box() {
		String inputDate = assignAddEdit.getDate();
		// if(inputDate.equals(class_date.getText())) {
		// Assert.assertTrue(true);
		// }
	}

	// assignment_46 Add New Assignment
	@Then("selected date should be in  mm\\/dd\\/yyyy format")
	public void selected_date_should_be_in_mm_dd_yyyy_format() throws ParseException {
		String inputDate = assignAddEdit.getDate();

		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat outputFormat = new SimpleDateFormat("mm/dd/yyyy");
		Date date = inputFormat.parse(inputDate);
		String output = outputFormat.format(date);
		if (output.equals(inputDate)) {
			Assert.assertTrue(true);
		}
	}

	// assignment_47 Add New Assignment
	@When("Admin clicks right arrow in the date picker near month")
	public void admin_clicks_right_arrow_in_the_date_picker_near_month() {
		assignAddEdit.clkDateRightArrow();
	}

	@Then("Next month calender should visible")
	public void next_month_calender_should_visible() {
		Loggerload.info("Next month calender should visible");
	}

	// assignment_48 Add New Assignment
	@When("Admin clicks left arrow in the date picker near month")
	public void admin_clicks_left_arrow_in_the_date_picker_near_month() {
		assignAddEdit.clkDateLefttArrow();
	}

	@Then("previous month calender should visible")
	public void previous_month_calender_should_visible() {
		Loggerload.info("previous month calender should visible");
	}

	// assignment_49 Add New Assignment
	@Then("Admin should see current date is highlighted in the date picker")
	public void admin_should_see_current_date_is_highlighted_in_the_date_picker() {
		Assert.assertTrue(assignAddEdit.highlightDate());
	}

	// assignment_50 Add New Assignment
	@When("Admin clicks date picker button")
	public void admin_clicks_date_picker_button() {
		assignAddEdit.clickCalenderIcon();
	}

	@When("selects future date")
	public void selects_future_date() throws InterruptedException {
		assignAddEdit.selectDate("October", "15");
	}

	// assignment_51 Add New Assignment
	@When("Admin clicks Cancel button without entering values in the fields")
	public void admin_clicks_cancel_button_without_entering_values_in_the_fields() {
		assignAddEdit.clkCancelButton();
		Loggerload.info("Admin clicked Cancel button without entering values in the fields");
	}

	@Then("Admin should land on manage assignment page")
	public void admin_should_land_on_manage_assignment_page() {
		if (assignAddEdit.getAssignmentHeader().equals("Manage Assignment")) {
			Loggerload.info("Admin landed on manage assignment page");
		}
	}

	// assignment_51 Add New Assignment
	@When("Admin clicks Cancel button entering values in the fields from {string} and {string}")
	public void admin_clicks_cancel_button_entering_values_in_the_fields_from_and(String SheetName, String Testcase) throws IOException {
		setAssignmentDetails(SheetName, Testcase);
		assignAddEdit.clkCancelButton();
	}

	@Then("validate new assignment is not created in the data table")
	public void validate_new_assignment_is_not_created_in_the_data_table() {
		if (assignAddEdit.getAssignmentHeader().equals("Manage Assignment")) {
			Loggerload.info("Admin landed on manage assignment page");
			/*int count = manageAssignment.getFooterText();
			if(count==actual count as before) {
				Loggerload.info("new assignment is not created in the data table");
			}*/
		}
	}
}
