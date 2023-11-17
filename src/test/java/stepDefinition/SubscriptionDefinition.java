package stepDefinition;

import action.SubscriptionActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.HelperClass;
import util.Utilityclass;

public class SubscriptionDefinition {
	SubscriptionActions subact = new SubscriptionActions();
	Utilityclass datas = new Utilityclass();

	
	@Given("User is on Khelmart application homepage")
	public void user_is_on_khelmart_application_homepage() {
		HelperClass.OpenPage(datas.Webpage); 
	}
	
	@When("User scroll to bottom of the page")
	public void user_scroll_to_bottom_of_the_page() {
	    
	}

	@When("User click and give email in that field")
	public void user_click_and_give_email_in_that_field() {
	    
	}

	@When("User clicks the subscribe option")
	public void user_clicks_the_subscribe_option() {
	   
	}

	@Then("User successfully subscribe the Application")
	public void user_successfully_subscribe_the_application() {
	    
	}
	
}
