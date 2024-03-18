package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class meesho {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://www.meesho.com/");
		Thread.sleep(2000);
		d.manage().window().maximize();
		Thread.sleep(10000);
		d.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div[1]/div/div[3]/div[2]/div[2]/img")).click();
		Thread.sleep(10000);
		d.navigate().to("https://www.meesho.com/kids-store/pl/3g5q");
		((JavascriptExecutor) d).executeScript("window.open()");
		((JavascriptExecutor) d).executeScript("window.open('https://google.com')");
		//d.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div[1]/div/div/div[3]/div[2]/div[2]/div/div[4]/a/div/div[1]/img")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div/div[2]/div[2]/div/div/span[5]/span")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div/div[1]/div/div[2]/div[2]/div/button[1]/div/span")).click();

	}

}
