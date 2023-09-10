package page_Objects;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constant.Constant;
import io.cucumber.datatable.DataTable;
import utilities.ExcelReader;

public class HomePage {
	
	  public WebDriver driver;
	  
	  By User=By.xpath("//button[@class='btn']");
	  By password=By.xpath("//div[@class='nav-item dropdown']");
	 By loginbtn=By.xpath("//div[@class='dropdown-menu show']/a[2]");
	 By logo =By.xpath("//a[@href='linked-list']");
	 By loginpagetext=By.xpath("//a[@href='linked-list']");
	 By asterik1=By.xpath("//a[@href='linked-list']");
	 By Forgotuserpswdlink=By.linkText("Forgotuserpswdlink");
	 By Resetpswdlink=By.linkText("Forgotuserpswdlink");
	 By UsernameBox=By.xpath("//div[@class='nav-item dropdown']");
	 By PasswordBox=By.xpath("//div[@class='nav-item dropdown']");
	 By message=By.xpath("//div[@class='nav-item dropdown']");
	 By Email=By.xpath("//div[@class='nav-item dropdown']");
	 By sendlink=By.xpath("//div[@class='nav-item dropdown']");
	 By typeinnewpswd= By.xpath("//div[@class='nav-item dropdown']");
	 By retypepswd=By.xpath("//div[@class='nav-item dropdown']");
	 By submit=By.xpath("//div[@class='nav-item dropdown']");
	 By resetpassworklink=By.xpath("//div[@class='nav-item dropdown']");

	
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		
	}

public void Verifyhomepage() {
		
		String actualtitle=driver.getTitle();
		String exptitle=""	;
		if(actualtitle.equalsIgnoreCase(exptitle)) {
			System.out.println("Title is matched");
		}else {
				System.out.println("Title is not matched");
		}
		}
	
	public void verifytext() {
		
		String expectedtext="";
		String actualtext = driver.findElement(User).getText();
		
		Assert.assertEquals(expectedtext,actualtext);
	
			}
	
	public void verifylogo() {
	
		String exp=driver.getPageSource();
		String logoact=driver.findElement(logo).getAttribute("src");
		if(exp.equals(logoact))
		{
			System.out.println("logo is correct place");
		}
		else {
			
			System.out.println("logo is incorrect place");		
		}
		
	}
	
	public void verifylogin() {
		
		if(driver.findElement(loginbtn).isDisplayed()) {
			System.out.println("Login button is displayed");
			}else {
				
				System.out.println("Login button is not displayed");
			
		}
	}
	
public void verifyloginClickable() {
		
		if(driver.findElement(loginbtn).isEnabled()) {
			System.out.println("Login button is Clickable");
			}else {
				
				System.out.println("Login button is not Clickable");
			
		}
	}


public void clickonlogin() {
	
	driver.findElement(loginbtn).click();
}

public void verifyloginpage(String data, String output) {
	
   String actualoutput=driver.getTitle();
   if(actualoutput.equals(output)) {
	   System.out.println("Login page is landed ");
	   Assert.assertEquals(actualoutput,output);
   }else
   {
	   System.out.println("400 Not Found ");
	   Assert.assertEquals(actualoutput,output);
   }
}
   
   public void verifyloginpagetext(String data, String output) {
		
	   String actualtext=driver.findElement(loginpagetext).getText();
	   if(actualtext.equals(output)) {
		   System.out.println("Login page is landed ");
		   Assert.assertEquals(actualtext,output);
	   }else
	   {
		   System.out.println("Not Found ");
		   Assert.assertEquals(actualtext,output);
	   }
   

}

   public void verifylogintextbox() {
	   
	   if(driver.findElement(User).isDisplayed() && driver.findElement(password).isDisplayed()) {
		   
			System.out.println("User and password is displayed");
			}else {
				
				System.out.println("User and password is not displayed");
			
		}
	    	   
   }
   
   public void verifyusertextbox(String user, String asterik) {
	   
	   String user2= driver.findElement(User).getText();
	   String asterik2=driver.findElement(asterik1).getText();
	   if(user2.equals(user)&&asterik2.equals(asterik)) {
		   
		   System.out.println("User and asterik is displayed");
		}else {
			
			System.out.println("User and asterik is not displayed");
		
	}
		   
	   }
   
 public void verifyuserpswdbox(String pswd, String asterik) {
	   
	   String pswd2= driver.findElement(password).getText();
	   String asterik2=driver.findElement(asterik1).getText();
	   if(pswd2.equals(pswd)&&asterik2.equals(asterik)) {
		   
		   System.out.println("password and asterik is displayed");
		}else {
			
			System.out.println("password and asterik is not displayed");
		
	}
	
	   }
	     
 
 public void verifyAlignment() {
	 
	 String Aligninput= driver.findElement(User).getCssValue("");
	 if(Aligninput.equals("Center"))
	 {
		 System.out.println("Alignment is centre position");
	 }else {
		 System.out.println("Alignment in not right position");
	 }
	 
 }
 
