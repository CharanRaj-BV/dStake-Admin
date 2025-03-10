package dStake_Admin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dcstakeui.diamante.io/");
		
		//LOGIN - LOGOUT
	
		driver.findElement(By.xpath("//input[@class='email_input outline_none p-3 rounded-5 border-0 w-100 ps-5 text-white']")).sendKeys("simran.upadhyay@diamante.io");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='email_input outline_none p-3 w-100 rounded-5 border-0 px-5 text-white']")).sendKeys("Rupesh@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='bg-transparent outline_none border-0 position-absolute end-0 mt-2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='submitBtn p-3 rounded-5 border-0 text-white ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@class='m-1 ps-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='w-25 btn btn-primary']")).click();
		Thread.sleep(2000);
		
		//Forgot password
		
		driver.findElement(By.xpath("//p[@class='cursor_pointer mb-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='email_input outline_none p-3 rounded-5 border-0 w-100 ps-5 text-white ']")).sendKeys("simran.upadhyay@diamante.io");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='submitBtn p-3 rounded-5 border-0 text-white']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='email_input outline_none p-3 w-100 rounded-5 border-0 px-5 text-white'])[1]")).sendKeys("Rupesh@12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='email_input outline_none p-3 w-100 rounded-5 border-0 px-5 text-white'])[2]")).sendKeys("Rupesh@12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='email_input outline_none p-3 w-100 rounded-5 border-0 px-5 text-white no-spinners']")).sendKeys("Rupesh@12345");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); 
		Thread.sleep(5000); 
		driver.findElement(By.xpath("//button[@class='submitBtn p-3 rounded-5 border-0 text-white mt-3']")).click();
		Thread.sleep(2000);

	}

}
