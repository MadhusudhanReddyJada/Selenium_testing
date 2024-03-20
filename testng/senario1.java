package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class senario1 {
	WebDriver d;
	@BeforeClass
	void opening_browser() {
		d= new ChromeDriver();
		d.get("https://www.google.com/");

	}
	@Test
	void check_title() {
		if(d.getTitle().equals("Google")) {
			System.out.println("titles are equal");
		}
		else {
			System.out.println("titles are not equal");
		}
	}
	@AfterClass
	void closing_window() {
		d.quit();
	}
}
