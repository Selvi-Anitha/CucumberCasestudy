package Pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CaseStudy.TestMepack.UtilityClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class signinDefinition {
	
	WebDriver driver;
	@Given("User is in home page")
	public void user_is_in_home_page() {
		
		driver=UtilityClass.getDriver("Chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("User click Login  button")
	public void user_click_Login_button() {
		driver.findElement(By.linkText("SignIn")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@And("User give userName {string}")
	public void user_give_userName(String string) {
		
		driver.findElement(By.name("userName")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@And("User give password {string}")
	public void user_give_password(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
	}

	@Then("Click Login")
	public void click_Login() {
		driver.findElement(By.name("Login")).click();
		Assert.assertEquals("Home", driver.getTitle());
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}
