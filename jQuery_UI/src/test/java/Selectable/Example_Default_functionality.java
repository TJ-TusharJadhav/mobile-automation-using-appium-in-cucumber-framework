package Selectable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Example_Default_functionality {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/selectable/");
        driver.switchTo().frame(0);
        WebElement selectableItem1 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[1]"));
        WebElement selectableItem2 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[2]"));
        WebElement selectableItem3 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[3]"));
        WebElement selectableItem4 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[4]"));
        WebElement selectableItem5 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[5]"));
        WebElement selectableItem6 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[6]"));
        WebElement selectableItem7 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[7]"));

        // Use Actions class to perform multiple selections
        Actions actions = new Actions(driver);
        actions.click(selectableItem1)
               .click(selectableItem2)
               .click(selectableItem3)
               .click(selectableItem4)
               .click(selectableItem5)
               .click(selectableItem6)
               .click(selectableItem7)
               .perform();

        Thread.sleep(1000);
        driver.quit();

        
	}

}
