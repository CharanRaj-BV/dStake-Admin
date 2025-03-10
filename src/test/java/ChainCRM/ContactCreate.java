package ChainCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactCreate {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://backoffice.chaincrm.io/");
		Thread.sleep(1000);
		//Create contact
		{
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("charan123@mailinator.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Charan@123");
			driver.findElement(By.xpath("//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();
			Thread.sleep(5000);
			}
		{
			driver.findElement(By.xpath("//img[@src='/static/media/Crm.81ed46d298edc2cc1ead42f0b3fa51d9.svg']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@src='/static/media/Contact.5fe67bb258d810fb72df1f441373b84c.svg']")).click();
			Thread.sleep(2000);
			//Save Button
			//for(int i=0;i<3;i++) {
			driver.findElement(By.xpath("//button[@class='createContactButtonSave py-2']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Charan");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Raj");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("Charan@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();
			Thread.sleep(5000);
	//		}
			//Save and New button
			driver.findElement(By.xpath("//button[@class='createContactButtonSave py-2']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Charan");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Raj");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='emailId']")).sendKeys("Charan@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='createContactButton']")).click();
			Thread.sleep(5000);
			//Cancel button
			driver.findElement(By.xpath("//button[@class='createContactButton ']")).click();
			
		}
	}
}
