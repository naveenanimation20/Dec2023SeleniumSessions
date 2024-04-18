package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with;



public class RelativeLocatorsConcept {

	public static void main(String[] args) throws InterruptedException {

		//selenium 4.x: 
//							above of ele
//		                    |
//		left of ele <----  ele   --> right of ele
//							|
//		near of ele			below of ele
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(4000);
		
		WebElement ele = driver.findElement(By.linkText("Brandon, Canada"));
		
		String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftRank);
		
		
		
		String rightNumber = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightNumber);
		
		
		
		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);

		
		String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);
		
		
		String nearEle = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(nearEle);

		
		
	}

}
