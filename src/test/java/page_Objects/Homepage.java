package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	
	  public WebDriver driver;
	  By GetStartedbutton=By.xpath("//button[@class='btn']");
	  By dropdown=By.xpath("//div[@class='nav-item dropdown']");
	 By selectopt=By.xpath("//div[@class='dropdown-menu show']/a[2]");
	 By getstart2=By.xpath("//a[@href='linked-list']");
	 By ErrorMsg=By.xpath("//div[@class='alert alert-primary']");
	By Registerlink=By.xpath("//a[@href='/register']");
	By loginlink=By.xpath("//a[@href='/login']");
	
	
	public Homepage(WebDriver driver) {
		
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public   void ClickonGetStarted() {
		
		try {
			driver.findElement(GetStartedbutton).isDisplayed();
			driver.findElement(GetStartedbutton).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
