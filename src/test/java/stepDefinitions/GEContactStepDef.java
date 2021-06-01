package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GEContactUsPage;
import utilities.BaseClass;

public class GEContactStepDef extends BaseClass {

	@And("I enter firstname as {string}")
	public void correctfirstname(String firstname) throws InterruptedException {
		contactUsPage = new GEContactUsPage(driver);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(contactUsPage.FirstName));
		wait.until(ExpectedConditions.elementToBeClickable(contactUsPage.FirstName));
		contactUsPage.FirstName.sendKeys(firstname);
	}

	@And("I enter lastname as {string}")
	public void correctlastname(String lastname) {
		contactUsPage = new GEContactUsPage(driver);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(contactUsPage.Lastname));
		contactUsPage.Lastname.sendKeys(lastname);
	}

	@And("I enter email as {string}")
	public void correctemail(String email) {
		contactUsPage = new GEContactUsPage(driver);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(contactUsPage.email));
		contactUsPage.email.sendKeys(email);
	}

	@And("I enter telephone as {string}")
	public void correcttelephone(String telephone) {
		contactUsPage = new GEContactUsPage(driver);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(contactUsPage.Telephone));
		contactUsPage.Telephone.sendKeys(telephone);
	}

	@And("I enter companyname as {string}")
	public void correctcompanyname(String companyname) {
		contactUsPage = new GEContactUsPage(driver);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(contactUsPage.Company));
		contactUsPage.Company.sendKeys(companyname);
	}

	@And("I select number of learner as {string}")
	public void correctLearner(String learner) throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='" + learner + "']/..")).click();
	}

	@When("I select country as {string}")
	public void i_select_country_as(String country) {
		contactUsPage = new GEContactUsPage(driver);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(contactUsPage.Company));
		select = new Select(contactUsPage.Country);
		select.selectByVisibleText(country);
	}

	@And("I select the role as {string}")
	public void role(String role) {
		contactUsPage = new GEContactUsPage(driver);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(contactUsPage.BestDescribeRole));
		select = new Select(contactUsPage.BestDescribeRole);
		select.selectByVisibleText(role);

	}

	@And("I select the purpose of {string}")
	public void enquiry(String enquiry) {
		contactUsPage = new GEContactUsPage(driver);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(contactUsPage.purposeofEnquiry));
		select = new Select(contactUsPage.purposeofEnquiry);
		select.selectByVisibleText(enquiry);

	}

	@And("I click on terms and conditions")
	public void clickterms() {
		contactUsPage = new GEContactUsPage(driver);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(contactUsPage.conditioncheckbox));
		contactUsPage.conditioncheckbox.click();
	}

	@When("I click on submit button")
	public void clicksubmit() {
		contactUsPage = new GEContactUsPage(driver);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(contactUsPage.submitbutton));
		contactUsPage.submitbutton.click();
	}

	@When("I try to move to some other field")
	public void i_try_to_move_to_some_other_field() {
		contactUsPage = new GEContactUsPage(driver);
		contactUsPage.Otherplace.click();
	}

	@Then("I should be getting the telephone {string}")
	public void i_should_be_getting_the_telephone(String errormsg) throws Exception {
		contactUsPage = new GEContactUsPage(driver);
		if (!contactUsPage.telephoneErrorMessage1.getText().equals(errormsg)) {
			throw new Exception("Error while validating the error message of Telephone");
		}
		System.out.println("Error message validation succesful");
	}

	@Then("I should be getting the email {string}")
	public void i_should_be_getting_the_email(String errormsg) throws Exception {
		contactUsPage = new GEContactUsPage(driver);
		if (!contactUsPage.emailmessage.getText().equals(errormsg)) {
			throw new Exception("Error while validating the error message of Email");
		}
		System.out.println("Error message validation succesful");
	}

	@Then("I should be able to submit the form")
	public void i_should_be_able_to_submit_the_form() {
	}

	@Then("I should not be able to submit the form and validate the error messages")
	public void validatefieldmessage() throws Exception {
		String errormessage = "Please complete this required field.";
		String dropdownerrormessage = "Please select an option from the dropdown menu.";
		contactUsPage = new GEContactUsPage(driver);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(contactUsPage.submitbutton));
		String firstnamevalidation = contactUsPage.firstnamemessage.getText();

		if (!firstnamevalidation.equals(errormessage)) {
			throw new Exception("Firstname field error message is not validated");
		}
		System.out.println("firstname field error message is validated ");

		String lastnamevalidation = contactUsPage.lastnamemessage.getText();
		if (lastnamevalidation.equals(errormessage)) {

			System.out.println("last name  field error message is validated");
		} else {
			System.out.println("last name field error message is not validated");
		}

		String emailvalidation = contactUsPage.emailmessage.getText();
		if (emailvalidation.equals(errormessage)) {

			System.out.println("email field error message is validated");
		} else {
			System.out.println("email field error message is not validated");
		}

		String phonevalidation = contactUsPage.phonemessage.getText();
		if (phonevalidation.equals(errormessage)) {

			System.out.println("telephone field error message is validated");
		} else {
			System.out.println("telephone field error message is not validated");
		}
		String companyvalidation = contactUsPage.companymessage.getText();
		if (companyvalidation.equals(errormessage)) {

			System.out.println("Company field error message is validated");
		} else {
			System.out.println("Company field error message is not validated");
		}

		String Termscondition = contactUsPage.Termsconditionsmessage.getText();
		if (Termscondition.equals(errormessage)) {
			System.out.println("Terms and condition error message is validated");
		} else {
			System.out.println("terms and condition error message is not validated");
		}

		String Countryvalidation = contactUsPage.countrymessage.getText();
		if (Countryvalidation.equals(dropdownerrormessage)) {
			System.out.println("Country field error message is validated");

		} else {
			System.out.println("Country field error message is not validated");
		}

		String rolevalidation = contactUsPage.roledescriptionmessage.getText();
		if (rolevalidation.equals(dropdownerrormessage)) {
			System.out.println("Role description field error message is validated");

		} else {
			System.out.println("Role description field error message is not validated");
		}

		String purposevalidation = contactUsPage.purposemessage.getText();
		if (purposevalidation.equals(dropdownerrormessage)) {
			System.out.println("Purpose field error message is validated");

		} else {
			System.out.println("Purpose field error message is not validated");
		}

	}
}
