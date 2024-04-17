package demo;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import testbase.TestBase;
public class picker extends TestBase {

	public static void main(String[] args) throws MalformedURLException, InterruptedException, ParseException  {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
//        cap.setCapability("platformVersion", "12");
        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("app", "D:\\APK\\app-debug.apk"); 
//        cap.setCapability("app", "D:\\employee-app\\build\\app\\outputs\\flutter-apk\\app-debug.apk");
        cap.setCapability("automationName", "UiAutomator2");
//		cap.setCapability("newCommandTimeout", 157);
		
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 
		 
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.xpath(xpath.login_Email));
		Actions a=new Actions(driver);
	   a.moveToElement(email).click().perform();Thread.sleep(1000);
	   email.sendKeys("salmankhan@mailinator.com");
	   Thread.sleep(1000);
	   WebElement password = driver.findElement(By.xpath(xpath.login_password));
  	 Actions b=new Actions(driver);
	   b.moveToElement(password).click().perform();Thread.sleep(1000);
	 password.sendKeys("salmankhan@mailinator.com");  
//	 
	 driver.findElement(By.xpath(xpath.login_button)).click(); Thread.sleep(1000);
	 driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Projects\"]")).click();	
	 driver.findElement(By.xpath("//android.view.View[@content-desc=\"project 1\"]/android.widget.ImageView[2]")).click();
	 driver.findElement(By.xpath("//android.view.View[@content-desc=\"Task 1\"]/android.widget.ImageView[2]")).click();
	 driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"ADD\"]")).click(); 
//	 driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Time\"]")).click();
	 
	   
//		***Device Current Date***
		String currentTime = driver.getDeviceTime();
        LocalDateTime dateTime = LocalDateTime.parse(currentTime, DateTimeFormatter.ISO_DATE_TIME); 
        String date = dateTime.format(DateTimeFormatter.ofPattern("d", Locale.getDefault()));
        String month = dateTime.format(DateTimeFormatter.ofPattern("MMMM", Locale.getDefault()));
        String year = dateTime.format(DateTimeFormatter.ofPattern("yyyy", Locale.getDefault()));
        String dayName = dateTime.format(DateTimeFormatter.ofPattern("EEEE", Locale.getDefault()));
        String fulldate = dateTime.format(DateTimeFormatter.ofPattern("MM/dd/YYYY", Locale.getDefault()));
        String xpathExpression = "//android.view.View[@content-desc=\"" + date + ", " + dayName + ", " + month + " " + date + ", " + year + "\"]";

	 driver.findElement(By.xpath(xpathExpression)).click();
	 
		
//		 ***Device Current Time***
		String hours = dateTime.format(DateTimeFormatter.ofPattern("hh", Locale.getDefault()));
		
//		Deduction Hours
		int DeductionHours = Integer.parseInt(hours) - 1;
		String DeductionHoursFormatted = String.format("%02d", DeductionHours);
		
        String xpathhours = "(//android.view.View[@content-desc='" + DeductionHoursFormatted + "'])[1]";
        
		driver.findElement(By.xpath(xpathhours)).click();
		
		

//		Deduction Minutes 
		String Minutes = currentTime.substring(14, 16);
		int DeductionMinutes = Integer.parseInt(Minutes) - 1;
		String DeductionMinutesFormatted = String.format("%02d", DeductionMinutes);
        String xpathMinutes = "(//android.view.View[@content-desc='" + DeductionMinutesFormatted + "'])[1]";
        driver.findElement(By.xpath(xpathMinutes)).click();
        Thread.sleep(1000);
		
//		short dayname
		String shortdayName = dayName.substring(0, 3); 
        
//        Validate
        String xpathValidate = "//android.view.View[@content-desc=\"" + shortdayName + ", " + fulldate +"\n " +hours + ":" + DeductionMinutesFormatted +" " + "AM"+"\n"+ " 1h 1m" + "\"]";
        System.out.println(xpathValidate);
        
        
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"SAVE\"]")).click();
        Thread.sleep(2000);
//		Assert.assertTrue(driver.findElement(By.xpath(xpathValidate)).isDisplayed());
     

		

        
    
  
	}

}
