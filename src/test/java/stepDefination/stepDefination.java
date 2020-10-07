package stepDefination;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {
	@Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
       System.out.println("Hello World 1");
    }

	@When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
		System.out.println(strArg1);
		System.out.println(strArg2);
        
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	 System.out.println("Hello World 3"); 
    }

    @And("^Cards are not displayed are \"([^\"]*)\"$")
    public void cards_are_displayed_are_something(String strArg1) throws Throwable {
    	 System.out.println(strArg1); 
    }
    // Papametarijation like getting data from excel data 
    @When("^User login into application with following details$")
    public void user_login_into_application_with_following_details(DataTable data) throws Throwable {
    
    	List< List<String>> obj= data.asLists() ;
   
    	System.out.println(obj.get(0).get(0));
    	System.out.println(obj.get(0).get(1));
    	System.out.println(obj.get(0).get(2));
    	System.out.println(obj.get(0).get(3));
    }
    @When("^User login in to application with  (.+) and (.+)$")
    public void user_login_into_application_with_and(String username, String password) throws Throwable {
System.out.println(username);
System.out.println(password);

    
   

}
}