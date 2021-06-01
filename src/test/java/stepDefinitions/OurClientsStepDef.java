package stepDefinitions;

import io.cucumber.java.en.Then;
import utilities.BaseClass;

public class OurClientsStepDef extends BaseClass {

	@Then("validate Our Clients and go back to home page")
	public void validate_Our_Clients_and_go_back_to_home_page() throws Exception {
		System.out.println("The Our Clients page title is: " + driver.getTitle());
		if (!driver.getTitle().equals("Our Clients | Growth Engineering - Engaging Online Learning Experts")) {
			throw new Exception("Error while validating the Our Clients link");
		}
		System.out.println("The Our Clients link is validated");
		driver.navigate().back();
	}
}
