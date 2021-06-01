package stepDefinitions;

import io.cucumber.java.en.Then;
import utilities.BaseClass;

public class GenieAuthoringToolStepDef extends BaseClass {

	@Then("validate Gene Authoring page and go back to home page")
	public void validate_gene_a_uthoring_page_and_go_back_to_home_page() throws Exception {
		System.out.println("The Gene Authoring page title is: " + driver.getTitle());
		if (!driver.getTitle().equals("Genie - A Collaborative Content Authoring Tool - Growth Engineering")) {
			throw new Exception("Error while validating the Gene Authoring link");
		}
		System.out.println("The Gene Authoring page link is validated");
		driver.navigate().back();
	}
}
