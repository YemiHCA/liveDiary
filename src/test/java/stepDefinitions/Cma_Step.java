package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.CmaPage;
import utilities.ExcelReader;

public class Cma_Step {

	String doctor;
	CmaPage cmaPage = new CmaPage(DriverFactory.getDriver());
	WebDriver driver;

	@Given("user opens URL")
	public void user_opens_url() {
		DriverFactory.getDriver().get("https://www.hcahealthcare.co.uk/finder");
		cmaPage.clickAcceptAllCookies();
	}

	@Given("click search for a consultant")
	public void click_search_for_a_consultant() throws InterruptedException {
		cmaPage.clickSearchForConsultantTab();
//		Thread.sleep(5000);
	}

	@Given("user fill the form from sheetname {string} and rownumber {int}")
	public void user_fill_the_form_from_sheetname_and_rownumber(String sheetName, int rowNumber)
			throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData("\\\\hca.uk.net\\users\\pro_users\\yolukoya\\My Documents\\ConsultantsName.xlsx", sheetName);
		String heading = testData.get(rowNumber).get("doctors");
		
//System.out.println(heading);
		Thread.sleep(2000);
		cmaPage.enterConsultantName(heading);
		System.out.println("This is an header" + heading);
		Thread.sleep(2000);
		cmaPage.clickConsultantDrpDown();
		Thread.sleep(1000);

//		cmaPage.clickConsultantFromDrpDwn();
//		Thread.sleep(1000);

	}

	@Given("click next button")
	public void click_next_button() throws InterruptedException {
		cmaPage.clickNextTab();
//		 Thread.sleep(1000);

	}

	@Given("click Here hyperlink")
	public void click_here_hyperlink() throws InterruptedException, IOException {
//		cmaPage.IsReadMoreLinkEnquireNowPgVisible();
		cmaPage.clickHereLink3();
//		Thread.sleep(1000);

	}

	@Then("a new page is opened with the doctor name")
	public void a_new_page_is_opened_with_the_doctor_name() {
		cmaPage.getHandles();
	}

	@Then("page title should be CMA Disclosure | How we work with doctors | HCA UK")
	public void page_title_should_be_cma_disclosure_how_we_work_with_doctors_hca_uk() throws InterruptedException {
		Assert.assertEquals(cmaPage.getPageTitle(), "CMA Disclosure");
		Thread.sleep(5000);
//		Assert.assertEquals(cmaPage.getPageTitle(), "* | HCA UK");

		
		
	}

	
}
