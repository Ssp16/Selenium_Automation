package Api;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class utils {

	public static String getGlobalValue(String key) throws IOException
	{
		Properties prop =new Properties();
		FileInputStream fis =new FileInputStream("src/main/java/Api/global.properties");
		prop.load(fis);
		return prop.getProperty(key);
	
	}
}
