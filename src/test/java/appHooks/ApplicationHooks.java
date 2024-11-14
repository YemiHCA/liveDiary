package appHooks;

import java.util.Properties;

import utilities.SoundPlayer;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ConfigReader;

public class ApplicationHooks {

	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;

	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}

	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);

	}

	@After(order = 0)
	public void quitBrowser() {
		// driver.close();
		driver.quit();

	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			// take screenshot

			String screenshotName = scenario.getName().replaceAll("", "");

			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

			scenario.attach(sourcePath, "image/png", screenshotName);
			
			if (scenario.isFailed()) {
	            System.out.println("Test Failed: " + scenario.getName());
	            // Specify the path to your sound file
	            SoundPlayer.playErrorSound("src/test/resources/sounds/mixkit-arcade-retro-game-over-213.wav");

			} else {
				SoundPlayer.playPassSound("src/test/resources/sounds/mixkit-retro-game-notification-212.wav");
			}
}}}
