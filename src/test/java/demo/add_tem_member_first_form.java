package demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import Utility.Scroll;
import Utility.Scroll.ScrollDiretion;
import io.appium.java_client.android.AndroidDriver;
import testbase.TestBase;

public class add_tem_member_first_form extends TestBase {
	String Email = RandomStringUtils.randomNumeric(4);

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "12");
        cap.setCapability("deviceName", "Pixel API 31"); 
        cap.setCapability("app", "F:\\app-release.apk");
        cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("newCommandTimeout", 157);
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(1000);
		//login
		WebElement login_email = driver.findElement(By.xpath(xpath.login_Email));
		Actions a=new Actions(driver);
	   a.moveToElement(login_email).click().perform();
	   login_email.sendKeys("salmankhan@mailinator.com");
	   Thread.sleep(1000);
	   WebElement password = driver.findElement(By.xpath(xpath.login_password));
  	 Actions b=new Actions(driver);
	   b.moveToElement(password).click().perform();
	 password.sendKeys("salmankhan@mailinator.com");  
	 driver.findElement(By.xpath(xpath.login_button)).click();
	 //team member
	 driver.findElement(By.xpath(xpath.teammember)).click();
	 //add team member
	 driver.findElement(By.xpath(xpath.add_team_member_button)).click();
	 //first name
	 WebElement first=  driver.findElement(By.xpath(xpath.firstname));
	 Actions c=new Actions(driver);
	   c.moveToElement(first).click().perform();
	   first.sendKeys("Tushar");
	   //last name
	   WebElement last=  driver.findElement(By.xpath(xpath.lastname));
		 Actions d=new Actions(driver);
		   d.moveToElement(last).click().perform();
		   last.sendKeys("Jadhav");
		   //email
		   WebElement email=  driver.findElement(By.xpath(xpath.email));
		   Actions e=new Actions(driver);
		   e.moveToElement(email).click().perform();
		   email.sendKeys("tj.1@mailinator.com");
		   //phone
		   WebElement phone=driver.findElement(By.xpath(xpath.phone));
		   Actions f=new Actions(driver);
		   f.moveToElement(phone).click().perform();
		   phone.sendKeys("1234567890");
		   Thread.sleep(1000);
		   Scroll.scroll(ScrollDiretion.DOWN,0.3); 
		   //address
		   WebElement address=driver.findElement(By.xpath(xpath.address));
		   Actions g=new Actions(driver);
		   g.moveToElement(address).click().perform();
		   phone.sendKeys("Nashik");
		   
		   

		   
	 

	}

}
