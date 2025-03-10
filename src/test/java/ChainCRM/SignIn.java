package ChainCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignIn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://backoffice.chaincrm.io/");
		Thread.sleep(1000);
		
		//Valid Email & Password
//		{
//		driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("charan123@mailinator.com");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Charan@123");
//		driver.findElement(By.xpath("//img[@src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();
//		}
		
	//Invalid mail
//		{
//			driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("CHaran@mailinator.com");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
//			{
//				System.out.println("Email Id doesn't exist");
//			
//		}
		//Valid mail Id & Invalid password
//		{
//			driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("charan@mailinator.com");
//			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Charan@12345");
//			driver.findElement(By.xpath("//button[@class='LoginNextBtn mt-1']")).click();
//			{
//				System.out.println("Invalid credentials");
//				
//			}
		
	//Email change
//		{
//			driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("charan@mailinator.com");
//			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//p[@class='mt-2']")).click();
//		}
//		//Login with valid OTP
//		{
//			driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("charan@mailinator.com");
// 		    driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//p[@class='text-end mb-0']")).click();
//			Thread.sleep(30000);
//		    driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
//	        Thread.sleep(10000);
//	        {
//	        System.out.println("Login successfull");	
//	        }
//	        
		//Login with Invalid OTP
//				{
//					driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("charan@mailinator.com");
//		 		    driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
//					Thread.sleep(3000);
//					driver.findElement(By.xpath("//p[@class='text-end mb-0']")).click();
//					Thread.sleep(30000);
//				    driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
//			        {
//			        System.out.println("Please enter the correct OTP");	
//			        }
		
		//Login using password button in the OTP page
//		{
//			driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("charan@mailinator.com");
// 		    driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//p[@class='text-end mb-0']")).click();
//			Thread.sleep(30000);
//		    driver.findElement(By.xpath("//p[@class='text-end mb-0']")).click();
//			        
//		}
		//Resend OTP
//		{
//			{
//				driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("charan@mailinator.com");
//	 		    driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath("//p[@class='text-end mb-0']")).click();
//				Thread.sleep(70000);
//				driver.findElement(By.xpath("//p[@class='text-end mb-0'][2]")).click();
//			}
//			{
//			System.out.println("OTP sent successfully");
//			}
		//Forgot password
		{
			driver.findElement(By.xpath("//input[@class='loginEmailField mb-3 ps-3']")).sendKeys("charan@mailinator.com");
 		    driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//p[@class='text-end mb-0'][2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
			Thread.sleep(30000);//Enter OTP manually
			//driver.findElement(By.xpath("//input[@class='signupInputFieldPassword']")).sendKeys("Charan@123");
			driver.findElement(By.xpath("//input[@placeholder='New Password']")).sendKeys("Charan@123");
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//button[@img='src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg']")).click();
			//Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("Charan@123");
			//driver.findElement(By.xpath("//button[@img='src='/static/media/ClosePassword.238b4710b1a4f25ab4ae8dcb8d390bf7.svg'][2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@class='LoginNextBtn']")).click();
		}
			
		}
	
}
