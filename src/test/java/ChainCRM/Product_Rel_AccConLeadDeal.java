package ChainCRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;


public class Product_Rel_AccConLeadDeal {

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
		/*
		//Contact


		driver.findElement (By.xpath("//li[@class='cursorPointer p-2 relatedList_tab rounded-1'][4]")).click();
		Thread.sleep(2000);

		{
			// Initialize Faker
			Faker faker = new Faker();

			for (int j = 0; j < 5; j++) {

				driver.findElement(By.xpath("(//button[@class='addProductsButton'])[1]")).click();
				Thread.sleep(2000);


				// Loop to generate random names and input them
				//for (int i = 0; i < 5; i++) 
				{
					// Generate a random name
					String randomFirstName = faker.name().firstName();
					String randomLastName = faker.name().lastName();
					String randomEmail = faker.internet().emailAddress();

					// Locate the input fields and input the generated data
					WebElement firstNameField = driver.findElement(By.xpath("//input[@name='firstName']"));
					firstNameField.clear();
					firstNameField.sendKeys(randomFirstName);

					WebElement lastNameField = driver.findElement(By.xpath("//input[@name='lastName']"));
					lastNameField.clear();
					lastNameField.sendKeys(randomLastName);

					WebElement emailField = driver.findElement(By.xpath("//input[@name='emailId']"));
					emailField.clear();			
					emailField.sendKeys(randomEmail);
					Thread.sleep(10000);



					driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();
					Thread.sleep(5000);
				}
		 */

		/*
		//Account
		JavascriptExecutor js = (JavascriptExecutor) driver; //Scroll
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		//driver.findElement (By.xpath("//li[@class='cursorPointer p-2 relatedList_tab rounded-1'][7]")).click();

		{
			// Initialize Faker
			Faker faker = new Faker();

			for (int j = 0; j < 5; j++) {

				Thread.sleep(5000);
				driver.findElement(By.xpath("(//button[@class='addProductsButton'])[4]")).click();
				


				// Loop to generate random names and input them
				//for (int i = 0; i < 5; i++) 
				{
					// Generate a random name
					String randomAccountName = faker.name().firstName();


					// Locate the input fields and input the generated data
					WebElement firstNameField = driver.findElement(By.xpath("//input[@name='accountName']"));
					firstNameField.clear();
					firstNameField.sendKeys(randomAccountName);





					driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();
					Thread.sleep(5000);
				}*/

		{
		/*
		//Lead
				JavascriptExecutor js = (JavascriptExecutor) driver; //Scroll
				long pageHeight = (long) js.executeScript("return document.body.scrollHeight");
				js.executeScript("window.scrollTo(0, " + pageHeight / 1.3 + ")");
				Thread.sleep(2000);
				//driver.findElement (By.xpath("//li[@class='cursorPointer p-2 relatedList_tab rounded-1'][5]")).click();

				{
					// Initialize Faker
					Faker faker = new Faker();

					for (int j = 0; j < 5; j++) {

						Thread.sleep(5000);
						driver.findElement(By.xpath("(//button[@class='addProductsButton'])[2]")).click();
						


						// Loop to generate random names and input them
						//for (int i = 0; i < 5; i++) 
						{
							// Generate a random name
							String randomCompanyName = faker.company().name();
							String randomLastName = faker.name().lastName();
							String randomEmail = faker.internet().emailAddress();

							// Locate the input fields and input the generated data
							WebElement CompanyNameField = driver.findElement(By.xpath("//input[@name='companyName']"));
							CompanyNameField.clear();
							CompanyNameField.sendKeys(randomCompanyName);

							WebElement lastNameField = driver.findElement(By.xpath("//input[@name='lastName']"));
							lastNameField.clear();
							lastNameField.sendKeys(randomLastName);

							WebElement emailField = driver.findElement(By.xpath("//input[@name='emailId']"));
							emailField.clear();			
							emailField.sendKeys(randomEmail);
							Thread.sleep(2000);


							JavascriptExecutor js1 = (JavascriptExecutor) driver; //Scroll
							js1.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
							Thread.sleep(2000);


							driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();
							Thread.sleep(5000);*/
			
			//Deal
			JavascriptExecutor js = (JavascriptExecutor) driver; 
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); 
			Thread.sleep(2000); 
			//driver.findElement (By.xpath("//li[@class='cursorPointer p-2 relatedList_tab rounded-1'][5]")).click();

			{
				// Initialize Faker
				Faker faker = new Faker();

				for (int j = 0; j < 5; j++) {

					Thread.sleep(2000);
					driver.findElement(By.xpath("(//button[@class='addProductsButton'])[3]")).click();
					


					// Loop to generate random names and input them
					//for (int i = 0; i < 5; i++) 
					{
						// Generate a random name
						String randomDealName = faker.name().name();
						//double randomAmount = faker.number().randomDouble(2, 1, 10000);
						

						// Locate the input fields and input the generated data
						WebElement DealNameField = driver.findElement(By.xpath("//input[@name='dealName']"));
						DealNameField.clear();
						DealNameField.sendKeys(randomDealName);

						WebElement amountField = driver.findElement(By.xpath("//input[@name='amount']"));
						amountField.clear();
						amountField.sendKeys("100");

						Thread.sleep(20000);


						driver.findElement(By.xpath("//button[@class='createContactButtonSave']")).click();
						Thread.sleep(2000);
			}
		}}}}}

