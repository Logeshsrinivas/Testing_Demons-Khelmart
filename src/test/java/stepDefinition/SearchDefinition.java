package stepDefinition;

import org.testng.Assert;

import action.SearchFeatureActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.HelperClass;
import util.Utilityclass;


public class SearchDefinition {
	
	Utilityclass datas = new Utilityclass();
	SearchFeatureActions sfaction = new SearchFeatureActions();
	@Given("User is on Khelmart homepage")
	public void user_is_on_khelmart_homepage() {
		HelperClass.OpenPage(datas.Webpage);
	}
	@When("User shoud able login the application")
	public void user_shoud_able_login_the_application() {
	  
	}

	@When("User give the serach product in that searchfield")
	public void user_give_the_serach_product_in_that_searchfield() {
		sfaction.searchingActions(datas.givingData);
	}

	@When("User clicks the search option")
	public void user_clicks_the_search_option() {
		sfaction.searchButton();
	}

	@When("User clicks the Category in shopping option and select one filter")
	public void user_clicks_the_category_in_shopping_option_and_select_one_filter() {
		sfaction.finalCatogery();
	}
	@Then("User Successfully search and print the List of Product")
	public void user_successfully_search_and_print_the_list_of_product() {
	    sfaction.printList();
	    Assert.assertTrue(sfaction.size==2);
	}

}
