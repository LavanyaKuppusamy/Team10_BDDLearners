package page_Objects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;

public class AssignmentMAPV {
	
	
	public WebDriver driver;
	  
	 
	 By Assignment=By.xpath("div[@class='dropdown-menu show']/a[3]");
	 By ManageAssignmentHeader=By.xpath("div[@class='dropdown-menu show']/a[4]]");
	 By deleteIcon=By.xpath("div[@class='dropdown-menu show']/a[5]");
	 By Searchbar=By.linkText("div[@class='dropdown-menu show']/a[6]");
	 By AddNewbutton=By.xpath("//div[@class='nav-item']");
	 By EditIcon=By.xpath("//div[@class='nav-item']");
	 By sortbutton=By.linkText("div[@class='dropdown-menu show']/a[7]");
	 By logoutbtn=By.xpath("//button[@class='btn']");
	 By ManageProgramHeader=By.xpath("//div[@class='nav-i']");
	 By Loginbutton=By.xpath("//button[@class='btn']");
	 By Logoutbtn=By.xpath("//button[@class='btn']");
	 By Navigationbar=By.xpath("//table//th[4]");
	 By Footer=By.xpath("div[@class='dropdown-menu show']/a[3]");
	 By Pagination=By.xpath("div[@class='dropdown-menu show']");
	 By totalno=By.xpath("div[@class='dropdown-menu show']");
	 By Searchbox=By.xpath("div[@class='dropdown-menu show']");
	 By searchbtn=By.xpath("//button[@class='btn']");
	 By Delete=By.xpath("//button[@class='btn']");
	 By rowdata=By.xpath("div[@class='dropdown-menu show']");
	 
	public AssignmentMAPV(WebDriver driver) {
		
		this.driver=driver;
		
	}

public void verifyAssignmentPage() {
		
		String expectedtitle="Manage Program";
		String actualtitle=driver.findElement(ManageProgramHeader).getText();
		if(actualtitle.equalsIgnoreCase(expectedtitle)) {
			System.out.println("Title is matched");
			Assert.assertEquals(actualtitle, expectedtitle);
		}else {
				System.out.println("Title is not matched");
		}
		}

public void clicksonAssignment() {
	
	driver.findElement(Assignment).click();
}

public void verifyNavigationtime(int i) {
	
	driver.get("https://dasboardpage-url.com");
    long startTime = System.currentTimeMillis(); 
    driver.get("https://assignment-url.com");
    long endTime = System.currentTimeMillis();
    long navigationTime = endTime - startTime; 
    if(navigationTime <= i) {
    	 System.out.println("Navigation time is less or equal to +i " + navigationTime + " ms");
    }else
    {
   	 System.out.println("Navigation time is greater than +i " + navigationTime + " ms");
   }

	

}

public void verifyheader() {
	
	String expectedtitle="Manage Assignment";
	String actualtitle=driver.findElement(ManageAssignmentHeader).getText();
	if(actualtitle.equalsIgnoreCase(expectedtitle)) {
		System.out.println("Title is matched");
		Assert.assertEquals(actualtitle, expectedtitle);
	}else {
			System.out.println("Title is not matched");
	}
	}

	
	
public void Spellcheck() {
	
	WebElement table = driver.findElement(By.xpath("//table")); 
	List<WebElement> headerCells = table.findElements(By.xpath(".//th")); 

	List<String> headerTexts = new ArrayList<>();

	for (WebElement headerCell : headerCells) {
	    headerTexts.add(headerCell.getText());
	}
	for (String headerText : headerTexts) {
	    if (!spellCheckText(headerText)) {
	        System.out.println("Spelling error in header: " + headerText);
	    }
	}
}
	private boolean spellCheckText(String headerText) {
		
		return false;
	}

	public void verifyDeleteIcon() {
		
		if(!driver.findElement(deleteIcon).isEnabled()) {
			System.out.println("DeleteIcon is disabled");
			}else {
				System.out.println("DeleteIcon is Enabled");
			}
			}

	public void verifySearchbar() {
		
		if(driver.findElement(Searchbar).isDisplayed()) {
			System.out.println("Search bar is displayed");
			
		}else
		{
			System.out.println("Search bar is not displayed");
		}
		
	}

	public void verifyAddNewbutton() {
		
		if(driver.findElement(AddNewbutton).isDisplayed()) {
			System.out.println("Add New Assignment button is displayed");
		
	}else
	{
		System.out.println("Add New Assignment button is not displayed");
	}
		
	}

	public void verifyColumnheaders() {
		
		 WebElement table = driver.findElement(By.id("tableId"));
		List<WebElement> headerCells = table.findElements(By.xpath(".//th"));
		String[] expectedHeaders = {"AssignmentName", "AssignmentDescription","Assignment Due Date","Assignment Grade","Edit/Delete"};
		for (int i = 0; i < expectedHeaders.length; i++) {
		    String actualHeaderText = headerCells.get(i).getText();
		    String expectedHeaderText = expectedHeaders[i];

		    if (actualHeaderText.equals(expectedHeaderText)) {
		        System.out.println("Header " + (i + 1) + " is correct: " + actualHeaderText);
		    } else {
		        System.out.println("Header " + (i + 1) + " is incorrect. Expected: " + expectedHeaderText + ", Actual: " + actualHeaderText);
		    }
		}

		
		
	}

	public void verifyEditIcon() {
		
		 WebElement dataTable = driver.findElement(By.id("dataTable"));
		 List<WebElement> rows = dataTable.findElements(By.xpath(".//tr"));
		 if (rows.size() > 0) {
			    if(driver.findElement(EditIcon).isDisplayed())
			    {
			    	System.out.println("Edit Icon is displayed");
			    }
				   
			} else {
			    System.out.println("No entries available in the data table.");
			    
			}
		 
		 
	}

