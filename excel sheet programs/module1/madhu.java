package module1;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class madhu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://vtavisvotsav2k22.herokuapp.com");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=649,561");
		d.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/nav/div/button/span")).click();
		d.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a/div")).click();
		Thread.sleep(2000);
		
        d.close();
	}

}
