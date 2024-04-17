package stepdefination;
import org.openqa.selenium.By;

import Utility.Scroll;
import Utility.Scroll.ScrollDiretion;
import io.cucumber.java.en.When;
import testbase.TestBase;

public class reports extends TestBase {
	@When("click the reports option in dashboard")
	public void click_the_reports_option_in_dashboard() throws InterruptedException {
		Thread.sleep(2000);
		Scroll.scroll(ScrollDiretion.DOWN,0.4); 
        driver.findElement( By.xpath("//android.widget.ImageView[@content-desc=\"Reports\"]")).click();
	}
	@When("click the timesheet reports option in dashboard")
	public void click_the_timesheet_reports_option_in_dashboard() {
	   driver.findElement( By.xpath("//android.view.View[@content-desc=\"Timesheet report\"]")).click();
	}
	@When("select the project in report")
	public void select_the_project_in_report() {
//	   driver.findElement( By.xpath("//android.widget.ImageView[@content-desc=\"Choose project\r\n"
//	   		+ "All projects\"]")).click();
	}
	
	@When("select the monthly redio button in duration field")
	public void select_the_monthly_redio_button_in_duration_field() {
		 driver.findElement( By.xpath("//android.view.View[@content-desc=\"Monthly\"]/android.widget.RadioButton")).click();   
	}
	@When("select the month")
	public void select_the_month() {
		driver.findElement( By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.ImageView[2]")).click();  
		driver.findElement( By.xpath("//android.view.View[@content-desc=\"1, Monday, January 1, 2024\"]")).click();   
		driver.findElement( By.xpath("//android.widget.Button[@content-desc=\"OK\"]")).click();  
	}
	@When("select the project wish option in grouping field")
	public void select_the_project_wish_option_in_grouping_field() throws InterruptedException {
//		Thread.sleep(2000);
//		List<MobileElement> element = driver.findElement(By.className(""));
//     for (int i=0; i<element.size();i++) {
//    	 if(element.get(i).getText().equals("name")) {
//    		 element.get(i).click();
//    		 break;
//    	 }
//     }
    	 
		Scroll.scroll(ScrollDiretion.DOWN,0.4);
//		 driver.findElementByAccessibilityId("Views").click();
		
	}
	@When("select the hhmm format in time format field")
	public void select_the_hhmm_format_in_time_format_field() {
		
	}

	@When("click the download button in reports")
	public void click_the_download_button_in_reports() {
		driver.findElement( By.xpath("//android.widget.Button[@content-desc=\"DOWNLOAD\"]")).click();   
	}
	
	

}
