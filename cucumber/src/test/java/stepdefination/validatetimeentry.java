package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Testbase.Testbase;
import io.cucumber.java.en.*;

public class validatetimeentry extends Testbase {
	boolean abc;
	@When("click the projects in dashboard")
	public void click_the_projects_in_dashboard() throws InterruptedException {
	    driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Projects\"]")).click();
	    Thread.sleep(1000);
	}

	@When("select the project and task")
	public void select_the_project_and_task() {
		driver.findElement(By.xpath("(//android.view.View[@content-desc=\"project 1\"])[1]/android.widget.ImageView[2]")).click();
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Task 1\"]/android.widget.ImageView[2]")).click();
	}

	@When("check the time entry")
	public void check_the_time_entry() {
		WebElement element = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Fri, 03/01/2024\n"
				+ "11:47 AM\n"
				+ "12h\"]"));
		  abc = element.isDisplayed();
System.out.println("Element text: " + element.getAttribute("content-desc")); 
	}

	@When("click the main menu")
	public void click_the_main_menu() {
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button")).click();   
	}

	@When("click the timesheet approval in main menu")
	public void click_the_timesheet_approval() {
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Timesheet approval\"]")).click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Monthly\"]")).click(); 
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"OK\"]")).click(); 
	}
	@When("select the team member in timesheet approval")
	public void select_the_team_member_in_timesheet_approval() {
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[7]/android.view.View/android.view.View[1]")).click();    
		 
		}

	@When("select project and task")
	public void select_project_and_task() {
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Task 1\n"
				+ "12h\"]/android.widget.ImageView[2]")).click();
	}

	@When("verify the time entry")
	public void verify_the_time_entry() {
		WebElement element2=  driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Fri, 03/01/2024\n"
				+ "11:47 AM\n"
				+ "12h\"]"));
		 boolean ale = element2.isDisplayed();
System.out.println("Element text: " + element2.getAttribute("content-desc"));
  Assert.assertEquals(ale, abc);
  
 
  

  



	}
	
}
