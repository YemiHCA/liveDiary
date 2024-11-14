package pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;
import utilities.WaitHelper;

public class HomePage {

	private WebDriver driver;

	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper = new WaitHelper(driver);

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}

	// //button[text()="Accept All Cookies"] ----
	// //button[@id=\"onetrust-accept-btn-handler\"]
	@FindBy(xpath = "//button[text()=\"Accept All Cookies\"]")
	private WebElement acceptAllCookies;

	public void clickAcceptAllCookies() {
		js.javaScriptClick(driver, acceptAllCookies);
	}

	@FindBy(xpath = "//a[normalize-space()='Departments']")
	private WebElement departmentsLink;

	public void clickDepartmentsLink() {

		js.javaScriptClick(driver, departmentsLink);
	}

	@FindBy(xpath = "//a[normalize-space()='Tests & Scans']")
	private WebElement tests_scansLink;

	public void clickTests_ScansLink() {

		js.javaScriptClick(driver, tests_scansLink);
	}

	@FindBy(xpath = "//a[normalize-space()='Treatments']")
	private WebElement treatmentsLink;

	public void clickTreatmentsLink() {

		js.javaScriptClick(driver, treatmentsLink);
	}

	@FindBy(xpath = "//a[normalize-space()='Consultants']")
	private WebElement consultantsLink;

	public void clickconsultantsLink() {

		js.javaScriptClick(driver, consultantsLink);
	}

	@FindBy(xpath = "//a[normalize-space()='Patient Information']")
	private WebElement patient_informationLink;

	public void clickPatient_InformationLink() {

		js.javaScriptClick(driver, patient_informationLink);
	}

	@FindBy(xpath = "//a[normalize-space()='Book an appointment']")
	private WebElement book_an_appointmentLink;

	public void clickBook_An_AppointmentLink() {

		js.javaScriptClick(driver, book_an_appointmentLink);
	}

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement searchField;

	public void inputSearchFieldTxt(String txt) {

		String mainHandle = driver.getWindowHandle();
		System.out.println(mainHandle);
		searchField.sendKeys(txt);

	}

	@FindBy(xpath = "//button[normalize-space()='Search']")
	private WebElement searchBtn;

	public void clickSearchBtn() {

		js.javaScriptClick(driver, searchBtn);
	}

	@FindBy(xpath = "//button[text()=\"Accept All Cookies\"]")
	private WebElement cookie;

	public void acceptCookie() {
		js.javaScriptClick(driver, cookie);

	}

	@FindBy(xpath = "//a[text()=\"Book an appointment\"]")
	private WebElement bookAnAppointment;

	public void clickBookAnAppointment() {
		js.javaScriptClick(driver, bookAnAppointment);

	}

	@FindBy(xpath = "//a[@class=\"btn primary offset-image-cta__btn\"]")
	private WebElement payOnlineNow;

	public void clickPayOnlineNow() {
		js.javaScriptClick(driver, payOnlineNow);
	}

	@FindBy(xpath = "//a[@href='/online-payments']//div[@class='icon-card__content']")
	private WebElement howToPayForYourTreatment;

	public void clickHowToPayForYourTreatment() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", howToPayForYourTreatment);
		// howToPayForYourTreatment.click();
	}

	// @FindBy(xpath = "//a[@class=\"icon-cards-grid__card\"]")
	// private WebElement ourServicesList;

	// this to get the number of elements and to print the elements
	public void listOurServices() {

		List<WebElement> list = driver.findElements(By.xpath("//a[@class=\"icon-cards-grid__card\"]"));
		list.size();

		for (WebElement i : list) {
			System.out.println(i.getText());
		}

		if (list.size() == 9) {

			System.out.println("list count is correct");
		} else {
			System.out.println("list count is wrong");

		}

		// ourServicesList.getText();
		// System.out.println(ourServicesList.getTagName());
		// System.out.println(ourServicesList.getSize());

	}

	@FindBy(xpath = "//span[@class='button-inline-alt__text site-header__search-text']")
	private WebElement searchFieldBtton;

	public void clickSearchField() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", searchField);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	@FindBy(xpath = "//a[@data-container-id=\"2d445720e6e04002b91fbe47cf1a335f\"]")
	private WebElement locationsLink;

	public void clickLocationsLink() {

		js.javaScriptClick(driver, locationsLink);
	}

	@FindBy(xpath = "//a[@aria-label='facebook']//*[name()='svg']")
	private WebElement facebookIcon;

	public void clickFacebookIcon() {
		js.javaScriptClick(driver, facebookIcon);

	}

	@FindBy(xpath = "//a[@aria-label='Instagram']//*[name()='svg']")
	private WebElement instagramIcon;

	public void clickInstagramIcon() {

		js.javaScriptClick(driver, instagramIcon);
	}

	@FindBy(xpath = "//a[@aria-label='linkedin']//*[name()='svg']")
	private WebElement linkedinIcon;

	public void clickLinkedinIcon() {
		js.javaScriptClick(driver, linkedinIcon);

	}

	@FindBy(xpath = "//a[@aria-label='twitter']//*[name()='svg']")
	private WebElement twitterIcon;

	public void clickTwitterIcon() {

		js.javaScriptClick(driver, twitterIcon);

	}

	@FindBy(xpath = "//a[@aria-label='youtube']//*[name()='svg']")
	private WebElement youtubeIcon;

	public void clickYoutubeIcon() {

		js.javaScriptClick(driver, youtubeIcon);

	}

	@FindBy(xpath = "//div[@data-overlay='true']//div//div//div//div//a")
	private WebElement careQualityCommissionTab;

	public void clickCareQualityCommissionTab() {

		// Get the handle
		String parentHandle = driver.getWindowHandle();
		System.out.println("Parent Handle: " + parentHandle);

		js.javaScriptClick(driver, careQualityCommissionTab);

		// Get all handles
		Set<String> handles = driver.getWindowHandles();

		// Switching between handles
		for (String handle : handles) {
			System.out.println(handle);
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
			}
		}

	}

	public String getCqcPageTitle() {

		return driver.getTitle();
	}

	@FindBy(xpath = "//p[@id=\"mission\"]")
	private WebElement cqcLogo;

	public boolean isCqcPageOpened() {
		return cqcLogo.isDisplayed();
	}

	// for Business link
	@FindBy(xpath = "//div[contains(@class,'NavigationDesktop_eyebrow-left__EWCKf')]//a[normalize-space()='For business']")

	WebElement forBusinessLink;

	public void clickForBusinessLink() {
		WaitHelper.WaitForElementToBeClickable(driver, forBusinessLink, 30);
		js.javaScriptClick(driver, forBusinessLink);
	}

	// is for business link displyaed
	public boolean IsForBusinessLinkDisplay() {
		WaitHelper.WaitForElementToBeVisible(driver, forBusinessLink, 20);

		// WaitHelper.WaitForElementToBeClickable(driver, forBusinessLink, 20);

		return forBusinessLink.isDisplayed();
	}

	// for Healthcare Professionals link
	@FindBy(xpath = "//div[contains(@class,'NavigationDesktop_eyebrow-left__EWCKf')]//a[normalize-space()='For healthcare professionals']")

	WebElement forHealthcareProfessionalsLink;

	public void clickForHealthcareProfessionalsLink() {
		WaitHelper.WaitForElementToBeClickable(driver, forHealthcareProfessionalsLink, 20);
		js.javaScriptClick(driver, forHealthcareProfessionalsLink);
	}

	// is for Healthcare Professionals Link Displayed
	public boolean IsForHealthcareProfessionalsLinkDisplay() {
		return forHealthcareProfessionalsLink.isDisplayed();
	}

	// pay my bill link
	@FindBy(xpath = "//div[contains(@class,'NavigationDesktop_eyebrow-left__EWCKf')]//a[normalize-space()='Pay my bill']")

	WebElement payMyBillLink;

	public void clickPayMyBillLink() {
		WaitHelper.WaitForElementToBeClickable(driver, payMyBillLink, 30);
		js.javaScriptClick(driver, payMyBillLink);
	}

	// is secure online payments displayed
	@FindBy(xpath = "//h1[normalize-space()='Secure Online Payments']")

	WebElement secureOnlinePayments;

	public boolean IsSecureOnlinePaymentsTextDisplay() {
		return secureOnlinePayments.isDisplayed();
	}

	// about hca uk link
	@FindBy(xpath = "//div[contains(@class,'NavigationDesktop_eyebrow-right__44FNf')]//a[normalize-space()='About HCA UK']")

	WebElement aboutHcaUKLink;

	public void clickAboutHcaUKLink() {
		WaitHelper.WaitForElementToBeClickable(driver, aboutHcaUKLink, 20);
		js.javaScriptClick(driver, aboutHcaUKLink);
	}

	// is about hca uk link displayed
	public boolean IsAboutHcaUKLinkDisplay() {
		return aboutHcaUKLink.isDisplayed();
	}

	// careers link
	@FindBy(xpath = "//div[contains(@class,'NavigationDesktop_eyebrow-right__44FNf')]//a[normalize-space()='Careers']")

	WebElement careersLink;

	public void clickCareersLink() {
		WaitHelper.WaitForElementToBeClickable(driver, careersLink, 20);
		js.javaScriptClick(driver, careersLink);
	}

	// is careers link displayed
	public boolean IsCareersLinkDisplay() {
		return careersLink.isDisplayed();

	}

	// departments link
	@FindBy(xpath = "//button[text()=\"Departments\"]")

	WebElement departmentLink;

	public void clickDepartmentLink() {
		WaitHelper.WaitForElementToBeClickable(driver, departmentLink, 20);
		js.javaScriptClick(driver, departmentLink);
	}

	// tests & scans link
	@FindBy(xpath = "//button[text()=\"Tests & scans\"]")

	WebElement testsAndScansLink;

	public void clickTestsAndScansLink() {
		WaitHelper.WaitForElementToBeClickable(driver, testsAndScansLink, 20);
		js.javaScriptClick(driver, testsAndScansLink);
	}

	// find a consultant link
	@FindBy(xpath = "//a[text()=\"Find a consultant\"]")

	WebElement findAconsultantLink;

	public void clickfindAconsultantLink() {
		WaitHelper.WaitForElementToBeClickable(driver, findAconsultantLink, 20);
		js.javaScriptClick(driver, findAconsultantLink);
	}

	// find a location link
	@FindBy(xpath = "//button[text()=\"Find a location\"]")

	WebElement findAlocationLink;

	public void clickfindAlocationLink() {
		WaitHelper.WaitForElementToBeClickable(driver, findAlocationLink, 20);
		js.javaScriptClick(driver, findAlocationLink);
	}

	// patient and visitor information link
	@FindBy(xpath = "//button[text()=\"Patient & Visitor Information\"]")

	WebElement patientAndVisitorInfoLink;

	public void clickPatientAndVisitorInfoLink() {
		WaitHelper.WaitForElementToBeClickable(driver, patientAndVisitorInfoLink, 20);
		js.javaScriptClick(driver, patientAndVisitorInfoLink);
	}

	// search icon
	@FindBy(xpath = "//li[contains(@class,'NavigationDesktop_control__uf0gK')]//div[contains(@class,'TextLink_body-medium-large__Bedet')]//button")

	WebElement searchIcon;

	public void clickSearchIcon() {
		WaitHelper.WaitForElementToBeClickable(driver, searchIcon, 20);
		js.javaScriptClick(driver, searchIcon);
	}

	// search field
	@FindBy(xpath = "//button[normalize-space()='How can we help you?']")

	WebElement homePageSearchField;

	public void sendKeyToSearchField() {
		WaitHelper.WaitForElementToBeClickable(driver, homePageSearchField, 20);
		js.javaScriptClick(driver, homePageSearchField);
	}

	// book an appointment tab
	@FindBy(xpath = "//div[@class=\"Button_button__ysJQs Button_large__61Vvo Button_full__5nt_j  \"]//button")

	WebElement bookAnAppointmentTab;

	public void clickBookAnAppointmentTab() {
		WaitHelper.WaitForElementToBeClickable(driver, bookAnAppointmentTab, 20);
		js.javaScriptClick(driver, bookAnAppointmentTab);
	}

	// call us today tab
	@FindBy(xpath = "//div[@class=\"Button_button__ysJQs Button_large__61Vvo Button_outline__GaSB_  \"]//div[text()=\"Call us  today \"]")

	WebElement callUsTodayTab;

	public void clickCallUsTodayTab() {
		WaitHelper.WaitForElementToBeClickable(driver, callUsTodayTab, 20);
		js.javaScriptClick(driver, callUsTodayTab);
	}
	
	
}
