
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GEHomePage {

	@FindBy(xpath = "(//a[text()=\"Our Products\"])[1]")
	public WebElement ourProducts;

	@FindBy(xpath = "(//a[text()='The Knowledge Arcade'])[1]")
	public WebElement KnowledgeArcade;

	@FindBy(xpath = "//span[text()='Contact Us']")
	public WebElement contactUs;

	@FindBy(xpath = "(//a[text()='Genie Authoring Tool'])[1]")
	public WebElement GenieAuthoringTool;

	@FindBy(xpath = "(//a[text()='The Academy LMS'])[1]")
	public WebElement AcademyLMS;

	@FindBy(xpath = "(//a[text()='Our Approach'])[1]")
	public WebElement OurApproach;

	@FindBy(xpath = "(//a[text()='Brain Science'])[1]")
	public WebElement BrianScience;

	@FindBy(xpath = "(//a[text()='Social Learning'])[1]")
	public WebElement SocialLearning;

	@FindBy(xpath = "(//a[text()='Gamification'])[1]")
	public WebElement Gamification;

	@FindBy(xpath = "(//a[text()='Personalisation'])[1]")
	public WebElement Personalisation;

	@FindBy(xpath = "(//a[text()='Resources'])[1]")
	public WebElement Resources;

	@FindBy(xpath = "(//a[text()='Downloads'])[1]")
	public WebElement Downloads;

	@FindBy(xpath = "(//a[text()='Blog'])[1]")
	public WebElement Blog;

	@FindBy(xpath = "(//a[text()='Webinars'])[1]")
	public WebElement Webinars;

	@FindBy(xpath = "(//a[text()='Free eLearning Content'])[1]")
	public WebElement FreeeLearningContent;

	@FindBy(xpath = "(//a[text()='About Us'])[1]")
	public WebElement AboutUs;

	@FindBy(xpath = "(//a[text()='Our Story'])[1]")
	public WebElement OurStory;

	@FindBy(xpath = "(//a[text()='Our Clients'])[1]")
	public WebElement OurClients;

	@FindBy(xpath = "(//a[text()='Awards'])[1]")
	public WebElement Awards;

	@FindBy(xpath = "(//a[text()='Partners'])[1]")
	public WebElement Partners;

	@FindBy(xpath = "(//a[text()='GDPR'])[1]")
	public WebElement GDPR;

	@FindBy(xpath = "(//a[text()='Get in Touch'])[1]")
	public WebElement GetinTouch;

	@FindBy(xpath = "(//span[contains(@class,'elementor-button-text')])")
	public WebElement GetinTouchButton;

	public GEHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}