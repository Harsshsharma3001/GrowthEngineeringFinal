package stepDefinitions;

import io.cucumber.java.en.Then;
import utilities.BaseClass;

public class GetInTouchStepDef extends BaseClass {

	@Then("validate the Get In Touch page and go back to home page")
	public void validate_Get_In_Touch_and_go_back_to_home_page() throws Exception {
		System.out.println("The Get In Touch page title is: " + driver.getTitle());
		if (!driver.getTitle().equals("Get in Touch | Growth Engineering - The Learning Engagement Experts")) {
			throw new Exception("Error while validating the Get In Touch link");
		}
		System.out.println("The Get In Touch link is validated");
		driver.navigate().back();

	}

}
