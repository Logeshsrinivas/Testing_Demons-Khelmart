package action;


import org.openqa.selenium.support.PageFactory;

import locators.SubscriptionLocators;
import util.HelperClass;



public class SubscriptionActions {

	SubscriptionLocators subscriptionlocators;
	
	SubscriptionActions(){
		subscriptionlocators =new  SubscriptionLocators();
		PageFactory.initElements(HelperClass.getDriver(), subscriptionlocators);
	}
	
	public void clickHomepage() {
		subscriptionlocators.homepage.click();
	}
	
	public void srollToBottm() {
		HelperClass.jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	HelperClass.jse.executeScript(window., null)
	}
	
	public void enterEmail(String email) {
		subscriptionlocators.emailAddress.sendKeys(email);
	}
	
	public void clickSubscribe() {
		subscriptionlocators.subscribe.click();
	}
}
