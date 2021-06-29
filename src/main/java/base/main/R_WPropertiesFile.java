package base.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class R_WPropertiesFile {
	
	public Properties properties (String path) throws IOException {
		InputStream file = new FileInputStream(path);
		
		Properties pro = new Properties();
		pro.load(file);
		return pro;
		
	}
	


}
