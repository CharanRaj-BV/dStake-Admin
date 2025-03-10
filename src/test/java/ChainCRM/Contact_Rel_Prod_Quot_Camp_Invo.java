package ChainCRM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contact_Rel_Prod_Quot_Camp_Invo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://backoffice.chaincrm.io/home");
		//	driver.switchTo().newWindow(WindowType.TAB);
		//    driver.get("https://backoffice.chaincrm.io/home");
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
		
		//Products
		/*
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		long pageHeight = (long) js.executeScript("return document.body.scrollHeight"); 
		js.executeScript("window.scrollTo(0, " + pageHeight / 1.8 + ")"); 
		Thread.sleep(2000); 
		driver.findElement(By.xpath("(//button[@class='addProductsButton p-1'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).click();
		driver.findElement(By.xpath("//button[@class='createContactButtonSave modalButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='position-absolute end-0 mt-2'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='position-absolute end-0 mt-2'])[1]")).click();
		driver.findElement(By.xpath("(//td[@class='position-absolute end-0 mt-2'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='unassignButton px-2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='position-absolute end-0 mt-2'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='position-absolute end-0 mt-2'])[1]")).click();
		driver.findElement(By.xpath("(//td[@class='position-absolute end-0 mt-2'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='unassignButton px-2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='position-absolute end-0 mt-2'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='position-absolute end-0 mt-2'])[1]")).click();
		driver.findElement(By.xpath("(//td[@class='position-absolute end-0 mt-2'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='unassignButton px-2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='position-absolute end-0 mt-2'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='position-absolute end-0 mt-2'])[1]")).click();
		driver.findElement(By.xpath("(//td[@class='position-absolute end-0 mt-2'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='unassignButton px-2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='position-absolute end-0 mt-2'])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='position-absolute end-0 mt-2'])[1]")).click();
		driver.findElement(By.xpath("(//td[@class='position-absolute end-0 mt-2'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='unassignButton px-2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='position-absolute end-0 mt-2'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='position-absolute end-0 mt-2'])[1]")).click();
		driver.findElement(By.xpath("(//td[@class='position-absolute end-0 mt-2'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='unassignButton px-2']")).click();
		Thread.sleep(2000);*/
		
		//Quotes
		{
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			long pageHeight = (long) js.executeScript("return document.body.scrollHeight"); 
			js.executeScript("window.scrollTo(0, " + pageHeight / 1.3 + ")"); 
			Thread.sleep(2000); 
			driver.findElement(By.xpath("(//button[@class='addProductsButton'])[2]")).click();
			driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("New quotes");
			JavascriptExecutor js1 = (JavascriptExecutor) driver; 
			js1.executeScript("window.scrollTo(0, -document.body.scrollHeight);"); 
			Thread.sleep(5000); 
			//driver.findElement(By.xpath("(//img[@src='/static/media/Account.f388005f1034c11a12f47b06093bd16e.svg'])[2]")).click();
			//driver.findElement(By.xpath("//button[@class='btn btnColor btn-sm px-3 text-white']")).click();
			driver.findElement(By.xpath("//button[@class=save-button']")).click();

		}
		//Invoice
		{
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			long pageHeight = (long) js.executeScript("return document.body.scrollHeight"); 
			js.executeScript("window.scrollTo(0, " + pageHeight / 1.3 + ")"); 
			Thread.sleep(2000); 
			driver.findElement(By.xpath("(//button[@class='addProductsButton'])[2]")).click();
			driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("New invoices");
			JavascriptExecutor js1 = (JavascriptExecutor) driver; 
			js1.executeScript("window.scrollTo(0, -document.body.scrollHeight);"); 
			Thread.sleep(5000); 
			//driver.findElement(By.xpath("(//img[@src='/static/media/Account.f388005f1034c11a12f47b06093bd16e.svg'])[2]")).click();
			//driver.findElement(By.xpath("//button[@class='btn btnColor btn-sm px-3 text-white']")).click();
			driver.findElement(By.xpath("//button[@class=save-button']")).click();
		}
		
		//Campaigns
		{
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			long pageHeight = (long) js.executeScript("return document.body.scrollHeight"); 
			js.executeScript("window.scrollTo(0, " + pageHeight / 1.3 + ")"); 
			Thread.sleep(2000); 
			driver.findElement(By.xpath("(//button[@class='addProductsButton'])[2]")).click();
			driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("New Campaigns");
			JavascriptExecutor js1 = (JavascriptExecutor) driver; 
			js1.executeScript("window.scrollTo(0, -document.body.scrollHeight);"); 
			Thread.sleep(5000); 
			//driver.findElement(By.xpath("(//img[@src='/static/media/Account.f388005f1034c11a12f47b06093bd16e.svg'])[2]")).click();
			//driver.findElement(By.xpath("//button[@class='btn btnColor btn-sm px-3 text-white']")).click();
			driver.findElement(By.xpath("//button[@class=save-button']")).click();

		}

	}
	
}
