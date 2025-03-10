package ChainCRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://backoffice.chaincrm.io/");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[contains(text(),'Sign Up')]")).click();
		Thread.sleep(5000);
		//driver.findElements(By.xpath("//button[@class='signupBtn']")).click();
	//Scroll bar with JS
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Charan");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Raj");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Mayank1@mailinator.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Charan@123");
		driver.findElement(By.xpath("//input[@placeholder='Company Name']")).sendKeys("Mayan tech pvt.ltd");
		driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("9987654780");
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[@class=' css-1qpx96c-indicatorContainer']")).click();
		//driver.findElement(By.xpath("//div[@class=' css-1r3lj47']")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[@class=' css-1r3lj47']")).sendKeys("Karnataka");
		driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='verifyButton p-2']")).click();
	}

}
