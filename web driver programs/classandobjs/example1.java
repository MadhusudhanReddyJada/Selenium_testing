package classandobjs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {
	WebDriver d;
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d= new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		System.out.println(d.getCurrentUrl());
	}
	public void drop() {
		d.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")).click();
		WebElement a=d.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
		List<WebElement> b= a.findElements(By.tagName("option"));
		System.out.println(b.size());
		for(int i=0;i<b.size();i++)
		{
			System.out.println(b.get(i).getText());
			b.get(i).click();
			//d.navigate().back();
			d.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")).click();
			a=d.findElement(By.name("url"));
			b= a.findElements(By.tagName("option"));
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example1 e= new example1();
		e.openbrowser();
		e.drop();

	}

}
