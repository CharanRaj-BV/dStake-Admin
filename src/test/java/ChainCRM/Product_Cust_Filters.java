package ChainCRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product_Cust_Filters {

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
			driver.findElement (By.xpath("//img[@src='/static/media/Commerce.91b56d91eaa2ee422c3b896bfd0d8c4e.svg']")).click();
			driver.findElement (By.xpath("//img[@src='/static/media/prodInactive.9ccd0ea23f928c1bae2cf36b4fa5fdae.svg']")).click();
			driver.findElement (By.xpath("//div[contains(text(),'10 Records Per Page')]")).click();
			driver.findElement (By.xpath("//div[contains(text(),'20 Records Per Page')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class=' css-1x6d312-option']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[1]")).click();
			driver.findElement(By.xpath("//div[@class=' css-1coswhg-option'][1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[1]")).click();
			driver.findElement(By.xpath("//div[@class=' css-1coswhg-option'][2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[1]")).click();
			driver.findElement(By.xpath("//div[@class=' css-1coswhg-option'][3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1qpx96c-indicatorContainer'])[1]")).click();
			driver.findElement(By.xpath("//div[@class=' css-1coswhg-option'][4]")).click();

		}

	}}
