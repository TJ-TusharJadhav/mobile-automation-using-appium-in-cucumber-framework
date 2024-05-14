package demo;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



import testbase.TestBase;
public class picker extends TestBase {

	public static void main(String[] args) throws MalformedURLException, InterruptedException, ParseException  {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "12");
        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("app", "D:\\APK\\app-debug.apk"); 
//        cap.setCapability("app", "D:\\employee-app\\build\\app\\outputs\\flutter-apk\\app-debug.apk");
        cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("newCommandTimeout", 3000);
		
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
//Form timing 
        int DeductionHours = Integer.parseInt(hours) - 1;
		String DeductionHoursFormatted = String.format("%02d", DeductionHours);
        String xpathhours = "(//android.view.View[@content-desc='" + DeductionHoursFormatted + "'])[1]";
		driver.findElement(By.xpath(xpathhours)).click();Thread.sleep(1000);

		int DeductionMinutes = Integer.parseInt(Minutes) - 1;
		String DeductionMinutesFormatted = String.format("%02d", DeductionMinutes);
        String xpathMinutes = "(//android.view.View[@content-desc='" + DeductionMinutesFormatted + "'])[1]";
        driver.findElement(By.xpath(xpathMinutes)).click();Thread.sleep(1000);
//        driver.findElement(By.xpath("(//android.view.View[@content-desc=\"AM\"])[1]")).click();
//        driver.findElement(By.xpath("(//android.view.View[@content-desc=\"PM\"])[1]")).click();
//To timing
        int IncreaseHours1 = Integer.parseInt(hours) + 1; 
		String IncreaseHoursFormatted1 = String.format("%02d", IncreaseHours1);
        String xpathhours1 = "(//android.view.View[@content-desc='" + IncreaseHoursFormatted1 + "'])";
		driver.findElement(By.xpath(xpathhours1)).click();Thread.sleep(1000);
 
		int IncreaseMinutes1 = Integer.parseInt(Minutes) + 1;
		String IncreaseMinutesFormatted1 = String.format("%02d", IncreaseMinutes1);
        String xpathMinutes1 = "(//android.view.View[@content-desc='" + IncreaseMinutesFormatted1 + "'])";
        driver.findElement(By.xpath(xpathMinutes1)).click();Thread.sleep(1000);
//        driver.findElement(By.xpath("(//android.view.View[@content-desc=\"AM\"])[2]")).click();
//        driver.findElement(By.xpath("(//android.view.View[@content-desc=\"PM\"])[2]")).click();
        
        
        
		
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"SAVE\"]")).click();
       
//		validation
       /* in Xpath added From and To time 
		String xpathValidate = "//android.view.View[@content-desc=\""+fulldate1 +"\n"+DeductionHoursFormatted + ":" +DeductionMinutesFormatted+" "+AMPM+"\n"+" to"+"\n"+to+" "+AMPM+"\n"+"2h 2m" + "\"]";
		*/
		String xpathValidate = "//android.view.View[@content-desc=\""+fulldate1 +"\n"+DeductionHoursFormatted + ":" +DeductionMinutesFormatted+" "+AMPM+"\n"+"2h 2m" + "\"]";
//       Edit Time entry
		String EditTimeEntry = xpathValidate+"/android.widget.ImageView[1]"; 
		driver.findElement(By.xpath(EditTimeEntry)).click();
		

////        Delete Time entry
//        String DeleteTimeEntry = xpathValidate+"/android.widget.ImageView[2]"; 
//        driver.findElement(By.xpath(DeleteTimeEntry)).click();
//        driver.findElement(By.xpath(button.YES)).click();
        
      
//      Thread.sleep(1000);  
//      driver.quit();
     

		

        
    
  
	}

}