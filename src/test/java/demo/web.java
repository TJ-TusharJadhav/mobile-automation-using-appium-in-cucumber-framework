package demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;

public class web {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("browserName", "Chrome");
		capabilities.setCapability("platformName", "Android");
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver appiumDriver=new AndroidDriver(url,capabilities);

		appiumDriver.navigate().to("https://app.checktrack.dev/#/login");
		Thread.sleep(5000);
		new TouchAction(appiumDriver).tap((TapOptions) appiumDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Home\"]"))).perform();

	}

}
