package stepDefinitions;

import io.cucumber.java.en.Then;
import utilities.BaseClass;

public class DownloadsStepDef extends BaseClass {

	@Then("validate Downloads page and go back to home page")
	public void validate_Downloads_and_go_back_to_home_page() throws Exception {
		System.out.println("The Downloads page title is: " + driver.getTitle());
		if (!driver.getTitle().equals("Resources | White Papers, Tip Sheets & Infographics - Growth Engineering")) {
			throw new Exception("Error while validating the Downloads link");
		}
		System.out.println("The Downloads link is validated");
		driver.navigate().back();
	}

}
