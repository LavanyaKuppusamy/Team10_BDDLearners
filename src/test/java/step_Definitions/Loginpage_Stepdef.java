package step_Definitions;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_Objects.HomePage;

public class Loginpage_Stepdef {
	
	private static final Logger LOGGER = LogManager.getLogger(Loginpage_Stepdef.class);
	HomePage homepage =null;
	WebDriver driver=null;
	
	@Given("Admin is in home page")
	public void admin_is_in_home_page() {
	   
		            // launch browser
					//	LOGGER.info("Launching a browser");
					//	driver = DriverManager.getDriver();
					//	driver.get(Constant.HomepageUrl);
						homepage = new HomePage(driver);
		
	}

	@When("Admin clicks Login \"<data>\"button")
	public void admin_clicks_login_data_button() {
		
		homepage.clickonlogin();
	    
		
	}

	@Then("verify {string} admin landed page")
	public void verify_admin_landed_page(String string,DataTable dataTable) {
	   
		 List<String> crendential= dataTable.asList(String.class);
		   String data=crendential.get(0);
		   String output=crendential.get(0);
		   homepage.verifyloginpage(data, output);
	}

	@When("Admin clicks Login button")
	public void admin_clicks_login_button() {
		
	    homepage.clickonlogin();
		
	}

	@Then("Admin should see {string} in the header")
	public void admin_should_see_in_the_header(String string, DataTable dataTable) {
		
		List<String> crendential= dataTable.asList(String.class);
		   String data=crendential.get(0);
		   String output=crendential.get(0);
		   homepage.verifyloginpagetext(data, output);
	  
	}

	
	@Then("Admin should see two text field")
	public void admin_should_see_two_text_field() {
	   
		homepage.verifylogintextbox();
	}

	@Then("Admin should {string} in the first text field and {string} symbol")
	public void admin_should_in_the_first_text_field_and_symbol(String user, String asterik) {
		
	   homepage.verifyusertextbox(user, asterik);
		
	}

	@Then("Admin should {string} in the second text field and {string} symbol")
	public void admin_should_in_the_second_text_field_and_symbol(String pswd, String asterik) {
	    
		homepage.verifyusertextbox(pswd, asterik);
	}

	@Then("Admin should see input field on the centre of the page")
	public void admin_should_see_input_field_on_the_centre_of_the_page() {
	    
		homepage.verifyAlignment();
	}

	@Then("Admin should see login button on the centre of the page")
	public void admin_should_see_login_button_on_the_centre_of_the_page() {
	    
		homepage.verifyAlignLogin();
	}

	@Then("Admin should see forgot username\\/password  and Reset password link")
	public void admin_should_see_forgot_username_password_and_reset_password_link() {
	    
		homepage.verifylink();
	}

	@Then("Admin should see user and password in gray color")
	public void admin_should_see_user_and_password_in_gray_color() {
	    
		homepage.verifycolor();
	}

	
	@When("Admin enter {string} credentials  and clicks login button")
	public void admin_enter_credentials_and_clicks_login_button(String string) {
	      
		homepage.clickonlogin();
		
	}

	@Then("Admin should land on dashboard page {string}")
	public void admin_should_land_on_dashboard_page(String datakey,String sheetName) {
	    
		
		   homepage.Loginwithcredientials(sheetName, datakey);
	
	}

	@When("Admin enter valid credentials  and clicks login button through keyboard")
	public void admin_enter_valid_credentials_and_clicks_login_button_through_keyboard() {
	    
		homepage.Loginthroughkeyboard();
	}

	@Then("Admin should land on dashboard page")
	public void admin_should_land_on_dashboard_page() {
		
		homepage.Dashboardpage();
	    
		
	}

	@When("Admin enter valid credentials  and clicks login button through mouse")
	public void admin_enter_valid_credentials_and_clicks_login_button_through_mouse() {
		
		homepage.LoginthroughMouse();
	    
	}

	@Given("Admin is in login page")
	public void admin_is_in_login_page() {
	    
		homepage.clickonlogin();
	}

	@When("Admin clicks forgot username or password link")
	public void admin_clicks_forgot_username_or_password_link() {
		
		homepage.clickonforgotusernamepasswordlink();
	  		
	}

