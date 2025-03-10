package ChainCRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEAL_REPORTS {

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
				driver.findElement (By.xpath("//img[@src='/static/media/Report.0c3d85485b54cdae8d4f0b36e22a2730.svg']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//h6[@class='cursorPointer'])[1]")).click();
				Thread.sleep(3000);
				
				driver.findElement (By.xpath("(//p[@class='sidebarSmallName '])[5]")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//img[@src='/static/media/Analytics.101cf3a83c2400283e9fdfac9ad4a622.svg']")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//img[@src='/static/media/Report.0c3d85485b54cdae8d4f0b36e22a2730.svg']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//h6[@class='cursorPointer'])[2]")).click();
				Thread.sleep(3000);
				
				driver.findElement (By.xpath("(//p[@class='sidebarSmallName '])[5]")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//img[@src='/static/media/Analytics.101cf3a83c2400283e9fdfac9ad4a622.svg']")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//img[@src='/static/media/Report.0c3d85485b54cdae8d4f0b36e22a2730.svg']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//h6[@class='cursorPointer'])[3]")).click();
				Thread.sleep(3000);
				
				driver.findElement (By.xpath("(//p[@class='sidebarSmallName '])[5]")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//img[@src='/static/media/Analytics.101cf3a83c2400283e9fdfac9ad4a622.svg']")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//img[@src='/static/media/Report.0c3d85485b54cdae8d4f0b36e22a2730.svg']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//h6[@class='cursorPointer'])[4]")).click();
				Thread.sleep(3000);
				
				driver.findElement (By.xpath("(//p[@class='sidebarSmallName '])[5]")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//img[@src='/static/media/Analytics.101cf3a83c2400283e9fdfac9ad4a622.svg']")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//img[@src='/static/media/Report.0c3d85485b54cdae8d4f0b36e22a2730.svg']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//h6[@class='cursorPointer'])[5]")).click();
				Thread.sleep(3000);
				
				driver.findElement (By.xpath("(//p[@class='sidebarSmallName '])[5]")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//img[@src='/static/media/Analytics.101cf3a83c2400283e9fdfac9ad4a622.svg']")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//img[@src='/static/media/Report.0c3d85485b54cdae8d4f0b36e22a2730.svg']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//h6[@class='cursorPointer'])[6]")).click();
				Thread.sleep(3000);

				driver.findElement (By.xpath("(//p[@class='sidebarSmallName '])[5]")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//img[@src='/static/media/Analytics.101cf3a83c2400283e9fdfac9ad4a622.svg']")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//img[@src='/static/media/Report.0c3d85485b54cdae8d4f0b36e22a2730.svg']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//h6[@class='cursorPointer'])[7]")).click();
				Thread.sleep(3000);

				driver.findElement (By.xpath("(//p[@class='sidebarSmallName '])[5]")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//img[@src='/static/media/Analytics.101cf3a83c2400283e9fdfac9ad4a622.svg']")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//img[@src='/static/media/Report.0c3d85485b54cdae8d4f0b36e22a2730.svg']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//h6[@class='cursorPointer'])[8]")).click();
				Thread.sleep(3000);
				
				driver.findElement (By.xpath("(//p[@class='sidebarSmallName '])[5]")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//img[@src='/static/media/Analytics.101cf3a83c2400283e9fdfac9ad4a622.svg']")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//img[@src='/static/media/Report.0c3d85485b54cdae8d4f0b36e22a2730.svg']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//h6[@class='cursorPointer'])[9]")).click();
				Thread.sleep(3000);

				driver.findElement (By.xpath("(//p[@class='sidebarSmallName '])[5]")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//img[@src='/static/media/Analytics.101cf3a83c2400283e9fdfac9ad4a622.svg']")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//img[@src='/static/media/Report.0c3d85485b54cdae8d4f0b36e22a2730.svg']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//h6[@class='cursorPointer'])[10]")).click();
				Thread.sleep(3000);
				
				driver.findElement (By.xpath("(//p[@class='sidebarSmallName '])[5]")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//img[@src='/static/media/Analytics.101cf3a83c2400283e9fdfac9ad4a622.svg']")).click();
				Thread.sleep(2000);
				driver.findElement (By.xpath("//img[@src='/static/media/Report.0c3d85485b54cdae8d4f0b36e22a2730.svg']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//h6[@class='cursorPointer'])[11]")).click();
				Thread.sleep(3000);
			}}}}

