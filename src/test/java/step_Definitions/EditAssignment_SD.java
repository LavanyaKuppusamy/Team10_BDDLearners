package step_Definitions;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import constant.Constant;
import driver.Driver_Factory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_Objects.AssignmentAddEditPage;
import utilities.Loggerload;

public class EditAssignment_SD extends Constant {

	WebDriver driver = Driver_Factory.getDriver();
	String URL = driver.getCurrentUrl();
	AssignmentAddEditPage assignAddEdit = new AssignmentAddEditPage(driver);

	// @assignment_53
	@When("Admin clicks Edit button in data table")
	public void admin_clicks_edit_button_in_data_table() {
		// manageAssignment.clickEdit()
		Loggerload.info("Admin clicked Edit button in data table");
	}

	@Then("Edit popup window appears with heading Assignment Details")
	public void edit_popup_window_appears_with_heading_assignment_details() {
		String header = assignAddEdit.getAssignmentHeader();
		Loggerload.info("Edit popup window appears with heading " + header);
	}

	// @assignment_54
	@When("Admin clicks Edit button from one of the row in data table")
	public void admin_clicks_edit_button_from_one_of_the_row_in_data_table() {
		assignAddEdit.clickEditIcon();
	}

	@Then("Edit popup window appears with same row values in the all fields")
	public void edit_popup_window_appears_with_same_row_values_in_the_all_fields() {
		Loggerload.info("Edit popup window appears with same row values in the all fields");
	}

	// @assignment_55
	@Given("Admin is in  Edit assignment detail popup window")
	public void admin_is_in_edit_assignment_detail_popup_window() {
		Loggerload.info("Admin is in  Edit assignment detail popup window");
	}

	@When("Admin enters all mandatory field values with valid data from {string} and {string}")
	public void admin_enters_all_mandatory_field_values_with_valid_data_from_and(String SheetName, String Testcase) throws IOException {
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

	@Then("Admin should see updated assignment details is added in the data table")
	public void admin_should_see_updated_assignment_details_is_added_in_the_data_table() {
		Loggerload.info("Admin should see updated assignment details is added in the data table");
	}
	//assignment_56 has repeating Gherkins ,so no stepDefinitions

}
