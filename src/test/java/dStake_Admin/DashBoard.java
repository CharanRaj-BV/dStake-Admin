package dStake_Admin;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DashBoard {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dcstakeui.diamante.io/");
		
		
		driver.findElement(By.xpath("//input[@class='email_input outline_none p-3 rounded-5 border-0 w-100 ps-5 text-white']")).sendKeys("simran.upadhyay@diamante.io");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='email_input outline_none p-3 w-100 rounded-5 border-0 px-5 text-white']")).sendKeys("Rupesh@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='bg-transparent outline_none border-0 position-absolute end-0 mt-2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='submitBtn p-3 rounded-5 border-0 text-white ']")).click();
		Thread.sleep(4000);

		//Total deposits

		List<WebElement> dataElements = driver.findElements(By.xpath("(//h1[@class='value_txt'])[1]"));
		System.out.println("Total deposits:");
		for (WebElement element : dataElements) {
			System.out.println(element.getText());

		//Total locked
		List<WebElement> dataElements2 = driver.findElements(By.xpath("(//h1[@class='value_txt'])[2]"));
		System.out.println("Total locked:");
		for (WebElement element2 : dataElements2) {
		System.out.println(element2.getText());

		//Total released
		List<WebElement> dataElements3 = driver.findElements(By.xpath("(//h1[@class='value_txt'])[3]"));
		System.out.println("Total released:");
		for (WebElement element3 : dataElements3) {
		System.out.println(element3.getText());

		//Total penalty
		List<WebElement> dataElements4 = driver.findElements(By.xpath("(//h1[@class='value_txt'])[4]"));
		System.out.println("Total penalty:");
		for (WebElement element4 : dataElements4) {
		System.out.println(element4.getText());


		//Active users
		List<WebElement> dataElements5 = driver.findElements(By.xpath("(//h1[@class='value_txt'])[5]"));
		System.out.println("Active users:");
		for (WebElement element5 : dataElements5) {
		System.out.println(element5.getText());


		//Total deposits from last month

		List<WebElement> dataElements6 = driver.findElements(By.xpath("(//h1[@class='last_txt_val w-50'])[1]"));
    	System.out.println("Total deposits from last month:");
		for (WebElement element6 : dataElements6) {
		System.out.println(element6.getText());

    	//Total locked from last month
		List<WebElement> dataElements7 = driver.findElements(By.xpath("(//h1[@class='last_txt_val w-50'])[2]"));
		System.out.println("Total locked from last month:");
		for (WebElement element7 : dataElements7) {
		System.out.println(element7.getText());

		//Total released from last month
		List<WebElement> dataElements8 = driver.findElements(By.xpath("(//h1[@class='last_txt_val w-50'])[3]"));
		System.out.println("Total released from last month:");
		for (WebElement element8 : dataElements8) {
		System.out.println(element8.getText());

		//Total penalty from last month
		List<WebElement> dataElements9 = driver.findElements(By.xpath("(//h1[@class='last_txt_val w-50'])[4]"));
		System.out.println("Total penalty from last month:");
		for (WebElement element9 : dataElements9) {
			System.out.println(element9.getText());


		//Active users from last month
		List<WebElement> dataElements10 = driver.findElements(By.xpath("(//h1[@class='last_txt_val w-50'])[5]"));
		System.out.println("Active users from last month:");
		for (WebElement element10 : dataElements10) {
		System.out.println(element10.getText());


        //Total deposits percentile

		List<WebElement> dataElements11 = driver.findElements(By.xpath("(//span[@class='small_text text_success'])[1]"));
		System.out.println("Total deposits percentile:");
		for (WebElement element11 : dataElements11) {
		System.out.println(element11.getText());

		//Total locked percentile
		List<WebElement> dataElements12= driver.findElements(By.xpath("(//span[@class='small_text text_success'])[2]"));
		System.out.println("Total locked percentile:");
		for (WebElement element12 : dataElements12) {
		System.out.println(element12.getText());

		//Total released percentile
		List<WebElement> dataElements13 = driver.findElements(By.xpath("(//span[@class='small_text text_success'])[3]"));
		System.out.println("Total released percentile:");
		for (WebElement element13 : dataElements13) {
		System.out.println(element13.getText());

		//Total penalty percentile
		List<WebElement> dataElements14 = driver.findElements(By.xpath("(//span[@class='small_text text_success'])[4]"));
		System.out.println("Total penalty percentile:");
		for (WebElement element14 : dataElements14) {
			System.out.println(element14.getText());


		//Active users percentile
		List<WebElement> dataElements15 = driver.findElements(By.xpath("(//span[@class='small_text text_success'])[5]"));
		System.out.println("Active users percentile:");
		for (WebElement element15 : dataElements15) {
		System.out.println(element15.getText());									

		
		//Activity overview dropdown
		
		driver.findElement(By.xpath("(//select[@name='category'])[1]")).click();
	    Thread.sleep(4000);
     	driver.findElement(By.xpath("//option[contains(text(),'Weekly')]")).click();
  
		
		
	    Thread.sleep(4000);
     	driver.findElement(By.xpath("//option[contains(text(),'Daily')]")).click();
		Thread.sleep(4000);
		
		
	    Thread.sleep(4000);
     	driver.findElement(By.xpath("//option[contains(text(),'Yearly')]")).click();
		Thread.sleep(4000);
	
	    Thread.sleep(4000);
     	driver.findElement(By.xpath("//option[contains(text(),'Monthly')]")).click();
     
		Thread.sleep(2000);
		
		
		
		
	
		
		}}}}}}}}}}}}}}}}}


