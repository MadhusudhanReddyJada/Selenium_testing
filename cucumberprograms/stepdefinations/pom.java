package stepdefinations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom {
	WebDriver d;
	pom(WebDriver d){
		this.d=d;
	}
	By uname=By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input");
	By pass =By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input");
	By button=By.name("submit");
   public void unameandpass() throws IOException {
	   FileInputStream f=new FileInputStream("C:\\\\eclipse-workspace\\\\madhuproject1\\\\src\\\\test\\\\java\\\\stepdefinations\\\\p1.properties");
	   Properties p1= new Properties();
	   p1.load(f);
	   String s1=p1.getProperty("uname"),s2=p1.getProperty("pass");
	   d.findElement(uname).sendKeys(s1);
		d.findElement(pass).sendKeys(s2);
		d.findElement(button).click();
   }
}
