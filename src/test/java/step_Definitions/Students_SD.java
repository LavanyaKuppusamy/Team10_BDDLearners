package step_Definitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_Objects.ManageStudentsPage;
import utilities.CrossBrowser;
import webdriverManager.DriverManager;

public class Students_SD {
	public WebDriver driver = CrossBrowser.getDriver();
	Students_SD students = new Students_SD();
	ManageStudentsPage managePage = new ManageStudentsPage(driver);

	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
		DriverManager.openPage("https://LMSportalapp.herokuapp.com/login");
	}

	@When("Admin clicks {string} on the navigation bar")
	public void admin_clicks_on_the_navigation_bar(String string) {
		managePage.studentPageClick();
	}

	@Then("Admin should see the Student details Page Title")
	public void admin_should_see_the_student_details_page_title() {
	    // Write code here that turns the phrase above into concrete actions
		managePage.checkTitle();
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Maximum navigation time in milliseconds, defaults to {int} seconds")
	public void maximum_navigation_time_in_milliseconds_defaults_to_seconds(Integer int1) {
		
		managePage.verifyNavigationtime(30);
	    
	}

	/*@Then("HTTP response >= {int}. Then the link is broken")
	public void http_response_then_the_link_is_broken(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/

	@Then("Admin should see LMS -Learning management system  as title")
	public void admin_should_see_lms_learning_management_system_as_title() {
		 {
		    
			managePage.verifyLMStitle();
		}
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Student Detail title should be in centre of the page")
	public void student_detail_title_should_be_in_centre_of_the_page() {
		managePage.verifyLMSAlign();
	}

	@Then("{int} dropdowns should be present in the page")
	public void dropdowns_should_be_present_in_the_page(Integer int1) {
	    managePage.verifyDropDown();
	}

	@Then("Admin should see search box inside the drop down")
	public void admin_should_see_search_box_inside_the_drop_down() {
	    managePage.verifySearchbox();
	}

	@Then("Admin should see search box inside  batch id drop down")
	public void admin_should_see_search_box_inside_batch_id_drop_down() {
	    managePage.verifyDropDown();
	}

	@Then("Admin should see correct spelling select student name")
	public void admin_should_see_correct_spelling_select_student_name() {
	   managePage.spellingCheck();
	}

	@Then("Admin should see correct spelling select  batch id text")
	public void admin_should_see_correct_spelling_select_batch_id_text() {
	    managePage.spellingCheck();
	}

	@Then("Admin should see only numbers inside batch id drop down")
	public void admin_should_see_only_numbers_inside_batch_id_drop_down() {
	    managePage.verifyNumbersInDropDown();
	}

	@Then("Admin should see select student name in gray color")
	public void admin_should_see_select_student_name_in_gray_color() {
	    managePage.checkColour();
	}

	@Then("Admin should see select batch ID in gray color")
	public void admin_should_see_select_batch_id_in_gray_color() {
	    managePage.checkColour();
	}

	
	// !IMPORTANT
	@Then("Admin should see select student name in first")
	public void admin_should_see_select_student_name_in_first() {
	    managePage.selecStudentName();
	}

	// !IMPORTANT
	@Then("Admin should see select batch id in second")
	public void admin_should_see_select_batch_id_in_second() {
	    managePage.selectBatchid();
	};


	@Then("Admin should able to scroll down to select the name")
	public void admin_should_able_to_scroll_down_to_select_the_name() {
	   managePage.scrollName();
	}

	@Then("Admin should able to scroll down to select the batch id")
	public void admin_should_able_to_scroll_down_to_select_the_batch_id() {
		managePage.scrollBatchid(); 
	}

	
	@Given("Admin is on student details page")
	public void admin_is_on_student_details_page() {
	    // Write code here that turns the phrase above into concrete actions
		managePage.studentPageClick();
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin select student name from the drop down")
	public void admin_select_student_name_from_the_drop_down() {
	    
	}

	@Then("Admin shouldn't see select student name text")
	public void admin_shouldn_t_see_select_student_name_text() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin select batch id from the drop down")
	public void admin_select_batch_id_from_the_drop_down() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin shouldn't see select batch id text")
	public void admin_shouldn_t_see_select_batch_id_text() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks select student name and  enters x alphabet in the search box")
	public void admin_clicks_select_student_name_and_enters_x_alphabet_in_the_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see student name start with x is listed below")
	public void admin_should_see_student_name_start_with_x_is_listed_below() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin  clicks select batch id and enter x number in the search box")
	public void admin_clicks_select_batch_id_and_enter_x_number_in_the_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see batch id start with x is listed below")
	public void admin_should_see_batch_id_start_with_x_is_listed_below() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin selects only student name")
	public void admin_selects_only_student_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Student details shouldn't be displayed")
	public void student_details_shouldn_t_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin selects only  batch id")
	public void admin_selects_only_batch_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("batch id details shouldn't be displayed")
	public void batch_id_details_shouldn_t_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin selects  student name and batch id")
	public void admin_selects_student_name_and_batch_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Particular student informations should be display")
	public void particular_student_informations_should_be_display() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks on program link on student  page")
	public void admin_clicks_on_program_link_on_student_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin is redirected to Program page")
	public void admin_is_redirected_to_program_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks on Batch link on student page")
	public void admin_clicks_on_batch_link_on_student_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin is redirected to Batch page")
	public void admin_is_redirected_to_batch_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks on Class link on student page")
	public void admin_clicks_on_class_link_on_student_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin is redirected to Class page")
	public void admin_is_redirected_to_class_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks on User link on student page")
	public void admin_clicks_on_user_link_on_student_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin is redirected to User page")
	public void admin_is_redirected_to_user_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks on Assignment link on student page")
	public void admin_clicks_on_assignment_link_on_student_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin is redirected to Assignment page")
	public void admin_is_redirected_to_assignment_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks on Attendance link on student page")
	public void admin_clicks_on_attendance_link_on_student_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin is redirected to Attendance page")
	public void admin_is_redirected_to_attendance_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks on Logout link on student page")
	public void admin_clicks_on_logout_link_on_student_page() {
		managePage.ClickonLogout();
	}

	@Then("Admin is redirected to Login page")
	public void admin_is_redirected_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}










}



