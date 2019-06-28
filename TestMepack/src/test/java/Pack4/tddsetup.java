package Pack4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CaseStudy.TestMepack.UtilityClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class tddsetup {
	
	WebDriver driver;
	@Given("ALex has registered in TestMeApp")
	public void alex_has_registered_in_TestMeApp() {
		driver=UtilityClass.getDriver("Chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		driver.findElement(By.name("password")).sendKeys("password123");
		driver.findElement(By.name("Login")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@And("ALex search a particular product like HeadPhone")
	public void alex_search_a_particular_product_like_HeadPhone() {
		driver.findElement(By.id("myInput")).sendKeys("HeadPhone");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("Try to proceed payment without adding any item in the cart")
	public void try_to_proceed_payment_without_adding_any_item_in_the_cart() {
		
		Assert.assertEquals( driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).getText(),
				 "Cart "+ driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]/b")).getText()+"   ");
		 System.out.println( driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).getText());
		 System.out.println( "Cart "+ driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]/b")).getText()+"   ");
		  
		
	      
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("TestMe doesn't display the cart icon")
	public void testme_doesn_t_display_the_cart_icon() {
		driver.close();
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}
	
	@Given("ALex has registered in TestMeApps")
	public void alex_has_registered_in_TestMeApps() {
		driver=UtilityClass.getDriver("Chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		driver.findElement(By.name("password")).sendKeys("password123");
		driver.findElement(By.name("Login")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("ALex search a particular product like HeadPhones")
	public void alex_search_a_particular_product_like_HeadPhones() {
		driver.findElement(By.id("myInput")).sendKeys("HeadPhone");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("add product to cart")
	public void add_product_to_cart() {
		driver.findElement(By.xpath("//html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		
		Assert.assertEquals( driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).getText(),
				 "Cart "+ driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]/b")).getText()+"   ");
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("Try to proceed payment")
	public void try_to_proceed_payment() {
		 driver.findElement(By.xpath("//*[@id='cart']/tfoot/tr[2]/td[5]/a")).click();
		    driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
		    WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h3")));
	        driver.findElement(By.xpath("//*[@id='swit']/div[1]/div/label")).click();
	        driver.findElement(By.id("btn")).click();
	        Assert.assertEquals(driver.getTitle(), "Payment Gateway");
	        driver.findElement(By.name("username")).sendKeys("123456");
	        driver.findElement(By.name("password")).sendKeys("Pass@456");
	        driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	        WebDriverWait waitt = new WebDriverWait(driver, 10);
	        waitt.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h4")));
	        driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
	        driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("SuccesFully purchased a product")
	public void succesfully_purchased_a_product() {
		
		Assert.assertEquals(driver.getTitle(), "Order Details");
		System.out.println("product purchased successfully");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}


}
