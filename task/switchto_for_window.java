package task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchto_for_window {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://demo.automationtesting.in/Windows.html");
		Thread.sleep(2000);
		d.manage().window().maximize();
	
		d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		d.findElement(By.xpath("//*[@id=\"Multiple\"]/button")).click();
		Set<String> win=d.getWindowHandles();
		for(String w:win)
		{
			System.out.println(w);
			d.switchTo().window(w);
		
			if(d.getTitle().equals("Index"))
			{
				
				d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ABC@GMAIL.COM");
				Thread.sleep(3000);
			}
			else if(d.getTitle().equals("Selenium"))
			{
				
				d.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
				Thread.sleep(3000);
			}
		}
		d.quit();

	}

}
