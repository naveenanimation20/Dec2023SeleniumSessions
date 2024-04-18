package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownScrolling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hirist.tech/");
		

		driver.findElement(By.xpath("//div[text()='Location']")).click();
		
		List<WebElement> locList = driver.findElements(By.cssSelector("label.location-checkbox"));
		
		for(WebElement e : locList) {
			System.out.println(e.getText());
			if(e.getText().contains("Tanzania")) {
				e.click();
				break;
			}
		}
		
		
		
	}

}
