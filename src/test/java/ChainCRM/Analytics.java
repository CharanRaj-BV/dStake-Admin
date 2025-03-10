package ChainCRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Analytics {

	public static void main(String[] args) throws InterruptedException {
	
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://backoffice.chaincrm.io/");

			{
				driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("charan123@mailinator.com");
				driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
				driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Charan@123");
				driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("(//p[@class='sidebarSmallName '])[5]")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//img[@src='/static/media/Analytics.101cf3a83c2400283e9fdfac9ad4a622.svg']")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//div[@class='unselectedOverview mt-2'][1]")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//div[@class='unselectedOverview mt-2'][2]")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//div[@class='unselectedOverview mt-2'][3]")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//div[@class='unselectedOverview mt-2'][4]")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//div[@class='unselectedOverview mt-2'][5]")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//div[@class='unselectedOverview mt-2'][6]")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//div[@class='unselectedOverview mt-2'][7]")).click();
				Thread.sleep(2000);
	}

}}}
