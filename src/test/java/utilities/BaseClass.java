package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.GEContactUsPage;
import pages.GEHomePage;

public class BaseClass {

	public static WebDriver driver;
	protected WebDriverWait wait;
	public Select select;
	public GEContactUsPage contactUsPage;
	public GEHomePage homepage;
}