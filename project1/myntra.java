package project1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://www.myntra.com/");
		Thread.sleep(2000);
		d.manage().window().maximize();
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[5]/div/a")).click();
		d.findElement(By.xpath("/html/body/div[2]/div/main/div[3]/div[2]/div/div[2]/section/ul/li[2]/a/div[1]/div/div/div/picture/img")).click();
		Thread.sleep(2000);
		
		Set<String> win=d.getWindowHandles();
		for(String w:win)
		{
			System.out.println(w);
			Thread.sleep(2000);
			d.switchTo().window(w);
			System.out.println(d.getTitle());
			if(d.getTitle().equals("Buy Minimalist SPF 50 PA++++ Multi Vitamin Sunscreen - Face Sunscreen for Unisex 15853718 | Myntra"))
			{
				System.out.println("hello world");
				d.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[2]/div[2]/div[2]/div[2]/div/div[1]")).click();
				Thread.sleep(3000);
				d.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/div[2]/a[2]/span[1]")).click();

				//d.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[2]/div[2]/div[2]/div[2]/div/div[1]")).click();
				Thread.sleep(3000);
			}
	
			
		}
		//d.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/div[2]/a[2]/span[1]")).click();
		
		Thread.sleep(2000);
		d.quit();

	}

}
