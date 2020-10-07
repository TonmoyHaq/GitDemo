package stepDefination;



import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Cucumber.Automation.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;

@RunWith(Cucumber.class)
public class MyStepDefination {
	public WebDriver driver;

    @Given("^User is on Greencart Landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable {
    	driver=Base.getDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        
    }

    @When("^User search for \"([^\"]*)\" Vegitable$")
    public void user_search_for_something_vegitable(String strArg1) throws Throwable {
    	try {
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//input[@class='search-keyword']")).sendKeys(strArg1);
        Thread.sleep(3000);
    	}
    	catch(Exception e) {
    		System.out.println("Unable to find element");
    	}
    }

    @Then("^\"([^\"]*)\" results are generated$")
    public void something_results_are_generated(String strArg1) throws Throwable {

     //Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
    	System.out.println("OKKK");
    }
    @Then("^Verify selected \"([^\"]*)\" items are displayed in check out page$")
    public void verify_selected_something_items_are_displayed_in_check_out_page(String strArg1) throws Throwable {
     
    }

    @And("^ Adding items to cart$")
    public void adding_items_to_cart() throws Throwable {
    
    }

    @And("^User proceed to checkout page for purchase$")
    public void user_proceed_to_checkout_page_for_purchase() throws Throwable {
     
    }
}
