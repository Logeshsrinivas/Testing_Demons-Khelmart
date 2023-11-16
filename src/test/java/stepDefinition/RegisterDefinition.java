package stepDefinition;

import org.testng.Assert;

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
		HelperClass.log.info("HomePage launched");

	}

	@When("User clicks account and in that clicks new customer")
	public void user_clicks_account_and_in_that_clicks_new_customer() { 
				regac.Click();
				HelperClass.log.info("Create account page opened");

	}
	@When("User should enter username,lastname,email,password,confirm-password")
	public void user_should_enter_username_lastname_email_password_confirm_password() {
	
	   regac.NewAccount("log","sri", "logr5@gmail.com", "123456789", "123456789");
		HelperClass.log.info("Manditory Data passed");

	}

	@When("User clicks create Account")
	public void user_clicks_create_account() {
	   regac.clickCreateAccount();
		HelperClass.log.info("Account created succesfully");

	}

	@Tha("User able to see account registered successfully message")
	public void user_able_to_see_account_registered_successfully_message() {
	   Assert.assertTrue(regac.getVerifyText().contains("Thank you for registering with Khelmart Enterprises."));
		HelperClass.log.info("Aseert successful");

	}
}
