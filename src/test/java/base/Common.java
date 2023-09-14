package base;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;

public class Common {

	WebDriver driver;
	
	public void sort() {
		
		 
		int Noofheader=driver.findElements(By.xpath(".\\th")).size();
		String dataheader=driver.findElement(By.xpath(".\\th")).getText();
		for(int i=0;i<=Noofheader;i++) {
			
			WebElement tableheader =driver.findElement(By.xpath(".\\td"+i+"[i]"));
			tableheader.click();
			String tableheader2=driver.findElement(By.xpath(".\\td"+i+"[i]")).getText();
			if(dataheader==tableheader2) {
				
				System.out.println("The table is sorted to descending order");
			}else {
				
				System.out.println("The table is sorted to ascending order");
			}
		}
			
		
		
	}
	


public void pagination() {
	
	By Rightarrow=By.xpath("Rightarrow");
	WebElement Leftarrow=driver.findElement(By.xpath("Left arrow"));
	WebElement totalpage=driver.findElement(By.xpath("totalpage"));
	
	int NoofEntries=driver.findElements(By.xpath(".//td")).size();
	
	if(NoofEntries<5)
	{
	
		driver.findElement(Rightarrow).isEnabled();
		boolean isdisabled=!Leftarrow.isEnabled();
		boolean isdisabled2=!totalpage.isEnabled();
		System.out.println("Right arrow is enabled and left arrow is disabled, Next Page is disabled");
		System.out.println(isdisabled);
		System.out.println(isdisabled2);
		
		
		
	}else if(NoofEntries>5) {
		
		driver.findElement(Rightarrow).isEnabled();
		boolean isenabled=Leftarrow.isEnabled();
		boolean isenabled2=totalpage.isEnabled();
		System.out.println("Right arrow is enabled and left arrow is Enabled, Next Page is Enabled");
		System.out.println(isenabled);
		System.out.println(isenabled2);
		List<WebElement> Page = driver.findElements(By.xpath("//div[@id='pagination']/a"));
	    int pagesize = Page.size();
	    for (int j = 1; j <= pagesize; j++) {
		WebElement pagei = driver.findElement(By.xpath("//div[@id='pagination']/a[" + j + "]"));
		pagei.click();
	}

	}
	
}


public void NavigationControl() {
	
	List<String> pageUrls = new ArrayList<>();
    pageUrls.add("https://lms.com/student");
    pageUrls.add("https://lma.com/program");
    pageUrls.add("https://lma.com/batch");
    pageUrls.add("https://lma.com/user");
    pageUrls.add("https://lma.com/Class");
    pageUrls.add("https://lma.com/Assignment");
    pageUrls.add("https://lma.com/Attendence");
    pageUrls.add("https://lma.com/Login");
    
   
    for (String pageUrl : pageUrls) {
        
        driver.get(pageUrl);
        WebElement element = driver.findElement(By.id("element_id"));
        String dataFromCurrentPage = element.getText();

       // Compare data from the current page with data from the previous page (if applicable)
        if (dataFromCurrentPage.equals("expected_data")) {
            System.out.println("Page is as expected.");
        } else {
            System.out.println("Page does not match the expected data.");
        }
        
        }
	
	
	
}
}