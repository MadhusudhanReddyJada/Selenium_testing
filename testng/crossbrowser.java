package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowser {
	WebDriver d;
	@Parameters("browser")
	@Test
	void opening_browser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			
			 d=new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			
			d=new FirefoxDriver();

		}
		else {
			d=new EdgeDriver();
		}
		d.get("https://meet.google.com/nhy-trid-yrx");

	}
	
	
}
