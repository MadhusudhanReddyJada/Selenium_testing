package stepdefinations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class propertiesexample {
	WebDriver d;
	@Given("user opens newtours page")
	public void user_opens_newtours_page() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d= new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
	}

	@When("user login with uname password by property list")
	public void user_login_with_uname_password_by_property_list() throws IOException {
		FileInputStream f1=new FileInputStream("C:\\eclipse-workspace\\madhuproject1\\src\\test\\java\\stepdefinations\\p1.properties");
		Properties p1= new Properties();
		p1.load(f1);
		d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys(p1.getProperty("uname"));
		d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")).sendKeys(p1.getProperty("pass"));
		d.findElement(By.name("submit")).click();
	    	}

	@Then("user  capturs screenshot")
	public void user_capturs_screenshot() throws IOException {
		File s=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		  com.google.common.io.Files.copy(s,new  File("C://screenshots/img1.png"));
	}
	@Then("user closes current window")
	public void user_closes_current_window() {
	    d.close();
	}


}
