package stepdefinations;


import java.io.File;
import java.io.IOException;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dezlearn {
	WebDriver d;
	@cucumber.api.java.en.Given("user is in dezlern page")
	public void user_is_in_dezlern_page() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d= new ChromeDriver();
		d.get("https://www.dezlearn.com/javascript-alerts/");
		d.manage().window().maximize();
	}

	@cucumber.api.java.en.When("user gets title and url")
	public void user_gets_title_and_url() {
	    System.out.println(d.getTitle());
	    System.out.println(d.getCurrentUrl());
	}

	@cucumber.api.java.en.Then("user works on alert messages")
	public void user_works_on_alert_messages() {
	   
	   d.findElement(By.id("s_alert1")).click();
	   Alert a= d.switchTo().alert();
	   System.out.println(a.getText());
	   a.accept();
	}

	@cucumber.api.java.en.Then("user gets screenshot")
	public void user_gets_screenshot() throws IOException {
		 File s=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		  com.google.common.io.Files.copy(s,new  File("C://screenshots/img1.png"));
	   
	}

	@cucumber.api.java.en.And("user closes window")
	public void user_closes_window() {
	   d.close();
	}

}
