package Module1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Program2 {
  
  WebDriver d;
  @BeforeMethod
  public void openingbrowser() {
	  System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://amazon.com");
		d.manage().window().maximize();
  }
  @Test
  public void getTitle() {
	  System.out.println(d.getTitle());
  }
  @Test
  public void geturl() {
	  System.out.println(d.getCurrentUrl());
  }
  @Test
  public void screenshot() throws IOException {
	  File s=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(s,new  File("C://screenshots/img1.png"));
  }
  @AfterMethod
  public void close() {
	  d.close();
  }
  
}
