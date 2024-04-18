package seleniumsessions;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");

		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By fName = By.id("input-firstname");
		By lName = By.id("input-lastname");
		By eMail = By.name("email");
		By mob = By.id("input-telephone");
		By pwd = By.id("input-password");
		By pwdConfrm = By.id("input-confirm");

		By isSubscribeYes = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
		By isSubscribeNo = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");

		By policyChkBox = By.name("agree");
		By continueBtn = By.cssSelector("#content > form > div > div > input.btn.btn-primary");

		By successMessg = By.tagName("h1");

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(fName, "victor");
		eleUtil.doSendKeys(lName, "automation");
		eleUtil.doSendKeys(eMail, StringUtils.getRandomEmail());
		eleUtil.doSendKeys(mob, "98989898989");
		eleUtil.doSendKeys(pwd, "victor@123");
		eleUtil.doSendKeys(pwdConfrm, "victor@123");

		eleUtil.doClick(isSubscribeYes);

		eleUtil.doClick(policyChkBox);

		eleUtil.doClick(continueBtn);

		String actSuccMessg = eleUtil.doGetElementText(successMessg);
		System.out.println(actSuccMessg);
		if (actSuccMessg.equals("Your Account Has Been Created!")) {
			System.out.println("user Reg -- PASSED");
		} else {
			System.out.println("user Reg -- FAILED");
		}
		
		brUtil.getPageURL();

		// brUtil.quitBrowser();

	}

}
