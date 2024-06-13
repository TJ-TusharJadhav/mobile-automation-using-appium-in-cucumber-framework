package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		//chrome lunch 
		 WebDriver driver=new  ChromeDriver();
		 
		 //browser maximize
		 driver.manage().window().maximize();
		 
		 //lunch website
		 driver.get("https://the-internet.herokuapp.com/");
		 
		 //select option on main menu
		 driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[6]/a")).click();
		 
		 //click box
		 driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
		 driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();
		//chrome close 
		 Thread.sleep(5000);
		 driver.quit();
		 

	}

}
