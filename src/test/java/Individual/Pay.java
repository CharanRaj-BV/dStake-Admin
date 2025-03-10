package Individual;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pay {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C://Users//Blockstack//eclipse-workspace//Automationprojects//Drivers//chrome-win64");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://siladev.paycircle.io/");
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//input[@class='mobileNum']")).sendKeys("9142929436");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='passWord']")).sendKeys("Loki@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='continueSignIn']")).click();
		Thread.sleep(4000);
		
		List<WebElement> buttons = driver.findElements(By.xpath("//button[@class='sessionExpireButton']"));
 
        if (!buttons.isEmpty()) {
            // Click the first button if it is present
            buttons.get(0).click();
            System.out.println("Clicked the first button.");
    		Thread.sleep(4000);
        }
        
        //Deposit ACH
       //Using for loop
    int numberOfIterations = 1;
    for (int i = 0; i < numberOfIterations; i++){
       
       
		driver.findElement(By.xpath("//span[contains(text(),'Deposit')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search_input_wallet']")).sendKeys("USD");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@src='/static/media/Dollar-USD-icon.e5efcca16f825149a37184c86e2c3301.svg']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='enable-button fw-bold']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Same Day ACHdes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='enable-button fw-bold']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='currencyInput']")).sendKeys("20");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='SelectBank_container d-flex  justify-content-between ']")).click();
		Thread.sleep(14000);
		driver.findElement(By.xpath("//div[@class='cardContainer d-flex align-items-center gap-3 mb-4 text-white border-0'][1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='bankModel_cont_button fw-bold']")).click();
		Thread.sleep(1000);
 
		driver.findElement(By.xpath("//button[@class='enable-button fw-bold']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class=' depositButton']")).click();
		Thread.sleep(24000);
      	
    }

	}

}
