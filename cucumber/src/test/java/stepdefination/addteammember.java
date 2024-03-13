package stepdefination;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Testbase.Testbase;
import Utility.Scroll;
import Utility.Scroll.ScrollDiretion;
import io.cucumber.java.en.*;


public class addteammember extends Testbase {
	String Email = RandomStringUtils.randomNumeric(4);
	
	@When("I enter the email {string}")
	public void i_enter_the_email(String string) {
		WebElement email = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]"));
		Actions a=new Actions(driver);
	   a.moveToElement(email).click().perform();
	   email.sendKeys(string);
	}

	@When("I enter the password {string}")
	public void i_enter_the_password(String string) {
		 WebElement password = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
    	 Actions a=new Actions(driver);
  	   a.moveToElement(password).click().perform();
  	 password.sendKeys(string);  
	}

	@When("I click the login button")
	public void i_click_the_login_button() {
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"LOGIN\"]")).click(); 
	}

	
	@When("click team member option")
	public void click_team_member_option() {
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Team members\"]")).click();    
	}

	@When("click add team member button")
	public void click_add_team_member_button() throws InterruptedException {
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"ADD TEAM MEMBER\"]")).click(); 
		Thread.sleep(1000);
	}

	@When("Enter first name {string}")
	public void enter_first_name(String string) throws InterruptedException {
		 WebElement first = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.EditText[1]"));
    	 Actions a=new Actions(driver);
  	   a.moveToElement(first).click().perform();
  	 first.sendKeys(string);     
  	Thread.sleep(1000);
	}

	@When("Enter last name {string}")
	public void enter_last_name(String string) throws InterruptedException {
		WebElement last = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.EditText[2]"));
   	 Actions a=new Actions(driver);
 	   a.moveToElement(last).click().perform();
 	  last.sendKeys(string);
 	 Thread.sleep(1000);
	}

	@When("Enter email")
	public void enter_email() throws InterruptedException {
		 WebElement email = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.EditText[3]"));
    	 Actions a=new Actions(driver);
  	   a.moveToElement(email).click().perform();
  	 email.sendKeys("tj."+Email+"@mailinator.com");
 	Thread.sleep(1000);
	}

	@When("Enter phone {string}")
	public void enter_phone(String string) throws InterruptedException {
		 WebElement phone = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.EditText[4]"));
    	 Actions a=new Actions(driver);
  	   a.moveToElement(phone).click().perform();
  	 phone.sendKeys(string); 
  	Thread.sleep(1000);
  	Scroll.scroll(ScrollDiretion.DOWN,0.4); 
	Thread.sleep(1000);
	}

	@When("Enter address {string}")
	public void enter_address(String string) throws InterruptedException{
		 WebElement address = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.EditText[3]"));
    	 Actions a=new Actions(driver);
  	   a.moveToElement(address).click().perform();
  	 address.sendKeys(string); 
  	Thread.sleep(2000);
  	 Scroll.scroll(ScrollDiretion.DOWN,0.2); 
	}

	@When("select country {string}")
	public void select_country(String string) throws InterruptedException {
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Country\"]")).click();  
		 WebElement country = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Country\"]/android.widget.EditText"));
		 Actions a=new Actions(driver);
		   a.moveToElement(country).click().perform();
		   country.sendKeys(string);
		 driver.findElement(By.xpath("//android.view.View[@content-desc=\"India\"]")).click();
//		 Thread.sleep(3000);
	}

	@When("select state {string}")
	public void select_state(String string) throws InterruptedException {
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"State\"]")).click();  
		 WebElement state = driver.findElement(By.xpath("//android.view.View[@content-desc=\"State\"]/android.widget.EditText"));
		 Actions a=new Actions(driver);
		   a.moveToElement(state).click().perform();
		   state.sendKeys(string);
		 driver.findElement(By.xpath("//android.view.View[@content-desc=\"Maharashtra\"]")).click(); 
//	  Thread.sleep(3000);
	}

	@When("select city {string}")
	public void select_city(String string) throws InterruptedException {
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"City\"]")).click();  
		 WebElement city = driver.findElement(By.xpath("//android.view.View[@content-desc=\"City\"]/android.widget.EditText"));
		 Actions a=new Actions(driver);
		   a.moveToElement(city).click().perform();
		   city.sendKeys(string);
		 driver.findElement(By.xpath("//android.view.View[@content-desc=\"Nashik\"]")).click(); 
		 Thread.sleep(1000);
		 Scroll.scroll(ScrollDiretion.DOWN,0.2); 
	}

	@When("Enter pincode {string}")
	public void enter_pincode(String string) throws InterruptedException {
 WebElement p=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.EditText[2]"));
 		Actions a=new Actions(driver);
  	   a.moveToElement(p).click().perform();
  	 p.sendKeys(string); 
  	Thread.sleep(3000);
  	Scroll.scroll(ScrollDiretion.DOWN,0.3); 
	Scroll.scroll(ScrollDiretion.DOWN,0.3); 
	}

	@When("select timezone")
	public void select_timezone() {
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Timezone\n"
		+ "America/New_York\"]")).click(); 
