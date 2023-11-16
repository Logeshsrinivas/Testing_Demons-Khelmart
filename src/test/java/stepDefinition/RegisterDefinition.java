package stepDefinition;

import action.RegisterAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Tha;
import util.HelperClass;

public class RegisterDefinition {
		RegisterAction regac = new RegisterAction();
	@Given("User should land in Khelmart Homepage")
	public void user_should_land_in_khelmart_homepage() {
	  HelperClass.OpenPage("https://www.khelmart.com/");
	}

	@When("User clicks account and in that clicks new customer")
	public void user_clicks_account_and_in_that_clicks_new_customer() throws InterruptedException {

				regac.Click();
	  
	}

	@When("User should enter username,lastname,email,password,confirm-password")
	public void user_should_enter_username_lastname_email_password_confirm_password() {
	
//	   regac.NewAccount("log","sri", "logsri5@gmail.com", "123456789", "123456789");
	}

	@When("User clicks create Account")
	public void user_clicks_create_account() {
//	   regac.clickCreateAccount();
	}

	@Tha("User able to see account registered successfully message")
	public void user_able_to_see_account_registered_successfully_message() {
	   
	}
}
