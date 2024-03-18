package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_commands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		//for opening a web page through url    get command
		d.get("https://demo.guru99.com/");
		//for maximizing the browser window     manage command
		d.manage().window().maximize();
		//for minimizing the browser window
		d.manage().window().minimize();
		d.manage().window().maximize();
		//for finding any web element we use find element command
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
		//for getting the title of the page
		System.out.println(d.getTitle());
		// for getting current url of the page
		System.out.println(d.getCurrentUrl());
		// for geting the current window id
		System.out.println(d.getWindowHandle());
		//for navigating to other page like back forward etc
		d.navigate().back();
		//for closing the current tab or window
		d.close();
		//dfor closing over all browser we use quit
		//d.quit();

	}

}
