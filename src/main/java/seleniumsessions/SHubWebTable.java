package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SHubWebTable {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		
		
		//a[text()='John.Smith']/ancestor::tr//input[@type='checkbox']
		//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']
		
		selectUser("John.Smith");
		selectUser("Joe.Root");

		System.out.println(getUserDetails("John.Smith"));
		System.out.println(getUserDetails("Joe.Root"));
		
		
		
		
		
		
	}
	
	
	public static void selectUser(String userName) {
		String xpath = "//a[text()='"+userName+"']/ancestor::tr//input[@type='checkbox']";
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public static List<String> getUserDetails(String userName) {
		String xpath = "//a[text()='"+userName+"']/parent::td/following-sibling::td";
		List<WebElement> userInfoEles = driver.findElements(By.xpath(xpath));
		List<String> userInfoList = new ArrayList<String>();
		for(WebElement e : userInfoEles) {
			String text = e.getText();
			System.out.println(text);
			userInfoList.add(text);
		}
		
		return userInfoList;
	}
	
	
	
	
	

}
