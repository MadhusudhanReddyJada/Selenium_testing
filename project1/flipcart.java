package project1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://www.flipkart.com/?s_kwcid=AL!739!3!678876521201!e!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gad_source=1&gclid=Cj0KCQjwncWvBhD_ARIsAEb2HW_bpjdUH7uKevXFly4WBgFPG4ojdY2omXk7VmiW51CkH9R1m4WKz1QaAnozEALw_wcB");
		Thread.sleep(2000);
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[4]/div/div/div/div/div/div/div/div/div/div[2]/div/div/div/a/div/div/div[1]/img")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).click();
		Thread.sleep(2000);
		String a="";
		Set<String> win=d.getWindowHandles();
		for(String w:win)
		{
			System.out.println(w);
			Thread.sleep(2000);
			d.switchTo().window(w);
			System.out.println(d.getTitle());
			if(d.getTitle().equals("Apple iPhone 15 (Blue, 128 GB)"))
			{
				System.out.println("hello world");
				d.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
				Thread.sleep(3000);
				d.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[3]/button")).click();
				Thread.sleep(3000);
				//d.close();
			}
			
			else
			a=w;
			
		}
		d.switchTo().window(a);
		
		d.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[6]/div/div/a/span")).click();
		Thread.sleep(4000);
		d.navigate().back();
		d.navigate().back();
    	Thread.sleep(4000);
		
		d.quit();
	}

}
