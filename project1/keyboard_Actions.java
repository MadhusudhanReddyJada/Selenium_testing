package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_Actions {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://the-internet.herokuapp.com/key_presses");
		Thread.sleep(2000);
		d.manage().window().maximize();
		Actions a= new Actions(d);
		a.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		a.sendKeys("a").perform();
		Thread.sleep(2000);
		
	}
}
