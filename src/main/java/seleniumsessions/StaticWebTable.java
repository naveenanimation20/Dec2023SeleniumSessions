package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		System.out.println("total rows = " + (rowCount-1));
		
		int colCount = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		System.out.println("total colmns = " + (colCount));//3

		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
//		String beforXpath = "//*[@id=\"customers\"]/tbody/tr[";
//		String afterXpath = "]/td[1]";
//		
//		for(int row = 2; row<=rowCount; row++) {
//			String compXpath = beforXpath + row + afterXpath;
//			//System.out.println(compXpath);
//			String text = driver.findElement(By.xpath(compXpath)).getText();
//			System.out.println(text);
//		}
//		
//		List<WebElement> tableDataList = driver.findElements(By.xpath("//th[text()='Company']/parent::tr/following-sibling::tr/td"));
//		
//		for(WebElement e : tableDataList) {
//			System.out.println(e.getText());
//		}
		
		
		//th[text()='Contact']/parent::tr/following-sibling::tr/td[3]
		//table[@id='customers']//tr/td[1]
		
		for(int col=1; col<=colCount; col++) {
			List<WebElement> colData = driver.findElements(By.xpath("//table[@id='customers']//tr/td["+col+"]"));
				for(WebElement e : colData) {
					System.out.println(e.getText());
				}
		}
		
		
	}
	
	
	

}
