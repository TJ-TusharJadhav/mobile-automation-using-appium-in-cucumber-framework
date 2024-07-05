package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.*;
import testbase.testbase;

public class Login extends testbase {
	 @Given("open application")
	 public void open_the_application(){
		 initialize();
	 }
	
	 @When("^user enters the email as (.+)$")
	    public void user_enters_the_email_as(String abc) throws InterruptedException{
		 Thread.sleep(5000);
		WebElement email = driver.findElement(By.xpath(xpath.login_Email));
		Actions a=new Actions(driver);
	   a.moveToElement(email).click().perform(); Thread.sleep(2000);
	   email.sendKeys(abc);
	    }
	    @And("^user enters the password as (.+)$")
	    public void user_enters_the_password_as(String abc) throws InterruptedException{
	    	 WebElement password = driver.findElement(By.xpath(xpath.login_password));
	    	 Actions a=new Actions(driver);
	  	   a.moveToElement(password).click().perform(); Thread.sleep(2000);
	  	 password.sendKeys(abc);
	    
	    }
	    @And("user click on login button")
	    public void user_click_on_login_button(){
	    	driver.findElement(By.xpath(xpath.login_button)).click(); 
		 }
	    
	   @Then("A login success message should be displayed")
	    public void A_login_success_message_should_be_displayed() throws InterruptedException {
		   Thread.sleep(4000);
	    Assert.assertTrue(driver.findElement(By.xpath(xpath.Login_Successful)).isDisplayed());
	    	
	   
	    }
	   @Then("A bad credentials message should be displayed")
	    public void A_bad_credentials_message_should_be_displayed() throws InterruptedException {
		   Thread.sleep(2000);
	    Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Bad credentials!\"]")).isDisplayed());
	    	
	   
	    }
	    
	   @Then("A empty emailfield message should be displayed")
	    public void A_empty_emailfield_message_should_be_displayed() throws InterruptedException {
		   Thread.sleep(4000);
	    Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Please enter a valid email Address\"]")).isDisplayed());
	    	
	   
	    }
	   @Then("A empty passwordfield message should be displayed")
	    public void A_empty_passwordfield_message_should_be_displayed() throws InterruptedException {
		   Thread.sleep(4000);
	    Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Password cannot be blank\"]")).isDisplayed());
	    	
	   
	    }
}
