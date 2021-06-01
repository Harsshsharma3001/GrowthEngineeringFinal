package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports.html" }, monochrome = true, features = {
		"src/test/resources/features" }, glue = { "stepDefinitions" }, tags ="@GetInTouch")

public class Runner {

}