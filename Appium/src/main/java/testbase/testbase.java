package testbase;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class testbase {
	public static AndroidDriver driver;
	public String appiumServer="127.0.0.1";
	public int appiumPort=4723;
	public static locator.xpath xpath=new locator.xpath();
	URL appiumURl=null;
	public AndroidDriver initializerDriver() {

		try {
			appiumURl=new URL("http://"+appiumServer+":"+appiumPort+"/wd/hub");
			driver=new AndroidDriver(appiumURl,setAppCapabilitiesAndroid());
			driver.manage().timeouts();
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
        cap.setCapability("deviceName", "Pixel API 31");
        cap.setCapability("app", "D:\\APK\\app-debug.apk"); 
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
