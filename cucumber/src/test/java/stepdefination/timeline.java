package stepdefination;

import org.openqa.selenium.By;
import org.testng.Assert;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import Testbase.Testbase;
import io.cucumber.java.en.*;


public class timeline extends Testbase{
	@When("select the task")
	public void select_the_task() {
		driver.findElement(By.xpath(xpath.select_task)).click();   
	}

	@When("click add button in timeline")
	public void click_add_button_in_timeline() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath(xpath.add_button)).click();     
	}

	@When("select date in timeline")
	public void select_date_in_timeline() throws InterruptedException  {
		Thread.sleep(1000);
		String currentTime = driver.getDeviceTime();
        LocalDateTime dateTime = LocalDateTime.parse(currentTime, DateTimeFormatter.ISO_DATE_TIME); 
        String date = dateTime.format(DateTimeFormatter.ofPattern("d", Locale.getDefault()));
        String month = dateTime.format(DateTimeFormatter.ofPattern("MMMM", Locale.getDefault()));
        String year = dateTime.format(DateTimeFormatter.ofPattern("yyyy", Locale.getDefault()));
        String dayName = dateTime.format(DateTimeFormatter.ofPattern("EEEE", Locale.getDefault()));
        dateTime.format(DateTimeFormatter.ofPattern("MM/dd/YYYY", Locale.getDefault()));
        String xpathExpression = "//android.view.View[@content-desc=\"" + date + ", " + dayName + ", " + month + " " + date + ", " + year + "\"]";

	 driver.findElement(By.xpath(xpathExpression)).click();	
		
	}

	@When("select time in timeline")
	public void select_time_in_timelineform()  {
		String currentTime = driver.getDeviceTime();
        LocalDateTime dateTime = LocalDateTime.parse(currentTime, DateTimeFormatter.ISO_DATE_TIME); 
        String hours = dateTime.format(DateTimeFormatter.ofPattern("hh", Locale.getDefault()));
		int DeductionHours = Integer.parseInt(hours) - 1;
		String DeductionHoursFormatted = String.format("%02d", DeductionHours);
        String xpathhours = "(//android.view.View[@content-desc='" + DeductionHoursFormatted + "'])[1]";
		driver.findElement(By.xpath(xpathhours)).click();	 
		
		 } 
		
	
	@When("click save button in timeline")
	public void click_save_button_in_timeline() {
		driver.findElement(By.xpath(button.save)).click();      
	}

	@When("check the success message in timeline")
	public void check_the_success_message_in_timeline() throws InterruptedException {
		Thread.sleep(3000);
//		Assert.assertTrue(driver.findElement(By.xpath(button.submit)).isDisplayed());   
		driver.findElement(By.xpath("//android.view.View[@index=1]/android.widget.ImageView[2]"));
		
		
	}
}
