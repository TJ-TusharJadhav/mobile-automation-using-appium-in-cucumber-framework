package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class data_table {

	public static void main(String[] args) throws InterruptedException {
		//chrome lunch 
		 WebDriver driver=new  ChromeDriver();
		 
		 //browser maximize
		 driver.manage().window().maximize();
		 
		 //lunch website
		 driver.get("https://the-internet.herokuapp.com/");
		 
		 //click action
		 driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[3]/a")).click();
		 
		
		 
		//chrome close 
		 Thread.sleep(3000);
		 driver.quit();
		 

	}

}
