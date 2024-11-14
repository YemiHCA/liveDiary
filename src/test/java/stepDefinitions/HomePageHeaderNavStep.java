package stepDefinitions;

import org.junit.Assert;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.FooterPage;
import pages.HomePage;

public class HomePageHeaderNavStep {

	HomePage homePage = new HomePage(DriverFactory.getDriver());
	FooterPage footerPage = new FooterPage(DriverFactory.getDriver());

	@Given("user navigates to home page Header Nav links")
	public void user_navigates_to_home_page_header_nav_links() {
		DriverFactory.getDriver().get("https://www.hcahealthcare.co.uk/");

	}

	@When("user observes the page")
	public void user_observes_the_page() throws InterruptedException {
		Assert.assertEquals(homePage.getPageTitle(), "Get expert treatment, focused on you");
		footerPage.footerList();
	}

	@Then("there should be for business link")
	public void there_should_be_for_business_link() throws InterruptedException {

		homePage.clickForBusinessLink();
		homePage.IsForBusinessLinkDisplay();

		System.out.println(homePage.getPageTitle());
		Assert.assertEquals(homePage.getPageTitle(), "Healthcare for Business");

	}

	@Then("For healthcare professionals link")
	public void for_healthcare_professionals_link() throws InterruptedException {
		homePage.IsForHealthcareProfessionalsLinkDisplay();

		homePage.clickForHealthcareProfessionalsLink();
		System.out.println(homePage.getPageTitle());
		Assert.assertEquals(homePage.getPageTitle(), "For healthcare professionals");

	}

	@Then("pay my bills link")
	public void pay_my_bills_link() {
		homePage.clickPayMyBillLink();
		homePage.IsSecureOnlinePaymentsTextDisplay();
		Assert.assertEquals(homePage.getPageTitle(), "Payment Form");
		DriverFactory.getDriver().navigate().back();
	}

	@Then("About HCA UK link")
	public void about_hca_uk_link() {
		homePage.clickAboutHcaUKLink();
		homePage.IsAboutHcaUKLinkDisplay();
		Assert.assertEquals(homePage.getPageTitle(), "About HCA UK");

	}

	@Then("Careers link")
	public void careers_link() {
		homePage.IsCareersLinkDisplay();

		homePage.clickCareersLink();
		Assert.assertEquals(homePage.getPageTitle(), "HCA Healthcare UK Careers | Across London and the UK");
		DriverFactory.getDriver().navigate().back();
	}

}
