package multipleclass_beforetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class class1 {
  WebDriver d;
  @Test(priority=1)
  public void openingbrowser() {
	  System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://amazon.com");
		d.manage().window().maximize();
  }
  @Test(priority=2)
  public void  getTitle() {
	  System.out.println(d.getTitle());
  }
  @Test(priority=3)
  public void payment() {
	  System.out.println("paymaent success");
  }
  
  
}
