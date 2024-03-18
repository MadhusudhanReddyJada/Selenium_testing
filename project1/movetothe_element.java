package project1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movetothe_element {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		d.manage().window().maximize();
		d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		WebElement e=d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[10]/a"));
		WebElement e1=d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[13]/a"));
		WebElement e2=d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[17]/a"));
		Actions a= new Actions(d);
		
		a.moveToElement(e).build().perform();
		Thread.sleep(5000);
		a.moveToElement(e1).moveToElement(e2).click().build().perform();

	}

}
