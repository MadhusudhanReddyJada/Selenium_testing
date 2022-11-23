package Module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver d;
  @BeforeTest
  public void f() {
	  System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
  }
  @Test
  public void getTitle() {
	  System.out.println(d.getTitle());
  }
  @Test
  public void urlcheck() {
	  String expurl="https://demo.guru99.com/test/newtours/register.php";
	  d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
	  String acturl=d.getCurrentUrl();
	  System.out.println(d.getCurrentUrl());
	  if(expurl.equals(acturl)) {
		  System.out.println("both are same");
	  }
	  else
		  System.out.println("both are not same");
  }
  @AfterTest
  public void close() {
	  d.close();
  }
}