public void verifyAlignLogin() {
	 
	 String Alignogin= driver.findElement(loginbtn).getCssValue("");
	 if(Alignogin.equals("Center"))
	 {
		 System.out.println("Login button is centre position");
	 }else {
		 System.out.println("Login button is not right position");
	 }
	 
 }
   
   public void verifylink() {
	   	     	   
	   if(driver.findElement(Forgotuserpswdlink).isDisplayed() || driver.findElement(Resetpswdlink).isDisplayed() ) {
		   
		   System.out.println(" the link is present");
		 }else {
			 System.out.println("The link is not present");
		 }
		   
	   }
	   
   public void verifycolor() {
	   
	   String Usercolor= driver.findElement(User).getCssValue("color");
	   String pswdcolor= driver.findElement(password).getCssValue("color");
	   if (Usercolor.equals("rgb(128, 128, 128)") || pswdcolor.equals("#808080")) {
		    System.out.println("Text color is gray.");
		} else {
		    System.out.println("Text color is not gray.");
		}
	   
   }
   
   public void Loginwithcredientials(String datakey,String SheetName) {
	   
	   try{
		   Map<String, String> excelDataMap = ExcelReader.getData(datakey, SheetName);
		   
			
		switch(datakey) {
			
		case "Login_validcrediential":
			String Username=excelDataMap.get("UserName");
			String Password=excelDataMap.get("Password");
			String Message=excelDataMap.get("Message");
			driver.findElement(UsernameBox).sendKeys(Username);
			driver.findElement(PasswordBox).sendKeys(Password);
			driver.findElement(loginbtn).click();
	        String msg=driver.findElement(message).getText();
	        if(msg.equals(Message))
	         {
	        	 System.out.println("username and password is Valid");
	        	 Assert.assertEquals(msg, Message);
	         }else {
	        	 System.out.println("Username and password is Invalid");
	         }
			break;
			
	         case "Login_Invalidcrediential":
	 			String Username1=excelDataMap.get("UserName");
	 			String Password1=excelDataMap.get("Password");
	 			String Message1=excelDataMap.get("Message");
	 			driver.findElement(UsernameBox).sendKeys(Username1);
	 			driver.findElement(PasswordBox).sendKeys(Password1);
	 			driver.findElement(loginbtn).click();
	 	        String msg1=driver.findElement(message).getText();
	 	        if(msg1.equals(Message1))
	 	         {
	 	        	 System.out.println("Error message please check username/password");
	 	        	 Assert.assertEquals(msg1, Message1);
	 	         }else {
	 	        	 System.out.println("Error message please check username/password");
	 	         }
	 			break;
	 			
	 	        case "Login_onlyuser":
	 				String Username2=excelDataMap.get("UserName");
	 				String Message2=excelDataMap.get("Message");
	 				driver.findElement(UsernameBox).sendKeys(Username2);
	 				driver.findElement(loginbtn).click();
	 		        String msg2=driver.findElement(message).getText();
	 		       if(msg2.equals(Message2))
	 		         {
	 		        	 System.out.println("Error message please check password");
	 		        	Assert.assertEquals(msg2, Message2);
	 		         }else {
	 		        	 System.out.println("Error message please check password");
	 		         }
	 				break;
	 				
	 				
	 		        case "Login_onlypswd ":
	 					String Password3=excelDataMap.get("Password");
	 					String Message3=excelDataMap.get("Message");
	 					driver.findElement(PasswordBox).sendKeys(Password3);
	 					driver.findElement(loginbtn).click();
	 			         String msg3=driver.findElement(message).getText();
	 			        if(msg3.equals(Message3))
	 			         {
	 			        	 System.out.println("Error message please check username");
	 			        	Assert.assertEquals(msg3, Message3);
	 			         }else {
	 			        	 System.out.println("Error message please check username");
	 			         }		
	 					break;
	 					
	 					
	 			        case "Login_blank":
	 						String Username4=excelDataMap.get("UserName");
	 						String Password4=excelDataMap.get("Password");
	 						String Message4=excelDataMap.get("Message");
	 						driver.findElement(UsernameBox).sendKeys(Username4);
	 						driver.findElement(PasswordBox).sendKeys(Password4);
	 						driver.findElement(loginbtn).click();
	 				        String msg4=driver.findElement(message).getText();
	 				        if(msg4.equals(Message4))
	 				         {
	 				        	 System.out.println("Error message please check username/password");
	 				        	Assert.assertEquals(msg4, Message4);
	 				         }else {
	 				        	 System.out.println("Error message please check username/password");
	 				         }
	 						
	 						break;
	   
	 						
	 						case "Login_blankpswd  ":
	 							
	 							String Username5=excelDataMap.get("UserName");
		 						String Password5=excelDataMap.get("Password");
		 						String Message5=excelDataMap.get("Message");
		 						driver.findElement(UsernameBox).sendKeys(Username5);
		 						driver.findElement(PasswordBox).sendKeys(Password5);
		 						driver.findElement(loginbtn).click();
		 				        String msg5=driver.findElement(message).getText();
		 				        if(msg5.equals(Message5))
		 				         {
		 				        	 System.out.println("Error message please check username/password");
		 				        	Assert.assertEquals(msg5, Message5);
		 				         }else {
		 				        	 System.out.println("Error message please check username/password");
		 				         }
		 						break;
	 								 							
   }
   
   }catch(Exception ex) {
	   ex.printStackTrace();
   
   }}
   

