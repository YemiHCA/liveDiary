package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;
import utilities.WaitHelper;

public class LiveDiaryConsultantsPage {

	private WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper = new WaitHelper(driver);

	public LiveDiaryConsultantsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}

	// click search by consultant name link
	@FindBy(xpath = "//button[@class=\"consultant-finder__link-cta consultant-finder__link-cta--blue consultant-finder__link-cta--medium\"]")
	WebElement searchByConsultantName;

	@SuppressWarnings("static-access")
	public void clickSearchByConsultantName() {
		waitHelper.WaitForElementToBeClickable(driver, searchByConsultantName, 30);

		js.javaScriptClick(driver, searchByConsultantName);
	}

	// enter consultant name
	@FindBy(xpath = "//input[@placeholder=\"Type in a consultant name\"]")
	WebElement consultantNameField;

	@SuppressWarnings("static-access")
	public void enterConsultantName(String consultantName) {
		waitHelper.WaitForElementToBeClickable(driver, consultantNameField, 30);

		consultantNameField.sendKeys(consultantName);

	}

	// search consultant next button
	@FindBy(xpath = "//a[@class=\"consultant-finder__btn consultant-finder__btn--pad \"]")
	WebElement searchConsultantNextTab;

	@SuppressWarnings("static-access")
	public void clickSearchConsultantNextTab() {
		waitHelper.WaitForElementToBeClickable(driver, searchConsultantNextTab, 30);

		js.javaScriptClick(driver, searchConsultantNextTab);

	}

	// consultant list drop down
	@FindBy(xpath = "//div[@class=\"consultant-finder__search-tool-results--b-variant__container-suggestion\"]//li[1]")
	WebElement consultantFromDrpDwn;

	@SuppressWarnings("static-access")
	public void clickConsultantFromDrpDwn() {

		waitHelper.WaitForElementToBeClickable(driver, consultantFromDrpDwn, 60);

		js.javaScriptClick(driver, consultantFromDrpDwn);

	}

	@FindBy(xpath = "//div[contains(@class,'SidePanel_btns__OjPfn')]//span[contains(text(),'Book online')]")

	WebElement bookOnlineTab;

	@SuppressWarnings("static-access")
	public void clickBookOnlineTab() {
		waitHelper.WaitForElementToBeClickable(driver, bookOnlineTab, 10);
		js.javaScriptClick(driver, bookOnlineTab);

	}

	// booking location tab
	@FindBy(xpath = "//div[@data-parent=\"parent\"]")
	WebElement bookingLocationTab;

	@SuppressWarnings("static-access")
	public void clickBookingLocationTab() {
		waitHelper.WaitForElementToBeClickable(driver, bookingLocationTab, 30);

		js.javaScriptClick(driver, bookingLocationTab);

	}

	// initial appt tab
	@FindBy(xpath = "//h3[normalize-space()='Initial appointment']")
	WebElement initialApptTab;

	@SuppressWarnings("static-access")
	public void clickInitialApptTab() {
		waitHelper.WaitForElementToBeClickable(driver, initialApptTab, 30);

		js.javaScriptClick(driver, initialApptTab);
		
		System.out.println("This is INITIAL APPOINTMENT");

	}

	// follow-up appt tab
	@FindBy(xpath = "//h3[normalize-space()='Follow on appointment']")
	WebElement followUpApptTab;

	@SuppressWarnings("static-access")
	public void clickFollowUpApptTab() {
		waitHelper.WaitForElementToBeClickable(driver, followUpApptTab, 60);

		js.javaScriptClick(driver, followUpApptTab);
		System.out.println("This is FOLLOW-UP APPOINTMENT");


	}

	// appt type next tab
	@FindBy(xpath = "//span[normalize-space()='Next']")
	WebElement apptTypeNextTab;

	@SuppressWarnings("static-access")
	public void clickApptTypeNextTab() {
		waitHelper.WaitForElementToBeClickable(driver, apptTypeNextTab, 30);

		js.javaScriptClick(driver, apptTypeNextTab);

	}

	// weekdays header
	@FindBy(xpath = "//div[@class=\"SlotsCalendar_header__c8yQQ\"]")
	WebElement weekdaysHeader;

	@SuppressWarnings("static-access")
	public boolean isWeekdaysHeaderDisplayed() {
		waitHelper.WaitForElementToBeClickable(driver, weekdaysHeader, 60);
		return weekdaysHeader.isDisplayed();
	}

	// click accept all cookies tab
	@FindBy(xpath = "//button[contains(text(),\"Accept All Cookies\")]")
	WebElement acceptAllCookiesTab;

	@SuppressWarnings("static-access")
	public void clickAcceptAllCookiesTab() {

		waitHelper.WaitForElementToBeClickable(driver, acceptAllCookiesTab, 10);

		js.javaScriptClick(driver, acceptAllCookiesTab);

	}

	// click book online tab
	@FindBy(xpath = "//div[contains(@class,'SidePanel_btns__OjPfn')]//span[contains(text(),'Book online')]")
	WebElement bokOnlineTab;

	@SuppressWarnings("static-access")
	public boolean isbokOnlineTabDisplayed() {
		waitHelper.WaitForElementToBeVisible(driver, bokOnlineTab, 10);

		return bokOnlineTab.isDisplayed();
	}

	// click back to home page
	@FindBy(xpath = "//a[@class=\"consultant-finder__link-cta\"]")
	WebElement backToHomePage;

	public boolean isbackToHomePageDisplayed() {
		return backToHomePage.isDisplayed();
	}

	// click accept T & C
	@FindBy(xpath = "//span[normalize-space()='Accept']")
	WebElement acceptTCpage;

	@SuppressWarnings("static-access")
	public void clickAcceptTCpageTab() {
		waitHelper.WaitForElementToBeClickable(driver, acceptTCpage, 60);

		js.javaScriptClick(driver, acceptTCpage);

	}

	// click location next tab
	@FindBy(xpath = "//span[normalize-space()='Next']")
	WebElement locationNextTab;

	@SuppressWarnings("static-access")
	public void clickLocationNextTab() {
		waitHelper.WaitForElementToBeClickable(driver, locationNextTab, 120);

		js.javaScriptClick(driver, locationNextTab);

	}

	// click select location tab
	@FindBy(xpath = "//div[@class=\"LocationCard_main___t29V\"]")

	WebElement selectLocationTab;

	@SuppressWarnings("static-access")
	public void clickSelectLocationTab() {
		waitHelper.WaitForElementToBeVisible(driver, selectLocationTab, 30);

		js.javaScriptClick(driver, selectLocationTab);

	}
	
	// click appointment link
	@FindBy(xpath = "//span[text()=\"Appointment\"]")

	WebElement appointmentLink;

	@SuppressWarnings("static-access")
	public void clickAppointmentLink() {
		waitHelper.WaitForElementToBeVisible(driver, appointmentLink, 120);

		js.javaScriptClick(driver, appointmentLink);

	}
	
	

}
