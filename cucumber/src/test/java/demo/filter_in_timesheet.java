package demo;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import Testbase.Testbase;
import io.appium.java_client.android.AndroidDriver;
public class filter_in_timesheet extends Testbase{
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException, ParseException  {
		
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "12");
        cap.setCapability("deviceName", "android12");
//        cap.setCapability("app", "F:\\app-release.apk"); 
        cap.setCapability("app", "F:\\app-release.apk");
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
	 driver.findElement(By.xpath(xpath.login_button)).click();
	 driver.findElement(By.xpath(xpath.mytimesheet)).click();
	 //monthly filter
	 driver.findElement(By.xpath(xpath.monthly_filter)).click();
//	 String dayName = "Monday";
//	    String month = "January";
//	    int year = 2024;
//	    int MONTH= 1;  
//     String monthly_filter = "//android.view.View[@content-desc=\"" + MONTH + ", " + dayName + ", " + month + " " + MONTH + ", " + year + "\"]";
//	 driver.findElement(By.xpath(monthly_filter)).click();
//	 driver.findElement(By.xpath(button.ok)).click();
//	//weekly filter
//	 driver.findElement(By.xpath(xpath.weekly_filter)).click();
//	 String dayName1 = "Monday";
//	    String month1 = "April";
//	    int year1 = 2024;
//	    int date= 15; 
//	 String weekly_filter = "//android.view.View[@content-desc=\"" + date + ", " + dayName1 + ", " + month1 + " " + date + ", " + year1 + "\"]";
     driver.findElement(By.xpath("//android.view.View[@index=10]")).click();
	 driver.findElement(By.xpath(button.ok)).click();
        
	//Daily filter
//		 driver.findElement(By.xpath(xpath.daily_filter)).click();
//		 String dayName2 = "Monday";
//		    String month2 = "April";
//		    int year2 = 2024;
//		    int date2= 15; 
//		 String daily_filter = "//android.view.View[@content-desc=\"" + date2 + ", " + dayName2 + ", " + month2 + " " + date2 + ", " + year2 + "\"]";
//	     driver.findElement(By.xpath(daily_filter)).click();
//		 driver.findElement(By.xpath(button.ok)).click();
  
	}

}
