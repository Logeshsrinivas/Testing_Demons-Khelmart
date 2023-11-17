package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import action.SearchFeatureActions;
import locators.SearchFeatureLocators;
import util.HelperClass;

public class check {
	public static void main(String[] args) {
		HelperClass.setUpDriver("chrome");
		HelperClass.OpenPage("https://www.khelmart.com/catalogsearch/result/index/?cat=5_cricket&q=shoes");
	
//	SearchFeatureLocators searchfeaturelocators = new SearchFeatureLocators();
//	List<WebElement> element  = HelperClass.getDriver().findElements(By.xpath("//div[@class='product details product-item-details text-center']/div//strong/a"));
//	System.out.println("Count of products diplayed : "+ element.size() );
//	for (WebElement element1 : element) {
//		System.out.println("Product Name :" + element1.getText());
//	}
		
		
}
}
