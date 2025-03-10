package ChainCRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contact_Purch_Salesorder {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://backoffice.chaincrm.io/home");
		{
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("charan123@mailinator.com");
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Charan@123");
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();
		}
		{
			driver.findElement(By.xpath("//img[@src='/static/media/Crm.81ed46d298edc2cc1ead42f0b3fa51d9.svg']")).click();
			driver.findElement(By.xpath("//img[@src='/static/media/Contact.5fe67bb258d810fb72df1f441373b84c.svg']")).click();
			driver.findElement(By.xpath("//div[contains(text(),'10 Records Per Page')]")).click();
			driver.findElement(By.xpath("//div[contains(text(),'20 Records Per Page')]")).click();
			driver.findElement(By.xpath("//td[@class='overflow_text contactName cursorPointer']")).click();}
		    Thread.sleep(2000);
		 /* //Purchase
		    { 
		    JavascriptExecutor js = (JavascriptExecutor) driver; 
		    js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); 
		    Thread.sleep(2000); 
			driver.findElement(By.xpath("(//button[@class='addProductsButton'])[4]")).click();
			JavascriptExecutor js1 = (JavascriptExecutor) driver; 
		    js1.executeScript("window.scrollTo(0, -document.body.scrollHeight)"); 
		    Thread.sleep(2000); 
			driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("Testring one");
			driver.findElement(By.xpath("//button[@class='save-button']")).click();}*/
		    
		  //Sales  
		    { 
		    	JavascriptExecutor js = (JavascriptExecutor) driver; 
		    	long pageHeight = (long) js.executeScript("return document.body.scrollHeight"); 
		    	js.executeScript("window.scrollTo(0, " + pageHeight / 1.2 + ")"); 			    			    			    
		    	Thread.sleep(2000); 
		    	driver.findElement(By.xpath("(//button[@class='addProductsButton'])[3]")).click();
		    	JavascriptExecutor js1 = (JavascriptExecutor) driver; 
		    	js1.executeScript("window.scrollTo(0, -document.body.scrollHeight);"); 
		    	Thread.sleep(2000); 
		    	driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("Testring one");
		    	JavascriptExecutor js11 = (JavascriptExecutor) driver; 
		    	long pageHeight1 = (long) js11.executeScript("return document.body.scrollHeight"); 
		    	js11.executeScript("window.scrollTo(0, " + pageHeight1 / 2.8 + ")"); 			    			    			    
		    	Thread.sleep(8000); 
		    	JavascriptExecutor js111 = (JavascriptExecutor) driver; 
		    	js111.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		    	Thread.sleep(2000); 
		    	driver.findElement(By.xpath("//button[@class='save-button']")).click();}


		
		
	}

}
