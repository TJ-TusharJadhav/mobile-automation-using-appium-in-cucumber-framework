package testbase;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import locaters.button;
import locaters.xpath;
public class TestBase {
	public static AndroidDriver driver;
	public String appiumServer="127.0.0.1";
	public int appiumPort=4723;
	URL appiumURl=null;
	public static xpath xpath=new xpath();
	public static button button=new button();
	public AndroidDriver initializerDriver() {

		try {
			appiumURl=new URL("http://"+appiumServer+":"+appiumPort+"/wd/hub");
			driver=new AndroidDriver(appiumURl,setAppCapabilitiesAndroid());
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
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
        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("app", "D:\\employee-app\\build\\app\\outputs\\apk\\debug\\app-debug.apk"); 
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
