package ChainCRM;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScheduleCall_Del_MAC {

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
			driver.findElement(By.xpath("//img[@src='/static/media/call.62366def9dda621b33d5a67b1a2f5412.svg']")).click();
			driver.findElement(By.xpath("//div[contains(text(),'10 Records Per Page')]")).click();
			driver.findElement(By.xpath("//div[contains(text(),'20 Records Per Page')]")).click();
			{
				driver.findElement(By.xpath("//button[@class='createContactButtonSave py-2']")).click();
				driver.findElement(By.xpath("//li[@class='dropdown-item cursorPointer'][1]")).click();
				Thread.sleep(2000); 
				Actions ac= new Actions(driver);
				WebElement loc= driver.findElement(By.xpath("(//input[@class='insertCommonInputFieldCalls cursorPointer'])[4]"));
				ac.moveToElement(loc).perform();
				driver.findElement(By.xpath("(//div[@class='cursorPointer'])[2]")).click();
				driver.findElement(By.xpath("(//span[@class='p-1 cursorPointer'])[6]")).click();
				driver.findElement(By.xpath("(//div[@class='cursorPointer'])[4]")).click();
				driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("Shedule call");
				driver.findElement(By.xpath("//button[@class='save_btn py-2 border border-0 rounded-2']")).click();
				Thread.sleep(2000);

				try {
					driver.findElement(By.xpath("//button[@class='save_btn']")).click();
					System.out.println("Create button clicked successfully.");
				} catch (NoSuchElementException e) {
					System.out.println("Create button not found. Nothing is overlapping...");
				}

				Thread.sleep(2000);
				for(int i=0;i<3;i++) {
					driver.findElement(By.xpath("(//td[@class=' leadName cursorPointer'])[2]")).click();		
					driver.findElement(By.xpath("//button[@class='btn btn-secondary bg-white text-dark border border-primary ms-2']")).click();
					driver.findElement(By.xpath("(//li[@class='dropdown-item cursorPointer'])[4]")).click();
					driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();
					{
						System.out.println("Deleted successfully");
					}
					Thread.sleep(2000);}
			}

		}}}
