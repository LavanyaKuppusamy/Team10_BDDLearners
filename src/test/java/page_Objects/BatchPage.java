package page_Objects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constant.Constant;
import utilities.Loggerload;



public class BatchPage {
private static final String Active = null;

WebDriver driver;

@FindBy(xpath = "//div[@input='Dashboard']")WebElement DashboardPage;
@FindBy(xpath = "//a[@href='Batch']")WebElement BatchLink; 
@FindBy(xpath = "//a[@input='Manage Batch Page']")WebElement ManageBatchPage; 
@FindBy(xpath = "//div[@class='Pagination']")WebElement PaginationIcon; 
@FindBy(xpath = "//table[@id='Classroom']//tbody/tr/th") List<WebElement> tableHeaders;
//@FindBy(xpath = "//div[@class='Batch']/div[1]")WebElement BatchNameHeader; 
//@FindBy(xpath = "//div[@class='Batch']/div[2]")WebElement BatchDescriptionHeader; 
//@FindBy(xpath = "//div[@class='Batch']/div[4]")WebElement NoOfClassesHeader;
//@FindBy(xpath = "//div[@class='Batch']/div[3]")WebElement BatchStatusHeader;
////@FindBy(xpath = "//div[@class='Batch']/div[5]")WebElement ProgramNameHeader; 
//@FindBy(xpath = "//div[@class='Batch']/div[6]")WebElement EditDeleteHeader; 
@FindBy(xpath = "//button[text()='Delete']")WebElement DeleteButton; 
@FindBy(xpath = "//button[text()='New Batch']")WebElement NewBatchButton; 
@FindBy(xpath = "//label[for='Check Box']")WebElement CheckBox; 
@FindBy(xpath = "//div[@type='Edit Icon']")WebElement editIcon; 
@FindBy(xpath = "//div[@type='Delete Icon ']")WebElement DeleteIcon; 
@FindBy(xpath = "//div[@value='popup']")WebElement popuptextbox; 
@FindBy(xpath = "//table[@id='batch_details']//tbody/tr/th") WebElement BatchDetails;
@FindBy(xpath = "//input[@id='Name']")WebElement BatchName;
@FindBy(xpath = "//input[@id='Description']")WebElement BatchDescription;
@FindBy(xpath = "//input[@id='Program Name']")WebElement ProgramName;
@FindBy(xpath = "//p[@id='Active']")WebElement ActiveStatus;
@FindBy(xpath = "//p[@id='InActive']")WebElement InActiveStatus;
@FindBy(xpath = "//input[@id='No Of Classes']")WebElement NoOfClasses;
@FindBy(xpath = "//*[@text()='Save']")WebElement SaveButton;
@FindBy(xpath = "//*[@text()='Cancel']")WebElement CancelButton;
@FindBy(xpath = "//*[@text()='success']")WebElement SuccessMsg;
@FindBy(xpath="//div[@class='alert alert-primary']")WebElement ErrMsg;
@FindBy(xpath="//input[@id='Alert alert']")WebElement AlertMsg;
@FindBy(xpath="//input[@id='Alert alert_Yes']")WebElement YesBtn;
@FindBy(xpath="//input[@id='Alert alert_No']")WebElement NoBtn;
@FindBy(xpath="//div[@id='left']/table/tbody/tr/td")WebElement BatchTable;
@FindBy(xpath = "//tbody/tr/td[1]")List<WebElement> checkboxes; 
@FindBy(xpath = "//tbody/tr/td[1]")List<WebElement> deleteIcons; 


public BatchPage() {
		PageFactory.initElements(driver, this);
	}
     
     public void dashboard_batchlink() {
    		BatchLink.click();
    		Loggerload.info("User clicks on batch link");
    	}
     
     public void navigate(String urlName) {
    		driver.get(Constant.BatchPageURL);
    		driver.get(urlName); 
    	}
     
     public String getManageBatchpageTitle() {
    		String title = driver.getTitle();
    		return title;
    	}
     
     public List<WebElement> getTableHeaders() { 
    	 return tableHeaders;
    	 }
     
     public boolean checkDeleteButton() {
   	  return DeleteButton.isEnabled();
   	  }
     public void clickDeleteBtn() {
    	 DeleteButton.click();
     }
     public void checkNewBatchButton() {
    	 NewBatchButton.isDisplayed();
    	 Loggerload.info("User can view +A New Batch Button");
    	 NewBatchButton.click();
         Loggerload.info("User clicks on +A New Batch Button");
    	}
      public boolean Checkpopuptext() {
    	return popuptextbox.isDisplayed();
    	}
         
      public boolean CheckEditIcon() {
    	  return editIcon.isEnabled();
        	 }
      public void ClickEditIcon() {
    	  editIcon.click();
      }
      public void deleteIcon() {
    	  DeleteIcon.isEnabled();
        	Loggerload.info("User can see the enabled Delete Icon");
         }
      
