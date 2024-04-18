package seleniumsessions;

import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LocatorsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
       // System.setProperty("webdriver.chrome.logfile", "chrome.log");
       // System.setProperty("webdriver.chrome.verboseLogging", "true");
        
//        System.setProperty("webdriver.chrome.logfile", "chromedriver.log");
//        System.setProperty("webdriver.chrome.verboseLogging", "true");
//        System.setProperty("webdriver.chrome.silentOutput", "false");
//        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.INFO);




		driver = new ChromeDriver();//123
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		
		

		// chrome dev tools:
		// DOM: HTML: Document Object Model

		// create a webelement + perform an action on it(click, sendKeys, gettext,isDisplayed)

		// 1.
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");

		// 2.
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
		// 10 elements
		// 4 elements
//		
//		emailId.sendKeys("test@gmail.com");
//		password.sendKeys("test@123");

		// 3. By locator:
//		By username = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		WebElement emailId = driver.findElement(username);
//		WebElement password = driver.findElement(pwd);
//		
//		emailId.sendKeys("test@gmail.com");
//		password.sendKeys("test@123");

		// 4. By locator with some utility:
//		By username = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		WebElement emailId = getElement(username);
//		WebElement password = getElement(pwd);
//		
//		emailId.sendKeys("test@gmail.com");
//		password.sendKeys("test@123");
		
		
		//5. By locator with element util and action util:
//		By username = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		doSendKeys(username, "test@gmail.com");
//		doSendKeys(pwd, "test@123");
		
		//6. By locator and create a common util class for elements:
		//Page By Locators: OR - Object Repository
//		By username = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(username, "test@gmail.com");
//		eleUtil.doSendKeys(pwd, "test@123");
		
		//7. BrUtil + eleUtil
		
		//8. By util + String locators
		
		String username_id = "input-email";
		String pwd_id = "input-password";
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		eleUtil.doSendKeys("id", username_id, "anu@gmail.com");
		eleUtil.doSendKeys("id", pwd_id, "anu@123");
		
		
		//string --> by --> webelement -- action -- 2nd
		//by -- webelement --action -- Ist
		//webelement -- action -- 3rd
		
		
		
		
		
	}

//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}
//	
//	public static void doSendKeys(By locator, String value) {
//		getElement(locator).sendKeys(value);
//	}
//	
	
	
	
	///Browser(html/CSS + JS): web pages(JS/TS/React/AngularJS)---> server(Java/GO/PY) -- DB
	//selenium Java ---> Angular JS + GO

	
	
	
	
	
	
	
	
	

}
