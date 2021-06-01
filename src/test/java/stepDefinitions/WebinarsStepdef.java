package stepDefinitions;

import io.cucumber.java.en.Then;
import utilities.BaseClass;

public class WebinarsStepdef extends BaseClass {

	@Then("validate the Webinars page and go back to home page")
	public void validate_Webinars_and_go_back_to_home_page() throws Exception {
		System.out.println("The Webinars page title is: " + driver.getTitle());
		if (!driver.getTitle().equals("Upcoming Webinars | Register Today! - Growth Engineering")) {
			throw new Exception("Error while validating the Webinars link");
		}
		System.out.println("The Webinars link is validated");
		driver.navigate().back();

	}

}
