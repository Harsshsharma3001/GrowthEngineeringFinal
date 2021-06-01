package stepDefinitions;

import io.cucumber.java.en.Then;
import utilities.BaseClass;

public class BrainScienceStepDef extends BaseClass {
	@Then("validate Brian Science page and go back to home page")
	public void validate_the_Brain_science_page_and_go_back_to_home_page() throws Exception {
		System.out.println("The Brian Science page title is: " + driver.getTitle());
		if (!driver.getTitle().equals("Brain Science - Growth Engineering")) {
			throw new Exception("Error while validating Brain Science link");

		}
		System.out.println("The Brian Science link is validated");
		driver.navigate().back();
	}

}
