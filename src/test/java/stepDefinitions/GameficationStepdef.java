package stepDefinitions;

import io.cucumber.java.en.Then;
import utilities.BaseClass;

public class GameficationStepdef extends BaseClass {

	@Then("validate the Gamefication page and go back to home page")
	public void validate_gamefication_and_go_back_to_home_page() throws Exception {
		System.out.println("The gamefication page title is: " + driver.getTitle());
		if (!driver.getTitle().equals("Gamification in Online Learning - The #1 Gamified LMS!")) {
			throw new Exception("Error while validating the Gamefication link");
		}
		System.out.println("The Gamefication link is validated");
		driver.navigate().back();
	}
}
