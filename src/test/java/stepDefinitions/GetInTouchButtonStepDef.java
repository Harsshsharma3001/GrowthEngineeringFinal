package stepDefinitions;

import io.cucumber.java.en.Then;
import utilities.BaseClass;

public class GetInTouchButtonStepDef extends BaseClass {

	@Then("validate Our Get In Touch main page and go back to home page")
	public void validate_Our_Get_In_Touch_main_page_and_go_back_to_home_page() throws Exception {
		System.out.println("The Get In Touch main page title is: " + driver.getTitle());
		if (!driver.getTitle().equals("Get in Touch | Growth Engineering - The Learning Engagement Experts")) {
			throw new Exception("Error while validating the et In Touch main page link");
		}
		System.out.println("The Get In Touch main page link is validated");
		driver.navigate().back();
	}

}
