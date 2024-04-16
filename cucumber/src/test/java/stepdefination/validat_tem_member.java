package stepdefination;

import org.openqa.selenium.By;
import org.testng.Assert;

import Testbase.Testbase;
import Utility.EmailGen;
import io.cucumber.java.en.*;

public class validat_tem_member extends Testbase {
	 EmailGen gen=new EmailGen();
	    String actualemail;
	@When("check the user first name")
	public void check_the_user_first_name() throws InterruptedException {
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Team members\"]")).click();
		Thread.sleep(2000);
		
	}

	@When("check the user last name")
	public void check_the_user_last_name() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=TJ\n"
				+ "Tushar Jadhav])[1]")).click();
		
	       
	}

	@When("check the user email")
	public void check_the_user_email() {
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Profile\"]")).click();
	}

	@When("check the user phone no.")
	public void check_the_user_phone_no() {
		Assert.assertEquals(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[4]/android.widget.EditText[3]")).getText(),actualemail);    
	
		
	
	}

}
