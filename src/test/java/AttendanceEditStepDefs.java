package step_Definitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import page_Objects.AttendanceEditPage;
import page_Objects.ProgramPage;

public class AttendanceEditStepDefs {
	
	WebDriver driver;
	//Students_SD students = new Students_SD();
	AttendanceEditPage attendancepage = new AttendanceEditPage(driver);
	
	@Given("Admin lands on attendance details page by clicking on New Attendance")
	public void admin_lands_on_attendance_details_page_by_clicking_on_new_attendance() {
	    
		attendancepage.clickAddAttendance();
	}
	

	@Given("Admin fills the values for add attendance page with {string}, {string}, {string}, {string}, {string}")
	public void admin_fills_the_values_for_add_attendance_page_with(String programName, String className, String studentName, String attendance, String attendanceDate) {
		attendancepage.EnterAttendanceDetails(programName, className, studentName, attendance, attendanceDate);
	}

	@When("Admin clicks on {string}")
	public void admin_clicks_on(String confirmButton) {
	   
		attendancepage.ClickConfirmation(confirmButton);
	}

	@Then("Admin gets save confirmation {string}")
	public void admin_gets_save_confirmation(String message) throws InterruptedException {
	    
		Thread.sleep(3000);
		boolean output = driver.getPageSource().contains(message);
		Assert.assertEquals(output,true);		
		Thread.sleep(2000);
		if (!message.equals("NA")){
			String actualMsg=attendancepage.GetSuccessMessage();
			if (!actualMsg.contains(message))  
					assertEquals("Success message is not per requirement",message, actualMsg); 
		}
	}

	
	@Given("Admin lands on attendance details page by clicking on Edit Attendance")
	public void admin_lands_on_attendance_details_page_by_clicking_on_edit_attendance() {
		
		int GetProgramRecordCount=attendancepage.GetRecordCount();
		int index=attendancepage.getRandomIndex(GetProgramRecordCount);
		attendancepage.ClickEditButton(index);
	   
	}
}
