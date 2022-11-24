package stepdefinations;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class practice {
	ChromeDriver d;
	@Given("user is in Amazon page")
	public void user_is_in_Amazon_page() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://amazon.com");
	    d.manage().window().maximize();
	}

	@When("user clicks all links and navigate back")
	public void user_clicks_all_links_and_navigate_back() throws InterruptedException {
		 WebElement e=d.findElement(By.id("nav-xshop"));
		    ArrayList<WebElement> l = new ArrayList<WebElement>(10);
		    		//e.findElements(By.tagName("a"));
		   for(int i=1;i<10;i++)
		    l.add(d.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a["+i+"]")));
		    System.out.println(l.size());
		    for(int i=0;i<l.size();i++) {
		   	System.out.println(l.get(i).getText());
		   	l.get(i).click();
		   	d.navigate().back();
//		   	e=d.findElement(By.id("nav-xshop"));//*[@id="nav-xshop"]/a[2]
//		    l=e.findElements(By.tagName("a"));
		   	
		   }
		    Thread.sleep(2000);
	}

	@Then("user get url and title of page and store in exel sheet")
	public void user_get_url_and_title_of_page_and_store_in_exel_sheet() {
	   
	}

	@Then("closing the browser")
	public void closing_the_browser() {
	    d.close();
	}
}
