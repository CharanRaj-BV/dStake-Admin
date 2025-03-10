package ChainCRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product_Create {

	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://backoffice.chaincrm.io/");
	
    {
    	driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("charan123@mailinator.com");
		driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
		driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Charan@123");
		driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();
    }
    {
      driver.findElement (By.xpath("//img[@src='/static/media/Commerce.91b56d91eaa2ee422c3b896bfd0d8c4e.svg']")).click();
      driver.findElement (By.xpath("//img[@src='/static/media/prodInactive.9ccd0ea23f928c1bae2cf36b4fa5fdae.svg']")).click();
      driver.findElement (By.xpath("//div[contains(text(),'10 Records Per Page')]")).click();
      driver.findElement (By.xpath("//div[contains(text(),'20 Records Per Page')]")).click();
	  driver.findElement(By.xpath("//button[@class=' py-2 createContactButtonSave']")).click();
	 // WebElement File = driver.findElement(By.xpath("//label[@class='label-file']"));
	//  File.click();
	 
//	  // Provide the file path (use double backslashes for file paths on Windows)
//      //String filePath = "C:\\path\\to\\your\\image.jpg";
//	  String filePath = "C:\\Users\\Blockstack\\Downloads\\NVE00056.jpg";
//      // Upload the file
//     File.sendKeys("filePath");
	  driver.findElement(By.xpath("//input[@name='productCode']")).sendKeys("43453C");
	  driver.findElement(By.xpath("//input[@name='productName']")).sendKeys("Charanproduct");
	  driver.findElement(By.xpath("//input[@name='productActive']")).click();
	  driver.findElement(By.xpath("//div[@class=' css-qav5hl-singleValue']")).click();
     // driver.findElement(By.xpath("//div[contains(text(),'MetBeat Corp.')]")).click();
	  driver.findElement(By.xpath("//div[@class=' css-qav5hl-singleValue']")).click();
	  //driver.findElement(By.xpath("//div[@class=' css-qav5hl-singleValue']")).click();
	  //driver.findElement(By.xpath("//div[@class=' css-qav5hl-singleValue']")).click();
	  driver.findElement(By.xpath("//input[@name='unitPrice']")).sendKeys("100");
	  driver.findElement(By.xpath("//input[@name='commissionRate']")).sendKeys("100");
	  driver.findElement(By.xpath("//input[@name='quantityInStock']")).sendKeys("1000");
	  driver.findElement(By.xpath("//input[@name='qtyOrdered']")).sendKeys("500");
	  driver.findElement(By.xpath("//input[@name='reorderLevel']")).sendKeys("500");
	  driver.findElement(By.xpath("//input[@name='quantityInDemand']")).sendKeys("1000");
	  Thread.sleep(2000);
	   JavascriptExecutor js = (JavascriptExecutor) driver;
		  Thread.sleep(2000);

       // Scroll down by a certain amount (e.g., 1000 pixels)
       //js.executeScript("window.scrollBy(0, 1000);");

       // Scroll back up by the same amount (1000 pixels)
       js.executeScript("window.scrollBy(100, -1000);");

	 // driver.findElement(By.xpath("//p[@name='description']")).sendKeys("Automation testing description");
		driver.findElement(By.xpath("//button[@class='save-button']")).click();
	  //	  driver.findElement(By.xpath("//button[@class='createLeadButton'][1]")).click();
	  //	  driver.findElement(By.xpath("//button[@class='createLeadButton'][2]")).click();


      
      
    }
	
	
	}
	
	
}
