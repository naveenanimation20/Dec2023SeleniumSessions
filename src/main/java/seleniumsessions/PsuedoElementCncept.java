package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PsuedoElementCncept {

	public static void main(String[] args) throws InterruptedException {

		
		String script = "return window.getComputedStyle(document.querySelector('label[for=\"input-firstname\"]'), '::before').getPropertyValue('content');";
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String mand_text = js.executeScript(script).toString();
		System.out.println(mand_text);
		
		if(mand_text.contains("*")) {
			System.out.println("FN is a mandatory field");
		}
		
		
		
	}

}
