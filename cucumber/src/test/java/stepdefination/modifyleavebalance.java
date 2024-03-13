package stepdefination;

import org.openqa.selenium.By;
import org.testng.Assert;

import Testbase.Testbase;
import Utility.Scroll;
import Utility.Scroll.ScrollDiretion;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class modifyleavebalance extends Testbase{
	
	
	@When("click the modify leave balances option")
	public void click_the_modify_leave_balances_option() {
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Modify leave balances\"]")).click();   
	}

	@When("select the team members")
	public void select_the_team_members() {
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.CheckBox")).click();
		Scroll.scroll(ScrollDiretion.DOWN,0.4); 
	}

	@When("select the leave type")
	public void select_the_leave_type() {
		driver.findElement(By.xpath("//android.widget.CheckBox[@content-desc=\"leave type:Paid Leave\"]")).click();     
	}

	@When("select the set option in drop-down")
	public void select_the_set_option_in_drop_down() {
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Add\"]")).click();  
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Set\"]")).click();  
	}

	@When("enter the number of leaves")
	public void enter_the_number_of_leaves() {
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"leave type:slg1\r\n"
				+ "leaves\r\n"
				+ "Entered number will replace current balances.\"]/android.widget.EditText")).sendKeys("10");;    
	}

	@When("click the save button in modify leave balance")
	public void click_the_save_button_in_modify_leave_balance() {
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"SAVE\"]")).click();     
	}
	
	@When("click the save button on modify leave balance")
	public void click_the0_save_button_on_modify_leave_balance() {
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"YES\"]")).click();     
	}

	@Then("check if the successfully message has been shown to the modify leave balances")
	public void check_if_the_successfully_message_has_been_shown_to_the_modify_leave_balances() {
		Assert.assertTrue(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View")).isDisplayed());      
	}
}
