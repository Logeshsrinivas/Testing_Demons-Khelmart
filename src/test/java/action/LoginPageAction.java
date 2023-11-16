package action;

import org.openqa.selenium.support.PageFactory;

import locators.Loginlocators;
import util.HelperClass;

public class LoginPageAction {

	Loginlocators loginPageLocators=null;
	 
	public LoginPageAction() {
		loginPageLocators  = new Loginlocators();
	
	PageFactory.initElements(HelperClass.getDriver(),loginPageLocators);
	}
	public void myAccount(){
	loginPageLocators.myaccount.click();
}

	public void setEmail(String stremail){
		loginPageLocators.email.sendKeys(stremail);
	}
		public void setpassword(String strPassword) {
				loginPageLocators.password.sendKeys(strPassword);
	}
		public void clicksignin() {
			loginPageLocators.signin.click();
		}
			
		public void clicksignout() {
			HelperClass.jse.executeScript("arguments[0].click()", loginPageLocators.signout);
//				loginPageLocators.signout.click();
		}
		public void logininfo(String stremail,String strPassword) {
			setEmail(stremail);
			setpassword(strPassword);
				clicksignin();

		}
	
		 public String getloginVerifyText() {
			  return loginPageLocators.loginverify.getText();
		 }
		 
	public String getVerifyErrorText() {
			return loginPageLocators.invalidlogin.getText();
	}
			 
			  
			  public void signout() {
				  myAccount();
				  clicksignout();
			  }

	}


