package project1;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		d.manage().window().maximize();
		d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		d.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		Alert a= d.switchTo().alert();
		a.accept();
		d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		d.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		a.dismiss();
		d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		d.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		a.sendKeys("MADHUSUDHAN REDDY");
		
		
		d.quit();
		

	}

}
