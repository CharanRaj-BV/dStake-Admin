package Individual;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://webtest.paycircle.io/");
		Thread.sleep(1000);
	
	    driver.findElement(By.xpath("//input[@class='mobileNum']")).sendKeys("9999999999");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='passWord']")).sendKeys("Charan@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='continueSignIn']")).click();
		Thread.sleep(4000);
		
		List<WebElement> buttons = driver.findElements(By.xpath("//button[@class='sessionExpireButton']"));
        if (!buttons.isEmpty()) {
            // Click the first button if it is present
            buttons.get(0).click();
            System.out.println("Clicked the Proceed button.");
    		Thread.sleep(4000);
       
             	
        }
        
		/*List<WebElement> buttons1 = driver.findElements(By.xpath("//button[@class='sessionExpireButtonCancel']"));
 
        if (!buttons1.isEmpty()) {
            // Click the first button if it is present
            buttons1.get(0).click();
            System.out.println("Clicked the Cancel button.");
    		Thread.sleep(4000);
       
             	
        }*/
        
		/*driver.findElement(By.xpath("//span[contains(text(),'Manage Beneficiary')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Add Beneficiary')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='benifName']")).sendKeys("Charan Raj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='benifBankName']")).sendKeys("Canara");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='benifAccountNumber']")).sendKeys("4419108000500");
		Thread.sleep(2000);
		
		WebElement dropdown = driver.findElement(By.xpath("//div[@class='bankDetailInput px-2 css-b62m3t-container']"));
		dropdown.click();
		WebElement option = driver.findElement(By.xpath("//div[contains(text(),'CHECKING')]"));
		option.click();
		driver.findElement(By.xpath("//input[@name='benifRoutingNumber']")).sendKeys("021001208");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='benifPhone']")).sendKeys("9972623354");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='benifEmail']")).sendKeys("Charan@mailinator.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='benifReference']")).sendKeys("Banking");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='benifStreetOne']")).sendKeys("Janson road");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='benifStreetTwo']")).sendKeys("2nd main");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='benifZipcode']")).sendKeys("56860");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='bankStreetOne']")).sendKeys("Baby street");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='bankStreetTwo']")).sendKeys("5th main");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name='alcode']")).sendKeys("46861");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='manageadd_button px-2 py-2']")).click();
		Thread.sleep(9000);
		
		driver.findElement(By.xpath("//button[@class='otpCont_button']")).click();*/




	}

}
