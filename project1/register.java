package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class register {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		d.manage().window().maximize();
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("madhu");
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("reddy");
		d.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("madhu@gmail.com");
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("1232435677");
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
		d.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();

		WebElement drp =d.findElement(By.xpath("//*[@id=\"Skills\"]"));
		Select select = new Select(drp);

        select.selectByVisibleText("C");

        select.selectByIndex(9);
        d.findElement(By.xpath("//*[@id=\"imagesrc\"]")).sendKeys("C:\\Users\\DTLP165\\Documents\\madhu.txt");
		d.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();
		
     


	}

}
