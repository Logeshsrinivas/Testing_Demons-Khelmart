package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utilityclass {

	public String givingData;
	public String Webpage;
	public String subEmail;

	
	public Utilityclass() {
		data();
	}
	
	public void data() {
		File file = new File("C:\\Users\\rmohamedibrahim\\Pilot_project\\Khelmart\\src\\test\\resource\\searchData.properties");
		FileInputStream fio =null;
		try {
			fio = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		try {
			prop.load(fio);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		givingData = prop.getProperty("searchThing");
		Webpage = prop.getProperty("URL");
		subEmail = prop.getProperty("Email");
}
}

