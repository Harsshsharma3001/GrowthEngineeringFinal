package stepDefinitions;

import io.cucumber.java.en.Then;
import utilities.BaseClass;

public class SocialLearningStepDef extends BaseClass {

	@Then("validate Social Learning  and go back to home page")
	public void validate_Social_Learning_and_go_back_to_home_page() throws Exception {
		System.out.println("The SocialLearning page title is: " + driver.getTitle());
		if (!driver.getTitle().equals("Social Learning Platform - The Academy LMS")) {
			throw new Exception("Error while validating the Social Learning link");
		}
		System.out.println("The Social Learning link is validated");
		driver.navigate().back();
	}
}
