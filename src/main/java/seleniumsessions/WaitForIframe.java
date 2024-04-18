package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForIframe {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();// browser - chrome

		// page
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");// page

		driver.findElement(By.cssSelector("div#imageTemplateContainer img")).click();

		By frameLocator = By.xpath("//iframe[contains(@id,'frame-one')]");

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));

		waitForFrameAndSwitchToIt(frameLocator, 10);

		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("naveen");

		driver.switchTo().defaultContent();

		String text = driver.findElement(By.cssSelector("h3.details__form-preview-title")).getText();
		System.out.println(text);

	}

	public static void waitForFrameAndSwitchToIt(By frameLocator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}

}
