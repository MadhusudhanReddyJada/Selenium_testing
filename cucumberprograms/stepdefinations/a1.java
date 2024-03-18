package stepdefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class a1 {
	WebDriver d;
	@cucumber.api.java.en.Given("user is in amazon page")
	public void user_is_in_amazon_page() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d= new ChromeDriver();
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();
		 System.out.println("hi");
	}

	@When("user needs to select dropdown element and searches text")
	public void user_needs_to_select_dropdown_element_and_searches_text() {
		d.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")).sendKeys("Books");
		d.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("harryporter");
		 System.out.println("hi1");
	}

	@Then("user need to click on search button")
	public void user_need_to_click_on_search_button() {
		d.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		 System.out.println("hi2");
	}

	@And("user is navigate to home page")
	public void user_is_navigate_to_home_page() throws InterruptedException {
		d.navigate().back();
		Thread.sleep(2000);
		
		d.close();
		// System.out.println("hi3");
	}

}
