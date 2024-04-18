package testngsessions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvocationCountTest {

	@BeforeTest
	public void createUser() {
		System.out.println("BT -- create user");
	}

	@Test(invocationCount = 10, priority = 2)
	public void createUserTest() {
		System.out.println("createUserTest");
	}

	@Test(priority = 1)
	public void paymentTest() {
		System.out.println("paymentTest");
	}

	@AfterTest
	public void deleteUser() {
		System.out.println("AT -- deleteUser");
	}

}
