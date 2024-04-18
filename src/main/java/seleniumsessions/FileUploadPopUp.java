package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		
		//type = file is mandatory
		
		//c:\\document\\test.txt
		driver.findElement(By.name("upfile")).sendKeys("/Users/naveenautomationlabs/Documents/AWS_Linux_Commands.txt");
		
	
		//sikuli - image based/resolution based
		//autoIT -- only for windows machine -- wont work in docker, headless, jenkins, linux, macos
		
		
	}

}
