package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSuggestions {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com");

		By searchField = By.name("q");
		By suggestions = By.xpath("//ul[@class='G43f7e' and @role='listbox']//div[@class='wM6W7d']/span");
		
		doSearch(searchField, suggestions, "Naveen Automation Labs", "java");

	}
	
	
	public static void doSearch(By searchlocator, By searchSuggestions, String searchKey, String value) throws InterruptedException {
		driver.findElement(searchlocator).sendKeys(searchKey);

		Thread.sleep(3000);

		List<WebElement> suggList = driver.findElements(searchSuggestions);

		System.out.println(suggList.size());

		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(value)) {
				e.click();
				break;
			}
		}
	}
	
	
	
	
	
	
	

}
