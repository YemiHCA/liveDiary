package pages;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;
import utilities.WaitHelper;

public class FooterPage {

	private WebDriver driver;

	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper = new WaitHelper(driver);

	public FooterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}

	@FindBy(xpath = "//span[normalize-space()='App Download']")
	WebElement appDownload;

	public boolean IsAppDownloadDisplayed() {
		return appDownload.isDisplayed();
	}

	@FindBy(xpath = "//span[normalize-space()='Get a second opinion']")
	WebElement getAsecondOpinion;

	public boolean IsgetAsecondOpinionDisplayed() {
		return getAsecondOpinion.isDisplayed();
	}

	@FindBy(xpath = "//span[normalize-space()='Find a doctor']")
	WebElement findAdoctor;

	public boolean IsfindAdoctorDisplayed() {
		return findAdoctor.isDisplayed();
	}

	// pay my bill link
	@FindBy(xpath = "//span[normalize-space()='Pay my bill']")
	WebElement payMyBill;

	public boolean IspayMyBillDisplayed() {
		return payMyBill.isDisplayed();
	}

	// footer list
	@FindBy(xpath = "//ul[@data-navigation-type=\"footerNavigationText\"][@class=\"Footer_links__Vzvxm\"]//li//div[@class=\"TextLink_text-link__Yh3Rj  TextLink_body-medium-large__Bedet\"]//a")

	WebElement footerList;

	public void footerList() {

		List<WebElement> footerList = driver.findElements(By.xpath(
				"//ul[@data-navigation-type=\"footerNavigationText\"][@class=\"Footer_links__Vzvxm\"]//li//div[@class=\"TextLink_text-link__Yh3Rj  TextLink_body-medium-large__Bedet\"]//a"));
		System.out.println(footerList.size());

		List<String> exp = Arrays.asList("Our HCA Story", "Our quality commitment", "Management team",
				"Our Mission Statement", "How we work with doctors", "Environmental sustainability", "Contact HCA UK",
				"Blogs and articles", "News & Press", "Patient stories", "Careers", "Cancer care", "Cardiac care",
				"Neurosciences", "Gynaecology & Obstetrics", "Orthopaedics");

		for (int i = 0; i < footerList.size(); i++) {
			if (footerList.get(i).getText().equalsIgnoreCase(exp.get(i)))
				System.out.println("Matched");
			else
				System.out.println("Didn't match");
		}

	}

	// facebook icon
	@FindBy(xpath = "//span[text()=\"Facebook\"]")

	WebElement facebook;

	public boolean IsFacebookDisplay() {
		return facebook.isDisplayed();
	}

	// instagram icon
	@FindBy(xpath = "//span[text()=\"Instagram\"]")

	WebElement instagram;

	public boolean IsInstagramDisplay() {
		return instagram.isDisplayed();
	}

	// linkedin icon
	@FindBy(xpath = "//span[text()=\"Linkedin\"]")

	WebElement linkedin;

	public boolean IsLinkedinDisplay() {
		return linkedin.isDisplayed();
	}

	// footer bottom
	@FindBy(xpath = "//ul[@class=\"Footer_legals__A1xRj\"]/li//a")

	WebElement footerBottom;

	public boolean IsFooterBottomDisplay() {
		return footerBottom.isDisplayed();
	}

	// CQC
	@FindBy(xpath = "//div[@class=\"Footer_reviews__D1rdQ\"]//div[@class=\"CQCBlock_link__dSzJG\"]")

	WebElement careQualityCommissionIcon;

	public boolean IsCareQualityCommissionIconDisplay() {
		return careQualityCommissionIcon.isDisplayed();
	}

	// copy right
	@FindBy(xpath = "class=\"Text_body-small__qH5cg\"")

	WebElement hcaCopyRight;

	public boolean IshcaCopyRightDisplay() {
		return hcaCopyRight.isDisplayed();
	}
}
