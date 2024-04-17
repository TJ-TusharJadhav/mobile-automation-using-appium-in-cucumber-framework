package demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import testbase.TestBase;

public class sendkey extends TestBase {

	public static void main(String[] args) throws MalformedURLException, InterruptedException  {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("app", "D:\\APK\\app-debug.apk"); 
        cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("newCommandTimeout", 157);
		
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 
		 
		Thread.sleep(3000);
		 driver.findElement(By.xpath(xpath.login_Email)).click();	Thread.sleep(1000);
		 driver.findElement(By.xpath(xpath.login_Email)).sendKeys("salmankhan@mailinator.com");	Thread.sleep(1000);
		 driver.findElement(By.xpath(xpath.login_password)).click();	Thread.sleep(1000);
	   driver.findElement(By.xpath(xpath.login_password)).sendKeys("salmankhan@mailinator.com");	Thread.sleep(1000);
  	 
	
	 
	 driver.findElement(By.xpath(xpath.login_button)).click(); 
	
	 System.out.print("Pass");
     
	}

}
