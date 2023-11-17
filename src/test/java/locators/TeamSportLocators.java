package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeamSportLocators {
@FindBy(xpath="//span[text()='Team Sports'])[1]")
public WebElement TeamSport;
@FindBy(xpath="(//a[text()='Cricket Bat'])[1]")
public WebElement cricketBat;
@FindBy(xpath="(//div[@class='filter-options-title'])[2]")
public WebElement price;
@FindBy(xpath="(//div[@class='filter-options-content-inner'])[2]/ol/li[5]/a")
public WebElement priceSelect;
@FindBy(xpath="(//a[@title='Set Descending Direction'])[1]")
public WebElement desending;
public String list = "//li[@class='item product product-item']/div/div[2]/div/strong/a";
}
