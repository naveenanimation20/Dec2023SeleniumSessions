package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HDFCBank {
	public static void main(String args[]) {
		One one = new Two();
		one.print();
	}
}

class One {
	public static void print() {
		System.out.println("1");
	}
}

class Two extends One {
	public static void print() {
		System.out.println("2");
	}
}
