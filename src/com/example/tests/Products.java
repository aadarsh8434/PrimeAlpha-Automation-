package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Products {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  

  @Before
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://www.blazedemo.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testLogincustomer() throws Exception {
  
	    driver.get("https://www.userdev.primealpha.co/auth");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("email")).sendKeys("partharakshit5653@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("93qQQ93@");
	    driver.findElement(By.xpath("//*[text() = \"Login\"]")).click();
   
    
    driver.findElement(By.id("otp")).sendKeys("111111");
    Thread.sleep(4000);
    driver.findElement(By.xpath("//*[text() = \"Verify\"]")).click();
    Thread.sleep(4000);
    
    
    driver.findElement(By.xpath("//*[text() = \"Products\"]")).click(); // click on the Products
    Thread.sleep(3000);
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeScript("window.scrollBy(0,300);");
    Thread.sleep(3000);
    jse.executeScript("window.scrollBy(0,400);");
    Thread.sleep(3000);
    jse.executeScript("window.scrollBy(0,400);");
    Thread.sleep(3000);
    jse.executeScript("window.scrollBy(0,400);");
    Thread.sleep(3000);
    jse.executeScript("window.scrollBy(0,400);");
    Thread.sleep(3000);
    jse.executeScript("window.scrollBy(0,400);");
    Thread.sleep(3000);
    jse.executeScript("window.scrollBy(0,400);");
    Thread.sleep(3000);
    ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"Alternative Database\"]")).click(); // click on the Alternative Database under Products
    Thread.sleep(3000);
    jse.executeScript("window.scrollBy(0,300);");
    Thread.sleep(3000);
    jse.executeScript("window.scrollBy(0,400);");
    Thread.sleep(3000);
    jse.executeScript("window.scrollBy(0,400);");
    Thread.sleep(3000);
    jse.executeScript("window.scrollBy(0,400);");
    Thread.sleep(3000);
    ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@placeholder = \"Search by email, company name\"]")).sendKeys("Business Company Pvt Ltd");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@placeholder = \"Search by email, company name\"]")).clear();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div[3]/div[1]/div[2]/button")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"RoadShow\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@placeholder = \"Search by email, company name\"]")).sendKeys("Wesoftek Pvt Ltd");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"Investor/Manager/Sponsor\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"Products\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("i.fi.fi-rr-cross")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@placeholder = \"Search by email, company name\"]")).clear();
    Thread.sleep(3000);
    driver.navigate().to("https://www.userdev.primealpha.co/dashboard/products");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"Search Library\"]")).click(); // click on Search Library under Products
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"Products\"]")).click(); // click on the Products
    Thread.sleep(3000);
    
    
    driver.findElement(By.cssSelector("img[alt=\"Logo\"]")).click();// click on  home logo 
    Thread.sleep(3000);
    
    
    driver.findElement(By.xpath("//*[text() = \"P\"]")).click();// for log out click on the "P" icon
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"Logout\"]")).click(); // click on the Logout
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"Confirm\"]")).click(); // click on the confirm
    Thread.sleep(3000);
    
    
    
    
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
