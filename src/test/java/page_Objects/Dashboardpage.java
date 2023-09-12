package page_Objects;

import java.util.List;
import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Dashboardpage {

	 public WebDriver driver;
	  
	  By LMStitle=By.xpath("//table//th[3]");
	  By Student=By.xpath("//div[@class='nav-item dropdown']");
	 By Batch=By.xpath("//div[@class='dropdown-menu show']/a[2]");
	 By Assignment=By.xpath("div[@class='dropdown-menu show']/a[3]");
	 By Attendence=By.xpath("div[@class='dropdown-menu show']/a[4]]");
	 By Program=By.xpath("div[@class='dropdown-menu show']/a[5]");
	 By User=By.linkText("div[@class='dropdown-menu show']/a[6]");
	 By username=By.xpath("//div[@class='nav-item']");
	 By password=By.xpath("//div[@class='nav-item']");
	 By Class=By.linkText("div[@class='dropdown-menu show']/a[7]");
	 By logoutbtn=By.xpath("//button[@class='btn']");
	 By ManageProgramHeader=By.xpath("//div[@class='nav-i']");
	 By Loginbutton=By.xpath("//button[@class='btn']");
	 By Logoutbtn=By.xpath("//button[@class='btn']");
	 By Navigationbar=By.xpath("//table//th[4]");
		
	public Dashboardpage(WebDriver driver) {
		
		this.driver=driver;
		
	}

public void VerifyDashboardPage() {
		
		String expectedtitle="Manage Program";
		String actualtitle=driver.findElement(ManageProgramHeader).getText();
		if(actualtitle.equalsIgnoreCase(expectedtitle)) {
			System.out.println("Title is matched");
			Assert.assertEquals(actualtitle, expectedtitle);
		}else {
				System.out.println("Title is not matched");
		}
		}

public void Loginwithcredientials(String Username, String Password) {
	
	driver.findElement(username).sendKeys(Username);
	driver.findElement(password).sendKeys(Password);
	driver.findElement(Loginbutton).click();
	
}

public void verifyNavigationtime(int i) {
	
    long startTime = System.currentTimeMillis(); 
    driver.get("https://dasboardpage-url.com");
    long endTime = System.currentTimeMillis();
    long navigationTime = endTime - startTime; 
    if(navigationTime <= i) {
    	 System.out.println("Navigation time is less or equal to +i " + navigationTime + " ms");
    }else
    {
   	 System.out.println("Navigation time is greater than +i " + navigationTime + " ms");
   }
     
}

public void verifyLMStitle() {
	
	String expectedtitle="LMS-Learning Management system";
	String actualtitle=driver.findElement(LMStitle).getText();
	if(actualtitle.equalsIgnoreCase(expectedtitle)) {
		System.out.println("Title is matched");
		Assert.assertEquals(actualtitle, expectedtitle);
	}else {
			System.out.println("Title is not matched");
	}
	
	
	
}

public void verifyLMSAlign() {
	
	WebElement LMS = driver.findElement(By.xpath("//table//tr[2]/td[3]")); 
	String textAlignment = LMS.getCssValue("text-align");

	if (textAlignment.equals("Top-left")) {
	    System.out.println("Text is Top-left.");
	} else if (textAlignment.equals("left")) {
	    System.out.println("Text is left-aligned.");
	} else if (textAlignment.equals("right")) {
	    System.out.println("Text is right-aligned.");
	} else if (textAlignment.equals("justify")) {
	    System.out.println("Text is justified.");
	} else {
	    System.out.println("Unknown text alignment: " + textAlignment);
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
	

public void verifyLMSAlignNavigationbar() {
	
	WebElement Navigationbar = driver.findElement(By.xpath("//table//tr[2]/td[3]")); 
	String textAlignment = Navigationbar.getCssValue("text-align");

	if (textAlignment.equals("Top-Right Corner")) {
	    System.out.println("Text is Top-Right Corner.");
	} else if (textAlignment.equals("left")) {
	    System.out.println("Text is left-aligned.");
	} else if (textAlignment.equals("right")) {
	    System.out.println("Text is right-aligned.");
	} else if (textAlignment.equals("justify")) {
	    System.out.println("Text is justified.");
	} else {
	    System.out.println("Unknown text alignment: " + textAlignment);
	}

}

public void ClickonLogout() {
		
	driver.findElement(Logoutbtn).click();
}

public void verifytheposition() {
	
	String expectedText1 = "Student";
	String expectedText2 = "Program";
	String expectedText3 = "Batch";
	String expectedText4 = "Class";
	String expectedText5 = "User";
	String expectedText6 = "Assignment";
	String expectedText7 = "Attendence";
	String expectedText8 = "Logout";
	

	List<WebElement> elements=driver.findElements(Navigationbar);
	if (elements.size() >= 8) {
	    String text1 = elements.get(0).getText();
	    String text2 = elements.get(1).getText();
	    String text3 = elements.get(2).getText();
	    String text4 = elements.get(3).getText();
	    String text5 = elements.get(4).getText();
	    String text6 = elements.get(5).getText();
	    String text7 = elements.get(6).getText();
	    String text8 = elements.get(7).getText();

	    if (text1.equals(expectedText1) && text2.equals(expectedText2)&&text3.equals(expectedText3)&&text4.equals(expectedText4)&&
	    		text5.equals(expectedText5)&&text6.equals(expectedText6)&&text7.equals(expectedText7)&&text8.equals(expectedText8)) {
	        	System.out.println("Student is in the 1st position, Program is in the 2nd position, and Batch is in the 3rd position, Class is in the 4th position");
	        	System.out.println("User is in the 5th position, Assignment is in the 6th position, and Attendence is in the 7th position, Logout is in the 8th position");
	    } else {
	        System.out.println("The order is not as expected.");
	    }
	} else {
	    System.out.println("There are not enough elements in the list to verify the order.");
	}

	
	
}
}
