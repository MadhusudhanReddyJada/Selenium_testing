package maven1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		//d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]")).click();
		Thread.sleep(2000);
		WebElement e=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
		Thread.sleep(2000);
		List<WebElement> l=e.findElements(By.tagName("tr"));
		System.out.println(l.size());
		for(int i=0;i<l.size();i++) {
			//d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]")).click();
			Thread.sleep(2000);
			Thread.sleep(4000);
			l.get(i).click();
			Thread.sleep(5000);
			d.navigate().back();
			Thread.sleep(2000);
		//	System.out.println(l.get(i).getText());
			Thread.sleep(3000);
			
		}

	}

}
