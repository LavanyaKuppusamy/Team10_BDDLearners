package utilities;
import java.io.IOException;
import java.util.Properties;

import constant.Constant;

public class CommonUtils {
	
public  void loadProperties() {
		
		Properties properties=new Properties();
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Constant.HomepageUrl= properties.getProperty("HomepageUrl");
		Constant.BROWSER=properties.getProperty("BROWSER");
		Constant.loginpageurl=properties.getProperty("loginpageurl");
		Constant.dashboardurl=properties.getProperty("dashboardurl");
		Constant.Forgotusername=properties.getProperty("Forgotusername");
		Constant.Resetpassword=properties.getProperty("Resetpassword");
		


}



}
