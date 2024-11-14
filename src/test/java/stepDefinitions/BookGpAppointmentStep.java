package stepDefinitions;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.BookGpAppointmentPage;

public class BookGpAppointmentStep {
	
	BookGpAppointmentPage bookGpAppointmentPage = new BookGpAppointmentPage(DriverFactory.getDriver());


	@Given("user navigates to home page")
	public void user_navigates_to_home_page() {
		DriverFactory.getDriver().get("https://www.hcahealthcare.co.uk/");

	}
	@When("user click Book an appointment")
	public void user_click_book_an_appointment() {
		bookGpAppointmentPage.clickBookAnAppointmentTab();  
	}
	@When("user click Book a GP appointment")
	public void user_click_book_a_gp_appointment(){
		bookGpAppointmentPage.clickBookAGpAppointmentTab();
	}
	@When("user select an appointment type")
	public void user_select_an_appointment_type() {
		bookGpAppointmentPage.selectgpConsultationTab();
	}
	@When("user select appointment")
	public void user_select_appointment() {
		bookGpAppointmentPage.clickSelectAppointmentTab();
	}
	@When("user select Gender")
	public void user_select_gender() {
		bookGpAppointmentPage.selectGpGenderPreferences();
	}
	@When("user click continue")
	public void user_click_continue() {
		bookGpAppointmentPage.selectGpGenderPreferencesContinueBtn();
	}
	@When("user select location")
	public void user_select_location() {
		bookGpAppointmentPage.selectLocationShowAllBtn();
	}
	@When("user select slot")
	public void user_select_slot() {
		bookGpAppointmentPage.selectHcaGarlickHillTab();
	}
	@When("user select Book this slot")
	public void user_select_book_this_slot() {
		bookGpAppointmentPage.selectTimeSlotTab();
		bookGpAppointmentPage.selectBookThisSlotTab();
	}
	@When("user input their details")
	public void user_input_their_details() {
		bookGpAppointmentPage.selectTitleDrpDwn();
		bookGpAppointmentPage.enterFirstName();
		bookGpAppointmentPage.enterSurName();
		bookGpAppointmentPage.enterDateOfBirth();
	}
	@When("user click Book now button")
	public void user_click_book_now_button() {
		bookGpAppointmentPage.selectBookNowTab();
	}
	@Then("confirm your phone number page is displayed")
	public void confirm_your_phone_number_page_is_displayed() {
	  
	}




}
