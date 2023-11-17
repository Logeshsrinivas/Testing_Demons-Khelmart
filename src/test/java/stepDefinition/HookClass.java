package stepDefinition;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import util.HelperClass;

public class HookClass {
	
	@Before
	public void start() {
		HelperClass.setUpDriver("Chrome");
	}
	@After
	public void close(Scenario scenario) {
		
	}

}