       public void BatchDetails() {
     
    	  if(BatchName.isDisplayed()){
    		  Loggerload.info("User can see the BatchName textbox");
    	  }
    	  else {
    		  Loggerload.info("User cannot see the BatchName textbox");
    	  }
    	  if(BatchDescription.isDisplayed()) {
    		  Loggerload.info("User can see the BatchDescription textbox");
    	  }
    	  else{
    		  Loggerload.info("User cannot see the BatchDescription textbox");
    	  };
         if(ProgramName.isDisplayed()) {
    			Loggerload.info("User can see the ProgramName dropdown");
    	  }
    		else {
    			Loggerload.info("User cannot see the ProgramName dropdown");
    		};
         if(ActiveStatus.isDisplayed()) {
             Loggerload.info("User can see the Active radio button");
         }   
         else {
              Loggerload.info("User cannot see the Active radio button");
                 };
    	  if(InActiveStatus.isDisplayed()){
    		  Loggerload.info("User can see the InActive radiobutton");
    		    }
    	  else {
    		  Loggerload.info("User cannot see the Active Radio button");
    	  };
    	 if( NoOfClasses.isDisplayed()) {
    		Loggerload.info ("User can see the  NoOfClasses textbox");
   		  }
   	  else {
   		  Loggerload.info("User cannot see theNoOfClasses textbox ");
   	  };
    	 
    	 }
      public void Description() {
    	  BatchDescription.isDisplayed();
    	  Loggerload.info("User finds description field is optional");
      }
      public void setBatchName(String batchName) {
    	  Loggerload.info("Enter batch Name");
    	  BatchName.click();
    	  BatchName.clear();
    	  BatchName.sendKeys(batchName);
      }
      public void setBatchDescr(String batchDescr) {
    	  Loggerload.info("Enter batch Description");
    	  BatchDescription.click();
    	  BatchDescription.clear();
    	  BatchDescription.sendKeys(batchDescr);
      }
      public void setProgName(String progName) {
    	  Select se= new Select(ProgramName);
    	  se.selectByVisibleText(progName);
    	  ProgramName.getText();
      }
      public void SetStatus(String Status) {
    	  boolean Status1;
		if(Status1=Active != null) {
    	  ActiveStatus.click();}
		else
		{
			InActiveStatus.click();
		}
      }
		public void SetNoOfClasses(String classnos) {
			NoOfClasses.click();
			NoOfClasses.clear();
			NoOfClasses.sendKeys(classnos);
			
		}
		public void  ClickConfirmation(String confirmation) {
		if(confirmation.equalsIgnoreCase("Save")) {
		
			SaveButton.click();
			}
		else if(confirmation.equalsIgnoreCase("Cancel")) {
			CancelButton.click();
		}
		}
		public void getSuccessmsg(String message) {
			String msg=SuccessMsg.getText();
			Loggerload.info(msg);
			
			
		}
		public String verifyErrorMsg() {
			Loggerload.info("verify the error message");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String mes=ErrMsg.getText();
			Loggerload.warn(mes);
			return mes;
		}
	 
		public void clickdeleteIcon() {
		    	  DeleteIcon.click();
		}
		public void a1ertMsg() {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			Loggerload.info("Alert message is:"+alertText);
		}
		public void ClickYes() {
			Alert ConAlert = driver.switchTo().alert();
			ConAlert.accept();
		}
		public void ClickNo() {
			Alert ConAlert = driver.switchTo().alert();
			ConAlert.dismiss();
			
		}
		public void AllBatch() {
		BatchTable.getText();
	}
		 public boolean checkboxButton() {
		      	return CheckBox.isDisplayed();
		      	 	}
		 public void clickCheckboxBtn() {
		      	Boolean isSelected=CheckBox.isSelected();
		      	if(isSelected==false) {
		      		CheckBox.click();}
		      	}
		     
		 public List<WebElement> hasCheckBox(){
	      		return checkboxes;
	      	}
		 public void selectSingleCheckbox() {
			 for(int i=0;i< checkboxes.size();i++) {
				 checkboxes.get(i).click();
				 break;
			 }
		 }
		 
		 public void selectMultipleCheckbox() {
			 for(int i=0;i< checkboxes.size();i++) {
				 while(i<2) {
				 checkboxes.get(i).click();
				 
			 }
		 }
		 }
			 public List<WebElement> DeleteIcon(){
		      		return deleteIcons;
		      	}
			 public void selectSingleDeleteIcon() {
				for(int j=0;j<deleteIcons.size();j++) {
					deleteIcons.get(j).click();
					break;
				}
			}

			 }
		
		


      
