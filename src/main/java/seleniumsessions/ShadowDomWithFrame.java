package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomWithFrame {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();//B
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");//Page
		Thread.sleep(3000);

		
		//sc1: B --> P --> shadowDOM(open) -- element
//		String search_script = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement pizzaName = (WebElement) js.executeScript(search_script);
//
//		pizzaName.sendKeys("Veg Pizza");
		
		
		//sc2:
		//Browser -- page --> shadow DOM(open) ---> iframe --- element
		
		
		String frame_script = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#pact1\")";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement frameElement = (WebElement) js.executeScript(frame_script);
		System.out.println(frameElement);
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.id("glaf")).sendKeys("PASS");
		
	}

}




