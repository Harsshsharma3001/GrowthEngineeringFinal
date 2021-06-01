package stepDefinitions;

import io.cucumber.java.en.Then;
import utilities.BaseClass;

public class OurStoryStepDef extends BaseClass {
	@Then("validate Our Story page and go back to home page")
	public void validate_Our_Story_and_go_back_to_home_page() throws Exception {
		System.out.println("The Our Story page title is: " + driver.getTitle());
		if (!driver.getTitle().equals("About Us | Online Learning Superheroes - Growth Engineering")) {
			throw new Exception("Error while validating the Our Story link");
		}
		System.out.println("The Our Story link is validated");
		driver.navigate().back();

	}

}