public void Loginthroughkeyboard() {
	
	Actions action=new Actions(driver);
	WebElement user= driver.findElement(User);
	WebElement pswd=driver.findElement(password);
	WebElement Login=driver.findElement(loginbtn);
	action.moveToElement(user).sendKeys("Latha");
	action.moveToElement(pswd).sendKeys("Latha123");
	action.moveToElement(Login).perform();

}

public void LoginthroughMouse() {
	
	Actions ac=new Actions(driver);
	WebElement user= driver.findElement(User);
	WebElement pswd=driver.findElement(password);
	WebElement Login=driver.findElement(loginbtn);
	ac.click(user).sendKeys("Latha");
	ac.click(pswd).sendKeys("Latha123");
	ac.click(Login).perform();
	
	
}



public void Dashboardpage() {
	
	String Expected="";
	String titleurl=driver.getTitle();
	if(titleurl.equals("Dashboard"))
	{
		System.out.println("Dashboard page is displayed");
		Assert.assertEquals(titleurl,Expected);
		
	}else
	{
		System.out.println("Dashboard page is not displayed");
	}


}

public void clickonforgotusernamepasswordlink() {
	
	driver.findElement(Forgotuserpswdlink).click();
}

public void verifylandingpage(String data, DataTable message) {
	
	String acttitle=driver.findElement(Forgotuserpswdlink).getText();
	if(acttitle.equals(message)) {
		System.out.println("Forgot username and password page is displayed");
		Assert.assertEquals(acttitle,message);
	}else {
		
		System.out.println("400 Not Found");
	}
}
public void verifyEmailtext(String string) {
	

	String Emailtext=driver.findElement(Email).getText();
	Assert.assertEquals(Emailtext, string);
	
}

