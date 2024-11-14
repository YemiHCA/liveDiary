package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LiveDiaryConsultantsPage;
import pages.CmaPage;
import pages.FooterPage;
import utilities.ExcelReader;

public class LiveDiaryConsultantsSteps {

	LiveDiaryConsultantsPage liveDiaryConsultantsPage = new LiveDiaryConsultantsPage(DriverFactory.getDriver());
	CmaPage cmaPage = new CmaPage(DriverFactory.getDriver());

	@Given("user navigates to finder page")
	public void user_navigates_to_finder_page() throws InterruptedException {
		// DriverFactory.getDriver().get("https://hcauks-uat-sitecore-cd.azurewebsites.net/finder");

		DriverFactory.getDriver().get("https://www.hcahealthcare.co.uk/Finder/Step-Intro");

	}

	// accept cookies
	@Given("user accept cookies")
	public void user_accept_cookies() throws InterruptedException {
//		liveDiaryConsultantsPage.clickAcceptAllCookiesTab();
		// Thread.sleep(5000);
	}

	// pick consultant name from spreadsheet
	@Given("I fill the form from sheetname {string} and rownumber {int}")
	public void i_fill_the_form_from_sheetname_and_rownumber_row_number(String sheetName, int rowNumber)
			throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
//		List<Map<String, String>> testData = reader.getData(
//				"\\\\hca.uk.net\\users\\pro_users\\yolukoya\\My Documents\\NewlyAddedConsultants.xlsx", sheetName);
		
		List<Map<String, String>> testData = reader.getData("C:\\Users\\yolukoya\\Downloads\\LiveDiaryExcel2.xlsx", sheetName);
		String heading = testData.get(rowNumber - 1).get("doctors");

		liveDiaryConsultantsPage.enterConsultantName(heading);
		System.out.println(heading);
		cmaPage.clickConsultantDrpDown();
		// Thread.sleep(5000);

	}

	// next tab
	@Given("user click next tab")
	public void user_click_next_tab() throws InterruptedException {
		cmaPage.clickNextTab();
		// Thread.sleep(5000);

	}

	// click book online tab
	@Given("user click Book online")
	public void user_click_book_online() throws InterruptedException {

		liveDiaryConsultantsPage.clickBookOnlineTab();
		liveDiaryConsultantsPage.clickAcceptTCpageTab();
		// Thread.sleep(5000);

	}

	// click appt type
	@When("user click appointment type")
	public void user_click_appointment_type() throws InterruptedException {

		// liveDiaryConsultantsPage.clickFollowUpApptTab();
		liveDiaryConsultantsPage.clickApptTypeNextTab();
		// Thread.sleep(5000);

	}

	// select a location
	@When("user select a location")
	public void user_select_a_location() throws InterruptedException {

		liveDiaryConsultantsPage.clickSelectLocationTab();

		liveDiaryConsultantsPage.clickLocationNextTab();
		// Thread.sleep(500);

	}

	// assert weekday header is displayed
	@Then("weekdays header should be displayed")
	public void weekdays_header_should_be_displayed() throws InterruptedException {

		Assert.assertTrue(liveDiaryConsultantsPage.isWeekdaysHeaderDisplayed());
		// Thread.sleep(5000);

	}

	@When("user click initial appt")
	public void user_click_initial_appt() {
		liveDiaryConsultantsPage.clickInitialApptTab();
		liveDiaryConsultantsPage.clickApptTypeNextTab();

	}

	@Then("user click appointment link")
	public void user_click_appointment_link() {
		liveDiaryConsultantsPage.clickAppointmentLink();
	}

	@Then("user select follow on appt")
	public void user_select_follow_on_appt() throws InterruptedException {
		liveDiaryConsultantsPage.clickFollowUpApptTab();
		liveDiaryConsultantsPage.clickApptTypeNextTab();

	}

}
