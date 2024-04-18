package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDown {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");

		Thread.sleep(2000);

		By dropDown = By.id("justAnInputBox");
		By choices = By.xpath("//span[@class='comboTreeItemTitle']");

		// 1. tc_01: single selection
		 selectChoice(dropDown, choices, "choice 1");

		// 2. tc_02: multi selection
		// selectChoice(dropDown, choices, "choice 1", "choice 3", "choice 6", "choice 7", "choice 6 2 2");

		// 3. tc_03: all selection

		//selectChoice(dropDown, choices, "all");
		 
		 
		//... varargs --spread parameter(JS) -- array
	}

	
	/**
	 * This method is used to handle single, multiple and all selections. Please pass "all" in case of all selections.
	 * @param dropDownLocator
	 * @param choices
	 * @param value
	 * @throws InterruptedException
	 */
	public static void selectChoice(By dropDownLocator, By choices, String... value) throws InterruptedException {
		driver.findElement(dropDownLocator).click();

		Thread.sleep(2000);

		List<WebElement> choicesList = driver.findElements(choices);// 45

		if (!value[0].equals("all")) {

			System.out.println(choicesList.size());

			for (WebElement e : choicesList) {

				String text = e.getText();
				System.out.println(text);

				for (String val : value) {
					if (text.equals(val)) {
						e.click();
					}
				}

			}
		} else {
			// all selection logic:
			for (WebElement e : choicesList) {// 1 to 14
				try {
					e.click();
				} catch (ElementNotInteractableException ex) {
					break;
				}

			}
		}

	}

}
