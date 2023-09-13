
	package step_Definitions;
	import java.io.IOException;
	import java.util.*;
	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.testng.Assert;
	import webdriverManager.DriverManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import page_Objects.ClassPage;
	public class ClassPage_Stepdef {
		
		WebDriver driver;
		private ClassPage cp;
		
		@Given("Admin is on dashboard page after Login")
		public void admin_is_on_dashboard_page_after_login() {
			
			cp.Dashboard_page();
		
		}
		@When("Admin clicks Class button on the navigation bar")
		public void admin_clicks_class_button_on_the_navigation_bar() {
		
			cp.click_classbutton();
		}
		@Then("Admin should see URL with Manage Class")
		public void admin_should_see_url_with_manage_class() {
			
		 cp.dashboard_title();
		}
		@Then("Get the response time for navigation to manage class page")
		public void Get_the_response_time_for_navigation_to_manage_class_page() {
			
			cp.Response_time();
				
		}
		
		@Then("admin sees header with Manage Class")
		public void admin_sees_header_with_Manage_Class() {
			cp.Header_display();	
	}
		
		@Then("Admin should see correct spelling for the all the fields")
		public void Admin_should_see_correct_spelling_for_the_all_the_fields(){
			
			
		}
		@Then("Admin should see disabled delete icon below the Manage Class")
		public void Admin_should_see_disabled_delete_icon_below_the_Manage_Class() {
			
			cp.Disable_Deleteicon_ManagePage();
			
		}
		
		@Then(" Admin should see search bar on the class page")
		public void Admin_should_see_search_bar_on_the_class_page() {
			
			cp.Searchbar(null);
		}
		
	//@tag7
		@Then("Admin should see +Add New Class button on the class page")
		public void Admin_should_see_Add_New_Class_button_on_the_class_page() {
			
			cp.AddNew_Button();
		}
		//@tag8
		@Then("Admin should see data table on the Manage Class Page Class")
		public void Admin_should_see_data_table_on_the_Manage_Class_Page() {
			 List<WebElement> list_of_headers = cp.getTableHeaders(); 	
			 list_of_headers.stream().forEach(l -> System.out.println(l)); 		
			 System.out.println("Admin sees the data table with headers Id, Name,location, Phone Number, Edit/Delete");
		
		}
		
		//@tag9
		@Then(" Edit Icon in each row of data table only when entries are available")
		public void Edit_Icon_in_each_row_of_data_table_only_when_entries_are_available() {
			 List<WebElement> list_of_Rows = cp.getTableRows(); 	
			 list_of_Rows.stream().forEach(l -> System.out.println(l)); 		
			 System.out.println("list of rows is:" + list_of_Rows);
		 Assert.assertEquals(list_of_Rows, 10);
		 cp.RowEdit_icon();
		}
		
	//@tag10
		
		@Then(" Edit Icon will not be present in data table")
		public void Edit_Icon_will_not_be_present_in_data_table() {
			List<WebElement> list_of_Rows1 = cp.getTableRows(); 	
			 list_of_Rows1.stream().forEach(l -> System.out.println(l)); 		
			 System.out.println("list of rows is:" + list_of_Rows1);
		 Assert.assertEquals(list_of_Rows1, 0);
		 cp.EditButton_NotPresent();
			
		}
		
		//@tag11
		
		@Then("Delete Icon in each row of data table only when entries are available")
		public void Delete_Icon_in_each_row_of_data_table_only_when_entries_are_available() {
			 List<WebElement> list_of_Rows2 = cp.getTableRows2(); 	
			 list_of_Rows2.stream().forEach(l -> System.out.println(l)); 		
			 System.out.println("list of rows is:" + list_of_Rows2);
		 Assert.assertEquals(list_of_Rows2, 10);
		 cp.RowDelete_icon();
		
		}
		//@tag12
		
		@Then("Admin cant see delete Icon in data table")
		public void Admin_cant_see_delete_Icon_in_data_table() {
			 List<WebElement> list_of_Rows3 = cp.getTableRows2(); 	
			 list_of_Rows3.stream().forEach(l -> System.out.println(l)); 		
			 System.out.println("list of rows is:" + list_of_Rows3);
		 Assert.assertEquals(list_of_Rows3,0);
		 cp.RowDelete_icon_NotPresent();
			
		}
		
		//tag13
		@ Then("Admin should see sort icon near the column headers except for Edit and Delete")
		public void Admin_should_see_sort_icon_near_the_column_headers_except_for_Edit_and_Delete() {
			
			cp.sortByColumn(null, null);
			
		}
		
		//tag14
		
		//@tag15
		@Then ("Admin should see check box in the all rows of data table ")
		public void Admin_should_see_check_box_in_the_all_rows_of_data_table () {
			cp.checkbox();
			
		}
		
		//@tag17
		@Then ("Admin should see the pagination controls under the data table ")
		public void Admin_should_see_the_pagination_controls_under_the_data_table () {
			
			cp.Pagination_Controls();
			
		}
		
		//@tag18
		
		@Then ("Admin should see the text with total number classes in the data table")
		public void Admin_should_see_the_text_with_total_number_classes_in_the_data_table () {
			
			cp.TotalClass_Nos_text();
		}
		//tag19
		
		@Given("Admin is on Manage Class Page")
		public void Admin_is_on_Manage_Class_Page() {
			
			cp.Manage_Page();
		
		}
		@When("Admin enters batch id into search box")
		public void Admin_enters_batch_id_into_search_box() {
		
			cp.searchbox_data(null);
			
		}
		
		@Then ("Displays entries with that batchId ")
		public void Displays_entries_with_that_batch_Id() {
			
			cp.searchbox_entries();
			
		}
		//invalidbatchid
		
		@When("Admin enters into search box")
		public void Admin_enters_into_search_box() {
			
			cp.searchbox_Invaliddata(null);
			
		
		}
		
		@Then ("Displays empty details in the data table ")
		public void Displays_empty_details_in_the_data_table() {
			
			cp.searchbox_entries();
			
		}	
		//valid class number
		
		
		@When("Admin enters into class no in search box")
		public void Admin_enters_class_no_into_search_box(String classno) {
			
			cp.searchbox_classno(classno);
			
		}
		
		@Then ("Displays entries with that class no")
		public void Displays_entries_with_that_class_no() {
			
		 cp.searchbox_entries();	
			
		}	
		@When("Admin enters invalid class no in search box")
		public void Admin_enters_invalid_class_no_in_search_box(String invalidClassno){
			
			cp.searchbox_Invalid(invalidClassno);
			
		}
		
		@Then ("Displays entries with that invalid class no")
		public void Displays_entries_with_that_invalid_class_no() {
			
		 cp.searchbox_entries();	
			
		}	
		
		@When(" Admin enters valid Class Topic into search box")
		public void Admin_enters_valid_Class_Topic_into_search_box(String classtopic) {
			
			cp.searchbox_classtopic(classtopic);
			
		}
		
		
		
		@Then ("Displays entries with that class topic")
		public void Displays_entries_with_that_class_topic() {
			
		 cp.searchbox_entries();	
			
		}	
		
		@When(" Admin enters invalid Class Topic into search box")
		public void Admin_enters_invalid_Class_Topic_into_search_box(String classtopic) {
			
			cp.searchbox_classtopic(classtopic);
			
		}
		
		@Then ("Displays empty details in the data table")
		public void Displays_empty_details_in_the_data_table1() {
			
		 cp.searchbox_entries();	
			
		}	
		
		@When(" Admin enters valid Staff id into search box")
		public void Admin_enters_valid_Staff_Id_into_search_box(String classtopic) {
			
			cp.searchbox_Staffid(classtopic);
			
		}
		
		@Then ("Displays entries with that Staff id")
		public void Displays_entries_with_that_Staff_id() {
			
		 cp.searchbox_entries();	
			
		}	
		
		@When(" Admin enters invalid Staff id into search box")
		public void Admin_enters_invalid_Staff_id_into_search_box(String classtopic) {
			
			cp.searchbox_InvalidStaffId(classtopic);
			
		}
		
		@Then ("Displays empty details in the data table")
		public void Displays_empty_details_in_the_data_table2() {
			
		 cp.searchbox_entries();	
			
		}	
		
		@When(" Admin enters valid Class Date into search box")
		public void Admin_enters_valid_Class_Date_into_search_box(String classtopic) {
			
			cp.searchbox_ClassDate1(classtopic);
			
		}
		
		@Then ("Displays entries with that Class Date")
		public void Displays_entries_with_that_Class_Date() {
			
		 cp.searchbox_entries();	
			
		}	
		
		//@classdetailspopupwindow
		
		@When("Admin click Add New Class button")
		public void Admin_click_Add_New_Class_button() {
		
			cp.AddNew_Button();
		}
		@Then("Admin should see a popup with heading class details")
		public void Admin_should_see_a_popup_with_heading_class_details() {
			
		 cp.Classdeatils_Header();
		}
		
		@Then("Admin should see input fields Text Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings")
		public void Admin_should_see_input_fields_Text_Batch_ID_No_of_Classes_Class_Date_Class_Topic_Staff_Id_Class_description_Comments_Notes_Recordings() {
			
		 cp.Input_Details();
		}
		
		@Then("Six textbox should be present in Class details popup window")
		public void Six_textbox_should_be_present_in_Class_details_popup_window() {
			
		 cp.text_box();
		}
		
		 @Then ("Admin should see dropdown option for Batch ID")
		 public void Admin_should_see_dropdown_option_for_Batch_ID() {
		
		cp.drop_down();
		
		 }
		
		 @Then ("Admin should see dropdown option for Staff Id")
		 public void Admin_should_see_dropdown_option_for_Staff_Id() {
			
		
		cp.Staffid_drop_down();
		
		 }
		 @Then ("Admin should see calendar icon for class date")
		 public void Admin_should_see_calendar_icon_for_class_date() {
			
		
		cp.Clasdate_calendericon();
		
		 }
		
		 @Then ("Admin should see save button in the class detail popup window")
		 public void Admin_should_see_save_button_in_the_class_detail_popup_window() {
			
		
		cp.Save_button();
		
		 }
		
		 @Then ("Admin should see cancel button in the class detail popup window")
		 public void Admin_should_see_cancel_button_in_the_class_detail_popup_window() {
			
		
		cp.Cancel_button();
		
		 }
		
		 @Then ("Admin should see close button in the class detail popup window")
		 public void Admin_should_see_close_button_in_the_class_detail_popup_window() {
			
		
		cp.Close_button();
		
		 }
		
		 //@Add New Class
		
		 @Given("Admin is in class detail popup window")
			public void Admin_is_in_class_detail_popup_window() {
				
			cp.classdetails_popupwindow();
			
			}
			@When(" Admin clicks Batch ID dropdown")
			public void Admin_clicks_Batch_ID_dropdown() {
			
				cp.batchid_dropdown();
				
			}
			
			@Then ("Batch id in the drop down should match with Batch id manage batch page table")
			public void Batch_id_in_the_drop_down_should_match_with_Batch_id_manage_batch_page_table() {
				
				cp.batchid_dropdown();
				
			}
			
			 @When("Admin enters all mandatory field values with valid data ")
			 public void Admin_enters_all_mandatory_field_values_with_valid_data (String code1) {
				
				 cp.AddNewClassdetails_ValidData(code1);
				
			 }
			
			 @Then("Admin should see new class details is added in the data table")
			
		 public void Admin_should_see_new_class_details_is_added_in_the_data_table(DataTable dataTable) {
						List<Map<String,String>> Reglist2=dataTable.asMaps();
						String batchid=Reglist2.get(0).get("batchid");
						String classno = Reglist2.get(0).get("classno");
						String classdate = Reglist2.get(0).get("classdate");
						String staffid = Reglist2.get(0).get("staffid");
						driver.get("https://lms.com/Addnewclass");
						cp.AddNew_Classdetails(batchid);
				
			
			 }
			
			 @When("Admin enters all mandatory field values with invalid data and clicks save button {string} {string} {string} {string} {string} {string} {string} and {string}")
				public void Admin_enters_values_in_all_fields_with_valid_data_and_clicks_save_button(String ClassDescription, String comments, String Notes,String Batchid, String Classno, String Classdate, String Staffid, int RowNumber) throws InvalidFormatException, IOException {
					ExcelReader reader=new ExcelReader();
					List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/lmsproject/Excel/DsAlgo_data (3).xlsx", Staffid);
					String code=testData.get(RowNumber).get("invaliddata");
					cp.class_invalid_data(code);
					cp.Save_button();
				
				}
			 @Then ("Error message should appear in alert")
			 public void Error_message_should_appear_in_alert() {
				
				 cp.Alerterror_message();
				
			 }
			 @When("Admin enters values in all fields with valid data and clicks save button {string} {string} {string} {string} {string} {string} {string} and {string}")
				public void Admin_enters_values_in_all_fields_with_valid_data_and_clicks_save_buttons(String ClassDescription, String comments, String Notes,String Batchid, String Classno, String Classdate, String Staffid, int RowNumber) throws InvalidFormatException, IOException {
					//ExcelReader reader=new ExcelReader();
					//List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/lmsproject/Excel/DsAlgo_data (3).xlsx", Staffid);
					//String code=testData.get(RowNumber).get("validdata");
					//cp.AddNewClassdetails_ValidData(code);
					cp.Save_button();
				
				}
			
			
			 @Then ("Admin should see new class details is added in the data table")
			 public void Admin_should_see_new_class_details_is_added_in_the_data_table() {
				
				 cp.AddNew_Classdetails();
				
			 }
			
			 @When("Admin enters all mandatory field values with invalid data and clicks save button {string} {string} {string} {string} {string} {string} {string} and {string}")
				public void Admin_enters_values_in_all_fields_with_invalid_data_and_clicks_save_button(String ClassDescription, String comments, String Notes,String Batchid, String Classno, String Classdate, String Staffid, int RowNumber) throws InvalidFormatException, IOException {
					ExcelReader reader=new ExcelReader();
					List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/lmsproject/Excel/DsAlgo_data (3).xlsx", Staffid);
					String code=testData.get(RowNumber).get("invaliddata");
					cp.class_invalid_data(code);
					cp.Save_button();
				
				}
			 @Then ("Error message should appear in alert")
			 public void Error_message_should_appear_in_alerts() {
				
				 cp.Alerterror_message();
				
			 }
			
			
			 @When("Admin enters data missing value in Batch ID and clicks save button {string} {string} {string} and {string}")
				public void Admin_enters_values_in_all_fields_with_invalid_data_and_clicks_save_button(String Batchid, String Classdate, String Staffid, int RowNumber) throws InvalidFormatException, IOException {
					ExcelReader reader=new ExcelReader();
					List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/lmsproject/Excel/DsAlgo_data (3).xlsx", Staffid);
					String code=testData.get(RowNumber).get("BatchId");
					cp.Batchid_empty(Batchid, Classdate, Staffid);
					cp.Save_button();
				
				}
			 @Then ("Batch Id is missing")
			 public void Batch_Id_is_missing() {
				
				 cp.Batchid_missing();
				
			 }
			
			 @When("Admin enters data missing value in No of Class and clicks save button {string} {string} {string} and {string}")
				public void Admin_enters_data_missing_value_in_No_of_class_and_clicks_save_button (String Batchid, String Classdate, String Staffid, int RowNumber) throws InvalidFormatException, IOException {
					ExcelReader reader=new ExcelReader();
					List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/lmsproject/Excel/DsAlgo_data (3).xlsx", Staffid);
					String code=testData.get(RowNumber).get("ClassNo");
					cp.ClassNo_empty(Batchid, Classdate, Staffid);
					cp.Save_button();
				
				}
			 @Then ("No of classes is missing")
			 public void Class_No_is_missing() {
				
				 cp.ClassNo_missing();
				
			 }
			 @When("Admin enters data missing value in Class Date and clicks save button {string} {string} {string} and {string}")
				public void Admin_enters_data_missing_value_in_Class_Date_and_clicks_save_button (String Batchid, String Classdate, String Staffid, int RowNumber) throws InvalidFormatException, IOException {
					ExcelReader reader=new ExcelReader();
					List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/lmsproject/Excel/DsAlgo_data (3).xlsx", Staffid);
					String code=testData.get(RowNumber).get("ClassDate");
					cp.Classdate_empty(Batchid, Classdate, Staffid);
					cp.Save_button();
				
				}
			 @Then ("Class Date is missing")
			 public void Class_Date_is_missing() {
				
				 cp.ClassDate_missing();
				
			 }
			
			
			 @When("Admin enters data missing value in Staff id and clicks save button {string} {string} {string} and {string}")
				public void Admin_enters_data_missing_value_in_staff_id_and_clicks_save_button(String Batchid, String Classdate, String Staffid, int RowNumber) throws InvalidFormatException, IOException {
				    ExcelReader reader=new ExcelReader();
					List<Map<String,String>> testData=ExcelReader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/lmsproject/Excel/DsAlgo_data (3).xlsx", Staffid);
					String code=testData.get(RowNumber).get("Staffid");
					cp.Classdate_empty(Batchid, Classdate, Staffid);
					cp.Save_button();
				
				}
			 @Then ("Staff id is missing")
			 public void Staff_id_is_missing() {
				
				 cp.ClassDate_missing();
				
			 }
			
			 @When("Admin enters passed date in the class date field and clicks save button {string} {string} {string} and {string}")
				public void Admin_enters_passed_date_in_the_class_date_field_and_clicks_save_button(String Batchid, String Classdate, String Staffid, int RowNumber, WebElement[] passdates) throws InvalidFormatException, IOException {
					ExcelReader reader=new ExcelReader();
					List<Map<String,String>> testData=reader.getData("/Users/rajanikanthpemmaraju-venkata/eclipse-workspace/lmsproject/Excel/DsAlgo_data (3).xlsx", Staffid);
					String code=testData.get(RowNumber).get("passeddate");
					cp.Passed_date(passdates);
					cp.Save_button();
				
				}
			 @Then ("class cannot be created for the passed date")
			 public void class_cannot_be_created_for_the_passed_date(String value) {
				
				cp.errormessage_passeddate(value);
				
			 }
			
			
				
				 @When("Admin clicks date from date picker ")
				 public void Admin_clicks_date_from_date_picker() {
					
					 cp.datepicker();
					
				 }
			
			
				 @Then ("selected date should be there in class date text box")
					public void selected_date_should_be_there_in_class_date_text_box() {
						
						cp.validDatePickup();
						
					}
				
			
			
			
				 @Then ("selected date should be in mm/dd/yyyy format")
					public void selected_date_should_be_in_mm_dd_yyyy_format(String dmy) {
						
						cp.validdateformat(dmy);
						
					}
				 @When("Admin clicks right arrow in the date picker near month")
				 public void Admin_clicks_right_arrow_in_the_date_picker_near_month() {
					
				cp.leftarrow_datepicker();
					
				 }
			
			
				 @Then ("Next month calender should visible")
					public void Next_month_calender_should_visible() {
						
						cp.previousmonth();
						
					}
				
				 @When("Admin clicks date picker button")
				 public void Admin_clicks_date_picker_button() {
					
				cp.Currentdate();
					
				 }
			
				 @Then ("Admin should see current date is highled in the date picker")
					public void Admin_should_see_current_date_is_highled_in_the_date_picker() {
						
					cp.CurrentDate_Highlighted();
					
						
					}
				
				
				 @When("Admin clicks date picker button and selects future date")
				 public void Admin_clicks_date_picker_button_and_selects_future_date() {
					
				cp.futuredate();
					
				 }
			
			
				 @Then ("Admin should see selected date is highlited in the date picker")
					public void Admin_should_see_selected_date_is_highlited_in_the_date_picker() {
						
						cp.FutureDate_Highlighted();
						
					}
				
				 @When("Admin clicks Cancel button without entering values in the fields")
				 public void Admin_clicks_Cancel_button_without_entering_values_in_the_fields() {
					
				cp.Cancel_button();
					
				 }
			
			
				 @Then ("Admin should land on Manage Class page")
					public void Admin_should_land_on_Manage_Class_page() {
						
						cp.Manage_Page();
						
					}
				 @When("Admin clicks Cancel button entering values in the fields")
				 public void Admin_clicks_Cancel_button_entering_values_in_the_fields() {
					
				cp.Cancel_button();
					
				 }
			
			
				 @Then ("Admin should land on Manage Class Page and validate new class is not created in the data table")
					public void Admin_should_land_on_Manage_Class_Page_and_validate_new_class_is_not_created_in_the_data_table() {
						
						cp.Manage_Page();
						cp.validateclass_cancelbutton();
						
					}
				 
				 
				//@Delete
					
				 @Given("Admin is in Manage class page")
				 public void Admin_is_in_Manage_class_page() {
					
				cp.Manage_Page();
					
				 }
			
				
				 @When("Admin clicks delete button in data table row level")
					public void Admin_clicks_delete_button_in_data_table_row_level() {
					
				
					 cp.deletebutton_rowlevel();
				 }
			
			
				 @Then ("Admin should see alert")
					public void Admin_should_see_alert() {
						
						cp.alert_display();
						
					}
				 @Then ("Alert should have yes button to accept")
					public void Alert_should_have_yes_button_to_accept(String value) {
						
						cp.alert_accept(value);
						
					}
				 @Then ("Alert should have no button to accept")
					public void Alert_should_have_no_button_to_accept(String value) {
						
						cp.alert_dismiss(value);
						
					}
				
				 @When(" Admin clicks yes button")
					public void Admin_clicks_yes_button(String value) {
					
				
					 cp.alert_accept(value);
				 }
			
			
				 @Then ("Success message and validate particular class details are deleted from the data table")
					public void Success_message_and_validate_particular_class_details_are_deleted_from_the_data_table(String message) {
						
						cp.successmessage_delete(message);
						
					}
				
				 @When(" Admin clicks no button")
					public void Admin_clicks_no_button(String value) {
					
				
					 cp.alert_dismiss(value);
				 }
			
			
				 @Then ("Admin should land on manage class page and validate particular class details are not deleted from the data table")
					public void Admin_should_land_on_manage_class_page_and_validate_particular_class_details_are_not_deleted_from_the_data_table (String message1){
						cp.Manage_Page();
						cp.message_deleted(message1);
						
						
					}
				
			
		
		 //@Deletemultipleclassvalidation
		
	@Given ("Admin is in Managee class page")
	public void Admin_is_in_Managee_class_page() {
		
		cp.Manage_Page();
		
	}
	@When(" Admin clicks single row level check box in the data table")
	public void Admin_clicks_single_row_level_check_box_in_the_data_table() {
	cp.Singlerow_checkbox();
	}
	@Then ("Admin should see delete icon below the header is enabled")
	public void Admin_should_see_delete_icon_below_the_header_is_enabled(){
		
		cp.Header_deleteicon();
		
	}
	@Then ("Admin should see tick mark in check box ")
	public void Admin_should_see_tick_mark_in_check_box (){
		
		cp.Tickmark_Checkbox(true);
		
	}
	@When(" Admin clicks multiple row level check box in the data table")
	public void Admin_clicks_multiple_row_level_check_box_in_the_data_table() {
	cp.Multiplerow_checkbox();
	}
	@Then ("Admin should see tick mark in check box of the selected rows")
	public void Admin_should_see_tick_mark_in_check_box_of_the_selected_rows(){
		
		cp.Multiplerow_checkboxselected();
		
	}
	@Given ("Admin is in delete alert")
	public void Admin_is_in_delete_alert(){
		
		cp.alert_display();
		
	}
	@When("Admin clicks yes buttton")
	public void Admin_clicks_yes_buttton(String value) {
	cp.alert_accept(value);
	}
	@Then ("Success message and validate particular class details are deleted from the data table")
	public void Success_message_and_validate_particular_class_detaills_are_deleted_from_the_data_table(String message){
		
		cp.successmessage_delete(message);
		
		
	}	
	@When("Admin clicks no buttton")
	public void Admin_clicks_no_buttton(String value) {
	cp.alert_dismiss(value);
	}
	@Then ("Success message and validate particular class details are not deleted from the data table")
	public void Success_message_and_validate_particular_class_detaills_are_not_deleted_from_the_data_table(String message1){
		
		cp.message_deleted(message1);
		
		
	}	
	@Then ("Admin should land on manage class page and validate particular class details are deleted from the data table")
	public void Admin_should_land_on_manage_class_page_and_validate_particular_class_details_are_deleted_from_the_data_table (String message){
		
		cp.Manage_Page();
		
		cp.successmessage_delete(message);
		
		
	}	
	@Then("Admin should land on manage class page and validate particular class details are nott deleted from the data table")
	public void Admin_should_land_on_manage_class_page_and_validate_particular_class_details_are_nott_deleted_from_the_data_table (String message1){
		
		cp.Manage_Page();
		
		cp.message_deleted(message1);
		
		
	}
	}

				 
				 
				 
				
			 }
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		




