package step_Definitions;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import page_Objects.ProgramPage;

public class ProgFunctionalityDefs {
	
	WebDriver driver;
	ProgramPage progPage;
	boolean Content;
	
	@Given("Admin is on Manage Program page")
	public void admin_is_on_manage_program_page() {
		assertEquals("Not landed on Program page","Manage Program" , progPage.GetPageHeaderTitle());
	   
	}

	@When("Admin clicks Next page link on the program table")
	public void admin_clicks_next_page_link_on_the_program_table() {
		
		progPage.ClickNextNavigationButton();
	   
	}

	@Then("Admin should see the Pagination has next link")
	public void admin_should_see_the_pagination_has_next_link() {
		
		progPage.IsSecondpageLoaded();
	   
	}
	
	@When("Admin clicks Last page link")
	public void admin_clicks_last_page_link() {
	   progPage.ClickLastNavigationButton();
	}

	@Then("Admin should see the last page record on the table with Next page link are disabled")
	public void admin_should_see_the_last_page_record_on_the_table_with_next_page_link_are_disabled() {
	
		progPage.IsNextNavigationDisabled();
	}

	@When("Admin clicks First page link")
	public void admin_clicks_first_page_link() {
	    
		progPage.ClickPreviousNavigationButton();
	}

	@Then("Admin should see the previous page record on the table with pagination has previous page link")
	public void admin_should_see_the_previous_page_record_on_the_table_with_pagination_has_previous_page_link() {
	   
		progPage.IsFirstpageButtonEnabled();
	}

	@When("Admin clicks Start page link")
	public void admin_clicks_start_page_link() {
	    
		progPage.ClickFirstsNavigationButton();
	}
	
	@Then("Admin should see the very first page record on the table with Previous page link are disabled")
	public void admin_should_see_the_very_first_page_record_on_the_table_with_previous_page_link_are_disabled() {
		
		progPage.IsPreviouNavigationDisabled();
	   
	}

	@When("Admin clicks on the Ascending or Descending arrow button on program page")
	public void admin_clicks_on_the_ascending_or_descending_arrow_button_on_program_page(io.cucumber.datatable.DataTable dataTable) {
	   
	}

	@Then("Admin can see the results in Ascending or Descending order on program page")
	public void admin_can_see_the_results_in_ascending_or_descending_order_on_program_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks on the link page button on program page")
	public void admin_clicks_on_the_link_page_button_on_program_page(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
		 // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin is re-directed to following page")
	public void admin_is_re_directed_to_following_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("Admin clicks {string} on the navigation bar")
	public void admin_clicks_on_the_navigation_bar(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see URL with {string}")
	public void admin_should_see_url_with(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see a heading with text {string} on the page")
	public void admin_should_see_a_heading_with_text_on_the_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the text as {string} along with Pagination icon below the table.")
	public void admin_should_see_the_text_as_along_with_pagination_icon_below_the_table(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the footer as {string}.")
	public void admin_should_see_the_footer_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
    
	
	@Then("Admin should see a Delete button on the top left hand side as Disabled")
	public void admin_should_see_a_delete_button_on_the_top_left_hand_side_as_disabled() {
		
		assertFalse("Multiple delete button is enabled", progPage.IsMultiDeleteIconEnabled());
	   
		
	}

	@Then("Admin should see a {string} button on the program page above the data table")
	public void admin_should_see_a_button_on_the_program_page_above_the_data_table(String ButtonText) {
		
		assertTrue("Add new button is not visible", progPage.IsAddButtonDisplayed());
		assertEquals("Page title is not pre requirement", ButtonText,progPage.GetAddButtonText() );
	   
	}

	@Then("Admin should see the number of records \\(rows of data in the table) displayed on the page are {int}")
	public void admin_should_see_the_number_of_records_rows_of_data_in_the_table_displayed_on_the_page_are(Integer int1) {
	    
		
		
	}

	@Then("Admin should see the sort arrow icon beside to each column header except Edit and Delete")
	public void admin_should_see_the_sort_arrow_icon_beside_to_each_column_header_except_edit_and_delete() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see check box on the left side in all rows of the data table")
	public void admin_should_see_check_box_on_the_left_side_in_all_rows_of_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Admin should see the Edit and Delete buttons on each row of the data table")
	public void admin_should_see_the_edit_and_delete_buttons_on_each_row_of_the_data_table() {
	    
	}

	@Then("Admin should see Search bar with text as {string}")
	public void admin_should_see_search_bar_with_text_as(String string) {
	   
	}

	@Then("Admin should see data table on the Manage Program Page with following column headers")
	public void admin_should_see_data_table_on_the_manage_program_page_with_following_column_headers(io.cucumber.datatable.DataTable dataTable) {
	  
	}

	@When("Admin enters Program search content into search box {string}")
	public void admin_enters_program_search_content_into_search_box(String Content) {
		
		progPage.EnterSearchContent(Content);
	   
	}

	@Then("Admin see the Program search result")
	public void admin_see_the_program_search_result() throws InterruptedException {
		
		
	    
		
	}

}
