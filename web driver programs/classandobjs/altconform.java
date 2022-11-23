package classandobjs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class altconform {
	FirefoxDriver d;
	public void openbrowser() {
		d=  new FirefoxDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
		System.out.println(d.getCurrentUrl());
		
	}
	public void alert() throws InterruptedException {
		d.findElement(By.id("confirmButton")).click();
		
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(3000);
		alt.accept();
		WebElement text = d.findElement(By.id("confirmResult"));
		System.out.println(text.getText());
		d.findElement(By.id("promtButton")).click();
		System.out.println(alt.getText());
		Thread.sleep(3000);
		alt.sendKeys("hi hello");
		alt.accept();
	}
	public static void main(String args[]) throws InterruptedException {
		altconform a = new altconform();
		a.openbrowser();
		a.alert();
	}

}
