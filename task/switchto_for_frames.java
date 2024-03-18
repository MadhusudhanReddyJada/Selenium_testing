package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchto_for_frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		d.manage().window().maximize();
		d.findElement(By.xpath("//a[normalize-space()='Single Iframe']")).click();
		

		//for switching the cursor into the frame
		d.switchTo().frame("SingleFrame");
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("madhu");
		
	    // for getting back the cursor into parent frame
		d.switchTo().defaultContent();
		d.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		//here is is a nested frames a frame in side another frame we need to switch into inner frame using
		//entering into outer frame first frame
		d.switchTo().frame(2);
		//entering into the inner frame using web element as well
		d.switchTo().frame(d.findElement(By.xpath("/html/body/section/div/div/iframe")));
		d.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("madhu");
		
		//d.close();
	}

}