driver.findElement(By.xpath("//android.view.View[@content-desc=\"Asia/Kolkata\"]")).click();   
	}

	@When("select joining date")
	public void select_joining_date() throws InterruptedException {
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.ImageView[2]")).click();
		String currentTime = driver.getDeviceTime();
        LocalDateTime dateTime = LocalDateTime.parse(currentTime, DateTimeFormatter.ISO_DATE_TIME);
        String date = dateTime.format(DateTimeFormatter.ofPattern("d", Locale.getDefault()));
        String month = dateTime.format(DateTimeFormatter.ofPattern("MMMM", Locale.getDefault()));
        String year = dateTime.format(DateTimeFormatter.ofPattern("yyyy", Locale.getDefault()));
        String dayName = dateTime.format(DateTimeFormatter.ofPattern("EEEE", Locale.getDefault()));
        String xpathExpression = "//android.view.View[@content-desc=\"" + date + ", " + dayName + ", " + month + " " + date + ", " + year + "\"]";
		driver.findElement(By.xpath(xpathExpression)).click();
	}

	@When("enter job title {string}")
	public void enter_job_title(String string) {
		 WebElement title = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.EditText[2]"));
   	 Actions a=new Actions(driver);
 	   a.moveToElement(title).click().perform();
 	 title.sendKeys(string);    
	}

	@When("select report")
	public void select_report() {
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Tushar Jadhav\"]")).click(); 
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"salman khan\"]")).click();     
	}

	@When("select termination date")
	public void select_termination_date() {
	   
	}

	@When("click save button")
	public void click_save_button() throws InterruptedException {
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"SAVE\"]")).click();       
	}	
	@Then("check the success message")
	public void check_the_success_message() {
		Assert.assertTrue(driver.findElement(By.xpath("//android.view.View[@content-desc=\"Tushar Jadhav has been successfully added.\"]")).isDisplayed());      
	}
	
	@Then("click the more buttons")
	public void click_the_more_buttons() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//android.view.View[@content-desc=\"More\"])[1]")).click();    
		Thread.sleep(1000);
		}

	@Then("select the all roles")
	public void select_the_all_roles() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.CheckBox[1]")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.CheckBox[2]")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.CheckBox[3]")).click(); 
		 
	}
	
	@Then("Enter the Account holder name {string}")
	public void enter_the_account_holder_name(String string) {
		WebElement title = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]"));
	   	 Actions a=new Actions(driver);
	 	   a.moveToElement(title).click().perform();
	 	 title.sendKeys(string);       
	}

	@Then("Enter the Account number {string}")
	public void enter_the_account_number(String string) {
		WebElement title = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]"));
	   	 Actions a=new Actions(driver);
	 	   a.moveToElement(title).click().perform();
	 	 title.sendKeys(string);    
	}

	@Then("IFSC code {string}")
	public void ifsc_code(String string) {
		WebElement title = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[3]"));
	   	 Actions a=new Actions(driver);
	 	   a.moveToElement(title).click().perform();
	 	 title.sendKeys(string);   
	}

	@Then("select start date")
	public void select_start_date() {
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView[1]")).click();   
		String currentTime = driver.getDeviceTime();
        LocalDateTime dateTime = LocalDateTime.parse(currentTime, DateTimeFormatter.ISO_DATE_TIME);
        String date = dateTime.format(DateTimeFormatter.ofPattern("d", Locale.getDefault()));
        String month = dateTime.format(DateTimeFormatter.ofPattern("MMMM", Locale.getDefault()));
        String year = dateTime.format(DateTimeFormatter.ofPattern("yyyy", Locale.getDefault()));
        String dayName = dateTime.format(DateTimeFormatter.ofPattern("EEEE", Locale.getDefault()));
        String xpathExpression = "//android.view.View[@content-desc=\"" + date + ", " + dayName + ", " + month + " " + date + ", " + year + "\"]";
		driver.findElement(By.xpath(xpathExpression)).click();
		}

	@Then("enter basic pay {string}")
	public void enter_basic_pay(String string) {
		WebElement title = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText"));
	   	 Actions a=new Actions(driver);
	 	   a.moveToElement(title).click().perform();
	 	 title.sendKeys(string); 
//	 	 monthly/ weekly/ Yearly 
	 	driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Yearly\"]")).click();
	 	driver.findElement(By.xpath("//android.view.View[@content-desc=\"Monthly\"]")).click();
	}

	@Then("click next button")
	public void click_next_button() throws InterruptedException {
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"NEXT\"]")).click(); 
		Thread.sleep(1000); 
	}

	@Then("select Opted out option")
	public void select_opted_in_option() {
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"PF preference\"]")).click(); 
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Opted out\"]")).click();
	}

	@Then("select the checkbox")
	public void select_the_checkbox() {
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.CheckBox")).click();       
	}
	
	@Then("enter ESI no {string}")
	public void enter_ESI_no(String string) throws InterruptedException  {
		Thread.sleep(1000); 
		WebElement title = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]"));
	   	 Actions a=new Actions(driver);
	 	   a.moveToElement(title).click().perform();
	 	 title.sendKeys(string);   
	}

	@Then("enter previous employer salary {string}")
	public void enter_previous_employer_salary(String string) throws InterruptedException {
		Thread.sleep(1000);
		WebElement title = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]"));
	   	 Actions a=new Actions(driver);
	 	   a.moveToElement(title).click().perform();
	 	 title.sendKeys(string);   
	}

	@Then("enter previous employer TDS deducted {string}")
	public void enter_previous_employer_tds_deducted(String string) throws InterruptedException {
		Thread.sleep(1000); 
		WebElement title = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]"));
	   	 Actions a=new Actions(driver);
	 	   a.moveToElement(title).click().perform();
	 	 title.sendKeys(string);    
	}

	@Then("click the back button")
	public void click_the_back_button() throws InterruptedException {
		Thread.sleep(1000); 
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[1]")).click();      
		Assert.assertTrue(driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"ADD TEAM MEMBER\"]")).isDisplayed());
		}
	

	




	    
	
}
