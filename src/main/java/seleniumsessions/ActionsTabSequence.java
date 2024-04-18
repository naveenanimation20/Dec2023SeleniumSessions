package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTabSequence {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		Actions act = new Actions(driver);
		
		//WebElement search = driver.findElement(By.name("firstname"));

		
//		act.sendKeys(search, "sanjay")
//			.sendKeys(Keys.TAB)
//			.pause(200)
//			.sendKeys("automation")
//			.sendKeys(Keys.TAB)
//			.pause(200)
//			.sendKeys("san@gmail.com")
//			.sendKeys(Keys.TAB)
//			.pause(200)
//			.sendKeys("99999999")
//			.sendKeys(Keys.TAB)
//			.pause(200)
//			.sendKeys("san@123")
//			.sendKeys(Keys.TAB)
//			.pause(200)
//			.sendKeys("san@123")
//			.build().perform();
		
		act.sendKeys(Keys.TAB)
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.TAB)
			.sendKeys("macbook pro")
				.sendKeys(Keys.ENTER)
					.build().perform();
		
		

		
	}

}
