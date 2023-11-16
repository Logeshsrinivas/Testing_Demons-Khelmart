package util;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HookClass {
	
	@Before
	public void start() {
		HelperClass.setUpDriver("Edge");
	}
	@After
	public void close(Scenario scenario) {
		
	}

}
