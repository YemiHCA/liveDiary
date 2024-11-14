package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

	public WebDriver driver;

	public WaitHelper(WebDriver driver) {
		this.driver = driver;

	}

	public static WebElement WaitForElementToBeVisible(WebDriver driver, WebElement webElement, long timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement element = wait.until(ExpectedConditions.visibilityOf(webElement));
		return element;
	}

	public static WebElement WaitForElementToBeClickable(WebDriver driver, WebElement webElement,
			long timeOutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webElement));
		return element;

	}
	
public static void WaitForElementToBePresent2(WebDriver driver, WebElement webElement ){
		
		Wait<WebDriver> wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait2.until(ExpectedConditions.visibilityOf(webElement));

	}

	// working wait method
		public static void WaitForElementToBePresent(WebDriver driver, WebElement webElement, long timeOutInSeconds) {
//			 WebDriverWait wait = new WebDriverWait(driver, 10);
//			WebElement aboutMe;
//			aboutMe = wait.until(ExpectedConditions.visibilityOf(webElement));

		}
}
