package ChainCRM;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product_Mass_Update_Transfer_Delete {

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
		//driver.findElement(By.xpath("//input[@class='cursorPointer']")).click();
		/*
		//Mass Transfer
		driver.findElement(By.xpath("//div[@class=' css-1qpx96c-indicatorContainer']")).click();
		driver.findElement(By.xpath("//div[@class=' css-1coswhg-option'][1]")).click();
		driver.findElement(By.xpath("//img[@src='/static/media/user-search-01.f7897915c904c53cc76c49ced9419915.svg']")).click();
		// Locate the search input field
		WebElement Search = driver.findElement(By.xpath("//input[@class='topBarModalSearch px-5']"));

		// Perform search by sending keys
		Search.sendKeys("jhgjhbjhbjhvf");

		// Allow time for the search results to load (if necessary)
		Thread.sleep(2000); // Consider using WebDriverWait instead of Thread.sleep in production code

		// Locate search results (adjust XPath to match your actual search results element)
		List<WebElement> searchResults = driver.findElements(By.xpath("//span[@class='ms-2']"));

		if (searchResults.size() > 0) {
			// Results are displayed
			System.out.println("Search results are displayed.");
		} else {
			// No results found
			System.out.println("No search results are displayed.");
		}
		// Locate all list items
		List<WebElement> allItems1 = driver.findElements(By.xpath("//span[@class='ms-2']"));

		// Count the total number of items
		int totalItems = allItems1.size();
		System.out.println("Total items : " + totalItems);

		WebElement Search1 = driver.findElement(By.xpath("//input[@class='topBarModalSearch px-5']"));
		Search1.clear();
		//Search1.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		//Search1.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		Search1.sendKeys("Raj");
		Thread.sleep(2000); 
		List<WebElement> searchResults1 = driver.findElements(By.xpath("//span[@class='ms-2']"));
		if (searchResults1.size() > 0) {

			System.out.println("Search results are displayed.");
		} else {

			System.out.println("No search results are displayed.");
		}

		// Locate all list items
		List<WebElement> allItems = driver.findElements(By.xpath("//span[@class='ms-2']"));

		// Count the total number of items
		int totalItems1 = allItems.size();
		System.out.println("Total items : " + totalItems1);

		//driver.findElement(By.xpath("(//span[@class='ms-2'])[1]")).click();
		driver.findElement(By.xpath("(//td//span[@class='ms-2'])"+ "["+ new Random().nextInt(2)+"]")).click();
		driver.findElement(By.xpath("//button[@class='createContactButtonSave modalButton']")).click();
		driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();
		Thread.sleep(4000);


		//Mass delete
		//driver.findElement(By.xpath("//input[@class='cursorPointer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='cursorPointer'])[3]")).click();
		driver.findElement(By.xpath("//div[@class=' css-1qpx96c-indicatorContainer']")).click();
		driver.findElement(By.xpath("//div[@class=' css-1coswhg-option'][2]")).click();
		driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();


		Thread.sleep(1000);
		WebElement messageElement1 = driver.findElement(By.xpath("(//h4[@class='title'])[1]")); 
		if (messageElement1.isDisplayed()) {
			String actualMessage = messageElement1.getText().trim();
			String expectedMessage = "Deletion successful".trim();  

			if (actualMessage.equals(expectedMessage)) {
				System.out.println("The exact message is displayed.");
			} else {
				System.out.println("The message is displayed but does not match the expected text.");
			}
		} else {
			System.out.println("The message is not displayed.");
		}*/

		//Mass Update
		/*{
			driver.findElement(By.xpath("//div[@class=' css-1qpx96c-indicatorContainer']")).click();
			driver.findElement(By.xpath("//div[@class=' css-1coswhg-option'][3]")).click();
			driver.findElement(By.xpath("//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg']")).click();
			driver.findElement(By.xpath("//input[@id='selectField']")).sendKeys("Commission");
			driver.findElement(By.xpath("//span[@class='ps-2']")).click();
			driver.findElement(By.xpath("//input[@class='w-100 border-0 py-2 rounded-1']")).sendKeys("100");
			driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();
		} */
		Thread.sleep(3000);
		//		{
		//			//driver.findElement(By.xpath("//input[@class='cursorPointer']")).click();
		//			driver.findElement(By.xpath("//div[@class=' css-1qpx96c-indicatorContainer']")).click();
		//			driver.findElement(By.xpath("//div[@class=' css-1coswhg-option'][3]")).click();
		//			driver.findElement(By.xpath("//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg']")).click();
		//		    driver.findElement(By.xpath("//input[@id='selectField']")).sendKeys("Product");
		////			WebElement Code = driver.findElement(By.xpath("//input[@id='selectField']"));
		////			String valueWithSpaces = "Product Code";
		////			Code.sendKeys("Product Code"); 
		//			/*{
		//				Code.sendKeys("Product");
		//				Code.sendKeys(" ");
		//				Code.sendKeys("Code");}*/
		//			driver.findElement(By.xpath("(//span[@class='ps-2'])[2]")).click();
		//			driver.findElement(By.xpath("//input[@class='w-100 border-0 py-2 rounded-1']")).sendKeys("778378");
		//			driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();
		//			}
		/*driver.findElement(By.xpath("//input[@class='cursorPointer']")).click();
		driver.findElement(By.xpath("//div[@class=' css-1qpx96c-indicatorContainer']")).click();
		driver.findElement(By.xpath("//div[@class=' css-1coswhg-option'][3]")).click();
		driver.findElement(By.xpath("//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg']")).click();
		driver.findElement(By.xpath("//input[@id='selectField']")).sendKeys("Qty");
		driver.findElement(By.xpath("//span[@class='ps-2']")).click();
		driver.findElement(By.xpath("//input[@class='w-100 border-0 py-2 rounded-1']")).sendKeys("100");
		driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();*/

		/*driver.findElement(By.xpath("//input[@class='cursorPointer']")).click();
		driver.findElement(By.xpath("//div[@class=' css-1qpx96c-indicatorContainer']")).click();
		driver.findElement(By.xpath("//div[@class=' css-1coswhg-option'][3]")).click();
		driver.findElement(By.xpath("//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg']")).click();
		driver.findElement(By.xpath("//input[@id='selectField']")).sendKeys("Quantity");
		driver.findElement(By.xpath("//span[@class='ps-2']")).click();
		driver.findElement(By.xpath("//input[@class='w-100 border-0 py-2 rounded-1']")).sendKeys("100");
		driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();*/

		/*driver.findElement(By.xpath("//input[@class='cursorPointer']")).click();
		driver.findElement(By.xpath("//div[@class=' css-1qpx96c-indicatorContainer']")).click();
		driver.findElement(By.xpath("//div[@class=' css-1coswhg-option'][3]")).click();
		driver.findElement(By.xpath("//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg']")).click();
		driver.findElement(By.xpath("//input[@id='selectField']")).sendKeys("Reorder");
		driver.findElement(By.xpath("//span[@class='ps-2']")).click();
		driver.findElement(By.xpath("//input[@class='w-100 border-0 py-2 rounded-1']")).sendKeys("100");
		driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();*/

		/*driver.findElement(By.xpath("//input[@class='cursorPointer']")).click();
		driver.findElement(By.xpath("//div[@class=' css-1qpx96c-indicatorContainer']")).click();
		driver.findElement(By.xpath("//div[@class=' css-1coswhg-option'][3]")).click();
		driver.findElement(By.xpath("//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg']")).click();
		driver.findElement(By.xpath("//input[@id='selectField']")).sendKeys("Sale");
		driver.findElement(By.xpath("(//span[@class='ps-2'])[2]")).click();
		driver.findElement(By.xpath("//input[@class='w-100 border-0 py-2 rounded-1']")).sendKeys("01-09-2024");
		driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();*/

		/*driver.findElement(By.xpath("//input[@class='cursorPointer']")).click();
		driver.findElement(By.xpath("//div[@class=' css-1qpx96c-indicatorContainer']")).click();
		driver.findElement(By.xpath("//div[@class=' css-1coswhg-option'][3]")).click();
		driver.findElement(By.xpath("//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg']")).click();
		driver.findElement(By.xpath("//input[@id='selectField']")).sendKeys("Sale");
		driver.findElement(By.xpath("(//span[@class='ps-2'])[1]")).click();
		driver.findElement(By.xpath("//input[@class='w-100 border-0 py-2 rounded-1']")).sendKeys("01-09-2024");
		driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();*/

		/*driver.findElement(By.xpath("//input[@class='cursorPointer']")).click();
		driver.findElement(By.xpath("//div[@class=' css-1qpx96c-indicatorContainer']")).click();
		driver.findElement(By.xpath("//div[@class=' css-1coswhg-option'][3]")).click();
		driver.findElement(By.xpath("//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg']")).click();
		driver.findElement(By.xpath("//input[@id='selectField']")).sendKeys("Support");
		driver.findElement(By.xpath("(//span[@class='ps-2'])[2]")).click();
		driver.findElement(By.xpath("//input[@class='w-100 border-0 py-2 rounded-1']")).sendKeys("01-09-2024");
		driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();*/

		/*driver.findElement(By.xpath("//input[@class='cursorPointer']")).click();
		driver.findElement(By.xpath("//div[@class=' css-1qpx96c-indicatorContainer']")).click();
		driver.findElement(By.xpath("//div[@class=' css-1coswhg-option'][3]")).click();
		driver.findElement(By.xpath("//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg']")).click();
		driver.findElement(By.xpath("//input[@id='selectField']")).sendKeys("Support");
		driver.findElement(By.xpath("(//span[@class='ps-2'])[1]")).click();
		driver.findElement(By.xpath("//input[@class='w-100 border-0 py-2 rounded-1']")).sendKeys("01-09-2024");
		driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();*/

		/*driver.findElement(By.xpath("//input[@class='cursorPointer']")).click();
		driver.findElement(By.xpath("//div[@class=' css-1qpx96c-indicatorContainer']")).click();
		driver.findElement(By.xpath("//div[@class=' css-1coswhg-option'][3]")).click();
		driver.findElement(By.xpath("//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg']")).click();
		driver.findElement(By.xpath("//input[@id='selectField']")).sendKeys("Product");
		driver.findElement(By.xpath("(//span[@class='ps-2'])[1]")).click();
		driver.findElement(By.xpath("//input[@class='cursorPointer ms-2 mt-1']")).click();
		driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();*/

		driver.findElement(By.xpath("//input[@class='cursorPointer']")).click();
		driver.findElement(By.xpath("//div[@class=' css-1qpx96c-indicatorContainer']")).click();
		driver.findElement(By.xpath("//div[@class=' css-1coswhg-option'][3]")).click();
		driver.findElement(By.xpath("//img[@src='/static/media/Down31.f0a1749ad1085383807fc785ff2661f1.svg']")).click();
		driver.findElement(By.xpath("//input[@id='selectField']")).sendKeys("Unit");
		driver.findElement(By.xpath("//span[@class='ps-2']")).click();
		driver.findElement(By.xpath("//input[@class='w-100 border-0 py-2 rounded-1']")).sendKeys("34");
		driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();

	}

}