	public void VerifyDeleteIcon2() {
		WebElement dataTable = driver.findElement(By.id("dataTable"));
		 List<WebElement> rows = dataTable.findElements(By.xpath(".//tr"));
		 if (rows.size() > 0) {
			    if(driver.findElement(deleteIcon).isDisplayed())
			    {
			    	System.out.println("Delete Icon is displayed");
			    }
				   
			} else {
			    System.out.println("No entries available in the data table.");
			    
			}
		}

	public void Sortbutton() {
		
		 WebElement dataTable = driver.findElement(By.id("dataTable"));
		 List<WebElement> headerCells = dataTable.findElements(By.xpath(".//th"));
		 for (WebElement headerCell : headerCells) {
		     String columnHeader = headerCell.getText();

		     // Skip "Edit" and "Delete" columns
		     if (!columnHeader.equals("Edit") && !columnHeader.equals("Delete")) {
		         // Check for the presence of a sort icon within this column header
		         List<WebElement> sortIcons = headerCell.findElements(By.cssSelector(".sort-icon")); 
		         if (sortIcons.size() > 0) {
		             System.out.println("Sort icon found for column: " + columnHeader);
		         } else {
		             System.out.println("Sort icon not found for column: " + columnHeader);
		         }
		     }
		 }
	
		}

	public void SeeCheckboxAll() {
		
		 WebElement dataTable = driver.findElement(By.id("dataTable"));
		 List<WebElement> rows = dataTable.findElements(By.xpath(".//tr"));
		 for (WebElement row : rows) {
		     List<WebElement> checkboxes = row.findElements(By.xpath(".//input[@type='checkbox']")); 

		     if (checkboxes.size() > 0) {
		         System.out.println("Checkbox found in this row.");
		     } else {
		         System.out.println("Checkbox not found in this row.");
		     }
		 }
		
	}

	public void verifyfooter() {
		
		String Footertext=driver.findElement(Footer).getText();
		System.out.println(""+Footertext);
		
	}

	
public void verifyPagination() {
	
	String total=driver.findElement(totalno).getText();
	System.out.println(total);
	
	if(driver.findElement(Pagination).isDisplayed())
		{
	System.out.println("Pagination is displayed");
}else {
	
	System.out.println("Pagination is Not displayed");
}}

public void EnterTextSearchbox(String Searchtext) {
		
	driver.findElement(Searchbox).sendKeys(Searchtext);
	driver.findElement(searchbtn).click();
	
}

public void validatetable(String Searchtext,DataTable message) {
	
	driver.findElement(Searchbox).sendKeys(Searchtext);
	driver.findElement(searchbtn).click();
	WebElement dataTable=driver.findElement(By.xpath(".//td"));
	List<WebElement> rows = dataTable.findElements(By.xpath(".//tr"));
	if(rows.size()>0) {
		System.out.println(message);
	}
	
	
}

public void ClicksonsingleRow() {
	
	 WebElement Checkbox = driver.findElement(By.id("Checkbox_id"));
	 Checkbox.click();
	 
	
		
}

public void ValidateDelete() {
	
	driver.findElement(Delete).click();
}

public void HandleAlert(String alertmsg,DataTable message) {
	
	Alert alert=driver.switchTo().alert();
	try {
	if(alertmsg=="Accept") {
		
		driver.switchTo().alert().accept();
		alert.accept();
		String alertm=driver.switchTo().alert().getText();
		System.out.println(message);
		System.out.println(alertm);
		
		}else if(alertmsg=="Reject")
	{
			driver.switchTo().alert().dismiss();
			alert.dismiss();
			String alertm=driver.switchTo().alert().getText();
			System.out.println(message);
			System.out.println(alertm);
		
	}}catch(NoSuchElementException ex) {
		
		
	}}



public void ClickonMultipleRow() {
	
	WebElement Checkbox = driver.findElement(By.id("Checkbox_id"));
	List<WebElement> rows = Checkbox.findElements(By.xpath(".//tr"));
	 for (WebElement row : rows) {
	     List<WebElement> checkboxes = row.findElements(By.xpath(".//input[@type='checkbox']")); 

	     if (checkboxes.size() > 0) {
	    	 Checkbox.click();
	    	 
	     } else {
	         System.out.println("Checkbox not found in this row.");
	     }
	 }
	 
	
}

public void PopupAlert() {
	
	Alert alert=driver.switchTo().alert();
	String alertM=alert.getText();
	System.out.println(alertM);
	
}

public void AcceptAlert(String accept) {
	
	WebElement row=driver.findElement(By.xpath("\\tr"));
	String data=driver.findElement(rowdata).getText();
	row.click();
	Alert alert=driver.switchTo().alert();
	driver.switchTo().alert().accept();
	alert.accept();
		if(!driver.findElement(rowdata).isDisplayed())
		{
			System.out.println("The data is deleted");
		}else
		{
			System.out.println("The data is Not deleted");
			System.out.println(data);

		}

}

public void RejectAlert(String reject) {

	WebElement row=driver.findElement(By.xpath("\\tr"));
	String data=driver.findElement(rowdata).getText();
	row.click();
	Alert alert=driver.switchTo().alert();
	driver.switchTo().alert().dismiss();
	alert.dismiss();
		if(!driver.findElement(rowdata).isDisplayed())
		{
			System.out.println("The data is deleted");
		}else
		{
			System.out.println("The data is Not deleted");
			System.out.println(data);

		}
	
}




	
}




	