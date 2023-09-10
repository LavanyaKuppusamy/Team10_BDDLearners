package step_Definitions;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;


import constant.Constant;
import page_Objects.HomePage;
import webdriverManager.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomePage_stepdef {
	
	private static final Logger LOGGER = LogManager.getLogger(HomePage_stepdef.class);
	HomePage homepage =null;
	WebDriver driver=null;
		
	@Given("Admin launch the browser")
	public void admin_launch_the_browser() {
		
		// launch browser
			//	LOGGER.info("Launching a browser");
			//	driver = DriverManager.getDriver();
			//	driver.get(Constant.HomepageUrl);
				homepage = new HomePage(driver);
 	
	}

	@When("Admin gives the correct LMS portal URL")
	public void admin_gives_the_correct_lms_portal_url() {
		
		homepage.Verifyhomepage();
	    
	}

	@Then("Admin should land on the home page")
	public void admin_should_land_on_the_home_page() {
		
		homepage.Verifyhomepage();
	    
	}

	@When("Admin gives the invalid LMS portal URL")
	public void admin_gives_the_invalid_lms_portal_url() {
	    
		homepage.Verifyhomepage();
	}

	@Then("Admin should recieve {int} page not found error")
	public void admin_should_recieve_page_not_found_error(Integer int1) {
	   
		homepage.Verifyhomepage();
	}

	@Then("HTTP response >= {int}. Then the link is broken")
	public void http_response_then_the_link_is_broken(Integer int1) {
	    
		homepage.Verifyhomepage();
	}

	@Then("Admin should see correct spellings in all fields")
	public void admin_should_see_correct_spellings_in_all_fields() {
	   
		homepage.verifytext();
		
	}

	@Then("Admin should see correct logo of the LMS")
	public void admin_should_see_correct_logo_of_the_lms() {
	    
		homepage.verifylogo();
		
	}

	@Then("Admin should see logo is properly aligned")
	public void admin_should_see_logo_is_properly_aligned() {
	    
		homepage.verifylogo();
	}

	@Then("Admin should see login button")
	public void admin_should_see_login_button() {
	   
		homepage.verifylogin();
	}

	@Then("Admin should able to click the Login button")
	public void admin_should_able_to_click_the_login_button() {
	    
		homepage.verifyloginClickable();

	}
	
	
}

