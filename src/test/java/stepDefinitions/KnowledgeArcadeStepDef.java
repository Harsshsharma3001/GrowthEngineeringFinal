package stepDefinitions;

import io.cucumber.java.en.Then;
import utilities.BaseClass;

public class KnowledgeArcadeStepDef extends BaseClass {

	@Then("validate Knowledge Arcade page and go back to home page")
	public void validate_the_page_and_go_back_to_home_page() throws Exception {
		System.out.println("The Knowlede Arcade page title is: " + driver.getTitle());
		if (!driver.getTitle().equals("The Knowlede Arcade - Growth Engineering")) {
			throw new Exception("Error while validating the The Knowlede Arcade link");
		}
		System.out.println("The Knowlede Arcade link is validated");
		driver.navigate().back();
	}
}
