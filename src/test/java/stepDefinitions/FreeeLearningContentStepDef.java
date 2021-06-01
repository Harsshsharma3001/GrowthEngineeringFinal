package stepDefinitions;

import io.cucumber.java.en.When;
import utilities.BaseClass;

public class FreeeLearningContentStepDef extends BaseClass {

	@When("validate the Free eLearning Content page and go back to home page")
	public void validate_FreeeLearningContent_and_go_back_to_home_page() throws Exception {
		System.out.println("The FreeeLearningContent page title is: " + driver.getTitle());
		if (!driver.getTitle().equals("Free eLearning Content - Growth Engineering")) {
			throw new Exception("Error while validating the FreeeLearningContent link");
		}
		System.out.println("The FreeeLearningContent link is validated");
		driver.navigate().back();
	}
}
