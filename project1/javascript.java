package project1;

import java.awt.Window;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://demo.automationtesting.in/Register.html");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js= (JavascriptExecutor)d;
		d.manage().window().maximize();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,200)" , "");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,0)", "");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		WebElement ele=d.findElement(By.xpath("//*[@id=\"submitbtn\"]"));
		js.executeScript("arguments[0].click()", ele);
		 //certain pixcel
		//  js.executeScript("window.scrollBy(0,1000)","");
		   // finding element  
		     // WebElement flag=driver.findElement(By.xpath("//button[text()='Vote']"));//kenya
		     //js.executeScript("arguments[0].scrollIntoView()",flag);
		      //flag.click();
		      //s
		//scrolling down
		      //js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			//alternate for click
		   // WebElement s=driver.findElement(By.xpath("//button[text()='Search']"));
		   // js.executeScript("arguments[0].click()",s);
	  //js.executeScript("history.go(0)");//refresh
	}
}
