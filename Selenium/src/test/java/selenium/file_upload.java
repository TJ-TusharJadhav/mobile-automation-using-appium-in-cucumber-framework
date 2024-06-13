package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_upload {

	public static void main(String[] args) throws InterruptedException {
		//chrome lunch 
		 WebDriver driver=new  ChromeDriver();
		 
		 //browser maximize
		 driver.manage().window().maximize();
		 
		 //lunch website
		 driver.get("https://the-internet.herokuapp.com/");
		 
		 //click action
		 driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[13]/a")).click();
		 
		driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button")).click();  
		//chrome close 
		 Thread.sleep(3000);
		 driver.quit();
		 

	}

}
