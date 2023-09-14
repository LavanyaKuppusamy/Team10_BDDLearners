package step_Definitions;
import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.*;
import page_Objects.BatchPage;
import utilities.CommonUtils;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.Loggerload;
import utilities.ExcelSheet;
public class AddEditDelBatch_stepdef {
	
	CommonUtils util =new CommonUtils ();
	BatchPage bp = new BatchPage();
	private String message;
	static String batchName;
    static String batchDescr;
    static String progName;
    static String Status;
	static String classnos;
	static String confirmation;
	String Excelpath=ConfigReader.getexcelfilepath();
	
	@Then("The pop up should include the fields Name ,Description as text box, Program Name as drop down, Status as radio button ,Number of classes as text box")
	public void the_pop_up_should_include_the_fields_name_description_as_text_box_program_name_as_drop_down_status_as_radio_button_number_of_classes_as_text_box() {
		bp.BatchDetails();
		Loggerload.info("Admin sees the data table with field name, Batch Description,Batch Status, No. of classes, Program Name");
	}

	@Then("User finds description field is optional")
	public void user_finds_description_field_is_optional() {
	  bp.Description();
	}

	@When("Admin enters batch details with {string},{string},{string},{string},{string} and click {string} button")
	public void admin_enters_batch_details_with_and_click_button(String batchName, String batchDescr, String progName, String Status, String classnos, String confirmation) {
	    bp.setBatchName(batchName);
	    bp.setBatchDescr(batchDescr);
	    bp.setProgName(progName);
	    bp.SetStatus(Status);
	    bp.SetNoOfClasses(classnos);
	    bp.ClickConfirmation(confirmation);
	}
	
	

	@Then("User find a \"Batch created\"new batch created or not")
	public void user_find_a_batch_created_new_batch_created_or_not() {
	  bp.getSuccessmsg(message);
	  
	}

	@Then("User find a \"Batch Not created\"new batch created or not")
	public void user_find_a_batch_not_created_new_batch_created_or_not() {
	   bp.verifyErrorMsg();
	}

	@When("any of the fields have invalid {string},{string},{string},{string},{string} and click {string} button values")
	public void any_of_the_fields_have_invalid_and_click_button_values(String batchName, String batchDescr, String progName, String Status, String classnos, String confirmation)  {
		bp.setBatchName(batchName);
	    bp.setBatchDescr(batchDescr);
	    bp.setProgName(progName);
	    bp.SetStatus(Status);
	    bp.SetNoOfClasses(classnos);
	    bp.ClickConfirmation(confirmation);
	}
	
	@Then("Error {string} should appear")
	public void error_should_appear(String warn ) {
	    
	    String mes =bp.verifyErrorMsg();
	    assertEquals(mes, warn);
	}
	@Given("The delete icon on row level in data table is enabled")
	public void the_delete_icon_on_row_level_in_data_table_is_enabled() {
	    bp.deleteIcon();
	}

	@When("Admin clicks the delete icon")
	public void admin_clicks_the_delete_icon_ADD() {
	    bp.clickdeleteIcon();
	}

	@Then("Alert appears with yes and No option")
	public void alert_appears_with_yes_and_no_option() {
	    bp.a1ertMsg();
	}

	@When("You click yes option")
	public void you_click_yes_option() {
	   bp.ClickYes();
	}

	@Then("Batch deleted alert pops and batch is no more available in data table")
	public void batch_deleted_alert_pops_and_batch_is_no_more_available_in_data_table() {
	bp.AllBatch();
    }

	@When("you click No option")
	public void you_click_no_option() {
	    bp.ClickNo();
	}

	@Then("Batch is still listed in data table")
	public void batch_is_still_listed_in_data_table() {
	    bp.AllBatch();
	}
	@Given("None of the checkboxes in data table are selected")
	public void none_of_the_checkboxes_in_data_table_are_selected() {
	    bp.checkboxButton();
	    
	}

	@Then("The delete icon under the {string} header should be disabled")
	public void the_delete_icon_under_the_header_should_be_disabled_ADD(String string) {
	    bp.checkDeleteButton();
	    Loggerload.info("Delete button is disabled");
	}

	@Given("One of the checkbox\\/ row is selected")
	public void one_of_the_checkbox_row_is_selected() {
	   bp.selectSingleCheckbox();
	}

	@When("Click delete icon below {string} header")
	public void click_delete_icon_below_header(String string) {
		bp.clickDeleteBtn();
		
	}

	@Then("The respective row in the data table is deleted")
	public void the_respective_row_in_the_data_table_is_deleted_ADDBATCH() {
	bp.selectSingleDeleteIcon();
	}

	@Given("Two or more checkboxes\\/row is selected")
	public void two_or_more_checkboxes_row_is_selected() {
	    bp.selectMultipleCheckbox();
	}
	@Given("The edit icon on row level in data table is enabled")
	public void the_edit_icon_on_row_level_in_data_table_is_enabled() {
	    Assert.assertTrue(bp.CheckEditIcon());
	    Loggerload.info("User can see the enabled Edit Icon in row level");
		
	}

