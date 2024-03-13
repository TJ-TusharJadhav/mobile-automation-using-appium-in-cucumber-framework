package Testbase;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
public class Testbase {
	
	public static AndroidDriver driver;
	public String appiumServer="127.0.0.1";
	public int appiumPort=4723;
	URL appiumURl=null;

	public AndroidDriver initializerDriver() {

		try {
			appiumURl=new URL("http://"+appiumServer+":"+appiumPort+"/wd/hub");
			driver=new AndroidDriver(appiumURl,setAppCapabilitiesAndroid());
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}

		catch(Exception e) {
			e.printStackTrace();
		}

		return driver;
	}

	public DesiredCapabilities setAppCapabilitiesAndroid() {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "12");
        cap.setCapability("deviceName", "android12");
        cap.setCapability("app", "D:\\apkfile\\13.apk"); 
        cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("newCommandTimeout", 157);
		
//		cap.setCapability("noReset", true);
//		cap.setCapability("FULL_RESET", false); 


		
		return cap;

	}
      
	public void initialize() {
		driver= initializerDriver();
		
		
}
}
