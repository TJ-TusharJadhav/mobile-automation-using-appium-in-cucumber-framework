package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


import io.cucumber.java.en.*;
import testbase.TestBase;

public class addproject extends TestBase {
	public static final String RESET = "\u001B[0m";
	public static final String GREEN = "\u001B[32m";
	 public static final String RED = "\u001B[31m";
//	@After
//	public void a(){
//		driver.quit();
//	}
	@When("click the projects option in dashboard")
	public void click_the_projects_option_in_dashboard() throws InterruptedException {
		Thread.sleep(5000);
	 driver.findElement(By.xpath(xpath.projects)).click();
	 }

	@When("click the add project button")
	public void click_the_add_project_button() {
    driver.findElement(By.xpath(xpath.addproject)).click();   
	}

	@When("enter the project name {string}")
	public void enter_the_project_name(String string) {
		WebElement project = driver.findElement(By.xpath(xpath.project_name));
   	 Actions a=new Actions(driver);
 	   a.moveToElement(project).click().perform();
 	  project.sendKeys(string);    
	}

	@When("enter the description {string}")
	public void enter_the_description(String string) {
		WebElement description = driver.findElement(By.xpath(xpath.project_description));
	   	 Actions a=new Actions(driver);
	 	   a.moveToElement(description).click().perform();
	 	  description.sendKeys(string);      
	}

	@When("click the add button in add project form")
	public void click_the_add_button_in_add_project_form() {
		driver.findElement(By.xpath(button.add)).click();     
	}
	@When("Check if a new project has been added")
	public void check_if_a_new_project_has_been_added() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Project\"]")).isDisplayed()); 
		System.out.println(GREEN+"    new project is successfully added"+RESET);
		 }

	@When("Check the empty text filed meassage")
	public void check_the_empty_text_filed_meassage() {
		Assert.assertTrue(driver.findElement(By.xpath(xpath.empty_project_name)).isDisplayed());
		
	}

}
