package stepdefination;

import org.openqa.selenium.By;
import org.testng.Assert;

import Testbase.Testbase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class localization extends Testbase {

@When("click the english language")
public void click_the_english_language() {
	driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"English\"]")).click();  
}

@When("select the marathi language")
public void select_the_marathi_language() {
	driver.findElement(By.xpath("//android.view.View[@content-desc=\"Marathi\"]")).click();    
}

@Then("login page should be appear in marathi language")
public void login_page_should_be_appear_in_marathi_language() {
	Assert.assertTrue(driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"लॉगिन करा\"]")).isDisplayed());      
}

@When("select the hindi language")
public void select_the_hindi_language() {
	driver.findElement(By.xpath("//android.view.View[@content-desc=\"Hindi\"]")).click();    
}

@Then("login page should be appear in hindi language")
public void login_page_should_be_appear_in_hindi_language() {
	Assert.assertTrue(driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"लॉग इन करें\"]")).isDisplayed());       
}

@When("select the gujarati language")
public void select_the_gujarati_language() {
	driver.findElement(By.xpath("//android.view.View[@content-desc=\"Gujarati\"]")).click();   
}

@Then("login page should be appear in gujarati language")
public void login_page_should_be_appear_in_gujarati_language() {
	Assert.assertTrue(driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"પ્રવેશ કરો\"]")).isDisplayed());       
}

}
