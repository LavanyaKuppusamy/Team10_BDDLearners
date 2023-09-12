package page_Objects;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;

public class ProgramPage {
	
WebDriver driver;
Actions action;
	
public ProgramPage(WebDriver wdriver) {
	driver=wdriver;
	action =new Actions(driver);
	PageFactory.initElements(driver,this);

}
	
// Elements for Create a new program

	@FindBy(xpath = "//*[text()='A New Program']")
	@CacheLookup
	WebElement btnNewProgram;
	
	@FindBy(xpath = "//input[@id='programName']")
	@CacheLookup
	WebElement txtProgName;
	
	@FindBy(xpath = "//input[@id='programDescription']")
	@CacheLookup
	WebElement txtProgDescription;
	
	@FindBy(xpath = "//p-radiobutton[@ng-reflect-input-id='Active']")
	@CacheLookup
	WebElement statusActive;
	
	@FindBy(xpath="//p-radiobutton[@ng-reflect-input-id='Inactive']") 
	WebElement statusInActive;
	
	
	@FindBy(xpath = "//*[text()='Cancel']")
	@CacheLookup
	WebElement btnCancel;
	
	@FindBy(xpath = "//*[text()='Save']")
	@CacheLookup
	WebElement btnSave;
	
	public void setProgramName(String ProgName)
	{
		txtProgName.sendKeys(ProgName);
	}
	
	public void setProgramDesc(String ProgDesc)
	{
		txtProgDescription.sendKeys(ProgDesc);
	}
	
	public void clickCancel()
	{
		btnCancel.click();
	}
	
	public void clickSave()
	{
		btnSave.click();
	}
	
	public void clickAddProgram()
	{
	btnNewProgram.click();
		}

	public void EnterProgramDetails(String name,String desc,String active) {
		txtProgName.clear();
		txtProgName.sendKeys(name);
		txtProgDescription.clear();
		txtProgDescription.sendKeys(desc);
		if(active.equals("Active")) {
			action.moveToElement(statusActive).click().build().perform();;}
		else {
			action.moveToElement(statusInActive).click().build().perform();;}
	}
	
	public void ClickConfirmation(String status)   {
		if (status.equalsIgnoreCase("Save")) {
			action.moveToElement(btnSave).click().build().perform();
		}
		if (status.equalsIgnoreCase("Cancel")){
			action.moveToElement(btnCancel).click().build().perform();
		}
	}
	
	//Edit a Program
	
	@FindBys({
		@FindBy(xpath = "//button[@icon='pi pi-pencil']") 
	})List<WebElement> iconEdit;
	
	public void ClickEditButton(int index) {
		action.moveToElement(iconEdit.get(index)).click().build().perform();
	}
	
	
	public int getRandomIndex(int limit) {
		Random random =new Random();
		return random.nextInt(limit-1);
	}
	
	//Delete Program
	
	@FindBys({
		@FindBy(xpath = "//tbody//td[1]") 
	})List<WebElement> checkboxSingleSelect; 
		
	@FindBys({
		@FindBy(xpath = "//button[@icon='pi pi-trash']") 
	})List<WebElement> iconDelete;
	
	@FindBy(xpath="//thead/tr[1]/th[1]") WebElement checkBoxMultipleSelect;
	
	@FindBy(xpath="//mat-card-title//button[@icon='pi pi-trash']") WebElement iconMultipleDelete;
	
	@FindBy(xpath="//p-confirmdialog//div[1]/div[1]/span") WebElement DeleteDialogTitle;
	@FindBy(xpath="//p-confirmdialog//div[3]/button[2]") WebElement DeleteDialogYes;

	@FindBy(xpath="//p-confirmdialog//div[3]/button[1]") WebElement DeleteDialogNo;
	
	@FindBy(xpath="//p-confirmdialog//div[1]/div[2]/span") WebElement DeleteDialogCancel;


	public String GetDeleteDialogBoxTitle() {

		return DeleteDialogTitle.getText();
	}
	
	public void ClickDeleteConfirmation(String Confirmation) {

		if (Confirmation.equalsIgnoreCase("Yes")) {
			action.moveToElement(DeleteDialogYes).click().build().perform();;
		}
		else if  (Confirmation.equalsIgnoreCase("No")) {
			action.moveToElement(DeleteDialogNo).click().build().perform();;
		}
		else{
				action.moveToElement(DeleteDialogCancel).click().build().perform();;
				
			}
				

		}
	
	public void ClickSingleDeleteIcon(int index) {
		action.moveToElement(iconDelete.get(index)).click().build().perform();
	}
	
	public void ClickMultiDeleteIcon() {
		action.moveToElement(iconMultipleDelete).click().build().perform();
	}
	
	public int ClickSingleSelectCheckbox(int index) {
		action.moveToElement(checkboxSingleSelect.get(index)).click().build().perform();
		return index;
	}
	
	public void ClickMutiSelectCheckBox() {
		action.moveToElement(checkBoxMultipleSelect).click().build().perform();
	}
	
	
	//Success Message Popup
	
		public String GetSuccessMessage() {
			WebElement MsgElement = driver.findElement(By.xpath("//p-toast//p-toastitem"));
			String Msg = MsgElement.getText();
			return Msg;
		}
		
// Common Elements 
		
		//Page Common Header Element
		@FindBy(xpath="//mat-card-title/div") WebElement lblPageHeaderTitle;
		
		
		//Table Body Element
		@FindBys({
			@FindBy(xpath = "//table//tbody//tr") 
		})List<WebElement> PageGridDetail;
		
		
		@FindBy(xpath="//div[@role='dialog']") WebElement ProgramDialog;
		@FindBy(xpath="//p-dialog//div[@role='dialog']/div/span") WebElement lblDialogTitle;
		
		public boolean IsProgramDialogVisible() {
			return ProgramDialog.isDisplayed();
		}

		public String getDetailFormTitle() {
			return lblDialogTitle.getText();
		}
		
		
		public String GetPageHeaderTitle() {
			return lblPageHeaderTitle.getText();
		}
		
		public int GetRecordCount() {
			return PageGridDetail.size();
		}
		
		//Search Program
		@FindBy(xpath = "//mat-card-title/div[2]/div[2]//input") WebElement txtSearch;
		
		public void EnterSearchContent(String content) {
			txtSearch.clear();
			txtSearch.sendKeys(content);
		}
		
		
	
	
}

