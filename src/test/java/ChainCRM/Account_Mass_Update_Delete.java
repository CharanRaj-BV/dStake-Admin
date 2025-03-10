package ChainCRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Account_Mass_Update_Delete {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://backoffice.chaincrm.io/");
		{
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("charan123@mailinator.com");
			
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
		
			driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Charan@123");
			
			driver.findElement(By.xpath("//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg']")).click();
		
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();
			
			// Mass Update
			driver.findElement(By.xpath("//img[@src='/static/media/Crm.81ed46d298edc2cc1ead42f0b3fa51d9.svg']")).click();
			driver.findElement(By.xpath("//img[@src='/static/media/Account.f388005f1034c11a12f47b06093bd16e.svg']")).click();
			driver.findElement(By.xpath("//div[contains(text(),'10 Records Per Page')]")).click();
			driver.findElement(By.xpath("//div[contains(text(),'20 Records Per Page')]")).click();
//			driver.findElement(By.xpath("//input[@class='cursorPointer']")).click();
//			driver.findElement(By.xpath("//div[@class=' css-qav5hl-singleValue']")).click();
//			driver.findElement(By.xpath("//div[contains(text(),'Mass Update')]")).click();
//			driver.findElement(By.xpath("//input[@class='w-100 border-0 py-2 rounded-1']")).sendKeys("Charan");
//			driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();
//		Thread.sleep(4000);
//			driver.findElement(By.xpath("//input[@class='cursorPointer']")).click();
//			driver.findElement(By.xpath("//div[@class=' css-qav5hl-singleValue']")).click();
//			driver.findElement(By.xpath("//div[contains(text(),'Mass Update')]")).click();
//			driver.findElement(By.xpath("//div[@class='cursorPointer d-flex justify-content-between w-100 my-1 p-1 border-0']")).click();
//			driver.findElement(By.xpath("//span[contains(text(),'Account Number')]")).click();
//			driver.findElement(By.xpath("//input[@class='w-100 border-0 py-2 rounded-1']")).sendKeys("4419108000508");
//			driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();
			
			//Mass Delete
             driver.findElement(By.xpath("(//input[@id='vehicle1'])[3]")).click();
             driver.findElement(By.xpath("//div[@class=' css-qav5hl-singleValue']")).click();
             driver.findElement(By.xpath("//div[contains(text(),'Mass Delete')]")).click();
             driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();

	
	}}}
