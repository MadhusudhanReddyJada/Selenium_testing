package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		String a="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String b="]/td[";
		String c="]";
		//String ele=d.findElement(By.xpath("")).getText();
		for(int i=1;i<=36;i++)
		{
			for(int j=1;j<=8;j++)
			{
			String ele=d.findElement(By.xpath(a+i+b+j+c)).getText();
			System.out.print(ele+"   ");
			}
			System.out.println();
			
		}
		

	}

}
