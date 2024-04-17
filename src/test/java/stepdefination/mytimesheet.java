package stepdefination;

import org.openqa.selenium.By;
import org.testng.Assert;


import io.cucumber.java.en.*;
import testbase.TestBase;

public class mytimesheet extends TestBase{

	@When("click the my timesheet option in dashboard")
	public void click_the_my_timesheet_option_in_dashboard() throws InterruptedException   {
		Thread.sleep(2000);
		driver.findElement(By.xpath(xpath.mytimesheet)).click();
	    
	}

	@When("click the monthly filter")
	public void click_the_monthly_filter() throws InterruptedException {
		Thread.sleep(1000);
		 driver.findElement(By.xpath(xpath.monthly_filter)).click();
		 
		   
	}
	@When("select the month in mytimesheet")
	public void select_the_month_in_mytimesheet() {
		driver.findElement(By.xpath("//android.view.View[@index=10]")).click();
		//		String dayName = "Monday";
//	    String month = "January";
//	    int year = 2024;
//	    int MONTH= 1;  
//     String monthly_filter = "//android.view.View[@content-desc=\"" + MONTH + ", " + dayName + ", " + month + " " + MONTH + ", " + year + "\"]";
//	 driver.findElement(By.xpath(monthly_filter)).click();
	    
	}

	@When("click the ok button")
	public void click_the_ok_button() {
		 driver.findElement(By.xpath(button.ok)).click();  
	}

	@When("selected month should be select")
	public void selected_month_should_be_select() {
		
		    
	}

	@When("click the weekly filter")
	public void click_the_weekly_filter() throws InterruptedException {
		Thread.sleep(1000);	
		driver.findElement(By.xpath(xpath.weekly_filter)).click();
		 
	}

	@When("select the week")
	public void select_the_week() {
		 String dayName1 = "Monday";
		    String month1 = "April";
		    int year1 = 2024;
		    int date= 15; 
		 String weekly_filter = "//android.view.View[@content-desc=\"" + date + ", " + dayName1 + ", " + month1 + " " + date + ", " + year1 + "\"]";
	     driver.findElement(By.xpath(weekly_filter)).click();    
	}

	@When("selected week should be select")
	public void selected_week_should_be_select() { 
	}

	@When("click the daily filter")
	public void click_the_daily_filter() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(xpath.daily_filter)).click(); 
		
	}
	@When("select the date in my timesheet")
	public void select_the_date_in_my_timesheet() throws InterruptedException {
		Thread.sleep(1000);
		String dayName2 = "Monday";
	    String month2 = "April";
	    int year2 = 2024;
	    int date2= 15; 
	    Thread.sleep(1000);
	 String daily_filter = "//android.view.View[@content-desc=\"" + date2 + ", " + dayName2 + ", " + month2 + " " + date2 + ", " + year2 + "\"]";
     System.out.print(daily_filter);
     driver.findElement(By.xpath(daily_filter)).click();  
		
	}

	@When("selected date should be select")
	public void selected_date_should_be_select() throws InterruptedException {
		 
	}	
	
	@When("click the project wish")
	public void click_the_project_wish() {
	  
	}

	@When("verify the project wish")
	public void verify_the_project_wish() {
	   
	}

	@When("click the date wish")
	public void click_the_date_wish() {
	   driver.findElement(By.xpath(xpath.date_wish)).click();
	}

	@When("verify the date wish")
	public void verify_the_date_wish() {
//		Assert.assertTrue(driver.findElement(By.xpath(xpath.validat_date_wish)).isDisplayed());  
	}
	
	
	
}
