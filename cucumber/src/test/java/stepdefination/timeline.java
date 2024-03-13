package stepdefination;

import org.openqa.selenium.By;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import Testbase.Testbase;
import Utility.TimePickerWeel;
import io.cucumber.java.en.*;


public class timeline extends Testbase{
	@When("select the task")
	public void select_the_task() {
		driver.findElement(By.xpath("(//android.view.View[@content-desc=\"Task 1\"])[1]/android.widget.ImageView[2]")).click();   
	}

	@When("click add button in timeline")
	public void click_add_button_in_timeline() {
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"ADD\"]")).click();     
	}

	@When("select date in timeline")
	public void select_date_in_timeline()  {
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Time\"]")).click();	
		
	}

	@When("select time in timeline")
	public void select_time_in_timelineform()  {
		
		 
		
		 }

		

		    
		    
		 
		 
		 
		
	
	@When("click save button in timeline")
	public void click_save_button_in_timeline() {
//		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"SAVE\"]")).click();      
	}

	@When("check the success message in timeline")
	public void check_the_success_message_in_timeline() {
////		Assert.assertTrue(driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"SUBMIT\"]")).isDisplayed());    
	}
}
