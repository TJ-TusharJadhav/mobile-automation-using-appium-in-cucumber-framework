package Droppable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_Prevent_propagation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		 driver.get("https://jqueryui.com/droppable/");
		 driver.manage().window().maximize();
   driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/ul/li[3]/a")).click();
   
   Actions a =new Actions(driver);

	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

	Thread.sleep(1000);
	a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"draggable\"]")), driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).build().perform();
	
	Thread.sleep(1000);
	a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"draggable\"]")), driver.findElement(By.xpath("//*[@id=\"droppable-inner\"]"))).build().perform();
	
	Thread.sleep(1000);
	a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"draggable\"]")), driver.findElement(By.xpath("//*[@id=\"droppable2\"]"))).build().perform();
	
	Thread.sleep(1000);
	a.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"draggable\"]")), driver.findElement(By.xpath("//*[@id=\"droppable2-inner\"]"))).build().perform();
		
  
	
	
	
	Thread.sleep(3000);	
	 driver.quit();
	}

}
