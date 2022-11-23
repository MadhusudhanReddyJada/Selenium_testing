package classandobjs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
	static WebDriver d;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe" );
		d= new ChromeDriver();
		alerts a1= new alerts();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
		a1.title();
		a1.url();
		a1.alertmsg();
		
		

	}
	public void title() {
		String a=d.getTitle();
		System.out.println(a);

		}
	public void url() {
		System.out.println(d.getCurrentUrl());
	}
	public void alertmsg() throws InterruptedException {
		d.findElement(By.id("alertButton")).click();
		Alert alt= d.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(3000);
		alt.accept();
	}

}
