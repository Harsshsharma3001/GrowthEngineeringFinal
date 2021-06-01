package stepDefinitions;

import io.cucumber.java.en.When;
import utilities.BaseClass;

public class AcademyLMSStepDef extends BaseClass {

	@When("validate the Academy LMS page and go back to home page")
	public void validate_Academy_LMS_page_and_go_back_to_home_page() throws Exception {
		System.out.println("The The Academy LMS page title is: " + driver.getTitle());
		if (!driver.getTitle().equals("The #1 Learning Management System for Employee Engagement")) {
			throw new Exception("Error while validating The Academy LMS link");
		}
		System.out.println("The Academy LMS page link is validated");
		driver.navigate().back();
	}

}