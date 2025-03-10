package ChainCRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Account_Filter {

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
			
			driver.findElement(By.xpath("//img[@src='/static/media/Crm.81ed46d298edc2cc1ead42f0b3fa51d9.svg']")).click();
			driver.findElement(By.xpath("//img[@src='/static/media/Account.f388005f1034c11a12f47b06093bd16e.svg']")).click();
			driver.findElement(By.xpath("//div[contains(text(),'10 Records Per Page')]")).click();
			driver.findElement(By.xpath("//div[contains(text(),'20 Records Per Page')]")).click();
			driver.findElement(By.xpath("//div[contains(text(),'All Accounts')]")).click();
			driver.findElement(By.xpath("//div[contains(text(),'Accounts Shared by Me')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[contains(text(),'Accounts Shared by Me')]")).click();
			driver.findElement(By.xpath("//div[contains(text(),'Accounts Shared to Me')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[contains(text(),'Accounts Shared to Me')]")).click();
			driver.findElement(By.xpath("//div[contains(text(),'My Accounts')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[contains(text(),'My Accounts')]")).click();
			driver.findElement(By.xpath("//div[contains(text(),'New Last Week')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[contains(text(),'New Last Week')]")).click();
			driver.findElement(By.xpath("//div[contains(text(),'New This Week')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[contains(text(),'New This Week')]")).click();
			driver.findElement(By.xpath("//div[contains(text(),'Recently Created Accounts')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[contains(text(),'Recently Created Accounts')]")).click();
			driver.findElement(By.xpath("//div[contains(text(),'Recently Modified Accounts')]")).click();

			
		}

	}

}
