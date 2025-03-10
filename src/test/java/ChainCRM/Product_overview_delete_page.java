package ChainCRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product_overview_delete_page {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://backoffice.chaincrm.io/home");
		driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("charan123@mailinator.com");
		driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
		driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Charan@123");
		driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();
		driver.findElement (By.xpath("//img[@src='/static/media/Commerce.91b56d91eaa2ee422c3b896bfd0d8c4e.svg']")).click();
		driver.findElement (By.xpath("//img[@src='/static/media/prodInactive.9ccd0ea23f928c1bae2cf36b4fa5fdae.svg']")).click();
		driver.findElement (By.xpath("//div[contains(text(),'10 Records Per Page')]")).click();
		driver.findElement (By.xpath("//div[contains(text(),'20 Records Per Page')]")).click();
		driver.findElement (By.xpath("//td[@class=' productName cursorPointer']")).click();
		//driver.findElement (By.xpath("//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg']")).click();
		//driver.findElement (By.xpath("//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg']")).click();
		//driver.findElement (By.xpath("//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg']")).click();
		driver.findElement (By.xpath("//li[@class='cursorPointer p-2 relatedList_tab rounded-1'][1]")).click();
		Thread.sleep(2000);
		driver.findElement (By.xpath("//textarea[@class='notesClass']")).click();
		driver.findElement (By.xpath("//textarea[@class='notesClass']")).sendKeys("dcwdwwd");
		driver.findElement (By.xpath("//input[@name='title']")).click();
		driver.findElement (By.xpath("//input[@name='title']")).sendKeys("dutjutjuwdwwd");
		driver.findElement (By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Blockstack\\OneDrive\\Desktop\\COPY.png");
		driver.findElement (By.xpath("//button[@class='editNoteButton']")).click();

	
	}
}
