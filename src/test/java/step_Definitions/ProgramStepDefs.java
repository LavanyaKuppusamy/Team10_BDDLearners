package step_Definitions;


import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.*;
import page_Objects.ProgramPage;

public class ProgramStepDefs {
	
	
	WebDriver driver;
	
	ProgramPage progPage;
	int Chkindex;
	
	@Given("Admin lands on program details page by clicking on New Program")
	public void admin_lands_on_program_details_page_by_clicking_on_new_program() throws InterruptedException {
		
		progPage.clickAddProgram();
		Thread.sleep(2000);
		boolean output = driver.getPageSource().contains("Program Details");
		Assert.assertEquals(output,true);
	}
	    

	@Given("Admin enters program details with {string},{string} and {string}")
	public void admin_enters_program_details_with_and(String ProgName, String ProgDesc, String status) {
		
		progPage.EnterProgramDetails(ProgName, ProgDesc, status);
	    
	}

	@When("Admin clicks on Program {string} button")
	public void admin_clicks_on_program_button(String Confirmation) {
		
		progPage.ClickConfirmation(Confirmation);
	   
	}

	@Then("Admin gets following pop up message {string}")
	public void admin_gets_following_pop_up_message(String Message) throws InterruptedException {
		
		Thread.sleep(3000);
		boolean output = driver.getPageSource().contains(Message);
		Assert.assertEquals(output,true);		
		Thread.sleep(2000);
		if (!Message.equals("NA")){
			String actualMsg=progPage.GetSuccessMessage();
			if (!actualMsg.contains(Message))  
					assertEquals("Success message is not per requirement",Message, actualMsg); 
		}
	   
	}

	@Then("Admin lands on Manage Program")
	public void user_lands_on_manage_program() {
		
		assertEquals("Not landed on Program page","Manage Program" , progPage.GetPageHeaderTitle());
	   
	}
	
	@Given("Admin lands on program details page by clicking on Edit Program")
	public void admin_lands_on_program_details_page_by_clicking_on_edit_program() {
		
		int GetProgramRecordCount=progPage.GetRecordCount();
		int index=progPage.getRandomIndex(GetProgramRecordCount);
		progPage.ClickEditButton(index);
	   
	}


	@Given("Admin edit program details with {string},{string} and {string}")
	public void admin_edit_program_details_with_and(String ProgName, String ProgDesc, String status) {
		
		progPage.EnterProgramDetails(ProgName, ProgDesc, status);
		    
	}

	@Given("Admin is on Manage Program Page")
	public void admin_is_on_manage_program_page() {
		
		assertEquals("Not landed on Program page","Manage Program" , progPage.GetPageHeaderTitle());
	    
	}

	@Given("Admin select one program")
	public void admin_select_one_program() {
	   
		int GetProgramRecordCount=progPage.GetRecordCount();
		Chkindex=progPage.getRandomIndex(GetProgramRecordCount);
		progPage.ClickSingleSelectCheckbox(Chkindex);
		
	}

	@When("Admin clicks Delete Checkbox")
	public void admin_clicks_delete_checkbox() {
		
		
		progPage.ClickSingleDeleteIcon(Chkindex);
	    	
	}

	@Then("Admin should see a alert open with heading {string} button for deletion")
	public void admin_should_see_a_alert_open_with_heading_button_for_deletion(String Confirm) {
		
		progPage.ClickDeleteConfirmation(Confirm);
	    
	}

	@Then("Admin gets following message {string}")
	public void admin_gets_following_message(String Message) {
		
		if (!Message.equals("NA")){
			String actualMsg=progPage.GetSuccessMessage();
			if (!actualMsg.contains(Message))  
				assertEquals("Success message is not per requirement",Message, actualMsg); 
		
			assertEquals("Not landed on Program page","Manage Program" , progPage.GetPageHeaderTitle());
		}
	   
		
	}

	@Given("Admin select multiple program")
	public void admin_select_multiple_program() {
	    
		
		progPage.ClickMutiSelectCheckBox();
	}

	@Given("Admin clicks multiple Delete button")
	public void admin_clicks_multiple_delete_button() {
		
		progPage.ClickMultiDeleteIcon();
		
	}
	    
	

}