	@Then("Admin should land on {string} forgot username or password page")
	public void admin_should_land_on_forgot_username_or_password_page(String data, DataTable message) {
		
		homepage.verifylandingpage(data,message);
	    
	}

	
	@Then("Admin should see {string} text in gray color and text field with asterik")
	public void admin_should_see_text_in_gray_color_and_text_field_with_asterik(String string) {
	    
		homepage.verifyEmailtext(string);
	}

	@Then("Admin should see {string}  button")
	public void admin_should_see_button(String string) {
		
		homepage.verifysendlink(string);
	    
	}

	@Then("Admin should see send link button in center of the page")
	public void admin_should_see_send_link_button_in_center_of_the_page() {
	   
		homepage.verifysendlinkAlign();
	}

	@Given("Admin is in forgot username and password page")
	public void admin_is_in_forgot_username_and_password_page() {
	    homepage.clickonforgotusernamepasswordlink();
	}

	@When("Admin enters valid email id and clicks send link button")
	public void admin_enters_valid_email_id_and_clicks_send_link_button() {
	    homepage.EnterEmailandclicksendbtn();
	}

	@Then("Admin should receive link in mail for reset username \\/ password")
	public void admin_should_receive_link_in_mail_for_reset_username_password() {
		
	   homepage.validateinMailbox();
	}

	@When("Admin enters invalid email id and clicks send link button")
	public void admin_enters_invalid_email_id_and_clicks_send_link_button() {
		
		homepage.EnterInvalidEmailandclicksendbtn();
	}

	@Then("Admin should not receive link in mail for reset username \\/ password")
	public void admin_should_not_receive_link_in_mail_for_reset_username_password() {
		
		homepage.validateinMailbox();
	    
	}

	@When("Admin clicks reset password link")
	public void admin_clicks_reset_password_link() {
	    homepage.clickonresetpassword();
	}

	@Then("Admin should land on reset password page")
	public void admin_should_land_on_reset_password_page() {
		
		homepage.clickonresetpassword();
	    
	}

	@Then("Admin should see submit button in center of the page")
	public void admin_should_see_submit_button_in_center_of_the_page() {
		
		homepage.submitAlign();
	}

	@Then("Admin should see two text box")
	public void admin_should_see_two_text_box() {
	    
		homepage.Resetpasswordtxt();
	}

	@Then("Admin should see {string} in the first label text")
	public void admin_should_see_in_the_first_label_text(String expstr) {
	    
		homepage.verifyTypeinNewpswdtxt(expstr);
	}

	@Then("Admin should see {string} in the second label text")
	public void admin_should_see_in_the_second_label_text(String expstr) {
		
		homepage.verifyRetypepswd(expstr);
	    
	}

	@Then("Admin should see text box in disabled state")
	public void admin_should_see_text_box_in_disabled_state() {
		
	    homepage.verifydisablestate();
	}

	@Given("Admin reset password page")
	public void admin_reset_password_page() {
	    homepage.clickonresetpassword();
	}

	@When("Admin clicks on type in new password field")
	public void admin_clicks_on_type_in_new_password_field() {
	    
		homepage.clicksonnewpswd();
		
	}

	@Then("Admin should see text box is enabled state")
	public void admin_should_see_text_box_is_enabled_state() {
		
	    homepage.clicksonnewpswd();
	}

	@When("Admin clicks on retype password field")
	public void admin_clicks_on_retype_password_field() {
	    
		homepage.clicksonRetypepswd();
		
	}

	

	@When("Admin enters details and clicks submit button")
	public void admin_enters_details_and_clicks_submit_button() {
		
	    homepage.clickonsubmit();
	}

	@Then("Admin should recieve {string},{string},{string} Please click here to login")
	public void admin_should_recieve_please_click_here_to_login(String Newtypepswd, String retypepswd, String message, DataTable dataTable) {
		
		List<String> crendential= dataTable.asList(String.class);
		   String Newtypepswd1=crendential.get(0);
		   String retypepswd1=crendential.get(0);
		   String message1=crendential.get(0);
	    	homepage.verifydatawithretypepswdpage(Newtypepswd1,retypepswd1,message1);
	}

	@When("Admin clicks Login {string} button")
	public void admin_clicks_login_button(String string) {
	    homepage.clickonlogin();
	}

	

	
}
