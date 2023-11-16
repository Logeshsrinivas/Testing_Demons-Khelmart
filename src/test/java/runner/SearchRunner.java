package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resource\\Features\\search.feature",glue="stepDefinition",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class SearchRunner {

}
