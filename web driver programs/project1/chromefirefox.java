package project1;
import java.io.File;
import java.io.IOException;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class chromefirefox {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String choice=s.nextLine();
		switch(choice)
		{
		case "Chrome":
			System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
			ChromeDriver d = new ChromeDriver();
			d.get("https://www.amazon.com/");
			d.manage().window().maximize();
			d.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")).click();
			WebElement a=d.findElement(By.name("url"));
			List<WebElement> b= a.findElements(By.tagName("option"));
			System.out.println(b.size());
			for(int i=0;i<b.size();i++)
			{
				System.out.println(b.get(i).getText());
				b.get(i).click();
				//d.navigate().back();
				d.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")).click();
				a=d.findElement(By.name("url"));
				b= a.findElements(By.tagName("option"));
				
			}
			File t=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(t,new File("C:\\screenshots//abc.png"));
			
			d.close();	
			break;
		case "Firefox":
			FirefoxDriver d1= new FirefoxDriver();
			d1.get("https://www.amazon.com/");
			d1.manage().window().maximize();
			d1.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")).click();
			WebElement a1=d1.findElement(By.name("url"));
			List<WebElement> b1= a1.findElements(By.tagName("option"));
			System.out.println(b1.size());
			for(int i=0;i<b1.size();i++)
			{
				System.out.println(b1.get(i).getText());
				b1.get(i).click();
				d1.navigate().back();
				d1.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")).click();
				a1=d1.findElement(By.name("url"));
				b1= a1.findElements(By.tagName("option"));
				
			}
			File t1=((TakesScreenshot)d1).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(t1,new File("C:\\screenshots//abc.png"));
			
			d1.close();	
			break;
		default:
			System.out.println("Enter Valid Input");
			break;
		}
		

	}

}
