package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;

public class SimonMorleyPage {

	private WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();

	public SimonMorleyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// get Dr Simon Morley page title
	public String getDrSimonMorleyPageTitle() {
		return driver.getTitle();
	}

}
