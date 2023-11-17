package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
 

public class Utility {
		public String url;
		public String ChangeAddress;
		
		public void UtilityClass() {
			data();
		}
		public void data() {
			File file= new File("C:\\Users\\apiramanayagam\\Pilot Project\\Khelmart\\src\\test\\resource");
			FileInputStream fileInput = null;
			try {
				fileInput = new FileInputStream(file);
				}catch(FileNotFoundException e) {
					e.printStackTrace();
				}
			Properties prop = new Properties();
			try {
				prop.load(fileInput);
			}catch(IOException e) {
				e.printStackTrace();
			}
			url = prop.getProperty("WebPageURL");
			ChangeAddress = prop.getProperty("address");
		}
		}
	 
	 


