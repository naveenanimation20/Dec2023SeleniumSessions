package seleniumsessions;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkarPricing {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
		String lowestPrice = driver.findElements(By.xpath("(//div[contains(text(), '₹')])[position() mod 2 =1]"))
			.stream().map(e -> e.getText()).sorted().findFirst().get();
		System.out.println(lowestPrice);
		
		
				driver.findElements(By.xpath("//div[text()='"+lowestPrice+"']/ancestor::div[contains(@class,'row')]//div[@class='_4rR01T']"))
					.forEach(e -> System.out.println(e.getText()));
				
				
				
		System.out.println("-------------------");
		
		String highestPrice = driver.findElements(By.xpath("(//div[contains(text(), '₹')])[position() mod 2 =1]"))
				.stream().map(e -> e.getText()).sorted(Collections.reverseOrder()).findFirst().get();
			System.out.println(highestPrice);
			
			
					driver.findElements(By.xpath("//div[text()='"+highestPrice+"']/ancestor::div[contains(@class,'row')]//div[@class='_4rR01T']"))
						.forEach(e -> System.out.println(e.getText()));
		
		
	}

}

