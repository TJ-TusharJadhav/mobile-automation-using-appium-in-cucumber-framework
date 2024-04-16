package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Testbase.Testbase;
import io.cucumber.java.en.*;

public class addtask extends Testbase {
	@When("select the project")
	public void select_the_project() throws InterruptedException {
		Thread.sleep(1000);
	 driver.findElement(By.xpath(xpath.select_project)).click();  
	}
	@When("click add task button")
	public void click_add_task_button() {
		 driver.findElement(By.xpath(xpath.addtask)).click();      
	}

	@When("enter the task name {string}")
	public void enter_the_task_name(String string) {
		WebElement task = driver.findElement(By.xpath(xpath.task_name));
	   	 Actions a=new Actions(driver);
	 	   a.moveToElement(task).click().perform();
	 	  task.sendKeys(string);   
	}

	@When("enter the description in add task form {string}")
	public void enter_the_description_in_add_task_form(String string) {
		WebElement description = driver.findElement(By.xpath(xpath.task_description));
	   	 Actions a=new Actions(driver);
	 	   a.moveToElement(description).click().perform();
	 	  description.sendKeys(string);   
	}

	@When("click the add button in add task form")
	public void click_the_add_button_in_add_task_form() {
		driver.findElement(By.xpath(button.add)).click();     
	}

	@When("Check if a new task has been added")
	public void check_if_a_new_task_has_been_added() {
		Assert.assertTrue(driver.findElement(By.xpath(button.add)).isDisplayed());   
	}

	@When("Check the empty text filed meassage in add task form")
	public void check_the_empty_text_filed_meassage_in_add_task_form() {
		Assert.assertTrue(driver.findElement(By.xpath(xpath.empty_task_name)).isDisplayed());     
	}
}
