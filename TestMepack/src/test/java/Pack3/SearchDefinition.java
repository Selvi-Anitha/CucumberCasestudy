package Pack3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CaseStudy.TestMepack.UtilityClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class SearchDefinition {
	
	WebDriver driver;

@Given("User must Login the TestMeApp")
public void user_must_Login_the_TestMeApp() {
	
	driver=UtilityClass.getDriver("Chrome");
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.findElement(By.linkText("SignIn")).click();
	driver.findElement(By.name("userName")).sendKeys("lalitha");
	driver.findElement(By.name("password")).sendKeys("password123");
	driver.findElement(By.name("Login")).click();
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@And("Enter Product in the Search box")
public void enter_Product_in_the_Search_box() {
	driver.findElement(By.id("myInput")).sendKeys("Head");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Then("Click Find Details button")
public void click_Find_Details_button() {
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}
	
	@Then("Add to Cart page is displayed")
	public void add_to_Cart_page_is_displayed() {
		
	 Assert.assertEquals("Search", driver.getTitle());
	 System.out.println("navigated successfully");
	 
	}
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();


}
