package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubscriptionLocators {

	@FindBy(xpath="//a[@class='logo']") public WebElement homepage;
	@FindBy(xpath="//input[@id='newsletter']") public WebElement emailAddress;
	@FindBy(xpath="//button[@class='action subscribe primary']") public WebElement subscribe;
}
