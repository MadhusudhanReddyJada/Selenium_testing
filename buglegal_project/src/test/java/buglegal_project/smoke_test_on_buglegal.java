package buglegal_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class smoke_test_on_buglegal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://buglegal.com/");
		Thread.sleep(2000);
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/header/div/nav/ul/li[2]/a")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"FeaturesDropdown\"]")).click();
		//WebElement e=d.findElement(By.xpath("//*[@id=\"FeaturesDropdown\"]"));
		Thread.sleep(2000);
		//List<WebElement> l=e.findElements(By.xpath("/html/body/header/div/nav/ul/li[3]/div"));
		//System.out.println(l.size());
		for(int i=1;i<=10;i++) {
			String s="/html/body/header/div/nav/ul/li[3]/div/a["+i+"]";
			System.out.println(s);
			d.findElement(By.xpath(s)).click();
			Thread.sleep(2000);
			d.findElement(By.xpath("//*[@id=\"FeaturesDropdown\"]")).click();
			Thread.sleep(2000);
		}
		
		d.findElement(By.xpath("/html/body/header/div/nav/ul/li[4]/a")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id='About UsDropdown']")).click();
		Thread.sleep(2000);

		d.findElement(By.xpath("/html/body/header/div/nav/ul/li[5]/div/a[1]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id='About UsDropdown']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/header/div/nav/ul/li[5]/div/a[2]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/header/div/nav/ul/li[6]/a")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id='modal_trigger']")).click();
		Thread.sleep(2000);
		d.quit();

	}

}
