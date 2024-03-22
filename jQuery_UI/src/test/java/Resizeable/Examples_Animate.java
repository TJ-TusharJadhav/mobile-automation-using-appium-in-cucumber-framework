package Resizeable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Examples_Animate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		 driver.get("https://jqueryui.com/resizable/#animate");
		 driver.manage().window().maximize();
		 
	        driver.switchTo().frame(0);
	        Thread.sleep(3000);
	        WebElement resizableElement = driver.findElement(By.cssSelector(".ui-resizable-handle.ui-resizable-se"));
	        Actions actions = new Actions(driver);
	        actions.clickAndHold(resizableElement).perform();
	        actions.moveByOffset(200, 200).perform(); 
	        actions.release().perform();
	        
	        
	        
	        Thread.sleep(3000);	
	   	 driver.quit();

	}

}
