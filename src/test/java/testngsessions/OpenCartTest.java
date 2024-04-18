package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTest {
	
	
//	BS -- DB connection
//	BT -- create user
//	BC -- launchBrowser
	
//	BM -- login to app
//	header test
//	AM -- logout
	
//	BM -- login to app
//	title test
//	AM -- logout
	
//	BM -- login to app
//	url test
//	AM -- logout
	
//	AC -- closeBrowser
//	AT -- deleteUser
//	AS -- disconnectWithDB
	
	
	
	
	//before ---- test -- after

	// before annotations:
	//1.
	@BeforeSuite
	public void dbConnection() {
		System.out.println("BS -- DB connection");
	}

	//2.
	@BeforeTest
	public void createUser() {
		System.out.println("BT -- create user");
	}
	

	//3.
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- launchBrowser");
	}

	//4. //7. //10. 
	@BeforeMethod
	public void login() {
		System.out.println("BM -- login to app");
	}

	//8. 
	@Test
	public void titleTest() {
		System.out.println("title test");
	}

	//5.
	@Test
	public void headerTest() {
		System.out.println("header test");
	}

	//11.
	@Test
	public void urlTest() {
		System.out.println("url test");
	}

	// after annotations:
	//6. //9. //12.
	@AfterMethod
	public void logout() {
		System.out.println("AM -- logout");
	}

	//13.
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- closeBrowser");
	}

	//14.
	@AfterTest
	public void deleteUser() {
		System.out.println("AT -- deleteUser");
	}

	//15.
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS -- disconnectWithDB");
	}

}
