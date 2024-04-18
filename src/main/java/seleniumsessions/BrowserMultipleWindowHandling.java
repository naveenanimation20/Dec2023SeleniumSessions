package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent
		
		String parentWindowId = driver.getWindowHandle();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href, 'twitter')]")).click();//child
		driver.findElement(By.xpath("//a[contains(@href, 'linkedin')]")).click();//child
		driver.findElement(By.xpath("//a[contains(@href, 'youtube')]")).click();//child
		driver.findElement(By.xpath("//a[contains(@href, 'facebook')]")).click();//child

		
		//fetch window ids:
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			System.out.println("window urL : " + driver.getCurrentUrl());
			
				if(!windowId.equals(parentWindowId)) {
					driver.close();
				}
						
			Thread.sleep(1000);

		}

		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl() + " " + driver.getTitle());

	}

}
