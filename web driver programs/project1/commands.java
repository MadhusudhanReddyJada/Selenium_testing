package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.amazon.co.in/");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.findElement(By.id("searchDropdownBox")).sendKeys("");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
		d.findElement(By.id("nav-search-submit-button")).click();
		boolean selected=d.findElement(By.id("nav-search-submit-button")).isSelected();
		System.out.println(selected);
		d.close();

	}

}
