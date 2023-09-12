package step_Definitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_Objects.Dashboardpage;

public class DashboardPage_Stepdef {
	
	WebDriver driver;
	
	
	Dashboardpage dashboard=new Dashboardpage(driver);
	
	@When("Admin enter valid credentials  and clicks login button")
	public void admin_enter_valid_credentials_and_clicks_login_button(String Username, String Password) {
		
		dashboard.Loginwithcredientials(Username, Password);
	    
	}

	@Then("Admin should see manage program as header")
	public void admin_should_see_manage_program_as_header() {
		
		dashboard.VerifyDashboardPage();
	    
	}

	@Then("Maximum navigation time in milliseconds, defaults to {int} seconds")
	public void maximum_navigation_time_in_milliseconds_defaults_to_seconds(Integer int1) {
		
		dashboard.verifyNavigationtime(30);
	    
	}

	@Then("Admin should see LMS -Learning management system  as title")
	public void admin_should_see_lms_learning_management_system_as_title() {
	    
		dashboard.verifyLMStitle();
	}

	@Then("LMS title should be on the top left corner of page")
	public void lms_title_should_be_on_the_top_left_corner_of_page() {
		
		dashboard.verifyLMSAlign();
	   
	}

	@Then("Admin should see correct spelling in navigation bar text")
	public void admin_should_see_correct_spelling_in_navigation_bar_text() {
		
		dashboard.Spellcheck();
	   
	}

	@Then("Admin should see correct spelling and space in LMS title")
	public void admin_should_see_correct_spelling_and_space_in_lms_title() {
		
	    dashboard.Spellcheck();
	}

	@Then("Admin should see the navigation bar text on the top right side")
	public void admin_should_see_the_navigation_bar_text_on_the_top_right_side() {
		
	    dashboard.verifyLMSAlignNavigationbar();
	}

	@Then("Admin should see student, program, batch, Class, User, Assignment, Attendence and Logout")
	public void admin_should_see_student_program_batch_class_user_assignment_attendence_and_logout() {
		
		dashboard.verifytheposition();
	    
	}

	@Given("Admin is in dashboard page")
	public void admin_is_in_dashboard_page() {
		
	    dashboard.VerifyDashboardPage();
	}

	@When("Admin click Logout button on navigation bar")
	public void admin_click_logout_button_on_navigation_bar() {
		
	    dashboard.ClickonLogout();
	}

	@Then("Admin should land on login in page")
	public void admin_should_land_on_login_in_page() {
		
	    dashboard.VerifyDashboardPage();
	}	
}
