package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchDrivers {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();// open browser: 123
		driver.get("https://www.google.com");// enter url: 123
		String title = driver.getTitle();// get title: 123
		System.out.println("page title: " + title);

		String url = driver.getCurrentUrl();//123
		System.out.println(url);
		
		driver.quit();//123

		
		
		WebDriver driver1 = new ChromeDriver();//456
		driver1.get("https://www.google.com");// enter url: 456
		String title1 = driver1.getTitle();// get title: 456
		System.out.println("page title: " + title1);//456
		
		driver1.quit();//456
		
		
		
		
	}

}
