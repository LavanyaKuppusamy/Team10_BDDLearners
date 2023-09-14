package constant;

import java.io.IOException;
import java.util.ArrayList;

import utilities.Loggerload;
import utilities.ExcelReader;
public class Constant {
	
	
	public static final String BatchPageURL = null;
	public static String BROWSER;
	public static String HomepageUrl;
	public static String loginpageurl;
	public static String dashboardurl;
	public static String Forgotusername;
	public static String Resetpassword;
	
	
	//public DashboardPage dashboard;
	//public UserMainPage usermainpage;
	
	public static ArrayList<String> excelDataValue(String sheetName, String testCase) throws IOException {
		Loggerload.info("excelDataValue method");
		ExcelReader ed = new ExcelReader();
		ArrayList<String> data =  ed.dataDrivenMethod(sheetName, testCase);
		return data;
	}
	

}
