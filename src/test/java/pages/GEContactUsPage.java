
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GEContactUsPage {

	@FindBy(xpath = "//input[contains(@id,'firstname')]")
	public WebElement FirstName;

	@FindBy(xpath = "//input[contains(@id,'lastname')]")
	public WebElement Lastname;

	@FindBy(xpath = "//input[contains(@id,'email')]")
	public WebElement email;

	@FindBy(xpath = " //input[contains(@id,'phone')]")
	public WebElement Telephone;

	@FindBy(xpath = " //input[contains(@id,'company')]")
	public WebElement Company;

	@FindBy(name = "country_")
	public WebElement Country;

	@FindBy(name = "role_description")
	public WebElement BestDescribeRole;

	@FindBy(name = "what_is_the_purpose_of_your_enquiry_")
	public WebElement purposeofEnquiry;

	@FindBy(xpath = "//input[@type='submit']")
	public WebElement submitbutton;

	@FindBy(xpath = "//input[contains(@id, 'i_have_read_and_understand_growth_engineering_s')]")
	public WebElement conditioncheckbox;

	@FindBy(xpath = "//label[contains(@data-reactid,'firstname') and @class ='hs-error-msg']")
	public WebElement firstnamemessage;

	@FindBy(xpath = "//label[contains(@data-reactid,'lastname') and @class ='hs-error-msg']")
	public WebElement lastnamemessage;

	@FindBy(xpath = "//label[contains(@data-reactid,'email') and @class ='hs-error-msg']")
	public WebElement emailmessage;

	@FindBy(xpath = "//label[contains(@data-reactid,'phone') and @class ='hs-error-msg']")
	public WebElement phonemessage;

	@FindBy(xpath = "//label[contains(@data-reactid,'company') and @class ='hs-error-msg']")
	public WebElement companymessage;

	@FindBy(xpath = "//label[contains(@data-reactid,'country') and @class ='hs-error-msg']")
	public WebElement countrymessage;

	@FindBy(xpath = "//label[contains(@data-reactid,'role_description') and @class ='hs-error-msg']")
	public WebElement roledescriptionmessage;

	@FindBy(xpath = "//label[contains(@data-reactid,'purpose_of_your_enquiry') and @class ='hs-error-msg']")
	public WebElement purposemessage;

	@FindBy(xpath = "//label[contains(@data-reactid,'privacy_poolicy') and @class ='hs-error-msg']")
	public WebElement Termsconditionsmessage;

	@FindBy(xpath = "//span[text()='Telephone']")
	public WebElement Otherplace;

	@FindBy(xpath = "//*[@name='phone']/../../ul//label[1]")
	public WebElement telephoneErrorMessage1;

	@FindBy(xpath = "//*[@name='phone']/../../ul//label[2]")
	public WebElement telephoneErrorMessage2;

	public GEContactUsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}