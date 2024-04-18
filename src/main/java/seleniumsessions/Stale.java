package seleniumsessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Stale {

	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//
//		List<WebElement> footerList = driver.findElements(By.cssSelector("footer ul.list-unstyled > li >a"));
//
//		for (int i = 0; i < footerList.size(); i++) {
//
//			String text = footerList.get(i).getText();
//
//			System.out.println(text);
//
//			footerList.get(i).click();
//
//			driver.navigate().back();
//
//			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//
//					.withTimeout(Duration.ofSeconds(10))
//
//					.pollingEvery(Duration.ofSeconds(2))
//
//					.ignoring(StaleElementReferenceException.class)
//
//					.withMessage("time out... element is not present...");
//
//			footerList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("footer ul.list-unstyled > li >a")));

			String s1 = "hello";
			String s2 = new String("hello");

			// s1 and s2 have the same value but are different objects
			System.out.println(s1 == s2); // false

			// Interning s2 so that it refers to the string from the string pool
			s2 = s2.intern();

			// Now s1 and s2 both point to the same string object in the pool
			System.out.println(s1 == s2); // true

		}

	
}
