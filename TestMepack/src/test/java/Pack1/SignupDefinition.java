package Pack1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import CaseStudy.TestMepack.UtilityClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SignupDefinition {
	WebDriver driver;
	@Given("User is in the home page")
	public void user_is_in_the_home_page() {
		
		driver=UtilityClass.getDriver("Chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@And("select the Registration button")
	public void select_the_Registration_button() {
		
		driver.findElement(By.linkText("SignUp")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("I enter valid credentials")
	public void i_enter_valid_credentials() {
		driver.findElement(By.id("userName")).sendKeys("ArunKumar");
		   driver.findElement(By.name("firstName")).sendKeys("sundar");
		   
		   driver.findElement(By.name("lastName")).sendKeys("srinivasan");
		   driver.findElement(By.id("password")).sendKeys("Arun123");
		   driver.findElement(By.id("pass_confirmation")).sendKeys("Arun123");
		   driver.findElement(By.xpath("//*[@id='gender']")).click();
		   driver.findElement(By.id("emailAddress")).sendKeys("ssksundar@gmail.com");
		   driver.findElement(By.id("mobileNumber")).sendKeys("9500535563");
		   
		   driver.findElement(By.name("dob")).sendKeys("07/18/1997");
		   driver.findElement(By.id("address")).sendKeys("boyampalayam,tirupur");
		   Select question = new Select(driver.findElement(By.id("securityQuestion")));
		   question.selectByValue("411011");
		   driver.findElement(By.id("answer")).sendKeys("blue");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@And("clicks register button")
	public void clicks_register_button() {
		  driver.findElement(By.name("Submit")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("navigated to Login page")
	public void navigated_to_Home_page() {

		Assert.assertEquals("Login", driver.getTitle());
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}
