package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TL {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		driver.findElements(By.tagName("a")).stream().filter(e -> e.getText().length()!=0).forEach(e -> System.out.println(e.getText()));
		
		//Thread.sleep(2000);
		
		List<WebElement>
		allTextFields =
		driver.findElements(By.className("form-control"));

		System.out.println(allTextFields.size());


		
		
	}

}
