package testngsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartLoginTest extends BaseTest {

	@Test(priority = 1)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Account Login", "title is not matched");
	}

	@Test(priority = 2)
	public void imageTest() {
		boolean flag = driver.findElement(By.cssSelector(".img-responsive")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void urlTest() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("account/login"));
	}

}