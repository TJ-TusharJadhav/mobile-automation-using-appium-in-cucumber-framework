package stepdefination;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

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
	driver.findElement(By.xpath(xpath.workschedule)).click() ;  
	}

	@When("click the add workschedule button")
	public void click_the_add_workschedule_button() {
		driver.findElement(By.xpath(xpath.add_workschedule)).click() ;    
	}

	@When("enter the name {string}")
	public void enter_the_name(String string) {
		WebElement workschedule = driver.findElement(By.xpath(xpath.workschedule_name));
   	 Actions a=new Actions(driver);
 	   a.moveToElement(workschedule).click().perform();
 	  workschedule.sendKeys(string); 
	}

	@When("select the date")
	public void select_the_date() {
		driver.findElement(By.xpath(xpath.start_date)).click() ;  
		String currentTime = driver.getDeviceTime();
        LocalDateTime dateTime = LocalDateTime.parse(currentTime, DateTimeFormatter.ISO_DATE_TIME);
        String date = dateTime.format(DateTimeFormatter.ofPattern("d", Locale.getDefault()));
        String month = dateTime.format(DateTimeFormatter.ofPattern("MMMM", Locale.getDefault()));
        String year = dateTime.format(DateTimeFormatter.ofPattern("yyyy", Locale.getDefault()));
        String dayName = dateTime.format(DateTimeFormatter.ofPattern("EEEE", Locale.getDefault()));
        String xpathExpression = "//android.view.View[@content-desc=\"" + date + ", " + dayName + ", " + month + " " + date + ", " + year + "\"]";
		driver.findElement(By.xpath(xpathExpression)).click();
	}

	@When("select the expected hours")
	public void select_the_expected_hours() throws InterruptedException {
		driver.findElement(By.xpath(xpath.hours)).click() ; //hours
		driver.findElement(By.xpath(xpath.select_hours)).click() ; //hours
		Thread.sleep(1000);
		driver.findElement(By.xpath(xpath.min)).click() ; //min
		driver.findElement(By.xpath(xpath.select_min)).click() ; //min
		
		
	}

	@When("select the week off days")
	public void select_the_week_off_days() {
		driver.findElement(By.xpath(xpath.sun)).click() ; 
		Scroll.scroll(ScrollDiretion.DOWN,0.4); 
		driver.findElement(By.xpath(xpath.sat)).click() ;
		
	}

	@When("click the add button")
	public void click_the_add_button() {
		driver.findElement(By.xpath(xpath.add)).click() ;   
	}

	@When("enter the holiday name {string}")
	public void enter_the_holiday_name(String string) {
		WebElement holiday = driver.findElement(By.xpath(xpath.holiday_name));
	   	 Actions a=new Actions(driver);
	 	   a.moveToElement(holiday).click().perform();
	 	  holiday.sendKeys(string); 
	 	
	}
	
	@When("select date")
	public void select_date() {
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Add holiday\n"
				+ "Name\"]/android.widget.ImageView")).click() ; 
		String currentTime = driver.getDeviceTime();
        LocalDateTime dateTime = LocalDateTime.parse(currentTime, DateTimeFormatter.ISO_DATE_TIME);
        String date = dateTime.format(DateTimeFormatter.ofPattern("d", Locale.getDefault()));
        String month = dateTime.format(DateTimeFormatter.ofPattern("MMMM", Locale.getDefault()));
        String year = dateTime.format(DateTimeFormatter.ofPattern("yyyy", Locale.getDefault()));
        String dayName = dateTime.format(DateTimeFormatter.ofPattern("EEEE", Locale.getDefault()));
        String xpathExpression = "//android.view.View[@content-desc=\"" + date + ", " + dayName + ", " + month + " " + date + ", " + year + "\"]";
		driver.findElement(By.xpath(xpathExpression)).click();
	}

	@When("click the save button on holidays pop-up window")
	public void click_the_save_butto_holidays() {
		driver.findElement(By.xpath(button.save)).click() ;    
	}
	
	
	@When("click the save button")
	public void click_the_save_button() {
		driver.findElement(By.xpath(button.save)).click() ;      
	}

	@Then("Check if a new work schedule has been added")
	public void check_if_a_new_work_schedule_has_been_added() {
		 Assert.assertTrue(driver.findElement(By.xpath(xpath.workschedule)).isDisplayed());
		
			}
	@Then("check the empty filed meassge in name field")
	public void error() {
		Assert.assertTrue(driver.findElement(By.xpath(xpath.empty_workschedule_name)).isDisplayed());
	}
	@And ("check the empty filed meassge in Start date field")
	public void error1() {
		Assert.assertTrue(driver.findElement(By.xpath(xpath.empty_workschedule_start_date)).isDisplayed());
	}
}
