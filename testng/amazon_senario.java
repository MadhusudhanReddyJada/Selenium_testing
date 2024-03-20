package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class amazon_senario {
	WebDriver d;
	@BeforeClass
	void opening_browser() throws InterruptedException {
		d= new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		Thread.sleep(2000);

	}
	@Test
	void check_title() {
		if(d.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
			System.out.println("titles are equal");
		}
		else {
			System.out.println("titles are not equal");
		}
	}
	@Test
	void selecting_item() throws InterruptedException {
		d.findElement(By.cssSelector("img[alt=\"Refrigerators\"]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/span/div/div/div[1]/span/a/div/img")).click();
		Thread.sleep(2000);
		Set<String> s=d.getWindowHandles();
		for(String i:s) {
			d.switchTo().window(i);
			System.out.println(d.getTitle());
			if(d.getTitle().equals("Samsung 183 L, 4 Star, Digital Inverter, Direct-Cool Single Door Refrigerator (RR20C1824CR/HL, Red, Camellia Purple, Base Stand Drawer, 2024 Model) : Amazon.in: Appliances")){
				Thread.sleep(2000);
				System.out.println("hello");
				d.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();
				Thread.sleep(2000);
				d.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();

			}
			else {
				System.out.println("hello");
			}
		}
		
		
	}
	
	
	@AfterClass
	void closing_window() {
		//d.quit();
	}
}
