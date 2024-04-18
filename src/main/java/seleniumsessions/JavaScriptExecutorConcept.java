package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {

		//browser : JS
		//JS --> JavaScriptExecutor --> executeScript()
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
	//	JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);
//		
//		String url = js.executeScript("return document.URL;").toString();
//		System.out.println(url);

		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		String title = jsUtil.getTitleByJS();
		System.out.println(title);
		
		
		//jsUtil.generateAlert("hi this is my alert");
//		String pageText = jsUtil.getPageInnerText();
//		System.out.println(pageText);
//		if(pageText.contains("Deal Pipeline")) {
//			System.out.println("PASS");
//		}
		
		//WebElement header = driver.findElement(By.xpath("//h3[text()='Companies & Contacts']"));
//		jsUtil.scrollIntoView(header);
		
		
//		jsUtil.zoomChromeEdge("50");
//		jsUtil.zoomChromeEdge("400");

		//WebElement loginForm = driver.findElement(By.id("hs-login"));
		WebElement userID = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));

		//jsUtil.drawBorder(loginForm);
		jsUtil.flash(userID);
		userID.sendKeys("testing@gmail.com");
		jsUtil.flash(password);
		password.sendKeys("testing@123");
		
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
		jsUtil.clickElementByJS(loginBtn);
		

	}

}
