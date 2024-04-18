package testngsessions;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority = 1)
	public void eTest() {
		System.out.println("e test");
	}

	@Test(priority = 2)
	public void dTest() {
		System.out.println("d test");
	}

	@Test(priority = 3)
	public void cTest() {
		System.out.println("c test");
	}

	@Test(priority = -1)
	public void aTest() {
		System.out.println("a test");
	}

	@Test()
	public void bTest() {
		System.out.println("b test");
	}

}
