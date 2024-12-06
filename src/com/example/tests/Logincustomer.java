package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Logincustomer {
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
    
    
    driver.findElement(By.xpath("//*[@id=\"tabstrip\"]/button[2]")).click();
    Thread.sleep(3000);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    // Scroll down the webpage by pixel
    // For example, scroll down by 500 pixels
    js.executeScript("window.scrollBy(0,500)");
    Thread.sleep(4000);

    
    driver.findElement(By.xpath("//*[text() = \"NEW AUM FLOW\"]")).click();
    js.executeScript("window.scrollBy(0,500)");
    Thread.sleep(3000); // show new aum slow
    
    driver.findElement(By.xpath("//*[@id=\"tabstrip\"]/button[2]")).click();
    Thread.sleep(3000); // Video
    
    driver.findElement(By.xpath("//*[@id=\"tabstrip\"]/button[3]")).click();
    Thread.sleep(3000); //Data room
    
    driver.findElement(By.xpath("(//*[text() = \"Video\"])[2]")).click();
    Thread.sleep(3000); //Video under Data room
    
	
    driver.findElement(By.cssSelector("img[alt=\"Video\"]")).click();
	 Thread.sleep(5000);//Click on the Video under Data room
	    
	 
	 WebElement closeButton = driver.findElement(By.className("close-btn"));
     closeButton.click();
	 Thread.sleep(3000);// click on the cancel icon in video
	 
	     
	 driver.findElement(By.xpath("//*[text() = \"Document\"]")).click();
    Thread.sleep(3000); //Document under Data room
    
    driver.findElement(By.cssSelector("img[alt=\"Excel\"]")).click();
    Thread.sleep(3000); //To download a Document under Data room
    
    driver.findElement(By.xpath("//*[text() = \"Podcast\"]")).click();
    Thread.sleep(3000); //Podcast under Data room
    
    
    driver.findElement(By.xpath("//*[text() = \"Disclaimer\"]")).click();
    Thread.sleep(3000); // Disclaimer
    
    driver.findElement(By.xpath("//*[text() = \"Product Overview\"]")).click();
    Thread.sleep(3000); // Product Overview
    
    driver.findElement(By.xpath("//*[text() = \"Investment Process\"]")).click();
    js.executeScript("window.scrollBy(0,300)");
    Thread.sleep(3000);// show Investment Process
    
    driver.findElement(By.xpath("//*[text() = \"Product Details\"]")).click();
    Thread.sleep(3000); //  Show Product Details


    driver.findElement(By.xpath("//*[text() = \"Track Record/AUM\"]")).click();
    Thread.sleep(3000); //  Show Track Record/AUM
    
    driver.findElement(By.xpath("//*[text() = \"Show Monthly AUM\"]")).click();
    Thread.sleep(3000);// Show Monthly AUM
    
    driver.findElement(By.xpath("//*[text() = \"Export\"]")).click();
    Thread.sleep(3000);// export under Track Record/AUM
    
    driver.findElement(By.xpath("//*[text() = \"Strategy\"]")).click();
    Thread.sleep(3000);  // Show Strategy
    
    driver.findElement(By.cssSelector("img[alt=\"Logo\"]")).click(); // click on  home logo 
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
