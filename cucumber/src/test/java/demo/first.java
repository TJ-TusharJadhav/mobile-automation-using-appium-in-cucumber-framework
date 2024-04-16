package demo;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.android.AndroidDriver;


public class first   {
	public static void main(String[] args) throws MalformedURLException, InterruptedException, ParseException  {
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("platformName", "Android");System.out.println("platformName");
        cap.setCapability("platformVersion", "12");System.out.println("platformVersion");
        cap.setCapability("deviceName", "Pixel API 31");System.out.println("deviceName");
//        cap.setCapability("app", "F:\\app-release.apk"); 
        cap.setCapability("app", "D:\\employee-app\\build\\app\\outputs\\flutter-apk\\app-debug.apk");System.out.println("app");
        cap.setCapability("automationName", "UiAutomator2");System.out.println("automationName");
//		cap.setCapability("newCommandTimeout", 157);
		
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");System.out.println("url");
		AndroidDriver driver=new AndroidDriver(url,cap);System.out.println("driver");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);System.out.println("manage");
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"LOGIN\"]")).click();System.out.println("login");
//		FlutterFinder finder = new FlutterFinder(driver);
//        WebElement loginButton = finder.byValueKey("loginButton");
//        loginButton.click();
		 
}}
