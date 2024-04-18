package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		Thread.sleep(4000);

		driver.switchTo().frame("mainpanel");

		driver.findElement(By.linkText("CONTACTS")).click();
		
		selectContact("Joe Root");
		String compName = getCompName("Joe Root");
		System.out.println(compName);

	}

	public static void selectContact(String contactName) {
		String xpath = "//a[text()='"+contactName+"']/parent::td/preceding-sibling::td/child::input[@type='checkbox']";
		driver.findElement(By.xpath(xpath)).click();
	}

	public static String getCompName(String contactName) {
		String xpath = "//a[text()='"+contactName+"']/parent::td/following-sibling::td/child::a[@context='company']";
		return driver.findElement(By.xpath(xpath)).getText();
	}
	
	public static void getPhoneNumber(String contactName) {

	}
	
	public static void getContactsInfoList(String contactName) {

	}
	
	
	//id/name
	//css vs xpath
	
	

}
