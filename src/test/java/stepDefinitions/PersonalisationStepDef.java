package stepDefinitions;

import io.cucumber.java.en.Then;
import utilities.BaseClass;

public class PersonalisationStepDef extends BaseClass {

	@Then("validate the Personalisation page and go back to home page")
	public void validate_personlisation_and_go_back_to_home_page() throws Exception {
		System.out.println("The personalisation page title is: " + driver.getTitle());
		if (!driver.getTitle().equals("Personalisation: Become a Personalisation Sensation!")) {
			throw new Exception("Error while validating the Personalisation link");
		}
		System.out.println("The Personalisation link is validated");
		driver.navigate().back();

	}

}
