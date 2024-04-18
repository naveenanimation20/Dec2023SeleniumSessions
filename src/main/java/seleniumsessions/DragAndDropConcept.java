package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		
		//ele to ele on the page -- valid
		//file on the page -- NA
		
		WebElement srcEle = driver.findElement(By.id("draggable"));
		WebElement targetEle = driver.findElement(By.id("droppable"));

		
		Actions act = new Actions(driver);
		Action action = act.clickAndHold(srcEle).moveToElement(targetEle).release().build();
		
		
		action.perform();
		
		
		
		//act.dragAndDrop(srcEle, targetEle).perform();
		
		
	}

}
