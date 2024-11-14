package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;
import utilities.WaitHelper;

public class ConsultantPage {

	 WebDriver driver;
	 WebElement idriver;
	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper = new WaitHelper(driver);
	String doctorName;

	public ConsultantPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		

	}

	// validate pratice Address field
	

	
	@FindBy(xpath = "//div[@class=\"consultant-finder__practice\"]")

	WebElement praticeAddress;
	
	public boolean isPraticeAddressDisplayed() {
		try {
			return (praticeAddress.isDisplayed());
		} catch (Exception e) {
			return false;
		}
	}

	// validate call to book tab
	@FindBy(xpath = "//div[@class=\"consultant-finder-page__enquire\"]")

	WebElement callToBookTab;
	
	public boolean isCallToBookTabDisplayed() {
		try {
			return (callToBookTab.isDisplayed());
		} catch (Exception e) {
			return false;
		}
	}
		

}
