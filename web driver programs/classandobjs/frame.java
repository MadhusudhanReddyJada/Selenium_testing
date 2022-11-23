package classandobjs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.dezlearn.com/nested-iframes-example/");
		d.manage().window().maximize();
		d.switchTo().frame(0);
		d.findElement(By.id("u_5_5")).click();
		System.out.println(d.findElement(By.id("processing")).getText());
		d.switchTo().frame("iframe1");
		d.findElement(By.id("u_5_6")).click();
		System.out.println(d.findElement(By.id("processing")).getText());

	}

}
