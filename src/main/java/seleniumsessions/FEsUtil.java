package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FEsUtil {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

		By links = By.tagName("a");
		By images = By.tagName("img");

//		System.out.println("total links = " + getElementsCount(links));
//		System.out.println("total images = " + getElementsCount(images));
//
//		ArrayList<String> eleTexts = getElementsTextList(links);
//		System.out.println(eleTexts);
//
//		if (eleTexts.contains("Help")) {
//			System.out.println("PASS");
//		}

		ArrayList<String> eleAltValues = getElementAttributeList(images, "alt");

		System.out.println(eleAltValues);
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public static ArrayList<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleTextList = new ArrayList<String>();// pc=0

		for (WebElement e : eleList) {
			String text = e.getText();
			if (text.length() != 0) {
				eleTextList.add(text);
			}
		}

		return eleTextList;
	}

	public static ArrayList<String> getElementAttributeList(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleAttrList = new ArrayList<String>();// pc=0

		for (WebElement e : eleList) {
			String attrValue = e.getAttribute(attrName);
			
			if (attrValue.length() != 0) {
				eleAttrList.add(attrValue);
			}
		}

		return eleAttrList;

	}

}
