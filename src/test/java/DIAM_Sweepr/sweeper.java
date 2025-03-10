package DIAM_Sweepr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sweeper {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dcgdev.diamante.io/");

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='overlay'])[1]")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		//Thread.sleep(60000);//Add extension 
		driver.findElement(By.xpath("//button[@class='connect_wallet_button btn btn-light btn btn-secondary']")).click();
		Thread.sleep(2000);
		//First Life

		driver.findElement(By.xpath("(//button[@class='w-auto px-5 py-1 header_color fw-bold tictactac_play'])[3]']")).click();
		//Thread.sleep(60000);//Connect the wallet and Confirm the verification
		driver.findElement(By.xpath("(//button[@class='w-auto px-5 py-1 header_color fw-bold tictactac_play'])[3]")).click();
		//Thread.sleep(60000);//Confirm the transaction
		driver.findElement(By.xpath("(//div[@class='tile-front'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='tile-front'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='tile-front'])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='tile-front'])[20]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='tile-front'])[12]")).click();
		Thread.sleep(2000);
		//Claim the amount
		driver.findElement(By.xpath("//button[@class='play_button_card_new']")).click();
		//Second Life

		driver.findElement(By.xpath("(//button[@class='w-auto px-5 py-1 header_color fw-bold tictactac_play'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='w-auto px-5 py-1 header_color fw-bold tictactac_play'])[3]")).click();
		//Thread.sleep(60000);//Confirm the transaction
		driver.findElement(By.xpath("(//div[@class='tile-front'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='tile-front'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='tile-front'])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='tile-front'])[20]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='tile-front'])[12]")).click();
		Thread.sleep(2000);
		//Claim the amount
		driver.findElement(By.xpath("//button[@class='play_button_card_new']")).click();

		//Third Life

		driver.findElement(By.xpath("(//button[@class='w-auto px-5 py-1 header_color fw-bold tictactac_play'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='w-auto px-5 py-1 header_color fw-bold tictactac_play'])[3]")).click();
		//Thread.sleep(60000);//Confirm the transaction
		driver.findElement(By.xpath("(//div[@class='tile-front'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='tile-front'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='tile-front'])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='tile-front'])[20]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='tile-front'])[12]")).click();
		Thread.sleep(5000);
		//Claim the amount
		driver.findElement(By.xpath("//button[@class='play_button_card_new']")).click();


	}}