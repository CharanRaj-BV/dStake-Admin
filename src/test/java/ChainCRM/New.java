package ChainCRM;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class New {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://www.blazedemo.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testContactCreate() throws Exception {
    // Label: Test
    // ERROR: Caught exception [ERROR: Unsupported command [resizeWindow | 1411,945 | ]]
    driver.get("https://backoffice.chaincrm.io/");
    driver.findElement(By.xpath("//input[@placeholder = \"Email address\"]")).click();
    driver.findElement(By.xpath("//input[@placeholder = \"Email address\"]")).clear();
    driver.findElement(By.xpath("//input[@placeholder = \"Email address\"]")).sendKeys("charan123@mailinator.com");
    driver.findElement(By.xpath("//*[text() = \"Next\"]")).click();
    driver.findElement(By.xpath("//input[@placeholder = \"Enter Password\"]")).click();
    driver.findElement(By.cssSelector("img.cursorPointer")).click();
    driver.findElement(By.xpath("//input[@placeholder = \"Enter Password\"]")).click();
    driver.findElement(By.xpath("//input[@placeholder = \"Enter Password\"]")).clear();
    driver.findElement(By.xpath("//input[@placeholder = \"Enter Password\"]")).sendKeys("Charan@123");
    driver.findElement(By.xpath("//*[text() = \"Next\"]")).click();
    driver.findElement(By.xpath("(//img[@alt='img'])[8]")).click();
    driver.findElement(By.xpath("//*[text() = \"Personal Profile\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"Personal Profile\"]")).click();
    driver.findElement(By.xpath("//*[text() = \"EDIT\"]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[text() = \"Save\"]")).click();
  
  }
}

