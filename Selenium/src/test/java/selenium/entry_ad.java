package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class entry_ad {

	public static void main(String[] args) throws InterruptedException {
		//chrome lunch 
		 WebDriver driver=new  ChromeDriver();
		 
		 //browser maximize
		 driver.manage().window().maximize();
		 
		 //lunch website
		 driver.get("https://the-internet.herokuapp.com/");
		 
		 //select option on main menu
		 driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[15]/a")).click();
		 Thread.sleep(1000);
		//close ad
		 driver.findElement(By.xpath("//*[@id=\"modal\"]/div[2]/div[3]/p")).click();
		 
		//chrome close 
		 Thread.sleep(1000);
		 driver.quit();
		 

	}

}
