package ChainCRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Product_Edit {

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
			}	
			{
				driver.findElement (By.xpath("//img[@src='/static/media/Commerce.91b56d91eaa2ee422c3b896bfd0d8c4e.svg']")).click();
				driver.findElement (By.xpath("//img[@src='/static/media/prodInactive.9ccd0ea23f928c1bae2cf36b4fa5fdae.svg']")).click();
				driver.findElement (By.xpath("//div[contains(text(),'10 Records Per Page')]")).click();
				driver.findElement (By.xpath("//div[contains(text(),'20 Records Per Page')]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//td[@class=' productName cursorPointer']")).click();
				Thread.sleep(2000);
				//				driver.findElement(By.xpath("//button[@class='btn btn-secondary bg-white text-dark border border-primary'][1]")).click();	
				//				Thread.sleep(2000);
				//				//		        String folderPath = "C:\\Users\\Blockstack\\OneDrive\\Desktop\\";
				//				//		        String fileName = "COPY.png";	
				//
				//				//		        // Combine folder path and file name to create the file path
				//				//		        File file = new File(folderPath + fileName);
				//				//		        String absolutePath = file.getAbsolutePath();
				//
				//				//		        // Locate the file upload element (input type='file')
				//				//		        WebElement uploadElement = driver.findElement(By.xpath("//span[contains(text(),'Drag and Drop files (JPG,PNG)')]"));
				//				//
				//				//		        // Provide the full path to the file
				//				//		        uploadElement.sendKeys(absolutePath);
				//
				//				//driver.findElement(By.xpath("//label[@class='label-file']")).sendKeys("C:\\Users\\Blockstack\\OneDrive\\Desktop\\COPY.png");
				//				//				driver.findElement(By.xpath("//span[contains(text(),'Drag and Drop files (JPG,PNG)')]")).click();
				//				//				Thread.sleep(10000);
				//				//				driver.findElement(By.xpath("//img[@src='/static/media/user-search-01.f7897915c904c53cc76c49ced9419915.svg']")).click();
				//				//				driver.findElement(By.xpath("//input[@class=' cursorPointer']")).click();
				//				//				//driver.findElement(By.xpath("//span[contains(text(),'Charan Raj')]")).click();
				//				//				driver.findElement(By.xpath("//input[@class=' cursorPointer']")).click();
				//				//driver.findElement(By.xpath("//input[@type='checkbox']")).click();
				//				//driver.findElement(By.xpath("//button[@class='unassignButton btnColor']")).click();
				//				WebElement inputField = driver.findElement(By.xpath("//input[@name='productName']"));
				//				inputField.sendKeys(Keys.chord(Keys.CONTROL, "a"));  // Select all text (Ctrl+A)
				//				inputField.sendKeys(Keys.BACK_SPACE);  // Delete the entire text
				//				inputField.sendKeys("Charan new product"); 
				//				//		        WebElement dropdownButton = driver.findElement(By.xpath("//input[@class='leadInputField cursorPointer']"));
				//				//		        dropdownButton.click();
				//				//		        Thread.sleep(2000);
				//				//		        dropdownButton.click();
				//				//				driver.findElement(By.xpath("//button[@class='cursorPointer pt-2 ps-1']")).click();
				//				driver.findElement(By.xpath("(//span[@class='cursorPointer pt-2 ps-1'])[2]")).click();
				//				driver.findElement(By.xpath("//td[@class='d-flex gap-2']")).click();
				//				driver.findElement(By.xpath("(//button[@class='btn btnColor btn-sm px-3 text-white'])")).click();
				//				WebElement dropdownButton = driver.findElement(By.xpath("//div[@class=' css-qav5hl-singleValue']"));
				//				dropdownButton.click();
				//				Thread.sleep(3000);
				//				driver.findElement(By.xpath("//div[@class=' css-1x4ez8u-option'][1]")).click();
				//				driver.findElement(By.xpath("//input[@name='productActive']")).click();
				//				Thread.sleep(2000);
				//				WebElement unitprice = driver.findElement(By.xpath("//input[@name='unitPrice']"));
				//				//unitprice.sendKeys(Keys.chord(Keys.CONTROL, "a"));  
				//				//unitprice.sendKeys(Keys.BACK_SPACE);  
				//				unitprice.clear();
				//				unitprice.sendKeys("1000");
				//				Thread.sleep(2000);
				//				WebElement commissionRate = driver.findElement(By.xpath("//input[@name='commissionRate']"));
				//				//commissionRate.sendKeys(Keys.chord(Keys.CONTROL, "a"));  
				//				//commissionRate.sendKeys(Keys.BACK_SPACE);  
				//				commissionRate.clear();
				//				commissionRate.sendKeys("1000");
				//				Thread.sleep(2000);
				//				JavascriptExecutor js = (JavascriptExecutor) driver;
				//				js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				//				Thread.sleep(5000);
				//				driver.findElement(By.xpath("(//div[@class=' css-qav5hl-singleValue'])[4]")).click();
				//				driver.findElement(By.xpath("(//div[@class=' css-1x4ez8u-option'])[4]")).click();
				//				WebElement quantityInStock = driver.findElement(By.xpath("//input[@name='quantityInStock']"));
				//				Thread.sleep(3000);
				//				quantityInStock.clear();
				//				//quantityInStock.sendKeys(Keys.chord(Keys.CONTROL, "a"));
				//				//quantityInStock.sendKeys(Keys.BACK_SPACE);  
				//				Thread.sleep(2000);
				//				quantityInStock.sendKeys("5000");
				//				Thread.sleep(2000);
				//				WebElement qtyOrdered = driver.findElement(By.xpath("//input[@name='qtyOrdered']"));
				//				qtyOrdered.clear();
				//				//qtyOrdered.sendKeys(Keys.chord(Keys.CONTROL, "a"));
				//				//qtyOrdered.sendKeys(Keys.BACK_SPACE);  
				//				Thread.sleep(2000);
				//				qtyOrdered.sendKeys("5000");
				//				Thread.sleep(2000);
				//				WebElement reorderLevel = driver.findElement(By.xpath("//input[@name='reorderLevel']"));
				//				//reorderLevel.sendKeys(Keys.chord(Keys.CONTROL, "a"));  
				//				//reorderLevel.sendKeys(Keys.BACK_SPACE);
				//				reorderLevel.clear();
				//				reorderLevel.sendKeys("100");
				//				Thread.sleep(2000);
				//				WebElement quantityInDemand = driver.findElement(By.xpath("//input[@name='quantityInDemand']"));
				//				//quantityInDemand.sendKeys(Keys.chord(Keys.CONTROL, "a"));  
				//				quantityInDemand.clear();
				//				//quantityInDemand.sendKeys(Keys.BACK_SPACE);  
				//				quantityInDemand.sendKeys("6000");
				//				Thread.sleep(2000);
				//				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				//				js1.executeScript("window.scrollTo(0, 0)");
				//				Thread.sleep(5000);
				//				driver.findElement(By.xpath("//button[@class='save-button']")).click();
				//				//driver.findElement (By.xpath("//button[contains(text(),'Update')]")).click();

				//Clone
				driver.findElement(By.xpath("//button[@class='btn btn-secondary bg-white text-dark border border-primary'][2]")).click();
				driver.findElement(By.xpath("//div[@class='mt-1 cursorPointer ms-2']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='productName']")).sendKeys("Char132");
				driver.findElement(By.xpath("//input[@name='productCode']")).sendKeys("Coden312");
				driver.findElement(By.xpath("//button[@class='save-button']")).click();
				{
					System.out.println("Clone product successpully");
				}
			}}}}
