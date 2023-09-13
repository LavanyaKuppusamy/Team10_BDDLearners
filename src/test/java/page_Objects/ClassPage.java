	package page_Objects;
	import static org.testng.Assert.assertEquals;
	import java.util.List;
	import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.Assert;
	import freemarker.core.Comment;
	public class ClassPage {
		
		private static final String select = null;
		public WebDriver driver;
		
		String DashboardUrl="https://lms.com/dsahboard";
		String ManagePageUrl="https://lms.com/MainClassPage";
		@FindBy (xpath="/html/body/div[2]/div[1]/div/div/a") WebElement ClassButton;
		@FindBy(xpath="//mat-toolbar/span[th]") WebElement MainPageHeader;
		@FindBy (xpath="/html/body/div[2]/div/div[2]/form/input[4]") WebElement TopDeleteicon;
		@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]") WebElement Searchbar;
		@FindBy (xpath="/html/body/div[2]/ul[1]/a") WebElement AddNewButton;
		@FindBy(xpath="//mat-toolbar/span[1]") WebElement TableHeaders;
		@FindBy (xpath="/html/body/div[2]/div/div[2]/a") WebElement Checkbox;
		@FindBy (xpath="//pre[@role='presentation']") WebElement BatchId;
		@FindBy (xpath="/html/body/div[2]/ul[2]/a") WebElement ClassNo;
		@FindBy (xpath="/html/body/div[2]/ul[3]/a") WebElement ClassDate;
		@FindBy (xpath="/html/body/div[2]/ul[4]/a") WebElement ClassTopic;
		@FindBy (xpath="//*[@id=\"content\"]/a") WebElement StaffId;
		@FindBy (xpath="/html/body/div[2]/a") WebElement Description;
		@FindBy (xpath="/html/body/div[2]/div[1]/div/div/a") WebElement Notes;
		@FindBy(xpath="//mat-toolbar/span[1]") WebElement Recording;
		@FindBy (xpath="/html/body/div[2]/div/div[2]/form/input[4]") WebElement Edit;
		@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]") WebElement Delete;
		@FindBy (xpath="//table[contains(@id,'ba')]//tr") WebElement TableRow;
		@FindBy (xpath="/html/body/div[3]/div/div[2]/form/input[4]") WebElement RowEditicon;
		@FindBy(xpath="//mat-toolbar/span[TR]") WebElement TableBody;
		@FindBy (xpath="/html/body/div[2]/div/div[2]/form/input[5]") WebElement RowDeleteicon;
	@FindBy (xpath="/html/body/div[2]/div/div[2]/form/input[6]") WebElement Sorting;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[4]/ul/a[4]") WebElement Chkbox;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[8]") WebElement pcontrols;
	@FindBy (xpath="/html/body/div[6]/ul[8]/a") WebElement Classnumbertext;
	@FindBy(xpath="//mat-toolbar/span[th]") WebElement PopupHeader;
	@FindBy (xpath="/html/body/div[3]/div/div[3]/form/input[4]") WebElement Batchid;
	@FindBy (xpath="/html/body/div[3]/div/div[3]/form/input[6]") WebElement Staffid;
	@FindBy (xpath="/html/body/div[3]/div/div[3]/form/input[7]") WebElement Classdescription;
	@FindBy (xpath="/html/body/div[3]/div/div[3]/form/input[8]") WebElement comments;
	@FindBy (xpath="/html/body/div[3]/div/div[3]/form/input[2]") WebElement Note;
	@FindBy (xpath="/html/body/div[3]/div/div[3]/form/input[9]") WebElement Recordings;
	@FindBy (xpath="//table[contains(@id,'ba')]//th[2]") WebElement Classtopic;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[4]/ul/a[1]") WebElement textbox;
	@FindBy (xpath="//select[@id='dropdown-id']") WebElement dropdown;
	@FindBy (xpath="//select[@id='dropdown-id']") WebElement staffiddropdown;
	@FindBy (xpath="/html/body/div[6]/ul[6]/a") WebElement calendericon;
	@FindBy (xpath="/html/body/div[2]/div[4]/div/div/a") WebElement savebutton;
	@FindBy (xpath="/html/body/div[2]/div[5]/div/div/a") WebElement cancelbutton;
	@FindBy (xpath="/html/body/div[2]/div[6]/div/div/a") WebElement closebutton;
	@FindBy (xpath="//table[contains(@id,'ba')]//th[4]") WebElement classdetails_popupwindow;
	@FindBy (xpath="//select[@id='dropdown-id']") WebElement batchiddropdown;
	@FindBy (xpath="//*[@id=\"navbarCollapse\"]/div[5]/ul/a[2]") WebElement code;
	@FindBy (xpath="/html/body/div[3]/div/div[3]/form/input[3]") WebElement Classid;
	@FindBy (xpath="/html/body/div[7]/ul[2]/a") WebElement passeddate;
	@FindBy (xpath="/html/body/div[7]/ul[3]/a") WebElement datepicker;
	@FindBy(xpath="//a[@title='Prev']") WebElement dprightarrow;
	@FindBy(xpath="//a[@title='Next']") WebElement dpleftarrow;
	@FindBy (xpath="/html/body/div[3]/div/div[3]/form/input[4]") WebElement Currentdate;
	@FindBy (xpath="/html/body/div[3]/div/div[3]/form/input[8]") WebElement Futuredate;
	public ClassPage(WebDriver driver)
		
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);	
		}
		
	public String dashboard_title() {
		
		return driver.getTitle();
		
			
	}
	public void Dashboard_page()
	{
		
		String actualtitle=driver.getTitle();
		String expectedtitle="lms" ;
		Assert.assertEquals(actualtitle, expectedtitle);
	}
	public void click_classbutton() {
		
		
		ClassButton.click();
		
	}
	public String Main_ClassTitle()
	{
		return driver.getTitle();
	}
	public void Response_time() {
		
		Long loadtime = (Long)((JavascriptExecutor)driver).executeScript(
			 "return performance.timing.loadEventEnd - performance.timing.navigationStart;");
		
	}
	public String Header_display() {
		
		return MainPageHeader.getText();
		
		
	}
	public void fields_spellcheck() {
	}
	public void Disable_Deleteicon_ManagePage() {
		Boolean deleteicon = TopDeleteicon.isEnabled();
		 if(deleteicon) {
	System.out.println("Yes ! Element is enabled");
	}
	else {
	System.out.println("NO ! Element is disabled");
	}
		
	}
	public void Searchbar(String Code) {
		Actions act=new Actions(driver);
		act.moveToElement(Searchbar).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
	act.sendKeys(Searchbar,Code).build().perform();
		Searchbar.sendKeys("Hello");
		Searchbar.sendKeys(Keys.RETURN);
	}
		
	public void AddNew_Button() {
		Boolean addnewicon = AddNewButton.isDisplayed();
		 if(addnewicon) {
	System.out.println("Yes ! Element is displayed");
	}
	else {
	System.out.println("NO ! Element is not displayed");
	}
		
	}
	List<WebElement> tableHeaders;	
	public List<WebElement> getTableHeaders() { 		
		return tableHeaders; 	
		}
	List<WebElement> tablerows;	
	public List<WebElement> getTableRows() { 		
		return tablerows; 	
		}		
		
	public void RowEdit_icon() {
		Boolean rowediticon = RowEditicon.isDisplayed();
		 if(rowediticon) {
	System.out.println("Yes ! Element is displayed");
	}
	else {
	System.out.println("NO ! Element is not displayed");
	}
	}
	//@tag10
	List<WebElement> tablerows1;	
	public List<WebElement> getTableRows1() { 		
		return tablerows1; 	
		}
	public void EditButton_NotPresent() {
		
		Boolean tablerows1= TableBody.isDisplayed();
		
		if (tablerows1 = null) {
		
	System.out.println("No data available in the table.");
		
	}
		
		
	}
	//@tag11
	List<WebElement> tablerows2;	
	public List<WebElement> getTableRows2() { 		
		return tablerows2; 	
		}		
		
	public void RowDelete_icon() {
		Boolean rowdeleteicon = RowDeleteicon.isDisplayed();
		 if(rowdeleteicon) {
	System.out.println("Yes ! Element is displayed");
	}
	else {
	System.out.println("NO ! Element is not displayed");
	}
	}
	List<WebElement> tablerows3;	
	public List<WebElement> getTableRows3() { 		
		return tablerows2; 	
		}		
		
	public void RowDelete_icon_NotPresent() {
		Boolean rowdeleteicon = RowDeleteicon.isDisplayed();
		
		
		if(rowdeleteicon=null) {
			
	System.out.println("No data available in the table.");
	}
	else {
	System.out.println("Element is displayed");
	}
	}
	public void sortByColumn(String colName, String order) {
		 Sorting.click();
			String sortOrder = Sorting.getAttribute("aria-sort");
			if (!order.equalsIgnoreCase(sortOrder)) {
				Sorting.click();
			}
		}
	public void checkbox() {
		
		Chkbox.isDisplayed();
		Chkbox.click();
		
	}
	public void Pagination_Controls() {
		
		pcontrols.isDisplayed();
		pcontrols.isEnabled();
		
		
	}
	public void TotalClass_Nos_text() {
		
		Classnumbertext.getText();
		
	}
	public void Manage_Page() {
		
		String actualtitle=driver.getTitle();
		String expectedtitle="ManagePage" ;
		Assert.assertEquals(actualtitle, expectedtitle);
	}
	public void searchbox_data(String Batchid) {
		
		Actions act=new Actions(driver);
		act.moveToElement(Searchbar).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
	act.sendKeys(Searchbar,Batchid).build().perform();
		Searchbar.sendKeys("U111");
		Searchbar.sendKeys(Keys.RETURN);
		
	}
	public void searchbox_entries() {
		
		Searchbar.getText();
	}
	public void searchbox_Invaliddata(String InvalidBatchid) {
		
		Actions act=new Actions(driver);
		act.moveToElement(Searchbar).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
	act.sendKeys(Searchbar,InvalidBatchid).build().perform();
		Searchbar.sendKeys("InvalidBatchid");
		Searchbar.sendKeys(Keys.RETURN);
		
	}
	public void searchbox_classno(String Classno) {
		
		Actions act=new Actions(driver);
		act.moveToElement(Searchbar).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
	act.sendKeys(Searchbar,Classno).build().perform();
		Searchbar.sendKeys("Classno");
		Searchbar.sendKeys(Keys.RETURN);
		
	}
	public void searchbox_Invalid(String InvalidClassno) {
		
		Actions act=new Actions(driver);
		act.moveToElement(Searchbar).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
	act.sendKeys(Searchbar,InvalidClassno).build().perform();
		Searchbar.sendKeys("InvalidBatchid");
		Searchbar.sendKeys(Keys.RETURN);
		
	}
	public void searchbox_classtopic(String Classtopic) {
		
		Actions act=new Actions(driver);
		act.moveToElement(Searchbar).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
	act.sendKeys(Searchbar,Classtopic).build().perform();
		Searchbar.sendKeys("Classtopic");
		Searchbar.sendKeys(Keys.RETURN);
		
	}
	public void searchbox_Invalidclasstopic(String InvalidClasstopic) {
		
		Actions act=new Actions(driver);
		act.moveToElement(Searchbar).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
	act.sendKeys(Searchbar,InvalidClasstopic).build().perform();
		Searchbar.sendKeys("InvalidClasstopic");
		Searchbar.sendKeys(Keys.RETURN);
		
	}
	public void searchbox_Staffid(String Staffid) {
		
		Actions act=new Actions(driver);
		act.moveToElement(Searchbar).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
	act.sendKeys(Searchbar,Staffid).build().perform();
		Searchbar.sendKeys("Staffid");
		Searchbar.sendKeys(Keys.RETURN);
		
	}
	public void searchbox_InvalidStaffId(String InvalidStaffId) {
		
		Actions act=new Actions(driver);
		act.moveToElement(Searchbar).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
	act.sendKeys(Searchbar,InvalidStaffId).build().perform();
		Searchbar.sendKeys("InvalidStaffid");
		Searchbar.sendKeys(Keys.RETURN);
		
	}
	public void searchbox_ClassDate1(String ClassDate1) {
		
		Actions act=new Actions(driver);
		act.moveToElement(Searchbar).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
	act.sendKeys(Searchbar,ClassDate1).build().perform();
		Searchbar.sendKeys("ClassDate1");
		Searchbar.sendKeys(Keys.RETURN);
		
		
	}
	public void searchbox_InvalidClassDate(String ClassDate) {
		
		Actions act=new Actions(driver);
		act.moveToElement(Searchbar).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
	act.sendKeys(Searchbar,ClassDate).build().perform();
		Searchbar.sendKeys("InvalidClassDate1");
		Searchbar.sendKeys(Keys.RETURN);
		
		
	}
	public void Classdeatils_Header() {
		
		PopupHeader.isDisplayed();
		PopupHeader.getText();
		
	}
	public void Input_Details() {
		Batchid.isDisplayed();
		ClassNo.isDisplayed();
		ClassDate.isDisplayed();
		ClassTopic.isDisplayed();
		Staffid.isDisplayed();
		Classdescription.isDisplayed();
	comments.isDisplayed();
		Notes.isDisplayed();
		Recordings.isDisplayed();
	}
	public void text_box() {
		
		textbox.isDisplayed();
		
		
	}
	public void drop_down() {
	BatchId.isDisplayed();
		assert dropdown.isDisplayed();
		dropdown.isEnabled();
		
		
	}
	public void Staffid_drop_down() {
	Staffid.isDisplayed();
		assert staffiddropdown.isDisplayed();
		staffiddropdown.isEnabled();
			
	}
	public void Clasdate_calendericon() {
		
		ClassDate.isDisplayed();
		calendericon.isDisplayed();
		calendericon.isEnabled();
		
		
	}
	public void Save_button() {
		
		savebutton.isDisplayed();
		
		savebutton.isEnabled();
		
	}
	public void Cancel_button() {
		
		cancelbutton.isDisplayed();
		
		cancelbutton.isEnabled();
		
	}
	public void Close_button() {
		
		closebutton.isDisplayed();
		
		closebutton.isEnabled();
		
	}
	public void classdetails_popupwindow() {
	classdetails_popupwindow.isDisplayed();
	classdetails_popupwindow.getText();
	}	
	public void batchid_dropdown() {
	Batchid.isDisplayed();
		assert batchiddropdown.isDisplayed();
		batchiddropdown.isEnabled();
			
	}
	public void AddNew_Classdetails(String code1)
	{
		
		Actions act=new Actions(driver);
		
		act.moveToElement(code).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
		act.sendKeys(code,code1).build().perform();
		savebutton.click();
		
	}
	public void AddNew_Classdetails() {
		
		Batchid.isDisplayed();
		
	}
	public void class_invalid_data(String code2)
	{
		
		Actions act=new Actions(driver);
		//CodeTxtEditor.click();
		act.moveToElement(code).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
		act.sendKeys(code,code2).build().perform();
		
	}
	public void Alerterror_message() {
		
		Alert alert1 = driver.switchTo().alert();
		String alertMessage1= alert1.getText();
		 System.out.println(alertMessage1);
		 alert1.accept();
	}
	public void AddNewClassdetails_ValidData(String code1)
	{
		
		Actions act=new Actions(driver);
		
		act.moveToElement(code).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
		act.sendKeys(code,code1).build().perform();
		savebutton.click();
		
	}
	public void AddNewClassdetails_INValidData(String code1)
	{
		
		Actions act=new Actions(driver);
		
		act.moveToElement(code).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
		act.sendKeys(code,code1).build().perform();
		savebutton.click();
		
	}
	public void Batchid_empty(String batchid,String classid,String staffid)
	{
		
	Batchid.sendKeys(null);
	Classid.sendKeys(classid);
	Staffid.sendKeys(staffid);
	System.out.println("Batchid:"+batchid+"Staffid:"+staffid+"classid:"+classid);
	}
	public void Batchid_missing() {
		
		Batchid.getText();
		System.out.println("Batch id is missing");
	}
	public void ClassNo_empty(String batchid,String classid,String staffid)
	{
		
	Batchid.sendKeys(batchid);
	ClassNo.sendKeys(null);
	Staffid.sendKeys(staffid);
	System.out.println("Batchid:"+batchid+"Staffid:"+staffid+"ClassNo:"+classid);
	}
	public void ClassNo_missing() {
		
		ClassDate.getText();
		System.out.println("ClassDate is missing");
	}
	public void ClassDate_empty(String batchid,String classid,String staffid)
	{
		
	Batchid.sendKeys(batchid);
	ClassDate.sendKeys(null);
	Staffid.sendKeys(staffid);
	System.out.println("Batchid:"+batchid+"Staffid:"+staffid+"ClassDate:"+classid);
	}
	public void ClassDate_missing() {
		
		ClassDate.getText();
		System.out.println("ClassDate is missing");
	}
	public void Classdate_empty(String batchid,String classNo,String classdate)
	{
		
	Batchid.sendKeys(batchid);
	ClassNo.sendKeys(classNo);
	ClassDate.sendKeys(null);
	System.out.println("Batchid:"+batchid+"ClassNo:"+classNo+"ClassDate:"+classdate);
	}
	public void classdate_missing() {
		
		Staffid.getText();
		System.out.println("Staffid is missing");
	}
	public void Passed_date(WebElement[] passdates) {
		
		String passdate = passeddate.getText();
		for (WebElement cell: passdates){
			
			 if (cell.getText().equals("0")){
			 System.out.println("Please enter valid date");
			 break;
			 }
		
			 }	
		
	}
	public void errormessage_passeddate(String value) {
		
		passeddate.getText();
		if (value.isEmpty()) {
			System.out.println("Class cannot be created for past date");
				
		}
	}
	public void datepicker() {
		
		datepicker.click();
		
	}	
	public void validDatePickup() {
		
		datepicker.isDisplayed();
		
		/*String value = datepicker.getText();
		
		for (WebElement cell: datapicker){
		 if (value.equals("1")){
		 System.out.println("Please select a date");
		 break;
		 }*/
		 }
	public void validdateformat(String dmy) {
		
		datepicker.isDisplayed();
		
		boolean isValidDate = datepicker.isSelected();
		
		if(isValidDate) {
			
		 System.out.println("date is valid format(DD-MM-YYY) :"+ dmy);
		}
		 else {
			
		 System.out.println("date is not valid format(DD-MM-YYY) :"+ dmy);
		
		
		 }
		}
	public void rightarrow_datepicker() {
		
		dprightarrow.click();
	}
	public void nextmonth() {
		
		
		dprightarrow.isDisplayed();
	}
	public void leftarrow_datepicker() {
		
		dprightarrow.click();
	}
	public void previousmonth() {
		
		
		dprightarrow.isDisplayed();
	}
	public void Currentdate() {
		
		
		Currentdate.click();
		Currentdate.isSelected();
	}
	public void CurrentDate_Highlighted() {
		
		Currentdate.isDisplayed();
		Boolean highlited=Currentdate.isSelected();
		 if(highlited.TRUE) {
		 System.out.println("Yes ! Element is highlited");
		 }
		 else {
		 System.out.println("NO ! Element is not highlited");
		 }
		
	}
	public void futuredate() {
		
		
		Futuredate.click();
		Futuredate.isSelected();
	}
	public void FutureDate_Highlighted() {
		
		Futuredate.isDisplayed();
		Boolean fhighlited=Futuredate.isSelected();
		 if(fhighlited.TRUE) {
		 System.out.println("Yes ! Element is highlited");
		 }
		 else {
		 System.out.println("NO ! Element is not highlited");
		 }
		
		
		 }
	public void validateclass_cancelbutton() {
		
		
		Boolean classdetails=Batchid.isDisplayed();
		if(classdetails=null) {
		 System.out.println("Yes ! Element is deleted");
		 }
		 else {
		 System.out.println("NO ! Element is not displayed");
		 }
	}
	
	
	public void deletebutton_rowlevel() {
		
		WebElement RowDeleteButton=driver.findElement(By.xpath("./btn"));
		RowDeleteButton.click();
	}
	
	public void alert_display() {
		
		
		String alert = driver.findElement(By.xpath("Alertmessage")).getText();
		System.out.println("Alert Message is:" + alert);
	}		
				
	public void alert_accept(String value) {
		
		Alert alert1 = driver.switchTo().alert();
		String option = value;
	if(option.equalsIgnoreCase("yes")) {
		
		alert1.accept();
	}
	else if (option.equalsIgnoreCase("no")) {
		
		alert1.dismiss();
	}
		
	}
	public void alert_dismiss(String value) {
		
		Alert alert1 = driver.switchTo().alert();
		String option = value;
	if(option.equalsIgnoreCase("yes")) {
		
		alert1.accept();
	}
	else if (option.equalsIgnoreCase("no")) {
		
		alert1.dismiss();
	}
		
	}
	public void successmessage_delete(String message) {
		
		Alert smessage = driver.switchTo().alert();
		String option = message;
	if(option.equalsIgnoreCase("yes")) {
		
		smessage.accept();
		System.out.println("Class details are deleted from table");
		
	}
	else if (option.equalsIgnoreCase("no")) {
		
		smessage.dismiss();
		System.out.println("Class details are not deleted from table");
		
	}
		
	}
	public void message_deleted(String message1) {
		
		Alert smessage = driver.switchTo().alert();
		String option = message1;
	if(option.equalsIgnoreCase("yes")) {
		
		smessage.accept();
		System.out.println("Class details are deleted from table");
		
	}
	else if (option.equalsIgnoreCase("no")) {
		
		smessage.dismiss();
		
		System.out.println("Class details are not deleted from table");
		
		
	}
	}
	//@Deletemultipleclassvalidation
	public void Singlerow_checkbox() {
		
		WebElement SingleRowCheckbox=driver.findElement(By.xpath("Checkbox"));
		SingleRowCheckbox.click();
	}
	public void Header_deleteicon() {
		
		TopDeleteicon.isEnabled();
		
	}
	public void Tickmark_Checkbox(boolean Checked) {
		
		WebElement SingleRowCheckbox=driver.findElement(By.xpath("Checkbox"));
		 Checked = SingleRowCheckbox.isSelected();
		
		if (Checked) {
	System.out.println("Checkbox is now checked.");
	} else {
	System.out.println("Checkbox is still not checked.");
	}
		
	}
	public void Multiplerow_checkbox() {
		
		WebElement MultipleRowCheckbox1=driver.findElement(By.xpath("Checkbox"));
		WebElement MultipleRowCheckbox2=driver.findElement(By.xpath("Checkbox"));
		WebElement MultipleRowCheckbox3=driver.findElement(By.xpath("Checkbox"));
		MultipleRowCheckbox1.click();
		MultipleRowCheckbox2.click();
		MultipleRowCheckbox3.click();
		
	}
	public void Multiplerow_checkboxselected() {
		
		 int[] selectedRows = {1, 3, 5};
		 for (int rowNumber : selectedRows) {
			
			 WebElement checkbox = driver.findElement(By.id("checkbox" + rowNumber));
			 boolean isChecked = checkbox.isSelected();
			 System.out.println("Checkbox in Row " + rowNumber + " is checked: " + isChecked);
		 }
		
	}
	}			

	
	
	
	
	
	
	
	
	
				




