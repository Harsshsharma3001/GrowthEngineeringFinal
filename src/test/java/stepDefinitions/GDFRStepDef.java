package stepDefinitions;

import io.cucumber.java.en.Then;
import utilities.BaseClass;

public class GDFRStepDef extends BaseClass {

	@Then("validate the GDPR page and go back to home page")
	public void validate_GDPR_Page_and_go_back_to_home_page() throws Exception {
		System.out.println("The GDPR page title is: " + driver.getTitle());
		if (!driver.getTitle().equals("GDPR: Growth Engineering Keep Your Secret Identity Secure")) {
			throw new Exception("Error while validating the GDPR link");
		}
		System.out.println("The GDPR link is validated");
		driver.navigate().back();
	}
}
