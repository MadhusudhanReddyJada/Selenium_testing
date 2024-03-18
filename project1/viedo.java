package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class viedo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://demo.automationtesting.in/Vimeo.html");
		Thread.sleep(2000);
		d.manage().window().maximize();
		d.switchTo().frame(1);
	
		d.findElement(By.xpath("//*[@id=\"player\"]/div[7]/div[9]/div[2]/div/button[3]")).click();
		Thread.sleep(7000);
		d.findElement(By.xpath("//*[@id=\"player\"]/div[7]/div[9]/div[1]/button")).click();
		Thread.sleep(7000);
		d.findElement(By.xpath("//*[@id=\"player\"]/div[7]/div[9]/div[1]/button")).click();
		Thread.sleep(2000);
		d.quit();
		

	}

}
