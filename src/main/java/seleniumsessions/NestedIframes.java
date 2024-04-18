package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframes {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();//B
		driver.get("https://selectorshub.com/iframe-scenario/");//Page
		Thread.sleep(3000);
		
		
		driver.switchTo().frame("pact1");//f1
		driver.findElement(By.id("inp_val")).sendKeys("testing");
		
		driver.switchTo().frame("pact2");	//f2	
		driver.findElement(By.id("jex")).sendKeys("Automation");
		
		driver.switchTo().frame("pact3");	//f3	
		driver.findElement(By.id("glaf")).sendKeys("1M subs");
		
		
		//
		//f3 --> f2 using switch().frame()? : NOOOOOO
		//f3  ---> parentFrame() : f2 : YESSSS
		//f2 --> parentFrame(): f1 : YESSS
		
		driver.switchTo().frame("pact2");	//f3 to f2	
		driver.switchTo().frame("pact1");//f2 to f1
		driver.findElement(By.id("inp_val")).sendKeys(" is fun");

		
//		driver.switchTo().defaultContent();//go to main page
//		//driver.findElement(By.id("inp_val")).sendKeys(" with fun");
//		String header = driver.findElement(By.tagName("h3")).getText();
//		System.out.println(header);
		
		//sel 4.x:
//		driver.switchTo().parentFrame();//to f2 frame
//		driver.findElement(By.id("jex")).sendKeys(" with fun");
//		
//		driver.switchTo().parentFrame();//to f1 frame
//		driver.findElement(By.id("inp_val")).sendKeys(" is boring");
//		
//		driver.switchTo().parentFrame(); //go to page
//		//driver.switchTo().defaultContent(); //to to page
//		String header = driver.findElement(By.tagName("h3")).getText();
//		System.out.println(header);
		
		


	}

}
