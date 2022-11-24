package stepdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class deepak {
	WebDriver d;
	@Given("user open new tours application")
	public void user_open_new_tours_application() {
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://demo.guru99.com/test/newtours/");
	    d.manage().window().maximize();
	}

	@When("user ned to click register")
	public void user_ned_to_click_register() {
		
	    
	}

	@Then("user need to get elements from drop down")
	public void user_need_to_get_elements_from_drop_down() {
	    
	}

	@Then("user nav to home page")
	public void user_nav_to_home_page() {
	    
	}


}
