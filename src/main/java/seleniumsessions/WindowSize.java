package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// driver.manage().window().maximize();
		// driver.manage().window().fullscreen();
		
		//responsive - view port - 
//		Dimension dim = new Dimension(414, 896);
//		driver.manage().window().setSize(dim);

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// sel 4.x
//		driver.manage().window().minimize();
//		driver.manage().window().maximize();
		
		WebElement fn = driver.findElement(By.id("input-firstname"));
		System.out.println(fn.getCssValue("font-size"));
		
		int ht = fn.getSize().getHeight();
		int wd = fn.getSize().getWidth();
		System.out.println(ht);
		System.out.println(wd);
		
		int x = fn.getLocation().getX();
		int y = fn.getLocation().getY();
		
		System.out.println(x + " "  + y);
		
		WebElement continue_btn = driver.findElement(By.xpath("//input[@value='Continue']"));
		String bk_color = continue_btn.getCssValue("background-color");
		System.out.println(bk_color);
		
		
	}

}

