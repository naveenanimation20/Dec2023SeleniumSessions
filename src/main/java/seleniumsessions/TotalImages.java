package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		System.out.println("total images = " + imagesList.size());
		
		for(WebElement e : imagesList) {
			String altValue = e.getAttribute("alt");
			String srcValue = e.getAttribute("src");
			
			System.out.println(altValue + "  ----  " + srcValue);
		}

		
		
	}

}
