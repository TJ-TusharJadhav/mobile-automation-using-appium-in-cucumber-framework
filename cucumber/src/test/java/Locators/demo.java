package Locators;

import org.openqa.selenium.WebElement;

import Testbase.Testbase;
import io.omnidya.flutter.FlutterFinder;

public class demo extends Testbase{
	
	FlutterFinder finder = new FlutterFinder(driver);
	
	
	public WebElement firstelement() {
		WebElement add_auto = finder.byValueKey("email");
		return add_auto;
	}
	
}
