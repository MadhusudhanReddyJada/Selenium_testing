package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class class1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver d = new FirefoxDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		Thread.sleep(5000);
		d.close();
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d1=new ChromeDriver();
		String url="https://www.amazon.in/";
		d1.get(url);
		d1.manage().window().maximize();
		d1.findElement(By.id("searchDropdownBox")).click();
		d1.findElement(By.id("searchDropdownBox")).sendKeys("mercury");
		d1.findElement(By.id("twotabsearchtextbox")).sendKeys("harryporter");
		d1.findElement(By.id("nav-search-submit-button")).click();
		System.out.println(d1.getTitle());
		System.out.println(d1.getCurrentUrl());
		d1.close();
		
		
		
		

	}

}
