package ChainCRM;

import java.awt.Dimension;
import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Datefield {

	
		
		    public static void main(String[] args) {
		    	WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        driver.get("https://backoffice.chaincrm.io/");
		        {
		        	driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("charan123@mailinator.com");
					driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
					driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Charan@123");
					driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();}
		        {
					driver.findElement(By.xpath("//img[@src='/static/media/Crm.81ed46d298edc2cc1ead42f0b3fa51d9.svg']")).click();
					driver.findElement(By.xpath("//img[@src='/static/media/Deals.7f6d923c23db95b6bd7813f47ef5fdf4.svg']")).click();
					driver.findElement(By.xpath("//button[@class='createContactButtonSave py-2']")).click();}
		        
		      
		        WebElement textField = driver.findElement(By.xpath("//input[@name='closingDate']")); 
		     
		        // Create a new Actions object to perform the click
		        Actions actions = new Actions(driver);

		        // Move to the position and click (adjust x and y if needed)
		        actions.moveToElement(textField, -92, 0).click().perform();		   
		        }
}
