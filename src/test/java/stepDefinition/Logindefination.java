package stepDefinition;


import java.sql.Driver;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.By;
import action.LoginPageAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.Dataproperties;
import util.HelperClass;


	public class Logindefination {
		Dataproperties data = new Dataproperties();
		LoginPageAction objLogin = new LoginPageAction();
		

		@Given("user is in khelmart webapplications login page")
		public void user_is_in_khelmart_webapplications_login_page() {
			HelperClass.OpenPage(data.url);
	        System.out.println("login page");
		}

		@When("User clicks the my account option in homepage")
		public void user_clicks_the_my_account_option_in_homepage() {
			objLogin.myAccount();
			System.out.println("welcome to home page");
		}

		@When("User enters the valid email-id")
		public void user_enters_the_valid_email_id() {
			objLogin.setEmail(data.email);
			System.out.println("user enters an email");
		}

		@When("User enters the valid password")
		public void user_enters_the_valid_password() {
			 objLogin.setpassword(data.password);
		        System.out.println("user enters a password");
		}

		@When("User clicks the sign in option")
		public void user_clicks_the_sign_in_option() {
			objLogin.clicksignin();
			objLogin.myAccount();
		}

		@When("User should able to login in khelmart application sucessfully")
		public void user_should_able_to_login_in_khelmart_application_sucessfully() {
			Assert.assertTrue(objLogin.getloginVerifyText().contains("HI KAVYA"));
			   System.out.println("sucessfull login");
		 
		}

		@Then("User clicks the sign out should able to logout sucessfully")
		public void user_clicks_the_sign_out_should_able_to_logout_sucessfully() throws InterruptedException {
			Thread.sleep(5000);		
			objLogin.signout();
		}

		@When("the user clicks an my account option")
		public void the_user_clicks_an_my_account_option() {
		objLogin.myAccount();
		}

		@When("enters valiD email Address")
//		public void enters_vali_d_email_address(io.cucumber.datatable.DataTable dataTable) {
//	   System.out.println("user enter email");
//		  List<Map<String,String>> signupForm =dataTable.asMaps(String.class,String.class);
//    	for(Map<String,String>form:signupForm) {
//				String email =form.get("email");
//			HelperClass.driver.findElement(By.name("'login[username")).sendKeys(email);
//		}
		//}
		

		@When("User gives the invalid password")
		public void user_gives_the_invalid_password(io.cucumber.datatable.DataTable dataTable) {
		System.out.println("user enter password");
		  List<Map<String,String>> signupForm =dataTable.asMaps(String.class,String.class);
		for(Map<String,String>form:signupForm) {
				String password =form.get("password");
				HelperClass.driver.findElement(By.name("'login[password")).sendKeys(password);
			}
		}

		@When("User clicks the sign in button")
		public void user_clicks_the_sign_in_button() {
		objLogin.clicksignin();
		}

		@Then("User not able to login and an error message should be show")
		public void user_not_able_to_login_and_an_error_message_should_be_show() {
			Assert.assertTrue(objLogin.getVerifyErrorText().contains("The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later."));
			   System.out.println("unsucessfull login");
		}
	}



