package demo;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import Utility.EmailGen;
import io.appium.java_client.android.AndroidDriver;
import testbase.TestBase;

public class validate_team_member extends TestBase{
	EmailGen gen=new EmailGen();
    static String actualemail;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "12");
        cap.setCapability("deviceName", "android12");
        cap.setCapability("app", "F:\\app-release.apk"); 
//        cap.setCapability("app", "D:\\employee-app\\build\\app\\outputs\\flutter-apk\\app-debug.apk");
        cap.setCapability("automationName", "UiAutomator2");
//		cap.setCapability("newCommandTimeout", 157);
		
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 
		 
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.xpath(xpath.login_Email));
		Actions a=new Actions(driver);
	   a.moveToElement(email).click().perform();
	   email.sendKeys("salmankhan@mailinator.com");
	   Thread.sleep(1000);
	   WebElement password = driver.findElement(By.xpath(xpath.login_password));
  	 Actions b=new Actions(driver);
	   b.moveToElement(password).click().perform();
	 password.sendKeys("salmankhan@mailinator.com");  	 
	 driver.findElement(By.xpath(xpath.login_button)).click(); Thread.sleep(1000);
	 driver.findElement(By.xpath(xpath.teammember)).click(); Thread.sleep(1000);
	 driver.findElement(By.xpath(xpath.add_team_member_button)).click(); 
	 
	 
	 
	 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View[2]")).click();Thread.sleep(1000);
	 driver.findElement(By.xpath("//android.view.View[@content-desc=\"Profile\"]")).click();
	 WebElement abc= driver.findElement(By.xpath("//android.widget.EditText[@text=\"Jadhav\"]"));
	   
		
	

	}

}
