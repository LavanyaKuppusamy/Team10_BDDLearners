package step_Definitions;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.*;
import page_Objects.BatchPage;
import utilities.Loggerload;

public class Batchmainpage_stepdef {
	
	BatchPage bp = new BatchPage(); 

	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login(String pagename) {
		bp.navigate(pagename);
		Loggerload.info(pagename);
	}

	@When("Admin clicks {string} from navigation bar")
	public void admin_clicks_from_navigation_bar(String string) {
	    bp.dashboard_batchlink();
	    Loggerload.info("User clicks on batch link");
	}

	@Then("Admin should see the {string} in the URL")
	public void admin_should_see_the_in_the_url(String UrlName) {
	    bp.navigate(UrlName);
		Loggerload.info("User get the Url Name");
		
	}

	@Then("Admin should see the {string} in the header")
	public void admin_should_see_the_in_the_header(String string) {
	   String Title= bp.getManageBatchpageTitle();
	   Loggerload.info("Current Page Title is :" + Title);
	   assertEquals(Title,"Manage Program Page");
	}

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {
	    
	}

	@Then("Admin Should see the data table with headers Batch name, Batch Description,Batch Status, No. of classes, Program Name, Edit/Delete")
	public void admin_should_see_the_data_table_with_headers_batch_name_batch_description_batch_status_no_of_classes_program_name_edit_delete() {
		List<WebElement> list_of_headers = bp.getTableHeaders(); 
		list_of_headers.stream().forEach(l -> System.out.println(l));
		Loggerload.info("Admin sees the data table with Batch name, Batch Description,Batch Status, No. of classes, Program Name , Edit/Delete");
	}

	@Then("Admin should be able to see the {string} button that is disabled")
	public void admin_should_be_able_to_see_the_icon_button_that_is_disabled(String string) {
	    bp.checkDeleteButton();
	}

	@Then("Admin should be able to see the {string} button")
	public void admin_should_be_able_to_see_the_button(String string) {
	    bp.checkNewBatchButton();
	}

	@Then("Each row in the data table should have a checkbox")
	public void each_row_in_the_data_table_should_have_a_checkbox() {
	  List<WebElement>checkbox = bp.hasCheckBox();
	  boolean flag = checkbox.stream().anyMatch(c -> c.isDisplayed());
	   Assert.assertTrue(flag);
	   Loggerload.info("Each row in the data table should have a check box");
	}

	@Then("Each row in the data table should have a edit icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_edit_icon_that_is_enabled() {
	    bp.CheckEditIcon();
	}

	@Then("Each row in the data table should have a delete icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled() {
	    bp.deleteIcon();
	}

	@When("Admin clicks {string} button")
	public void admin_clicks_button(String string) {
	    bp.checkNewBatchButton();
	}

	@Then("A new pop up with Batch details appears")
	public void a_new_pop_up_with_batch_details_appears() {
	    bp.Checkpopuptext();
	}

	}

	
	


