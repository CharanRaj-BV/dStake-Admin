package ChainCRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Product_Share {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://backoffice.chaincrm.io/");

		driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("charan123@mailinator.com");
		driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
		driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Charan@123");
		driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();
		{
			driver.findElement (By.xpath("//img[@src='/static/media/prodInactive.9ccd0ea23f928c1bae2cf36b4fa5fdae.svg']")).click();
			driver.findElement (By.xpath("//div[contains(text(),'10 Records Per Page')]")).click();
			driver.findElement (By.xpath("//div[contains(text(),'20 Records Per Page')]")).click();
			driver.findElement(By.xpath("//td[@class=' productName cursorPointer']")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-secondary bg-white text-dark border border-primary'][2]")).click();
			driver.findElement(By.xpath("//div[@class='d-flex gap-3 align-items-center mt-2'][2]")).click();
			driver.findElement(By.xpath("//span[@class='insertCommonInputField text-primary cursorPointer pt-2']")).click();
			driver.findElement(By.xpath("(//button[@class='add_btn'])[1]")).click();
			driver.findElement(By.xpath("(//button[@class='add_btn'])[2]")).click();
			driver.findElement(By.xpath("(//button[@class='add_btn'])[3]")).click();
			driver.findElement(By.xpath("(//button[@class='add_btn'])[4]")).click();
			driver.findElement(By.xpath("(//button[@class='add_btn'])[5]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-bhje4j-option'])[1]")).click();
			driver.findElement(By.xpath("(//button[@class='add_btn'])[1]")).click();
			driver.findElement(By.xpath("(//button[@class='add_btn'])[2]")).click();
			driver.findElement(By.xpath("(//button[@class='createContactButtonSave'])[2]")).click();
			driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();driver.findElement (By.xpath("//img[@src='/static/media/Commerce.91b56d91eaa2ee422c3b896bfd0d8c4e.svg']")).click();
			
			{
				System.out.println("Shared successfully");
			}
			Thread.sleep(2000);
			
			/*//Manage sharing
			driver.findElement(By.xpath("//button[@class='btn btn-secondary bg-white text-dark border border-primary'][2]")).click();
			driver.findElement(By.xpath("//div[@class='d-flex gap-3 align-items-center mt-2'][2]")).click();
			driver.findElement(By.xpath("//button[@class=' manageSharingBtn ']")).click();
			driver.findElement(By.xpath("//span[@class='insertCommonInputField text-primary cursorPointer pt-2']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[@class='add_btn'])[1]")).click();*/
			//Revoke sharing
			driver.findElement(By.xpath("//button[@class='btn btn-secondary bg-white text-dark border border-primary'][2]")).click();
			driver.findElement(By.xpath("//div[@class='d-flex gap-3 align-items-center mt-2'][2]")).click();
			driver.findElement(By.xpath("//span[@class='text-danger cursorPointer']")).click();
			driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();

			{
				System.out.println("Revoked successfully");
			}


		}
	}
}
