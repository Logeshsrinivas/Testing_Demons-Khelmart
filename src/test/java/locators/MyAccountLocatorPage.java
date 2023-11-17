package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountLocatorPage {
	
	@FindBy(xpath="//span[text()='Your account']")
	public WebElement youraccount;
	
	@FindBy(xpath="//a[text()=' My account']")
	public WebElement myaccount;
	
	@FindBy(xpath ="//strong[text()='Account Information']")
	public WebElement accountclick;
	
	@FindBy(xpath="//strong[text()='My Orders']")
	public WebElement myorder;
	
	@FindBy(xpath="(//span[text()='You have placed no orders.'])[1]")
	public WebElement orderclick;
	
	@FindBy(xpath="//strong[text()='Address Book']")
	public WebElement myaddressbook;
	
	@FindBy(xpath="//span[text()='Change Billing Address']")
	public WebElement changeaddress;
	
	@FindBy(xpath="//input[@id='street_1']")
	public WebElement addressgiven;
	
	@FindBy(xpath="//span[text()='Save Address']")
	public WebElement saveaddress;
	
	
	
	
	

}





