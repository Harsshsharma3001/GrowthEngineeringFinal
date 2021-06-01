package stepDefinitions;

import io.cucumber.java.en.Then;
import utilities.BaseClass;

public class AwardsStepDef extends BaseClass {

	@Then("validate the Awards page and go back to home page")
	public void validate_Awards_Page_and_go_back_to_home_page() throws Exception {
		System.out.println("The Awards page title is: " + driver.getTitle());
		if (!driver.getTitle().equals("Award-Winning Products - Growth Engineering")) {
			throw new Exception("Error while validating the Award link");
		}
		System.out.println("The Award link is validated");
		driver.navigate().back();
	}

}
