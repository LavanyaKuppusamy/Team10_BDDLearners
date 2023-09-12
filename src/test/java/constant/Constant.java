package constant;

import java.io.IOException;
import java.util.ArrayList;

import utilities.ExcelReader;
import utilities.Loggerload;

public class Constant {
	
	public static String APP_URL;
	public static String BROWSER;
	public static String UserName;
	public static String Password;
	public static String HomepageUrl;
	public static String loginpageurl;
	public static String dashboardurl;
	public static String Forgotusername;
	public static String Resetpassword;
	

	// Extract the data from Excel and return the value as String
			public static ArrayList<String> excelDataValue(String sheetName, String testCase) throws IOException {
				Loggerload.info("excelDataValue method");
				ExcelReader ed = new ExcelReader();
				ArrayList<String> data =  ed.dataDrivenMethod(sheetName, testCase);
				return data;
			}

}
