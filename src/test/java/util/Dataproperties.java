package util;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	
	public class Dataproperties {
		 public String url;
		 public String email;
		public String password;
		public Dataproperties(){
			data();
		}
		public void data() {
			File file = new File("C:\\Users\\kbjagadeesh\\Pilot_Project\\Khelmart\\src\\test\\resource\\property.properties");
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
			url = prop.getProperty("Url");
			email = prop.getProperty("Email");
		    password = prop.getProperty("Password");
		}
	}
	
	


