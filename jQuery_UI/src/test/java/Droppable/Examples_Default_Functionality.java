package Droppable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class Examples_Default_Functionality   {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	 driver.get("https://jqueryui.com/droppable/");
	 driver.manage().window().maximize();
		
    driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();
    
    Actions a =new Actions(driver);
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

	a.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")), driver.findElement(By.xpath("//div[@id='droppable']"))).build().perform();
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	}

}
