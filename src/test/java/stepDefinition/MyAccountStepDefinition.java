package stepDefinition;

import org.junit.Assert;

import action.MyAccountActionPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.HelperClass;
import util.Utility;

public class MyAccountStepDefinition {
	
	
	MyAccountActionPage act=new MyAccountActionPage();
	Utility ut = new Utility();
	@When("login with the url")
	public void login_with_the_url() {
		HelperClass.OpenPage(ut.url);
		
	}

	@When("user click my account")
	public void user_click_my_account() {
		Assert.assertTrue(act.getaccounttext().contains("Account Information"));
		System.out.println(act.getaccounttext());
	}

	@When("user click my orders")
	public void user_click_my_orders() {
		Assert.assertTrue(act. getordertext().contains("You have placed no orders."));
		System.out.println(act.getordertext());
	    
	}

	@When("user click address book and update the address")
	public void user_click_address_book_and_update_the_address() {
		act.setmyaddressbook();
		act.setchangeaddress();
		act.setaddressClear();
		act.setaddress(ut.ChangeAddress);
		act.setsaveaddress(); 
	}

	@Then("user checks the updated address")
	public void user_checks_the_updated_address() {
		
		System.out.println("user checks the updated address");
	   
	}




}
