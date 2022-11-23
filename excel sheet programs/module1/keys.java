package module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keys {
	WebDriver d;
public void opening_browser()
{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	d=new ChromeDriver();
}
public void navigate()
{
	d.get("https://demo.guru99.com/selenium/newtours/");
	d.manage().window().maximize();
}
public void username()
{
	d.findElement(By.name("userName")).sendKeys("mercury");
}
public void password()
{
	d.findElement(By.name("password")).sendKeys("mercury");
	d.findElement(By.name("submit")).click();
}
public void close()
{
	d.close();
}
	
}
