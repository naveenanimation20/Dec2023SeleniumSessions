package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeTest {

	public static void main(String[] args) {
		
		
		//4.0.0:

		//MAC:
		//launching the server
//		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Documents/mydrivers/chromedriver");
//		WebDriver driver = new ChromeDriver();//open browser
		
		
		//Windows:
				//launching the server
//				System.setProperty("webdriver.chrome.driver", "c:\\users\\naveen\\mydrivers\\chromedriver.exe");
//				WebDriver driver = new ChromeDriver();//open browser
		
		
		
		//4.0.0 --> manual download the .exe
		//chrome browser (121) ----> chromedriver.exe (121.exe) -- vendor site
		//chrome browser (122) ---> 121.exe --> 122.exe
		//chrome browser (123) --> 122 --> 123.exe
		
		
		//4.17.0:
		//Selenium Manager: Selenium 4.6.0+ 
		//SM
		//chrome browser (121) ---> machine (121) ---> download chromedriver 121.exe --> .cache folder
		//chrome browser (122) ---> machine (122) ---> download chromedriver 122.exe --> .cache folder
		
		//WebDriver driver = new ChromeDriver();//open browser
		//SM --> checking in ur local (browser 121) --> do u have chromedriver121.exe -- yes -- no need to download
		//if you are not having it -- need to download
		
		WebDriver driver = new FirefoxDriver();
		//4.17.0 -- SM
		//Sm --> check in local -- firefox(x) --> .cache -- .exe?
		
		//Selenium Manager: binary driver(.exe) management component in selenium
		
		
		//quit vs close:
			//1. SID
			//2. window handler: later 
		
		
		
	}

}
