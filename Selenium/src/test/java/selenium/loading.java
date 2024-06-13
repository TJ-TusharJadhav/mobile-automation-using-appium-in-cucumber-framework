package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loading {

	public static void main(String[] args) throws InterruptedException {
		//chrome lunch 
		 WebDriver driver=new  ChromeDriver();
		 
		 //browser maximize
		 driver.manage().window().maximize();
		 
		 //lunch website
		 driver.get("https://the-internet.herokuapp.com/tables");
		 
		 //select option on main menu
//		 driver.findElement(By.xpath("https://the-internet.herokuapp.com/tables")).click();
		System.out.println( driver.findElement(By.xpath("//*[@id=\"content\"]/div"
				+ "")).getText()); 
		
		
		
		
		//chrome close 
		 Thread.sleep(1000);
		 driver.quit();
		 

	}

}
