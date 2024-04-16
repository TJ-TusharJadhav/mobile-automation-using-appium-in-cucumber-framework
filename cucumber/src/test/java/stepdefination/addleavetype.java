package stepdefination;




import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Testbase.Testbase;
import Utility.Scroll;
import Utility.Scroll.ScrollDiretion;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addleavetype extends Testbase{

	String t = RandomStringUtils.randomAlphabetic(3);
	String d = RandomStringUtils.randomAlphabetic(100);

	@When("click the leave managment option in dashboard")
	public void click_the_leave_managment_option_in_dashboard() throws InterruptedException {
		Thread.sleep(1000);
		Scroll.scroll(ScrollDiretion.DOWN,0.3); Thread.sleep(1000);
		driver.findElement(By.xpath(xpath.leavemanagment)).click();   
	}

	@When("click the leave types option")
	public void click_the_leave_types_option() {
		driver.findElement(By.xpath(xpath.leavetypes)).click();    
	}

	@When("click the add leave type button")
	public void click_the_add_leave_type_button() {
		driver.findElement(By.xpath(xpath.add_leave_type)).click();    
	}

	@When("enter the leave type name")
	public void enter_the_leave_type_name() {
		WebElement type = driver.findElement(By.xpath(xpath.leave_type_name));
		Actions a=new Actions(driver);
	   a.moveToElement(type).click().perform();
	   type.sendKeys("leave type:"+t+"1");   
	}

	@When("enter the description in leave type field")
	public void enter_the_description_in_leave_type_field() {
		WebElement description = driver.findElement(By.xpath(xpath.leave_type_description));
		Actions a=new Actions(driver);
	   a.moveToElement(description).click().perform();
	   description.sendKeys("description: "+d+ "End");    
	}

	@When("click the is balance tracked")
	public void click_the_is_balance_tracked() {
		driver.findElement(By.xpath(xpath.balance_track)).click();    
	}

	@When("click the save button in add leave type form")
	public void click_the_save_button_in_add_leave_type_form() {
		driver.findElement(By.xpath(button.save)).click();  
	}

	@Then("Check if a new leave type has been added in leave type field")
	public void Check_if_a_new_leave_type_has_been_added_in_leave_type_field() {
		Assert.assertTrue(driver.findElement(By.xpath(xpath.add_leave_type)).isDisplayed());   
	}

	
	@Then("Check the empty text filed meassage in leave type field")
	public void check_the_empty_text_filed_meassage_in_leave_type_field() {
		Assert.assertTrue(driver.findElement(By.xpath(xpath.empty_leave_type)).isDisplayed());   
	}
}
