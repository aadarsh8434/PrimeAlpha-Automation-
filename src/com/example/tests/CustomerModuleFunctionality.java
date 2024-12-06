package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CustomerModuleFunctionality{
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
    
    driver.findElement(By.xpath("//*[text() = \"Edit\"]")).click();
    Thread.sleep(3000);  // Click on the Edit Button
    
    driver.findElement(By.xpath("//*[text() = \"Product Overview\"]")).click();
    Thread.sleep(3000);  // Click on the Product Overview
    
    driver.findElement(By.xpath("//*[text() = \"Video\"]")).click();
    Thread.sleep(3000);  // Click on the Video
    
    driver.findElement(By.cssSelector("i.fi.fi-rr-pencil.actions-icon-custom")).click();
    Thread.sleep(3000);  // Click on the Edit button under Video
    
    driver.findElement(By.className("close-btn")).click();
    Thread.sleep(3000);  // Click on the cancel button under Video
    
    
    driver.findElement(By.xpath("//*[text() = \"Disclaimer\"]")).click();
    Thread.sleep(3000);  // Click on the Disclaimer
    
    driver.findElement(By.xpath("//*[@id=\"tabstrip\"]/button[4]")).click();
    js.executeScript("window.scrollBy(0,500)");
    Thread.sleep(3000);  // Click on the Dataroom
    
    driver.findElement(By.cssSelector("i.fi.fi-rr-share.actions-icon-custom")).click();
    Thread.sleep(3000); // Click on the share button under Dataroom
    
    driver.findElement(By.id("primealphainputId")).sendKeys("22");
    Thread.sleep(3000); // enter days under Dataroom
    
    driver.findElement(By.xpath("//*[text() = \"Generate Link\"]")).click();
    Thread.sleep(3000); // click on the generate button under Dataroom
    
    driver.findElement(By.xpath("//*[text() = \"Share\"]")).click();
    Thread.sleep(3000); // click on the share button under Dataroom
    
    driver.findElement(By.xpath("//input[@placeholder = \"Email\"]")).sendKeys("partharakshit5653@gmail.com"); // enter the email
    driver.findElement(By.xpath("//input[@placeholder = \"Subject\"]")).sendKeys("History"); // Enter the subject
    driver.findElement(By.xpath("//textarea[@placeholder = \"Enter the message\"]")).sendKeys("Give me the update"); // enter the message
    Thread.sleep(3000);
    
    
    driver.findElement(By.xpath("//*[text() = \"Share\"]")).click(); // enter the share button
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("div.close-btn")).click(); // click on the close button
    Thread.sleep(3000);
    
    driver.findElement(By.cssSelector("img[alt=\"Logo\"]")).click();
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//*[text() = \"Investment Preference\"]")).click(); // click on the Investment preference
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//*[text() = \"Team\"]")).click();// click on the Team
    js.executeScript("window.scrollBy(0,500)");
    Thread.sleep(3000);
        
    
    driver.findElement(By.xpath("(//*[text() = \"View Profile\"])[7]")).click(); // click on the people name = AMITAaa Mishra
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//*[text() = \"Investment Preference\"]")).click();// click on the Investment Preference under people section
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//*[text() = \"About Me\"]")).click();// click on About Me under people section
    Thread.sleep(3000);
    
    driver.findElement(By.className("save_component_save__SLm-N")).click(); // click on Save under people section
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//*[text() = \"Update\"]")).click();// click on update under people section
    Thread.sleep(3000);
    
    driver.findElement(By.cssSelector("img[alt=\"Logo\"]")).click(); // click on  home logo 
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//*[text() = \"Insights & News\"]")).click();
    Thread.sleep(3000);// click on insights and news
    
    
    driver.findElement(By.cssSelector("img[alt=\"Logo\"]")).click();// click on  home logo 
    Thread.sleep(3000);
    
    
    driver.findElement(By.xpath("//*[text() = \"Products\"]")).click(); // click on the Products
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"Alternative Database\"]")).click(); // click on the Alternative Database under Products
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@placeholder = \"Search by email, company name\"]")).sendKeys("Wesoftek");
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
    driver.navigate().to("https://www.userdev.primealpha.co/dashboard/products");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"Search Library\"]")).click(); // click on Search Library under Products
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"Products\"]")).click(); // click on the Products
    Thread.sleep(3000);
    
    
    driver.findElement(By.xpath("//*[text() = \"Library\"]")).click(); // click on the Library
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"Hedge Funds\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"Digital Assets\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"Private Credit\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"Cash Management\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"Asset Focus\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"All\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@placeholder = \"Search\"]")).sendKeys("popo");
    Thread.sleep(3000);
    
    
    driver.findElement(By.xpath("//*[text() = \"Investors\"]")).click(); // click on the Investors
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"Search Investor Database\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@placeholder = \"Search by name, email, company name\"]")).sendKeys("Investor");
    driver.findElement(By.xpath("//*[text() = \"RoadShow\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@placeholder = \"Search by email, company name\"]")).sendKeys("Business Company Pvt Ltd");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"Investor/Manager/Sponsor\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"Investment Preference\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("i.fi.fi-rr-cross")).click();
    Thread.sleep(3000);
    driver.navigate().to("https://www.userdev.primealpha.co/dashboard/investors");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"Marketing Best Practices\"]")).click();
    Thread.sleep(3000);
    driver.navigate().to("https://www.userdev.primealpha.co/dashboard/investors");
    Thread.sleep(3000);
    
    
    
    driver.findElement(By.xpath("//*[text() = \"Resources\"]")).click(); // click on the Resources
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"Operations\"]")).click(); 
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"Due Diligence\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"Marketing\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"All\"]")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@placeholder = \"Search\"]")).sendKeys("test");// Type "test" under Resources section
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//*[text() = \"Saved List\"]")).click(); // click on the Saved List
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"People\"]")).click(); // click on the People under Saved List section
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@placeholder = \"Search by name,company name,Type\"]")).sendKeys("Amlesh");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"Product\"]")).click(); // click on the Product under Saved List section
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[text() = \"Company\"]")).click(); // click on the Company under Saved List section
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
