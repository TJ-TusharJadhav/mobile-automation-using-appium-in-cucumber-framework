package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import Utility.Scroll;
import Utility.Scroll.ScrollDiretion;
import io.cucumber.java.en.*;
import testbase.TestBase;

public class editteammember extends TestBase {
	@Given("select the team member")
	public void select_the_team_member() {
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View[1]")).click();     
	}

	@Given("click the role assignment option")
	public void click_the_role_assignment_option() {
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Role assignment\"]")).click();     
	}

//	@Given("click the more buttons")
//	public void click_the_more_buttons() throws InterruptedException {
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//android.view.View[@content-desc=\"More\"])[1]")).click();    
//		Thread.sleep(1000);
//		}
//
//	@Given("select the all roles")
//	public void select_the_all_roles() throws InterruptedException {
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.CheckBox[1]")).click(); 
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.CheckBox[2]")).click(); 
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.CheckBox[3]")).click(); 
//		 
//	}
	@When("click the Associated work schedule option")
	public void click_the_associated_work_schedule_option() {
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Associated work schedule\"]")).click();   
	}

	@When("click the work schedule")
	public void click_the_work_schedule() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Regular\"]")).click();     
	}

	@When("select the work schedule")
	public void select_the_work_schedule() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Feb\"]")).click();       
	}
	@When("click the bank details option")
	public void click_the_bank_details_option() {
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Bank details\"]")).click();      
	}

	@When("enter the acccount holder name {string}")
	public void enter_the_name(String string) {
		WebElement p=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]"));
 		Actions a=new Actions(driver);
  	   a.moveToElement(p).click().perform();
  	 p.clear();
  	 p.sendKeys(string);    
	}

	@When("enter the  Account number {string}")
	public void enter_the_account_number(String string) {
		WebElement p=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]"));
 		Actions a=new Actions(driver);
  	   a.moveToElement(p).click().perform();
  	 p.clear();
  	 p.sendKeys(string);   
	}

	@When("enter the IFSC code {string}")
	public void enter_the_ifsc_code(String string) {
		WebElement p=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[3]"));
 		Actions a=new Actions(driver);
  	   a.moveToElement(p).click().perform();
  	   p.clear();
  	 p.sendKeys(string);  
	}

	@When("select the savings account option")
	public void select_the_savings_account_option() {
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Current account\"]/android.widget.RadioButton")).click();    
	}
	@When("click the leaves option")
	public void click_the_leaves_option() {
		Scroll.scroll(ScrollDiretion.DOWN,0.3); 
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Leaves\"]")).click();        
	}

	@When("click the assign leave type")
	public void click_the_assign_leave_type() {
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"ASSIGN LEAVE TYPE\"]")).click();       
		      
	}

	@When("select the leave")
	public void select_the_leave() {
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"leave type:Jmi1\"]")).click();       
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"leave type:Gad1\"]")).click();     
	}

	@When("enter the leave balance {string}")
	public void enter_the_leave_balance(String string) {
		WebElement p=driver.findElement(By.xpath("//android.view.View[@content-desc=\"ASSIGN LEAVE TYPE\n"
				+ "Leave type\"]/android.widget.EditText"));			
 		Actions a=new Actions(driver);
  	   a.moveToElement(p).click().perform();
  	 p.sendKeys(string);   
	}

	
}
