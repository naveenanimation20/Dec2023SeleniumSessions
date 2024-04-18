package seleniumsessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//sel 3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel 4.x
		//imp wait: Global wait: applied to all the elements by default
		//FE/FEs
		
		
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		//case 1:
//		//login page: 10
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel 4.x

//		//total timeout = 10 secs
//		driver.findElement(By.id("Form_getForm_Name")).sendKeys("test");//e1: 10 : 2 = 8 ignored
//		//e2: 10 : 3 = 7
//		//e3: 10 : 8 = 2
//		//e4...en : 10
//		
//		//home page: 15 secs
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//sel 4.x
//		//he1: 15
//		//he2: 15
//		//logout: 15
//		
//		//login page: 
//		//e1 e2 e3: 
//		
//		//reg page: 5 secs
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//sel 4.x
//		
//		//cart page: 0 : nullify of imp wait: 0
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));//sel 4.x
		
		//login page: 0 secs
		
		
		//case 2:
		//login page: 10 secs
		//e1 : 10
		//e2 : 10
		//e3 : 10 
		//e4 : 10
		
		//case 3:
		//its only for webelements
		//not applicable for non web elements: JS alert, title, urls, browser window
		
		//avoid imp wait in your real time fw
		
		
	}

}
