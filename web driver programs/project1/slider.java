package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://jqueryui.com/slider/");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		WebElement a= d.findElement(By.id("slider"));
		Actions act = new Actions(d);
		int y= a.getLocation().y;
		
		act.dragAndDropBy(a,y,100).build().perform();
		Thread.sleep(2000);
		d.close();
//		d.get("https://jqueryui.com/datepicker/");
//		d.switchTo().frame(0);
//		d.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
//		d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[7]/a")).click();
//		
		
		
		
		
		

	}

}
