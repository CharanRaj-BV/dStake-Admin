package ChainCRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contact_Notes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://backoffice.chaincrm.io/home");
		{
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("charan123@mailinator.com");
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Charan@123");
			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();
		}
		{
			driver.findElement(By.xpath("//img[@src='/static/media/Crm.81ed46d298edc2cc1ead42f0b3fa51d9.svg']")).click();
			driver.findElement(By.xpath("//img[@src='/static/media/Contact.5fe67bb258d810fb72df1f441373b84c.svg']")).click();
			driver.findElement(By.xpath("//div[contains(text(),'10 Records Per Page')]")).click();
			driver.findElement(By.xpath("//div[contains(text(),'20 Records Per Page')]")).click();
			driver.findElement(By.xpath("//td[@class='overflow_text contactName cursorPointer']")).click();}
		Thread.sleep(2000);
		 
		driver.findElement(By.xpath("//li[@class='cursorPointer py-2 relatedList_tab rounded-1 }'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@class='notesClass']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@class='notesClass']")).sendKeys("Testing notes");
		driver.findElement(By.xpath("//input[@class='notesClass mt-2']")).sendKeys("Testing");
		driver.findElement(By.xpath("//button[@class='editNoteButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='editNoteButton']")).click();
		WebElement Title = driver.findElement(By.xpath("//input[@class='notesClass mt-2']"));
		Title.clear();
		driver.findElement(By.xpath("//input[@class='notesClass mt-2']")).sendKeys("Testing edit");
		WebElement Note= driver.findElement(By.xpath("//textarea[@class='notesClass']"));
		Note.clear();
		driver.findElement(By.xpath("//textarea[@class='notesClass']")).sendKeys("Edit Notes");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='editNoteButton'])[2]")).click();
		driver.findElement(By.xpath("//img[@src='/static/media/DeleteNote.391e0632849390e2cdb823c1132500dd.svg']")).click();
		driver.findElement(By.xpath("//button[@class='deleteButton px-4 p-1']")).click();
//Document upload
		Thread.sleep(2000);
		for(int i=0;i<3;i++) {
		driver.findElement(By.xpath("//textarea[@class='notesClass']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@class='notesClass']")).sendKeys("Testing notes");
		driver.findElement(By.xpath("//input[@class='notesClass mt-2']")).sendKeys("Testing");
		driver.findElement (By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Blockstack\\OneDrive\\Desktop\\COPY.png");						
		driver.findElement(By.xpath("//button[@class='editNoteButton']")).click();
		{
			System.out.println("Notes details created successfully");
		}

		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='/static/media/DeleteNote.391e0632849390e2cdb823c1132500dd.svg']")).click();
		driver.findElement(By.xpath("//button[@class='deleteButton px-4 p-1']")).click();
		{
			System.out.println("Notes deleted successfully");
		}


	}

}
}