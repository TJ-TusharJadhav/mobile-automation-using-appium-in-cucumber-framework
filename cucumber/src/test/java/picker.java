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
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;




public class picker {

	public static void main(String[] args) throws MalformedURLException, InterruptedException, ParseException  {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "12");
        cap.setCapability("deviceName", "android12");
        cap.setCapability("app", "D:\\apkfile\\13.apk"); 
        cap.setCapability("automationName", "UiAutomator2");
//		cap.setCapability("newCommandTimeout", 157);
		
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]")).click();
		 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")).sendKeys("salmankhan@mailinator.com");
		
//		WebElement email = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]"));
//		Actions a=new Actions(driver);
//	   a.moveToElement(email).click().perform();
//	   email.sendKeys("salmankhan@mailinator.com");
//	   
//	   WebElement password = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
//  	 Actions b=new Actions(driver);
//	   b.moveToElement(password).click().perform();
//	 password.sendKeys("salmankhan@mailinator.com");  
//	 
	 driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"LOGIN\"]")).click(); Thread.sleep(1000);
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
//		String currentTime = driver.getDeviceTime();System.out.println(currentTime);
//		LocalDateTime dateTime = LocalDateTime.parse(currentTime, DateTimeFormatter.ISO_DATE_TIME);
		String hours = dateTime.format(DateTimeFormatter.ofPattern("HH", Locale.getDefault()));
		
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
		Assert.assertTrue(driver.findElement(By.xpath(xpathValidate)).isDisplayed());
     

		

        
    
  
	}

}
