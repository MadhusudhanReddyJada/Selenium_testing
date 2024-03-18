package project1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://demo.automationtesting.in/Windows.html");
		Thread.sleep(2000);
		d.manage().window().maximize();
	
		d.findElement(By.xpath("//a[normalize-space()='Open New Tabbed Windows']")).click();
		d.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		Set<String> win=d.getWindowHandles();
		for(String w:win)
		{
			System.out.println(w);
			d.switchTo().window(w);
		
			if(d.getTitle().equals("Selenium"))
			{
				
				d.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
				Thread.sleep(3000);
			}
		}
		d.quit();
	}
}


