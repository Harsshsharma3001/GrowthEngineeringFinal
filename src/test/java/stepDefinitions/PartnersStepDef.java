package stepDefinitions;

import io.cucumber.java.en.Then;
import utilities.BaseClass;

public class PartnersStepDef extends BaseClass {

	@Then("validate the Partners page and go back to home page")
	public void validate_Downloads_and_go_back_to_home_page() throws Exception {
		System.out.println("The Partners page title is: " + driver.getTitle());
		if (!driver.getTitle().equals("Become a Partner! - Growth Engineering | Engagement Experts")) {
			throw new Exception("Error while validating the Partner link");
		}
		System.out.println("The Partner link is validated");
		driver.navigate().back();
	}

}
