package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;
import utilities.WaitHelper;

public class FinderPage {

	private WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();
	// WaitHelper waitHelper = new WaitHelper(driver);

	public FinderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// waitHelper = new WaitHelper(driver);

	}

	// click condition dropdown
	@FindBy(xpath = "//input[@id=\"doctify_autocomplete_input\"]")

	private WebElement conditionDrpDwn;

	public void clickConditionDrpDwn() {
		js.javaScriptClick(driver, conditionDrpDwn);

	}

	// click select condition
	@FindBy(xpath = "//span[text()=\"Paediatrics (Pediatrics)\"]")
	private WebElement selectCondition;

	public void selectCondition() {
		js.javaScriptClick(driver, selectCondition);
	}

	// click hospital dropdown
	@FindBy(xpath = "//input[@id='doctify_search_input_practices']")
	private WebElement hospitalDrpDwn;

	public void clickHospitalDrpDwn() {
		js.javaScriptClick(driver, hospitalDrpDwn);
	}

	// click select hospital
	@FindBy(xpath = "//ul[@id='doctify_practices_dropdown_list']//li//div//div[contains(text(),'The Lister Hospital')]")
	private WebElement selectHospital;

	public void selectHospital() {
		js.javaScriptClick(driver, selectHospital);
	}

	// click search button
	@FindBy(xpath = "//button[@id='doctify_search_widget_search_button']")
	private WebElement searchBtn;

	public void clickSearchBtn() {
		// WaitHelper.WaitForElementToBeClickable(driver, searchBtn,
		// 60).click();
		// waitHelper.WaitForElementToBeClickable(driver, searchBtn,
		// 60).click();
		js.javaScriptClick(driver, searchBtn);
	}

	// get specialist page title
	public String getSpecialistsPageTitle() {
		return driver.getTitle();
	}

	// enter postcode
	@FindBy(xpath = "//input[@id='doctify_location_input']")
	private WebElement location;

	public void enterLocation() {
		location.sendKeys("se9 2jb");
	}

	// get expert name
	@FindBy(xpath = "//body//div[@id='root-layout']//div//div//div//div[2]//div[1]//div[2]//div[1]//div[1]//h3[1]//a[1]")
	private WebElement expert;

	public String getExpertName() {
		return expert.getText();
	}

	// validate expert name is displayed
	@FindBy(xpath = "//a[text() ='Professor Adam Fox']")
	boolean expertName;

	public boolean isExpertNameDisplayed() {
		return expertName;
	}

	//
	@FindBy(xpath = "//input[@id=\"doctify_location_input\"]")
	WebElement locationField;

	public void enterPostCode(String postcode) {
		locationField.sendKeys(postcode);
	}

	@FindBy(xpath = "//a[text()=\"Dr Helen Brough\"]")
	boolean expertByLocation;

	public boolean isExpertNameByLocationDisplayed() {
		return expertByLocation;
	}

	// click find an oncologist
	@FindBy(xpath = "//a[text()='Find an oncologist']")
	WebElement findAnOncologist;

	public void clickFindAnOncologist() {
		js.javaScriptClick(driver, findAnOncologist);
	}

	// click find a surgeon
	@FindBy(xpath = "//a[text()='Find a surgeon']")
	WebElement findASurgeon;

	public void clickFindASurgeon() {
		js.javaScriptClick(driver, findASurgeon);
	}

	// click find a cardiologist
	@FindBy(xpath = "//a[text()='Find a cardiologist']")
	WebElement findACardiologist;

	public void clickFindACardiologist() {
		js.javaScriptClick(driver, findACardiologist);
	}

	// validate Orthopaedic Expert name is displayed
	@FindBy(xpath = "//a[text()='Mr Andrew Goldberg']")
	boolean OrthopaedicExpert;

	public boolean isOrthopaedicExpertNameDisplayed() {
		return OrthopaedicExpert;
	}

	// validate Cardiology Expert name is displayed

	@FindBy(xpath = "//a[text()='Dr Brian Clapp']")
	boolean CardiologyExpert;

	public boolean isCardiologyExpertNameDisplayed() {
		return CardiologyExpert;
	}

	// validate oncology Expert name is displayed

	@FindBy(xpath = "//a[text()='Professor Heather Payne']")
	boolean oncologyExpert;

	public boolean isOncologyExpertNameDisplayed() {
		return oncologyExpert;
	}

	@FindBy(xpath = "//input[@id=\"doctify_autocomplete_input\"]")
	WebElement doctorNameField;

	public void enterDoctorName(String drName) {
		// WaitHelper.WaitForElementToBeVisible(driver, doctorNameField,
		// 60).sendKeys(drName);
		doctorNameField.sendKeys(drName);
	}

	@FindBy(xpath = "//img[@class=\"doctify_search_widget_style_account_image\"]")
	WebElement resultItem;

	public void clickResultItem() {
		// WaitHelper.WaitForElementToBeClickable(driver, resultItem,
		// 60).click();
		js.javaScriptClick(driver, resultItem);

	}
}
