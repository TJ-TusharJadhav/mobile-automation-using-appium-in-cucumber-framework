package demo;
import io.appium.java_client.AppiumDriver;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
public class chatgpt {
	public static void main(String[] args) throws MalformedURLException {


		 DesiredCapabilities cap = new DesiredCapabilities();
		 cap.setCapability("platformName", "Android");
		 cap.setCapability("deviceName", "PixelAPI 31");
		 URL url=new URL("http://127.0.0.1:4723/wd/hub");
			AndroidDriver driver=new AndroidDriver(url,cap);
			 		     
           
			String currentTime = driver.getDeviceTime();
		    String hours = currentTime.substring(11, 13);
		    String minutes = currentTime.substring(14, 16);		    
		    System.out.println(hours);
		    System.out.println(minutes);

	        // Close the driver
	        driver.quit();
    }
}
