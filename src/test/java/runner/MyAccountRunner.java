package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="",features="src\\test\\resource\\Features\\MyAccount.feature",glue="stepDefinition",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class MyAccountRunner {

}
