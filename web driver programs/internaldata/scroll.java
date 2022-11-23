package internaldata;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		//d.manage().window().maximize();
		JavascriptExecutor j= (JavascriptExecutor)d;
		Thread.sleep(1000);
		j.executeScript("window.scrollBy(0,1000)"," ");
		Thread.sleep(1000);
		d.close();

	}

}
