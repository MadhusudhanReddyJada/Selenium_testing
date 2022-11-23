package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver d= new FirefoxDriver();
		d.get("https://google.com");
		d.manage().window().maximize();
		WebElement Link = d.findElement(By.linkText("Gmail"));
		Actions act= new Actions(d);
		act.contextClick(Link).sendKeys("L").build().perform();
		
		
		

	}

}
