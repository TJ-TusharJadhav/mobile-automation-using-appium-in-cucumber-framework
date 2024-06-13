package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		//chrome lunch 
		 WebDriver driver=new  ChromeDriver();
		 
		 //browser maximize
		 driver.manage().window().maximize();
		 
		 //lunch website
		 driver.get("https://the-internet.herokuapp.com/");
		 
		 //select frames option in main menu
		 driver.get("//*[@id=\"content\"]/ul/li[22]/a");
		 
		//select Nested Frames
		 driver.get("//*[@id=\"content\"]/div/ul/li[1]/a");
		 
		 //swich left 
		 
		
		 
		//chrome close 
		 Thread.sleep(3000);
		 driver.quit();
		 

	}

}
