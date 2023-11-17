package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SportsShoesLocators {
	@FindBy(xpath="(//span[text()='SPORTS SHOES'])[1]")
	public WebElement sportsshoes;
	
	@FindBy (xpath="(//a[@class=\"cdz-tab-link active\"])[2]")
	public WebElement football;
	
	@FindBy(xpath="//select[@id=\"sorter\"][1]")
	public WebElement position;
	
	@FindBy(xpath="(//option[text()='Price'])[1]")
	public WebElement price;
	
	
	
	

}
