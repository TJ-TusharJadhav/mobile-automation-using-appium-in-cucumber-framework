package Resizeable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Example_Constrain_resize_area {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/resizable/#constrain-area");
        driver.switchTo().frame(0); 

        
        WebElement resizableElement = driver.findElement(By.cssSelector(".ui-resizable-handle.ui-resizable-se"));

       
        WebElement resizeArea = driver.findElement(By.cssSelector(".ui-resizable"));

        int resizeAreaWidth = resizeArea.getSize().getWidth(); System.out.println("resizeAreaWidth:"+ resizeAreaWidth);
        int resizeAreaHeight = resizeArea.getSize().getHeight(); System.out.println("resizeAreaHeight"+ resizeAreaHeight);
        int resizeAreaX = resizeArea.getLocation().getX(); System.out.println("resizeAreaX:"+resizeAreaX);
        int resizeAreaY = resizeArea.getLocation().getY(); System.out.println("resizeAreaY:"+resizeAreaY);

       
        int maxXOffset = resizeAreaWidth - resizableElement.getSize().getWidth();
        int maxYOffset = resizeAreaHeight - resizableElement.getSize().getHeight();

        
        Actions actions = new Actions(driver);

        
        actions.clickAndHold(resizableElement).perform();

        
        actions.moveByOffset(maxXOffset, maxYOffset).perform();

       
        actions.release().perform();

        
        Thread.sleep(3000);
        driver.quit();

	}

}
