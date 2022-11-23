package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.jqueryui.com/menu");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		WebElement a= d.findElement(By.id("ui-id-9"));
		a.click();
		Thread.sleep(2000);
		WebElement b= d.findElement(By.id("ui-id-13"));
		b.click();
		Thread.sleep(2000);
		WebElement c= d.findElement(By.id("ui-id-16"));
		c.click();
		Thread.sleep(2000);
		Actions act= new Actions(d);
		act.moveToElement(a).moveToElement(b).moveToElement(c).build().perform();

	}

}
