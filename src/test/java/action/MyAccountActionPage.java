package action;

import org.openqa.selenium.support.PageFactory;

import locators.MyAccountLocatorPage;
import util.HelperClass;

public class MyAccountActionPage {
	MyAccountLocatorPage myAccountLocatorPage;

	public MyAccountActionPage(){
		myAccountLocatorPage=new MyAccountLocatorPage();
		PageFactory.initElements(HelperClass.getDriver(),myAccountLocatorPage);
	}
	
	public void setyouraccount() {
		myAccountLocatorPage. youraccount.click();
		}
	
	public void setaccountclick() {
		myAccountLocatorPage.myaccount.click();
		}
	public String getaccounttext() {
		return myAccountLocatorPage.accountclick.getText();
		}
	public void setmyorder() {
		myAccountLocatorPage.myorder.click();

		}
	public String getordertext() {
		return myAccountLocatorPage.orderclick.getText();

		}
	public void setmyaddressbook() {
		myAccountLocatorPage.myaddressbook.click();

		}
	
	public void setchangeaddress() {
		myAccountLocatorPage.changeaddress.click();

		}
	public void setaddressClear() {
		myAccountLocatorPage.addressgiven.clear();

		}
	public void setaddress(String straddress) {
		myAccountLocatorPage.addressgiven.sendKeys(straddress);

		}
	
	public void setsaveaddress() {
		myAccountLocatorPage.saveaddress.click();
        
		}
	

	
	public void addresschanging(String address) {
		setmyaddressbook();
		setchangeaddress();
		setaddressClear();
		setaddress(address);
		setsaveaddress();
	}
	
	
	
	
}




	

 


