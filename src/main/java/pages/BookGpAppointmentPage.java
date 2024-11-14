package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.JavaScriptExecutor;
import utilities.WaitHelper;

public class BookGpAppointmentPage {

	private WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper = new WaitHelper(driver);
	String doctorName;

	public BookGpAppointmentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}

	@FindBy(xpath = "//b[normalize-space()='appointment']")

	WebElement bookAnAppointmentTab;

	public void clickBookAnAppointmentTab() {

		bookAnAppointmentTab.click();
	}

	@FindBy(xpath = "//a[@href=\"/services/gp-and-urgent-care/private-gp-services/book-a-gp-appointment\"]")

	WebElement bookAGpAppointmentTab;

	@SuppressWarnings("static-access")
	public void clickBookAGpAppointmentTab() {

		waitHelper.WaitForElementToBePresent(driver, bookAGpAppointmentTab, 30);
		js.javaScriptClick(driver, bookAGpAppointmentTab);
	}

	@FindBy(xpath = "//div[@class=\"flex flex-col gap-4\"]//h4[normalize-space()='GP Consultation']")

	WebElement gpConsultationTab;

	@SuppressWarnings("static-access")
	public void selectgpConsultationTab() {

		waitHelper.WaitForElementToBeClickable(driver, gpConsultationTab, 20);
		js.javaScriptClick(driver, gpConsultationTab);

	}

	@FindBy(xpath = "//button[normalize-space()=\"Select appointment\"]")

	WebElement selectAppointmentTab;

	@SuppressWarnings("static-access")
	public void clickSelectAppointmentTab() {

		waitHelper.WaitForElementToBeClickable(driver, selectAppointmentTab, 20);
		js.javaScriptClick(driver, selectAppointmentTab);

	}

	@FindBy(xpath = "//span[normalize-space()=\"No preference\"]")

	WebElement gpGenderPreferences;

	@SuppressWarnings("static-access")
	public void selectGpGenderPreferences() {

		waitHelper.WaitForElementToBeClickable(driver, gpGenderPreferences, 20);
		js.javaScriptClick(driver, gpGenderPreferences);

	}

	@FindBy(xpath = "//button[normalize-space()=\"Continue\"]")

	WebElement gpGenderPreferencesContinueBtn;

	@SuppressWarnings("static-access")
	public void selectGpGenderPreferencesContinueBtn() {

		waitHelper.WaitForElementToBeClickable(driver, gpGenderPreferencesContinueBtn, 20);
		js.javaScriptClick(driver, gpGenderPreferencesContinueBtn);

	}

	@FindBy(xpath = "//button[normalize-space()=\"show all\"]")

	WebElement locationShowAllBtn;

	@SuppressWarnings("static-access")
	public void selectLocationShowAllBtn() {

		waitHelper.WaitForElementToBeClickable(driver, locationShowAllBtn, 20);
		js.javaScriptClick(driver, locationShowAllBtn);

	}

	@FindBy(xpath = "//h4[normalize-space()=\"HCA Garlick Hill - London\"]")

	WebElement hcaGarlickHillTab;

	@SuppressWarnings("static-access")
	public void selectHcaGarlickHillTab() {

		waitHelper.WaitForElementToBeClickable(driver, hcaGarlickHillTab, 20);
		js.javaScriptClick(driver, hcaGarlickHillTab);

	}

	@FindBy(xpath = "//div[@class=\"hours\"]//button[@type=\"button\"]")

	WebElement timeSlot;

	@SuppressWarnings("static-access")
	public void selectTimeSlotTab() {

		waitHelper.WaitForElementToBeClickable(driver, timeSlot, 20);
		js.javaScriptClick(driver, timeSlot);

	}

	@FindBy(xpath = "//button[normalize-space()=\"Book this slot\"]")

	WebElement bookThisSlot;

	@SuppressWarnings("static-access")
	public void selectBookThisSlotTab() {

		waitHelper.WaitForElementToBeClickable(driver, bookThisSlot, 20);
		js.javaScriptClick(driver, bookThisSlot);

	}
	
	@FindBy(xpath = "//input[@class=\"formControlSelect__input\"]")

	WebElement titleDrpDwn;

	@SuppressWarnings("static-access")
	public void selectTitleDrpDwn() {

		waitHelper.WaitForElementToBeClickable(driver, titleDrpDwn, 20);
		titleDrpDwn.sendKeys("Mr");
		
	}
	
	@FindBy(xpath = "//input[@id=\"first_name\"]")

	WebElement firstName;

	@SuppressWarnings("static-access")
	public void enterFirstName() {

		waitHelper.WaitForElementToBeClickable(driver, firstName, 20);
		firstName.sendKeys("Test");
		
	}
	
	@FindBy(xpath = "//input[@id=\"surname\"]")

	WebElement surName;

	@SuppressWarnings("static-access")
	public void enterSurName() {

		waitHelper.WaitForElementToBeClickable(driver, surName, 20);
		surName.sendKeys("TestSurname");
		
	}
	
	@FindBy(xpath = "//input[@id=\"date_birth\"]")

	WebElement dateOfBirth;

	@SuppressWarnings("static-access")
	public void enterDateOfBirth() {

		waitHelper.WaitForElementToBeClickable(driver, dateOfBirth, 20);
		dateOfBirth.sendKeys("11111980");
		
	}
	
	@FindBy(xpath = "//input[@id=\"phone_mobile\"]")

	WebElement phoneNumber;

	@SuppressWarnings("static-access")
	public void enterPhoneNumber() {

		waitHelper.WaitForElementToBeClickable(driver, phoneNumber, 20);
		phoneNumber.sendKeys("7889960550");
		
	}
	
	@FindBy(xpath = "//input[@id=\"email\"]")

	WebElement email;

	@SuppressWarnings("static-access")
	public void enterEmail() {

		waitHelper.WaitForElementToBeClickable(driver, email, 20);
		email.sendKeys("test@test.com");
		
	}
	
	@FindBy(xpath = "//input[@id=\"password\"]")

	WebElement password;

	@SuppressWarnings("static-access")
	public void enterPassword() {

		waitHelper.WaitForElementToBeClickable(driver, password, 20);
		password.sendKeys("Qwertyuiop69");
		
	}
	
	@FindBy(xpath = "//input[@name=\"q\"]")

	WebElement address;

	@SuppressWarnings("static-access")
	public void enterAddress() {

		waitHelper.WaitForElementToBeClickable(driver, address, 20);
		address.sendKeys("SE9 2JB");
		
	}
	
	@FindBy(xpath = "//button[normalize-space()=\"Book now\"]")

	WebElement bookNowTab;

	@SuppressWarnings("static-access")
	public void selectBookNowTab() {

		waitHelper.WaitForElementToBeClickable(driver, bookNowTab, 20);
		js.javaScriptClick(driver, bookNowTab);

	}

}
