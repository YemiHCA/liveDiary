package pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;
import utilities.WaitHelper;

public class CmaPage {

	private WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper = new WaitHelper(driver);
	String doctorName;

	public CmaPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}

	// Validate CMA statement
	@FindBy(xpath = "//div[@class=\"typography about__information\"]//p[4]")
	boolean cmaStatement;

	public boolean isCmaStatementDisplayed() {
		return cmaStatement;

	}

	public void getHandles() {
		// 7

		// Get the handle
		String parentHandle = driver.getWindowHandle();
		// System.out.println("Parent Handle: " + parentHandle);
		// Get all handles
		Set<String> handles = driver.getWindowHandles();

		// Switching between handles
		for (String handle : handles) {
			// System.out.println(handle);
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
			}
		}
	}

	// @FindBy(xpath = "//h1[@class=\"heading-3\"]")
	// WebElement doctorsName;
	//
	// public String getText() {
	// return doctorsName.getText();
	//
	// }
	//
	@FindBy(xpath = "//a[@target=\"_blank\"]")
	WebElement hereLink3;

	@SuppressWarnings("static-access")
	public void clickHereLink3() throws InterruptedException {
		// 6
		waitHelper.WaitForElementToBeClickable(driver, hereLink3, 20);
		hereLink3.click();
	}

	// //
	// @FindBy(xpath = "//h1[@class=\"specialist-intro-info__name\"]")
	// WebElement specialistName;
	//
	// @SuppressWarnings("static-access")
	// public String getSpecialistName() {
	// waitHelper.WaitForElementToBeClickable(driver, specialistName, 20);
	//
	// return specialistName.getText();
	//
	// }

	// get page title
	public String getPageTitle() {
		return driver.getTitle();
	}

	// search for consultant tab
	@FindBy(xpath = "//button[normalize-space()='Search for a consultant']")
	WebElement searchForConsultantTab;

	@SuppressWarnings("static-access")
	public void clickSearchForConsultantTab() throws InterruptedException {
		// 2
		waitHelper.WaitForElementToBeClickable(driver, searchForConsultantTab, 20);
		js.javaScriptClick(driver, searchForConsultantTab);

	}

	// click next tab
	@FindBy(xpath = "//span[normalize-space()='Next']")
	WebElement nextTab;

	@SuppressWarnings("static-access")
	public void clickNextTab() {
		// 5
		waitHelper.WaitForElementToBeClickable(driver, nextTab, 20);
		js.javaScriptClick(driver, nextTab);

	}

	// click here link 1
	// @FindBy(xpath = "//a[contains(@href,\"\")and contains(.,'here')]")
	// @FindBy(xpath =
	// "//a[starts-with(@href,'https://www.hcahealthcare.co.uk/cma-disclosure?')]")
	@FindBy(xpath = "//a[normalize-space()='here']")

	WebElement hereLink;

	@SuppressWarnings("static-access")
	public void clickHereLink() {
		waitHelper.WaitForElementToBePresent(driver, hereLink, 20);
		js.javaScriptClick(driver, hereLink);

	}

	// click here link 2
	// @FindBy(xpath = "//a[contains(@target,\"_blank\") and
	// contains(.,\"here\")]")
	@FindBy(xpath = "//strong[normalize-space()='here']")
	WebElement hereLnk;

	@SuppressWarnings("static-access")
	public void clickHereLnk() {
		waitHelper.WaitForElementToBePresent(driver, hereLnk, 20);
		js.javaScriptClick(driver, hereLnk);

	}

	// enter consultant name
	@FindBy(xpath = "//input[@type=\"text\"][@placeholder=\"Type in a consultant name\"]")

	WebElement consultantNameField;

	@SuppressWarnings("static-access")
	public void enterConsultantName(String dr) {
		// 3
		waitHelper.WaitForElementToBePresent(driver, consultantNameField, 20);
		consultantNameField.sendKeys(dr);

	}

	@FindBy(xpath = "//li[@aria-label=\"option\"][1]")
	WebElement consultantDrpDown;

	@SuppressWarnings("static-access")
	public void clickConsultantDrpDown() {
		// waitHelper.WaitForElementToBePresent(driver, consultantDrpDown, 60);
		// 4
		waitHelper.WaitForElementToBeClickable(driver, consultantDrpDown, 10);

		js.javaScriptClick(driver, consultantDrpDown);
	}

	// @FindBy(xpath =
	// "//div[@class=\"consultant-finder__search-tool-results--b-variant__container-suggestion\"]//li[1]")
	// WebElement firstItemOnList;
	//
	// @SuppressWarnings("static-access")
	// public void clickFirstItemOnList(){
	// waitHelper.WaitForElementToBePresent(driver, firstItemOnList, 20);
	//
	// js.javaScriptClick(driver, firstItemOnList);
	//
	// }
	//
	//
	// @FindBy(xpath =
	// "//img[@src=\"https://www.hcahealthcare.co.uk/-/media/Finder/images/Finder%20Step%202%20Card%20Image\"]")
	// WebElement clickAway;
	//
	// public void clickAway(){
	//
	// js.javaScriptClick(driver, clickAway);
	// }

	@FindBy(xpath = "//div[@class=\"consultant-finder-page__about\"]//p[4]")
	WebElement herePara;

	// @FindBy(xpath =
	// "//a[starts-with(@href,'https://www.hcahealthcare.co.uk/cma-disclosure?')]")
	// WebElement herelnk;

	// @FindBy(xpath="//a[contains(@target,\"_blank\") and
	// contains(.,\"here\")]")
	// WebElement herelnk;
	//
	// @FindBy(xpath =
	// "//button[contains(@class,\"consultant-finder__link-cta\") and contains
	// (.,\"Read more\")]")
	// WebElement readMoreLinkEnquireNowPg;
	//
	// @FindBy(xpath = "//button[text()=\"Read more\"]")
	// WebElement readMoreLink2;
	//
	// @FindBy(xpath = "//div[@class=\"consultant-finder-page__main\"]")
	// WebElement mainPage;
	//
	// @SuppressWarnings({ "static-access", "restriction" })
	// public void IsReadMoreLinkEnquireNowPgVisible() throws
	// InterruptedException, IOException {
	//
	// String here = "here", readMore = "Read more";
	//
	// // List of mainpage links
	// List<WebElement> link =
	// driver.findElements(By.xpath("//div[@class=\"consultant-finder-page__main\"]"));
	//
	// for (WebElement ele : link) {
	// String hereLink = ele.getText();
	//
	// try {
	//
	// // checking here link is present
	// if (hereLink.contains(here)) {
	// waitHelper.WaitForElementToBePresent(driver, herelnk, 20);
	// js.javaScriptClick(driver, herelnk);
	//
	// // checking readMore link is present
	// } else if (hereLink.contains(readMore)) {
	//
	// waitHelper.WaitForElementToBePresent(driver, readMoreLinkEnquireNowPg,
	// 50);
	//
	// js.javaScriptClick(driver, readMoreLinkEnquireNowPg);
	// waitHelper.WaitForElementToBePresent(driver, herelnk, 20);
	// js.javaScriptClick(driver, herelnk);
	//
	// } else if (readMoreLink2.isDisplayed()) {
	//
	// herelnk.click();
	//
	//
	// }
	// } catch (Exception e)
	//
	// {
	//
	// waitHelper.WaitForElementToBePresent(driver, readMoreLinkEnquireNowPg,
	// 10);
	// js.javaScriptClick(driver, readMoreLinkEnquireNowPg);
	// waitHelper.WaitForElementToBePresent(driver, herelnk, 30);
	//
	// js.javaScriptClick(driver, herelnk);
	//
	// }
	//
	// }
	// }
	//
	// @FindBy(xpath = "//button[@class=\"consultant-finder__link-cta
	// consultant-finder__link-cta--blue
	// consultant-finder__link-cta--no-underline\"]")
	// WebElement consultantFromDrpDwn;
	//
	// @SuppressWarnings("static-access")
	// public void clickConsultantFromDrpDwn() {
	// waitHelper.WaitForElementToBePresent(driver, consultantFromDrpDwn, 20);
	// js.javaScriptClick(driver, consultantFromDrpDwn);
	//
	// }
	//
	//
	// @FindAll(@FindBy(xpath =
	// "//ul[@class=\"consultant-finder__search-tool-results-list\"]//li//button\"]"))
	// List<WebElement> allConsultantFromDrpDwn;
	//
	// @SuppressWarnings("static-access")
	// public void clickAllConsultantFromDrpDwn() throws InterruptedException {
	//
	// System.out.println(allConsultantFromDrpDwn.size());
	//
	// for (int i = 0; i < allConsultantFromDrpDwn.size(); i++) {
	// System.out.print(allConsultantFromDrpDwn.get(i).getText());
	// if (allConsultantFromDrpDwn.get(i).getText().contains(doctorName)) {
	// Thread.sleep(5000);
	// allConsultantFromDrpDwn.get(i).click();
	//
	// }
	// }
	// }

	@FindBy(xpath = "//button[@id=\"onetrust-accept-btn-handler\"]")
	WebElement acceptAllCookies;

	@SuppressWarnings("static-access")
	public void clickAcceptAllCookies() {
		// waitHelper.WaitForElementToBePresent(driver, acceptAllCookies, 60); 1
		waitHelper.WaitForElementToBePresent2(driver, acceptAllCookies);
		js.javaScriptClick(driver, acceptAllCookies);
	}

	@FindBy(xpath = "//button[@id=\"onetrust-accept-btn-handler\"]")
	WebElement readMoreLink;

}
