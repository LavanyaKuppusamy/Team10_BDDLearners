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
			
			
			Constant.APP_URL= properties.getProperty("APP_URL");
			Constant.BROWSER=properties.getProperty("BROWSER");
			
			
		}
	}

