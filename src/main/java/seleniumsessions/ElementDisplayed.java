package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");		
		
		
//		boolean flag = driver.findElement(By.className("img-responsive11")).isDisplayed();//NSE
//		System.out.println(flag);
//		if(flag) {
//			System.out.println("logo is displayed");
//		}
//		else {
//			System.out.println("logo is not displayed");
//		}
		
//		By logo = By.className("img-responsive");
//		
//		if(isElementDisplayed(logo)) {
//			System.out.println("logo - displayed");
//		}
		
		
//		List<WebElement> logo = driver.findElements(By.className("img-responsive11"));
//		
//		if(logo.size()==1) {
//			System.out.println("logo is displayed");
//		}
//		else {
//			System.out.println("logo is not displayed");
//		}
		
		By logo = By.className("img-responsive11");
		
		if(isElementExist(logo)) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
	}
	
	public static boolean isElementExist(By locator) {
		if(getElements(locator).size()==1) {
			return true;
		}
		return false;
	}
	
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean isElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	
	

}
