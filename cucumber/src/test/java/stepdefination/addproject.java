package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Testbase.Testbase;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class addproject extends Testbase {
//	@After
//	public void a(){
//		driver.quit();
//	}
	@When("click the projects option in dashboard")
	public void click_the_projects_option_in_dashboard() {
	 driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Projects\"]")).click();
	 }

	@When("click the add project button")
	public void click_the_add_project_button() {
    driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"ADD PROJECT\"]")).click();   
	}

	@When("enter the project name {string}")
	public void enter_the_project_name(String string) {
		WebElement project = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]"));
   	 Actions a=new Actions(driver);
 	   a.moveToElement(project).click().perform();
 	  project.sendKeys(string);    
	}

	@When("enter the description {string}")
	public void enter_the_description(String string) {
		WebElement description = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]"));
	   	 Actions a=new Actions(driver);
	 	   a.moveToElement(description).click().perform();
	 	  description.sendKeys(string);      
	}

	@When("click the add button in add project form")
	public void click_the_add_button_in_add_project_form() {
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"ADD\"]")).click();     
	}
	@When("Check if a new project has been added")
	public void check_if_a_new_project_has_been_added() {
		Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Projects\"]")).isDisplayed());   
	}

	@When("Check the empty text filed meassage")
	public void check_the_empty_text_filed_meassage() {
		Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Project name is empty!\"]")).isDisplayed());   
	}

}
