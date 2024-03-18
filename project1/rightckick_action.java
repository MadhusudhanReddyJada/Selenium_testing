package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightckick_action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver d= new ChromeDriver();
				d.get("https://demo.guru99.com/test/simple_context_menu.html");
				Thread.sleep(2000);
				d.manage().window().maximize();
				WebElement e= d.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
				Actions a= new Actions(d);
				a.contextClick(e).build().perform();
				d.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[3]/span")).click();
				Thread.sleep(2000);
				d.switchTo().alert().accept();
				Thread.sleep(2000);
				e=d.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
				a.doubleClick(e).build().perform();
				Thread.sleep(2000);
				d.switchTo().alert().accept();
				Thread.sleep(2000);
				d.close();

	}

}
