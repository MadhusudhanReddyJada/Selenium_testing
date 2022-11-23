package internaldata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom2 {
		WebDriver d;
		By fname=By.name("firstName");
		By lname = By.name("lastName");
		By phone = By.name("phone");
		By email=By.name("userName");
		By country = By.name("country");
		By submit = By.name("submit");
		pom2(WebDriver d){
			this.d=d;
		}
		public void fname() {
			d.findElement(fname).sendKeys("madhu");
		}
		public void lname() {
			d.findElement(lname).sendKeys("reddy");
		}
		public void phone() {
			d.findElement(phone).sendKeys("99123");
		}
		public void email() {
			d.findElement(email).sendKeys("madhu@123");
		}
		public void country() {
			d.findElement(country).sendKeys("india");
		}
		public void submit() {
	    	d.findElement(submit).click();
	    }

}
