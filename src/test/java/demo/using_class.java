package demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import testbase.TestBase;

public class using_class extends TestBase {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
//        cap.setCapability("platformVersion", "12");
//        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("app", "E:\\master1\\build\\app\\outputs\\flutter-apk\\app-release.apk"); 
//        cap.setCapability("app", "D:\\employee-app\\build\\app\\outputs\\flutter-apk\\app-debug.apk");
        cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("newCommandTimeout", 3000);
		cap.setCapability("", "");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(2000);
//login page
		WebElement email = driver.findElement(By.xpath(xpath.login_Email));
		Actions a=new Actions(driver);
	   a.moveToElement(email).click().perform();Thread.sleep(1000);
	   email.sendKeys("salmankhan@mailinator.com");
	   Thread.sleep(1000);
	   WebElement password = driver.findElement(By.xpath(xpath.login_password));
  	 Actions b=new Actions(driver);
	   b.moveToElement(password).click().perform();Thread.sleep(1000);
	 password.sendKeys("salmankhan@mailinator.com");   
	 driver.findElement(By.xpath(xpath.login_button)).click(); Thread.sleep(1000);
	 // steps
	 driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Projects\"]")).click();	
	 driver.findElement(By.xpath("//android.view.View[@content-desc=\"project 1\"]/android.widget.ImageView[2]")).click();
	 driver.findElement(By.xpath("//android.view.View[@content-desc=\"Task 1\"]/android.widget.ImageView[2]")).click();
	

	 driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"ADD\"]")).click(); Thread.sleep(1000);
//	
////		***Device Current Date***
	 String currentTime = driver.getDeviceTime();
     LocalDateTime dateTime = LocalDateTime.parse(currentTime, DateTimeFormatter.ISO_DATE_TIME); 
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
     String formattedTime = dateTime.format(formatter); 
     formattedTime = formattedTime.toUpperCase();
     String AMPM = formattedTime.substring(6, 8);
     String date = dateTime.format(DateTimeFormatter.ofPattern("d", Locale.getDefault()));
     String month = dateTime.format(DateTimeFormatter.ofPattern("MMMM", Locale.getDefault()));
     String year = dateTime.format(DateTimeFormatter.ofPattern("yyyy", Locale.getDefault()));
     String dayName = dateTime.format(DateTimeFormatter.ofPattern("EEEE", Locale.getDefault()));
     String fulldate = dateTime.format(DateTimeFormatter.ofPattern("MM/dd/YYYY", Locale.getDefault()));
     String fulldate1 = dateTime.format(DateTimeFormatter.ofPattern("dd/MM/YYYY", Locale.getDefault()));
     String hours = dateTime.format(DateTimeFormatter.ofPattern("hh", Locale.getDefault()));
     String Minutes = currentTime.substring(14, 16);
     String shortdayName = dayName.substring(0, 3);
      
     String to = hours+":"+Minutes;
//     
////created xpath for date
     String Date = "//android.view.View[@content-desc=\"" + date + ", " + dayName + ", " + month + " " + date + ", " + year + "\"]";         
        
     driver.findElement(By.xpath(Date)).click();
    
	//Get Screen size
			Dimension size = driver.manage().window().getSize();
			
			//find the position where you need to touch
			int startX = size.getWidth() / 2;
			int startY = size.getHeight() / 2;
			
			
			//position till you want to move your finger to swipe
			int endX = startX;
			int endY = (int) (size.getHeight() * 0.25);
			
			//PointerInput class to create a sequence of actions 
			PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
			
			//Sequence object, which is a list of actions that will be performed on the device
			Sequence sequence = new Sequence(finger1, 1)
					.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
					.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
					.addAction(new Pause(finger1, Duration.ofMillis(200))) //wait for some time
					.addAction(finger1.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), endX, endY))
					.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg())); 

			//perform the Sequence of action
			driver.perform(Collections.singletonList(sequence));
			System.out.print("pass");
			Thread.sleep(5000);
			driver.quit();
	
	}

}
