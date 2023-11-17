package locators;


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	
	public class Loginlocators {
	
		@FindBy(xpath="//div[@class='account-wrapper']") 
    	public WebElement myaccount ;
			@FindBy(xpath = "//input[@id='email-6555f7a724480']")
		public WebElement email ;
		@FindBy(xpath = "//input[@id='pass-6555f7a724480']")
		public WebElement password;
		@FindBy(xpath = "//button[@id='send2-6555f7a724480']")
		public WebElement signin;
		@FindBy(xpath="(//a[text()='Sign Out'])[3]")
		public WebElement signout;
		@FindBy(xpath="//p[@class='title']")
		public WebElement loginverify;
		@FindBy(xpath ="(//div[@class='messages'])[1]")
		public WebElement invalidlogin;
	
		
	}
	



