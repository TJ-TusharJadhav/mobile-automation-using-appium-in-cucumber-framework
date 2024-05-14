package demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class create_xpath {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("newCommandTimeout", 3000);
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
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
        String hours = dateTime.format(DateTimeFormatter.ofPattern("hh", Locale.getDefault()));
        String Minutes = currentTime.substring(14, 16);
        String shortdayName = dayName.substring(0, 3);
        String fulldate1 = dateTime.format(DateTimeFormatter.ofPattern("dd/MM/YYYY", Locale.getDefault()));
        String to = hours+":"+Minutes;
        
//        Deduction Hours
		int DeductionHours = Integer.parseInt(hours) - 1;
		String DeductionHoursFormatted = String.format("%02d", DeductionHours);
        String xpathhours = "(//android.view.View[@content-desc='" + DeductionHoursFormatted + "'])[1]";

//		Deduction Minutes 
		int DeductionMinutes = Integer.parseInt(Minutes) - 1;
		String DeductionMinutesFormatted = String.format("%02d", DeductionMinutes);
        String xpathMinutes = "(//android.view.View[@content-desc='" + DeductionMinutesFormatted + "'])[1]";
 
		//validation 
		String xpathValidate = "//android.view.View[@content-desc=\""+fulldate1 +"\n"+DeductionHoursFormatted + ":" +DeductionMinutesFormatted+" "+AMPM+"\n"+" to"+"\n"+to+" "+AMPM+"\n"+"1h 1m" + "\"]";
        System.out.println(xpathValidate);
		
      
    
	}

}
