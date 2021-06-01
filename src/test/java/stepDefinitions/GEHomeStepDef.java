package stepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GEHomePage;
import utilities.BaseClass;
import utilities.ReadingProperties;

public class GEHomeStepDef extends BaseClass {

	@Before
	public void beforemethod() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		ReadingProperties readprop = new ReadingProperties();
		readprop.readingprop();

		driver.get(readprop.profileurl);
	}

	@After
	public void aftermethod() {
		driver.close();
	}

	@Given("I am in Growthengg Homepage and hover on our products")
	public void i_am_in_growthengg_homepage_and_hover_on_our_products() throws Exception {
		GEHomePage geHomePage = new GEHomePage(driver);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(geHomePage.ourProducts));
		Actions action = new Actions(driver);
		action.moveToElement(geHomePage.ourProducts).build().perform();
	}

	@Given("I am in Growthengg Homepage and click on our products")
	public void i_am_in_growthengg_homepage_and_hover_on_our_products2() throws Exception {
		GEHomePage geHomePage = new GEHomePage(driver);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(geHomePage.ourProducts));
		geHomePage.ourProducts.click();
	}

	@When("I click on The Knowledge Arcade link")
	public void i_click_on_the_knowledge_arcade_link() {
		GEHomePage geHomePage = new GEHomePage(driver);
		geHomePage.ourProducts.click();
		geHomePage.KnowledgeArcade.click();
	}

	@When("I click on Gene Authoring Tool link")
	public void i_click_on_gene_a_uthoring_tool_link() {
		GEHomePage geHomePage = new GEHomePage(driver);
		geHomePage.GenieAuthoringTool.click();
	}

	@When("I click on The Academy LMS link")
	public void i_click_on_the_academy_lms_link() {
		GEHomePage geHomePage = new GEHomePage(driver);
		geHomePage.AcademyLMS.click();
	}

	@Given("I am in Growthengg Homepage and hover on our approach")
	public void i_am_in_growthengg_homepage_and_hover_on_our_approach() {
		homepage = new GEHomePage(driver);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(homepage.OurApproach));
		Actions actions = new Actions(driver);
		actions.moveToElement(homepage.OurApproach).build().perform();

	}

	@Given("I am in Growthengg Homepage and click on our approach")
	public void i_am_in_growthengg_homepage_and_click_on_our_approach() {
		homepage = new GEHomePage(driver);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(homepage.OurApproach));
		homepage.OurApproach.click();

	}

	@When("I click on Brain Science link")
	public void i_click_on_Brain_Science_link() {
		homepage = new GEHomePage(driver);
		homepage.BrianScience.click();
	}

	@When("I click on Social Learning Tool link")
	public void i_click_on_Social_Learning_Science_link() {
		homepage = new GEHomePage(driver);
		homepage.SocialLearning.click();

	}

	@When("I click on Gamefication link")
	public void i_click_on_gamefication_link() {

		homepage = new GEHomePage(driver);
		homepage.Gamification.click();
	}

	@When("I click on Personalisation link")
	public void i_click_on_personalisation_link() {
		homepage = new GEHomePage(driver);
		homepage.Personalisation.click();

	}

	@Given("I am in Growthengg Homepage and click on Resources")
	public void i_am_in_growthengg_homepage_and_click_on_Resources() {
		homepage = new GEHomePage(driver);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(homepage.Resources));
		homepage.Resources.click();

	}

	@When("I click on Downloads link")
	public void i_click_on_downloads_link() {
		homepage = new GEHomePage(driver);
		homepage.Downloads.click();
	}

	@When("I click on Blog link")
	public void i_click_on_blog_link() {
		homepage = new GEHomePage(driver);
		homepage.Blog.click();
	}

	@When("I click on Webinars link")
	public void i_click_on_Webinars_link() {
		homepage = new GEHomePage(driver);
		homepage.Webinars.click();

	}

	@When("I click on Free eLearning Content link")
	public void i_click_on_Free_eLearning_Content_link() {
		homepage = new GEHomePage(driver);
		homepage.FreeeLearningContent.click();

	}

	@Given("I am in Growthengg Homepage and click on AboutUs")
	public void i_am_in_growthengg_homepage_and_click_on_AboutUs() {
		homepage = new GEHomePage(driver);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(homepage.AboutUs));
		homepage.AboutUs.click();

	}

	@When("I click on Our Story link")
	public void i_click_on_Our_Story_link() {
		homepage = new GEHomePage(driver);
		homepage.OurStory.click();
	}

	@When("I click on Our Clients link")
	public void i_click_on_Our_Clients_link() {
		homepage = new GEHomePage(driver);
		homepage.OurClients.click();
	}

	@When("I click on Awards link")
	public void i_click_on_Awards_link() {
		homepage = new GEHomePage(driver);
		homepage.Awards.click();
	}

	@When("I click on Partners link")
	public void i_click_on_Partners_Content_link() {
		homepage = new GEHomePage(driver);
		homepage.Partners.click();
	}

	@When("I click on GDPR link")
	public void i_click_on_GDPR_link() {
		homepage = new GEHomePage(driver);
		homepage.GDPR.click();
	}

	@When("I click on Get In Touch link")
	public void i_click_on_Get_In_Touch_link() {
		homepage = new GEHomePage(driver);
		homepage.GetinTouch.click();
	}

	@Given("I am in Growthengg Homepage and click on GetinTouch")
	public void i_am_in_growthengg_homepage_and_click_on_GetinTouch() {
		homepage = new GEHomePage(driver);
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(homepage.AboutUs));
		homepage.GetinTouchButton.click();

	}

	@Given("I am in Growthengg Homepage and click on ContactUs link")
	public void clickingcontactlink() {
		homepage = new GEHomePage(driver);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", homepage.contactUs);

		homepage.contactUs.click();

	}

}