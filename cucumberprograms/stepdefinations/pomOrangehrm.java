package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pomOrangehrm {
	WebDriver d;
	By uname=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
	By pass=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
	By enter=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	@cucumber.api.java.en.Given("open orangeHRM site")
	public void open_orange_hrm_site() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d= new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();
	}

	@cucumber.api.java.en.When("login witn username and password by pom")
	public void login_witn_username_and_password_by_pom() {
	   d.findElement(uname).sendKeys("Admin");
	   d.findElement(pass).sendKeys("admin123");
	   d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

	@cucumber.api.java.en.Then("caputreing data after login")
	public void caputreing_data_after_login() {
	    d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
	}

	@cucumber.api.java.en.Then("close current window")
	public void close_current_window() {
	   d.close();
	}

}
