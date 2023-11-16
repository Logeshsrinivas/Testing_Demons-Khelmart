package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterLocators {
	@FindBy(xpath="//div[@class='account-wrapper']")
	public WebElement account;
	@FindBy(xpath="//a[text()=' My account']")
	public WebElement myAccount;
	@FindBy(xpath="//div[@class='block block-new-customer']/div/div/div/a[@class='action create primary']")
	public WebElement newCustomer;
	@FindBy(id="firstname")
	public WebElement firstname;
	@FindBy(id="lastname")
	public WebElement lastname;
	@FindBy(id="email_address")
	public WebElement email;
	@FindBy(id="password")
	public WebElement password;
	@FindBy(id="password-confirmation")
	public WebElement cpassword;
	@FindBy(id="send2")
	public WebElement createAccount;
	
}
