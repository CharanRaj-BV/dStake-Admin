package ChainCRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Account_Create_Edit_Clone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  			driver.get("https://backoffice.chaincrm.io/");
				//Create Account
			{
					driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("charan123@mailinator.com");
					
					driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
				
					driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Charan@123");
					
					driver.findElement(By.xpath("//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg']")).click();
				
					driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();}
					{
					driver.findElement(By.xpath("//img[@src='/static/media/Crm.81ed46d298edc2cc1ead42f0b3fa51d9.svg']")).click();
					driver.findElement(By.xpath("//img[@src='/static/media/Account.f388005f1034c11a12f47b06093bd16e.svg']")).click();
                    driver.findElement(By.xpath("//button[@class='createContactButtonSave py-2']")).click();
					driver.findElement(By.xpath("//input[@name='accountName']")).sendKeys("CharanrajBV");
                    driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();
				
                    //Edit account
                    {
//                    	driver.findElement(By.xpath("//img[@src='/static/media/Crm.81ed46d298edc2cc1ead42f0b3fa51d9.svg']")).click();
//    					driver.findElement(By.xpath("//img[@src='/static/media/Account.f388005f1034c11a12f47b06093bd16e.svg']")).click();
//    					driver.findElement(By.xpath("//div[contains(text(),'10 Records Per Page')]")).click();
//    	 			    driver.findElement(By.xpath("//div[contains(text(),'20 Records Per Page')]")).click();
                    	driver.findElement(By.xpath("//td[@class='overflow_text leadName cursorPointer']")).click();
                        driver.findElement(By.xpath("//button[@class='btn btn-secondary bg-white text-dark border border-primary']")).click();
    					driver.findElement(By.xpath("//input[@name='accountName']")).sendKeys("CharanrajBVC");
                        driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();
                        
                        //Clone Account
                        {
                        	//driver.findElement(By.xpath("//img[@src='/static/media/Crm.81ed46d298edc2cc1ead42f0b3fa51d9.svg']")).click();
//        					driver.findElement(By.xpath("//img[@src='/static/media/Account.f388005f1034c11a12f47b06093bd16e.svg']")).click();
//        					driver.findElement(By.xpath("//div[contains(text(),'10 Records Per Page')]")).click();
//        	 			    driver.findElement(By.xpath("//div[contains(text(),'20 Records Per Page')]")).click();
                        	driver.findElement(By.xpath("//td[@class='overflow_text leadName cursorPointer']")).click();
                            driver.findElement(By.xpath("//button[@class='btn btn-secondary bg-white text-dark border border-primary'][2]")).click();
                            driver.findElement(By.xpath("//div[@class='mt-1 cursorPointer ms-2']")).click();
                            driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();

                            
					}
					}}}
				
	
	}

				
	
		
	

