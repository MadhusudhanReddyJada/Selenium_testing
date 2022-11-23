package project1;

import java.awt.font.OpenType;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		WebElement a=d.findElement(By.name("country"));
		List<WebElement> b= a.findElements(By.tagName("option"));
		System.out.println(b.size());
		for(int i=0;i<b.size();i++)
		{
			System.out.println(b.get(i).getText());
//			b.get(i).click();
//			a=d.findElement(By.name("country"));
//			b= a.findElements(By.tagName("a"));
		}
		File t=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(t,new File("C:\\screenshots//abc.png"));

	}


}
