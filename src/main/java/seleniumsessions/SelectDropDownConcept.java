package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");

		WebElement country = driver.findElement(By.id("Form_getForm_Country"));

		// Select select = new Select(country);
//		
//		select.selectByIndex(500);
		// select.selectByVisibleText(null);
//		select.selectByValue("Australia");

//		By country = By.id("Form_getForm_Country");
//		doSelectByIndex(country, 5);
//		
//		doSelectByVisibleText(country, "India");
//		
//		doSelectByValue(country, "Australia");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void doSelectByVisibleText(By locator, String visibleText) {
		if (visibleText == null || visibleText.length() == 0) {
			throw new MyElementException("visible text can not be null");
		}

		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}

	public static void doSelectByValue(By locator, String value) {

		if (value == null || value.length() == 0) {
			throw new MyElementException("visible text can not be null");
		}

		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

}
