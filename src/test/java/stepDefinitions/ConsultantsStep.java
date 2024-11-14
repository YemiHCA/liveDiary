package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.CmaPage;
import pages.ConsultantPage;
import utilities.ExcelReader;

public class ConsultantsStep {

	String doctor;
	CmaPage cmaPage = new CmaPage(DriverFactory.getDriver());
	ConsultantPage consultantPage = new ConsultantPage(DriverFactory.getDriver());

	WebDriver driver;

	@Given("user opens UAT URL")
	public void user_opens_uat_url() {

		DriverFactory.getDriver().get("https://hcauks-uat-sitecore-cm.azurewebsites.net/finder");
		cmaPage.clickAcceptAllCookies();
	}

//	@Given("I fill the form from sheetname {string} and rownumber {int}")
//	public void user_fill_the_form_from_sheetname_and_rownumber(String sheetName, int rowNumber)
//			throws InvalidFormatException, IOException, InterruptedException {
//		ExcelReader reader = new ExcelReader();
//		List<Map<String, String>> testData = reader.getData("C:\\Users\\yolukoya\\workspace\\AddedNewConsultants\\TestData\\NewlyAddedConsultants.xlsx", sheetName);
//		String heading = testData.get(rowNumber).get("consultants");
//		// Thread.sleep(5000);
//		cmaPage.enterConsultantName(heading);
//		System.out.println(heading);
//		Thread.sleep(1000);
//		cmaPage.clickCnsultantNameFieldTwo();
//		Thread.sleep(1000);
//		cmaPage.clickConsultantFromDrpDwn();
//		Thread.sleep(1000);
//
//	}

	@Then("there should not be practice address")
	public void there_should_not_be_practice_address() {
		Assert.assertTrue(!consultantPage.isPraticeAddressDisplayed());
	}

	@Then("call to book tab")
	public void call_to_book_tab() {
		 Assert.assertTrue(!consultantPage.isCallToBookTabDisplayed());
	}

}
