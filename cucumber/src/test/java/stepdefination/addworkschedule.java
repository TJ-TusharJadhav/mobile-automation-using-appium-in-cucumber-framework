package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Testbase.Testbase;
import Utility.Scroll;
import Utility.Scroll.ScrollDiretion;
import io.cucumber.java.en.*;

public class addworkschedule extends Testbase{
	

	
	
	@When("click the workschedules option in dashboard")
	public void click_the_workschedules_option_in_dashboard() {
	driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Work schedules\"]")).click() ;  
	}

	@When("click the add workschedule button")
	public void click_the_add_workschedule_button() {
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"ADD WORK SCHEDULE\"]")).click() ;    
	}

	@When("enter the name {string}")
	public void enter_the_name(String string) {
		WebElement password = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText"));
   	 Actions a=new Actions(driver);
 	   a.moveToElement(password).click().perform();
 	 password.sendKeys(string); 
	}

	@When("select the date")
	public void select_the_date() {
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[1]")).click() ;  
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"10, Saturday, February 10, 2024\"]")).click() ;
	}

	@When("select the expected hours")
	public void select_the_expected_hours() throws InterruptedException {
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"0m\n"
				+ "8h\"]")).click() ; //hours
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"5h\"]")).click() ; //hours
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"0m\"]")).click() ; //min
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"30m\"]")).click() ; //min
		
		
	}

	@When("select the week off days")
	public void select_the_week_off_days() {
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Sun\"]")).click() ; 
		Scroll.scroll(ScrollDiretion.DOWN,0.4); 
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Sat\"]")).click() ;
		
	}

	@When("click the add button")
	public void click_the_add_button() {
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"ADD\"]")).click() ;   
	}

	@When("enter the holiday name {string}")
	public void enter_the_holiday_name(String string) {
		WebElement password = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Add holiday\"]/android.widget.EditText"));
	   	 Actions a=new Actions(driver);
	 	   a.moveToElement(password).click().perform();
	 	 password.sendKeys(string); 
	 	
	}
	
	@When("select date")
	public void select_date() {
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Add holiday\n"
				+ "Name\"]/android.widget.ImageView")).click() ; 
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"15, Thursday, February 15, 2024\"]")).click() ;
	}

	@When("click the save button on holidays pop-up window")
	public void click_the_save_butto_holidays() {
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"SAVE\"]")).click() ;    
	}
	
	
	@When("click the save button")
	public void click_the_save_button() {
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"SAVE\"]")).click() ;      
	}

	@Then("Check if a new work schedule has been added")
	public void check_if_a_new_work_schedule_has_been_added() {
		 Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Work schedules\"]")).isDisplayed());
//		Assert.assertTrue( driver.findElement(By.xpath("(//android.view.View[@content-desc=\"Night Shift\"])[1]")).isDisplayed());
		
			}
	@Then("check the empty filed meassge in name field")
	public void error() {
		Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Name can't be empty\"]")).isDisplayed());
	}
	@And ("check the empty filed meassge in Start date field")
	public void error1() {
		Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Effective start date can't be empty\"]")).isDisplayed());
	}
}
