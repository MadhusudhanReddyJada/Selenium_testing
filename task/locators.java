package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		Thread.sleep(2000);
		d.manage().window().maximize();
		//cssSelector for selecting a web element
		d.findElement(By.cssSelector("button[ng-click=\"customer()\"]")).click();
		Thread.sleep(2000);
		//xpath locator 
		d.findElement(By.xpath("/html/body/div/div/div[1]/button[1]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button")).click();
		//xpath for selecting a web element
		d.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[3]")).click();
		
		//class name locator
		d.findElement(By.className("form-control ng-pristine ng-valid ng-touched")).sendKeys("madhu");
		
//		//linktext locator
//		d.findElement(By.linkText("Bob Tester")).click();
//		d.findElement(By.name("oxd-layout")).click();
		
		d.close();
		
	}

}