public void verifysendlink(String string) {
	String sendlinklxt=driver.findElement(sendlink).getText();
	Assert.assertEquals(sendlinklxt, string);
	
}

public void verifysendlinkAlign() {
	String Alignsendlink= driver.findElement(loginbtn).getCssValue("");
	 if(Alignsendlink.equals("Center"))
	 {
		 System.out.println("send link button is centre position");
	 }else {
		 System.out.println("send link button is not right position");
	 }
	
	
}

public void EnterEmailandclicksendbtn() {
	
	driver.findElement(Email).sendKeys("abc@gmail.com");
	driver.findElement(sendlink).click();
	
}

public void clickonresetpassword() {
	
	driver.findElement(resetpassworklink).click();
	String actualurl=driver.getCurrentUrl();
	if(actualurl.contains("Reset Password page")) {
		System.out.println("Admin user landed on right page");
			}else
			{
				System.out.println("400 Not Found");
			}
	
}

public void EnterInvalidEmailandclicksendbtn() {
	
	driver.findElement(Email).sendKeys("abc12345@gmail.com");
	driver.findElement(sendlink).click();
	
}

public void validateinMailbox() {
	
	driver.get("https://mail.google.com/"); 
	WebElement emailField = driver.findElement(By.id("identifierId"));
	WebElement nextButton = driver.findElement(By.id("identifierNext"));

	emailField.sendKeys("your_email@gmail.com"); 
	nextButton.click();

	 WebDriverWait wait = new WebDriverWait(driver, null); 
     wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Your Reset Password Email Subject')]")));

     driver.close();
	
}

public void submitAlign() {
	 String Alignsubmit= driver.findElement(submit).getCssValue("Center");
	 if(Alignsubmit.equals("Center"))
	 {
		 System.out.println("Submit button is center position");
	 }else {
		 System.out.println("submit button is not right position");
	 }
	
	
}

public void Resetpasswordtxt() {
	
	if(driver.findElement(typeinnewpswd).isDisplayed() || driver.findElement(retypepswd).isDisplayed())
	{
		System.out.println("Type in New password and Retype Password testbox is Present");
	}else
	{
		System.out.println("Type in New password and Retype Password testbox is Not Present");
	}
}

public void verifyTypeinNewpswdtxt(String expstr) {
	
	String txt1=driver.findElement(typeinnewpswd).getText();
	Assert.assertEquals(txt1, expstr);
		
}

public void verifyRetypepswd(String expstr) {
	

	String txt2=driver.findElement(retypepswd).getText();
	Assert.assertEquals(txt2, expstr);
	
}

public void verifydisablestate() {
	
	WebElement txt1=driver.findElement(typeinnewpswd);
	WebElement txt2=driver.findElement(retypepswd);
	if(!txt1.isEnabled()&&!txt2.isEnabled())
	{
		System.out.println("textbox is disabled");
	}else {
		System.out.println("textbox is Enabled");
	}
	
	
	
}

public void clicksonnewpswd() {
	
	WebElement txt1=driver.findElement(typeinnewpswd);
	txt1.click();
	if(txt1.isEnabled()) {
		System.out.println("textbox is Enabled");
	}else {
		System.out.println("textbox is disabled");
	}}	
	


public void clicksonRetypepswd() {
	
	WebElement txt1=driver.findElement(retypepswd);
	txt1.click();
	if(txt1.isEnabled()) {
		System.out.println("textbox is Enabled");
	}else {
		System.out.println("textbox is disabled");
	}}



public void clickonsubmit() {
	
	driver.findElement(submit).click();
	
}

public void verifydatawithretypepswdpage(String newtypepswd, String retypepswd2, String message2) {
	
	driver.findElement(typeinnewpswd).sendKeys(newtypepswd);
	driver.findElement(retypepswd).sendKeys(retypepswd2);
	driver.findElement(submit).click();
	String actualmsg=driver.findElement(submit).getText();
	Assert.assertEquals(actualmsg,message2);
	
	
}	

}
