package step_Definitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.util.Assert;

import io.cucumber.java.en.*;
import page_Objects.ClassEdit;

import utilities.Loggerload;
public class ClassEdit_Stepdef {
	
	ClassEdit ec =new ClassEdit();
	WebDriver driver;
	String URL = driver.getCurrentUrl();
	@Given("Admin is in Manage class page")
	public void admin_is_in_manage_class_page() {
	    ec.dashboard_classlink();
	}

	@When("Admin clicks Edit button in data table")
	public void admin_clicks_edit_button_in_data_table() {
	   ec.ClickEditIcon();
	}

	@Then("Edit popup window appears with heading Class Details")
	public void edit_popup_window_appears_with_heading_class_details() {
	   ec.CheckPopup();
	}

	@When("Admin clicks Edit button from one of the row in data table")
	public void admin_clicks_edit_button_from_one_of_the_row_in_data_table() {
	    ec.selectSingleEditIcon();
	}

	@Then("Edit popup window appears with same row values in the all fields")
	public void edit_popup_window_appears_with_same_row_values_in_the_all_fields() {
	    ec.CheckPopup();
	}
	@Given("Admin is in  Edit class detail popup window")
	public void admin_is_in_edit_class_detail_popup_window() {
	    ec.CheckPopup();
	}

	@When("Admin enters all mandatory field values with valid data{string},{string}, {string}, {string}and clicks save button")
	public void admin_enters_all_mandatory_field_values_with_valid_data_class_date_u08_and_clicks_save_button(String BatchID, String NoofClasses, String ClassDate , String StaffId, String status ) {
	    ec.EnterClassDetails(BatchID, NoofClasses, ClassDate, StaffId);
	    ec.ClickConfirmation(status);
	}

	@Then("Admin should see particular class details is updated in the data table")
	public void admin_should_see_particular_class_details_is_updated_in_the_data_table(String message) {
	  ec.GetSuccessMessage();
	 if (!message.equals("NA")){
			String actualMsg=ec.GetSuccessMessage();
			if (!actualMsg.contains(message))  
					assertEquals("Success message is not per requirement",message, actualMsg); 
		}
	}

	@When("Admin enters all mandatory field values with valid data {string},{string}, {string}, {string} and clicks save button")
	public void admin_enters_all_mandatory_field_values_with_valid_data_class_date_u06_and_clicks_save_button(String BatchID, String NoofClasses, String ClassDate, String StaffId, String status) {
	    ec.EnterClassDetails(BatchID, NoofClasses, ClassDate, StaffId);
	    ec.ClickConfirmation(status);
	    
	}
	@When("Admin enters all mandatory field values with invalid data {string},{string}, {string}, {string} and clicks save button")
	public void admin_enters_all_mandatory_field_values_with_invalid_data_and_clicks_save_button(String BatchID, String NoofClasses, String ClassDate, String StaffId, String status ) {
		 ec.EnterClassDetails(BatchID, NoofClasses, ClassDate, StaffId);
		    ec.ClickConfirmation(status);
		
	}

	@Then("Error message should appear in alert")
	public void error_message_should_appear_in_alert() {
	    ec.verifyErrorMsg();
	}

	@When("Admin enters values in all fields with valid data {string},{string},{string}, {string}, {string} , {string},  {string}, {string}, {string}, \"C:\\Recordings\"and click save button")
	public void admin_enters_values_in_all_fields_with_valid_data_c_recordings_and_click_save_button(String BatchID , String NoofClasses, String ClassDate, String StaffId, String ClassTopic, String Classdescription, String Comments , String Notes , String Recordings, String status) {
	    ec.EnterAllClassDetails(BatchID, NoofClasses, ClassDate, StaffId, ClassTopic, Classdescription, Comments, Notes, Recordings);
	    ec.ClickConfirmation(status);
	}

	@When("Admin enters with invalid data {string},{string}, {string}, \"U0$\"and click save button")
	public void admin_enters_with_invalid_data_u0$_and_click_save_button(String BatchID, String NoofClasses, String ClassDate, String StaffId, String status) {
		 ec.EnterClassDetails(BatchID, NoofClasses, ClassDate, StaffId);
		    ec.ClickConfirmation(status);
		    Loggerload.info(status);
	}

	@When("Admin enters  data missing value in Batch ID {string},{string}, {string}, \"U08\"and clicks save button")
	public void admin_enters_data_missing_value_in_batch_id_u08_and_clicks_save_button(String NoofClasses, String ClassDate, String StaffId, String status) {
	    ec.EnterClassDetails(null, NoofClasses, ClassDate, StaffId);
	    ec.ClickConfirmation(status);
	}

	@Then("Batch Id is missing")
	public void batch_id_is_missing() {
	    ec.verifyErrorMsg();
	    Loggerload.info("Batch Id is missing");
	}

	
    @When("Admin enters data missing value in No of class {string},{string}, {string}, \"U08\"and clicks save button")
	public void admin_enters_data_missing_value_in_no_of_class_u08_and_clicks_save_button(String BatchID, String ClassDate, String StaffId, String status) {
	    ec.EnterClassDetails(BatchID, null, ClassDate, StaffId);
	    ec.ClickConfirmation(status);
	}

	@Then("No of classes is missing")
	public void no_of_classes_is_missing() {
	    ec.verifyErrorMsg();
	    Loggerload.info("No of classes is missing");
	}

	@When("Admin enters data missing value in  class date\"{int}\",\"< No of Classes>{string}\", \"U08\" and clicks save button")
	public void admin_enters_data_missing_value_in_class_date_no_of_classes_u08_and_clicks_save_button( String BatchID, String NoofClasses, String StaffId, String status ) {
	    ec.EnterClassDetails(BatchID, NoofClasses, null, StaffId);
	    ec.ClickConfirmation(status);
	}

	@Then("class date is missing")
	public void class_date_is_missing() {
	    ec.verifyErrorMsg();
	    Loggerload.info("class date is missing");
	}

	@When("Admin enters data missing value in staff id\"{int}\",\"< No of Classes>\", \"{int}\\/{int}\\/{int}\", \"\" and clicks save button")
	public void admin_enters_data_missing_value_in_staff_id_no_of_classes_and_clicks_save_button(String BatchID, String NoofClasses, String ClassDate, String status )  {
	    	ec.EnterClassDetails(BatchID, NoofClasses, ClassDate, null);
	    	ec.ClickConfirmation(status);
	}

	@Then("staff id is missing")
	public void staff_id_is_missing() {
		ec.verifyErrorMsg();
	    Loggerload.info("staff id is missing");
	}

	@When("Admin clicks Cancel button without entering values in the fields")
	public void admin_clicks_cancel_button_without_entering_values_in_the_fields() {
	    ec.Clickcancelbtn();
	}

	@Then("Admin should land on Manage Class page")
	public void admin_should_land_on_manage_class_page() {
		
	   Loggerload.info("Admin should land on Manage Class page");
	   
	}

	@When("Admin clicks Cancel button entering values in the fields")
	public void admin_clicks_cancel_button_entering_values_in_the_fields() {
	    ec.Clickcancelbtn();
	 
	}

	@Then("Admin should land on Manage Class Page and validate particular class details are not changed  in the data table")
	public void admin_should_land_on_manage_class_page_and_validate_particular_class_details_are_not_changed_in_the_data_table() {
	    Loggerload.info("Admin should land on Manage Class Page and validate particular class details are not changed  in the data table");
	    
	}
}



