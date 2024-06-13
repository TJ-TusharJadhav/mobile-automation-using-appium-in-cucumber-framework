package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		//chrome lunch 
		 WebDriver driver=new  ChromeDriver();
		 
		 //browser maximize
		 driver.manage().window().maximize();
		 
		 //lunch website
		 driver.get("https://the-internet.herokuapp.com/");
		 driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[11]/a")).click();
		 
		 WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"dropdown\"]"));
         
         // Initialize the Select class with the dropdown WebElement
         Select dropdown = new Select(dropdownElement);
         
         // Select an option by visible text
         dropdown.selectByVisibleText("Option 2");
         // Get all options in the dropdown
         List<WebElement> options = dropdown.getOptions();
         for (WebElement option : options) {
             System.out.println(option.getText());
         }
         
         // Get the selected option
         WebElement selectedOption = dropdown.getFirstSelectedOption();
         System.out.println("Selected option: " + selectedOption.getText());
         
         
		//chrome close 
		 Thread.sleep(2000);
		 driver.quit();

	}

}
