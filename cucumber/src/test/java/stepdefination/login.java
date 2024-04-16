package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import Testbase.Testbase;
import io.cucumber.java.en.*;

public class login extends Testbase {

	 @Given("open application")
	 public void open_the_application(){
		 initialize();
	 }
	
	 @When("^user enters the email as (.+)$")
	    public void user_enters_the_email_as(String abc){
		WebElement email = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[2]"));
		Actions a=new Actions(driver);
	   a.moveToElement(email).click().perform();
	   email.sendKeys(abc);
	    }
	    @And("^user enters the password as (.+)$")
	    public void user_enters_the_password_as(String abc){
	    	 WebElement password = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText"));
	    	 Actions a=new Actions(driver);
	  	   a.moveToElement(password).click().perform();
	  	 password.sendKeys(abc);
	    
	    }
	    @And("user click on login button")
	    public void user_click_on_login_button(){
	    	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"LOGIN\"]")).click(); 
		 }
	    
	   @Then("A login success message should be displayed")
	    public void A_login_success_message_should_be_displayed() {
	    Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Login Successful\"]")).isDisplayed());
	    	
	   
	    }
	   @Then("A bad credentials message should be displayed")
	    public void A_bad_credentials_message_should_be_displayed() {
	    Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Bad credentials!\"]")).isDisplayed());
	    	
	   
	    }
	    
	   @Then("A empty emailfield message should be displayed")
	    public void A_empty_emailfield_message_should_be_displayed() {
	    Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Please enter a valid email Address\"]")).isDisplayed());
	    	
	   
	    }
	   @Then("A empty passwordfield message should be displayed")
	    public void A_empty_passwordfield_message_should_be_displayed() {
	    Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Password cannot be blank\"]")).isDisplayed());
	    	
	   
	    }
	   


}
