package page_Objects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.ConfigReader;
import utilities.CrossBrowser;

public class ManageStudentsPage {

	By LMStitle = By.xpath("//table//th[3]");

	public WebDriver driver;

	public ManageStudentsPage(WebDriver driver) {
		this.driver = driver;

	}

	public static final String STUDENT_PAGE_TITLE = "Student Details Page";

	// public WebDriver driver = CrossBrowser.getDriver();
	/*
	 * String loginUrl = ConfigReader.getSignInPage(); By datastructuredropdown =
	 * By.xpath("//a[@class='nav-link dropdown-toggle']"); By linkdropdown =
	 * By.xpath("//a[text()='Linked List']"); By output = By.id("output");
	 * 
	 * 
	 * By introduction = By.xpath("//a[@href='introduction']"); By
	 * creatinglinkedlist = By.xpath("//a[@href='creating-linked-list']"); By
	 * practicequestions = By.xpath("//a[text()='Practice Questions']"); // By
	 * practicequestions = By.xpath("//a[href='/linked-list/practice\']"); By
	 * typesoflinkedlist = By.xpath("//a[@href='types-of-linked-list']"); By
	 * transversallist = By.xpath("//a[@href='traversal']"); By insertionlink =
	 * By.xpath("//a[@href='insertion-in-linked-list']"); By deletion =
	 * By.xpath("//a[@href='deletion-in-linked-list']"); By implementLinkedListConst
	 * = By.xpath("//a[@href='implement-linked-list-in-python']");
	 */

	///////////////////////////////////////////////////////////////

	By studentLink = By.linkText("Student");
	By title = By.xpath("//label[contains(text(), 'Student Details Page')]");

	By dropDown1 = By.xpath("//*[@id='Select Student Name']");
	By dropDown2 = By.xpath("//*[@id='Select Batch Id']");
	// By searchbox = By.xpath("//select[@input]");

	By searchBox1 = By.xpath("//*[@id='Select Student Name']/*[@type='input']");
	By searchBox2 = By.xpath("//*[@id='Select Batch Id']/*[@type='input']");
	By Logoutbtn = By.xpath("//button[@class='btn']");
	// div[@class='ui fluid search selection dropdown upward active
	// visible']//input[@class='search']

	public void studentPageClick() {
		driver.findElement(studentLink).click();
	}

	public void checkTitle() {

		String actualOutput = driver.findElement(title).getText();
		Assert.assertEquals(actualOutput, STUDENT_PAGE_TITLE);

	}

	public void verifyNavigationtime(int i) {
		long startTime = System.currentTimeMillis();
		driver.get("https://dasboardpage-url.com");
		long endTime = System.currentTimeMillis();
		long navigationTime = endTime - startTime;
		if (navigationTime <= i) {
			System.out.println("Navigation time is less or equal to +i " + navigationTime + " ms");
		} else {
			System.out.println("Navigation time is greater than +i " + navigationTime + " ms");
		}

	}

	public void verifyLMStitle() {
		String expectedtitle = "LMS-Learning Management system";
		String actualtitle = driver.findElement(LMStitle).getText();
		if (actualtitle.equalsIgnoreCase(expectedtitle)) {
			System.out.println("Title is matched");
			Assert.assertEquals(actualtitle, expectedtitle);
		} else {
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

	public void verifyDropDown() {

		Assert.assertNotEquals(dropDown1, null);
		Assert.assertNotEquals(dropDown2, null);
	}

	public void verifySearchbox() {

		Assert.assertNotEquals(searchBox1, null);
		Assert.assertNotEquals(searchBox2, null);
	}

	// private boolean verifySpelling(String headerText) {

	// return false;
	// }

	// public void spellingCheck() {
	public boolean spellingCheck() {

		return false;
	}

	public void checkColour() {
		// TODO Auto-generated method stub

	}

	public void ClickonLogout() {
		driver.findElement(Logoutbtn).click();

	}

	public void selectBatchid() {

	}

	public void selecStudentName() {

	}

	public void scrollName() {
		// TODO Auto-generated method stub

	}

	public void scrollBatchid() {
		// TODO Auto-generated method stub

	}

	public void verifyNumbersInDropDown() {
		// TODO Auto-generated method stub
		
	}


}
