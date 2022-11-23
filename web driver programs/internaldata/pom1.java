package internaldata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom1 {
    WebDriver d;
    By username =By.name("userName");
    By password = By.name("password");
    By submit = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input");
    pom1(WebDriver d){
    	this.d=d;
    }
    public void uname() {
    	d.findElement(username).sendKeys("Admin");
    	
    	
    }
    public void pass() {
    	d.findElement(password).sendKeys("admin123");
    }
    public void submit() {
    	d.findElement(submit).click();
    }
	

}