	@When("Admin clicks the edit icon")
	public void admin_clicks_the_edit_icon() {
	    bp.ClickEditIcon();
	}
	@When("Update the fields with valid values {string} and \"{int}\"and click Save")
	public void update_the_fields_with_valid_values_and_and_click_save(String SheetName, Integer rowNo) {
		ExcelReader reader = new ExcelReader();

		
		/*List<Map<String, String>> testdata = reader.getData(Excelpath, SheetName);
		
		batchName = testdata.get(rowNo).get("batchName");
		batchDescr = testdata.get(rowNo).get("batchDescr");
		progName = testdata.get(rowNo).get("progName");
		Status = testdata.get(rowNo).get("Status");
		classnos= testdata.get(rowNo).get("classnos");
		confirmation= testdata.get(rowNo).get("confirmation");
		Loggerload.info("User Enter  as \"batchName " + batchName + " \"and batchDescr as \" " + batchDescr + "\" progName as\" "+ progName + "\" Status as\" "+ Status + "\" classnos as\" "+ classnos + "\" confirmation as\" "+ confirmation);
		if (batchName != null || batchDescr != null || progName != null || Status != null ||classnos != null || confirmation != null) {
			bp.setBatchName(batchName);
			bp.setBatchDescr(batchDescr);
			bp.setProgName(progName);
			bp.SetStatus(Status);
			bp.SetNoOfClasses(classnos);
			bp.ClickConfirmation(confirmation);
			
		}*/
	}

	@Then("The updated batch details should appear on the data table")
	public void the_updated_batch_details_should_appear_on_the_data_table() {
	    bp.AllBatch();
	}

	@When("Update the fields with invalid values {string} and  \"{int}\" and click save")
	public void update_the_fields_with_invalid_values_and_and_click_save(String SheetName , Integer rowNo) {
   /* ExcelReader reader = new ExcelReader();
    List<Map<String, String>> testdata = reader.getData(Excelpath, SheetName);
		
		batchName = testdata.get(rowNo).get("batchName");
		batchDescr = testdata.get(rowNo).get("batchDescr");
		progName = testdata.get(rowNo).get("progName");
		Status = testdata.get(rowNo).get("Status");
		classnos= testdata.get(rowNo).get("classnos");
		confirmation= testdata.get(rowNo).get("confirmation");
		Loggerload.info("User Enter  as \"batchName " + batchName + " \"and batchDescr as \" " + batchDescr + "\" progName as\" "+ progName + "\" Status as\" "+ Status + "\" classnos as\" "+ classnos + "\" confirmation as\" "+ confirmation);
		if (batchName != null || batchDescr != null || progName != null || Status != null ||classnos != null || confirmation != null) {
			bp.setBatchName(batchName);
			bp.setBatchDescr(batchDescr);
			bp.setProgName(progName);
			bp.SetStatus(Status);
			bp.SetNoOfClasses(classnos);
			bp.ClickConfirmation(confirmation);
			
		}
		Loggerload.info("User clicks on Save Button");
		bp.ClickConfirmation(confirmation);
	}*/
	}
	@Then("Error message should appear")
	public void error_message_should_appear() {
	    Loggerload.info("User get an error message that Entered Values are invalid");
	    String errMsg=bp.verifyErrorMsg();
	    String ExpectedError="Entered Values are invalid ";
	    Loggerload.info("Displayed error message is "+errMsg);
	    assertEquals(errMsg,ExpectedError);
	}

	@When("Erase data from mandatory field {string} and {int}")
	public void erase_data_from_mandatory_field_and(String SheetName, Integer rowNo) {
	/*	ExcelReader reader = new ExcelReader();
	    List<Map<String, String>> testdata = reader.getData(Excelpath, SheetName);
			
			batchName = testdata.get(rowNo).get("batchName");
			batchDescr = testdata.get(rowNo).get("batchDescr");
			progName = testdata.get(rowNo).get("progName");
			Status = testdata.get(rowNo).get("Status");
			classnos= testdata.get(rowNo).get("classnos");
			confirmation= testdata.get(rowNo).get("confirmation");
			Loggerload.info("User Enter  as \"batchName " + batchName + " \"and batchDescr as \" " + batchDescr + "\" progName as\" "+ progName + "\" Status as\" "+ Status + "\" classnos as\" "+ classnos + "\" confirmation as\" "+ confirmation);
			if (batchName != null || batchDescr != null || progName != null || Status != null ||classnos != null || confirmation != null) {
				bp.setBatchName(batchName);
				bp.setBatchDescr(batchDescr);
				bp.setProgName(progName);
				bp.SetStatus(Status);
				bp.SetNoOfClasses(classnos);
				bp.ClickConfirmation(confirmation);
				
			}
			Loggerload.info("User clicks on Save Button");
			bp.ClickConfirmation(confirmation);
		}*/
	}
	@When("Erase data from description field {string} and {int}")
	public void erase_data_from_description_field_and(String SheetName, Integer rowNo) {
		/*ExcelReader reader = new ExcelReader();
	    List<Map<String, String>> testdata = Excelreader.getData(Excelpath, SheetName);
			
			batchName = testdata.get(rowNo).get("batchName");
			batchDescr = testdata.get(rowNo).get("batchDescr");
			progName = testdata.get(rowNo).get("progName");
			Status = testdata.get(rowNo).get("Status");
			classnos= testdata.get(rowNo).get("classnos");
			confirmation= testdata.get(rowNo).get("confirmation");
			Loggerload.info("User Enter  as \"batchName " + batchName + " \"and batchDescr as \" " + batchDescr + "\" progName as\" "+ progName + "\" Status as\" "+ Status + "\" classnos as\" "+ classnos + "\" confirmation as\" "+ confirmation);
			if (batchName != null || batchDescr != null || progName != null || Status != null ||classnos != null || confirmation != null) {
				bp.setBatchName(batchName);
				bp.setBatchDescr(batchDescr);
				bp.setProgName(progName);
				bp.SetStatus(Status);
				bp.SetNoOfClasses(classnos);
				bp.ClickConfirmation(confirmation);
				
			}
			Loggerload.info("User clicks on Save Button");
			bp.ClickConfirmation(confirmation);
		}*/

	}
	


}
