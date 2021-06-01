package stepDefinitions;

import io.cucumber.java.en.Then;
import utilities.BaseClass;

public class BlogStepdef extends BaseClass {

	@Then("validate Blog and go back to home page")
	public void validate_Blog_and_go_back_to_home_page() throws Exception {
		System.out.println("The Blog page title is: " + driver.getTitle());
		if (!driver.getTitle().equals("Our Blog - Growth Engineering | Engagement Experts")) {
			throw new Exception("Error while validating the Blog link");
		}
		System.out.println("The Blog link is validated");
		driver.navigate().back();
	}

}
