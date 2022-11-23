package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(d.getTitle());
		d.findElement(By.linkText("REGISTER")).click();
		
	}

}
