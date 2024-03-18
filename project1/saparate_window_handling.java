package project1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saparate_window_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://demo.automationtesting.in/Windows.html");
		Thread.sleep(2000);
		d.manage().window().maximize();
		d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		d.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
		Set<String> s=d.getWindowHandles();
		for(String i:s) {
			System.out.println(i);
			d.switchTo().window(i);
			if(d.getTitle().equals("Selenium") ){
				Thread.sleep(2000);
				d.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[6]/a/span")).click();
				Thread.sleep(2000);
				d.close();
			}
		}
		
	

	}

}
