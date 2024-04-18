package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultileSelectionWithSelectClass {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");

		WebElement dropDownEle = driver.findElement(By.xpath("//select[@multiple]"));

		Select select = new Select(dropDownEle);
		
		System.out.println(select.isMultiple());//true
		

		if (select.isMultiple()) {
			System.out.println("multi select is possible");
			
			select.selectByVisibleText("American flamingo");
			select.selectByVisibleText("Chilean flamingo");
			select.selectByVisibleText("Lesser flamingo");
			select.selectByVisibleText("James's flamingo");
		}

				
		select.deselectByVisibleText("Lesser flamingo");
		select.deselectAll();
		
	}

}

