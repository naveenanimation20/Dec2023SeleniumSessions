package seleniumsessions;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaleElementRefExceptionConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		WebElement emailId = driver.findElement(By.id("input-email"));
		emailId.sendKeys("naveen@gmail.com");

		driver.navigate().refresh();// back and forward

		// emailId = driver.findElement(By.id("input-email"));
		// emailId.sendKeys("tom@gmail.com");// selenium.StaleElementReferenceException:
		// stale element reference: stale
		// element not found

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofMillis(500)).ignoring(StaleElementReferenceException.class)
				.withMessage("element not found...");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email"))).sendKeys("tom@gmail.com");

	}

	public boolean vote(int age) {

		if (age < 18) {

			System.out.println("not eligible to vote");

			return false;

		}

		else if (age >= 18) {

			System.out.println("eligible to vote");

			return true;

		}
		
		else {
			return false;
		}

	}

}
