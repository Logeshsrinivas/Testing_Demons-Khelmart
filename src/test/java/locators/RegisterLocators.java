package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterLocators {
	@FindBy(xpath="//div[@class='account-wrapper']")
	WebElement registerlink;
	@FindBy(xpath="(//a[text()='Start Here.'])[2]")
	WebElement newCustomer;
	@FindBy(id="firstname")
	WebElement firstname;
	@FindBy(id="lastname")
	WebElement lastname;
	@FindBy(id="email_address")
	WebElement email;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="password-confirmation")
	WebElement cpassword;
	@FindBy(id="send2")
	WebElement createAccount;
}
