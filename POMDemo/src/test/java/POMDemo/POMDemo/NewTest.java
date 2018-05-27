package POMDemo.POMDemo;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class NewTest {
	public static WebDriver driver;
	
  @Test(dataProvider="data")
  public void login(String Username,String password) {
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--disable-notifications");
	  System.setProperty("webdriver.chrome.driver", "/Users/achint/Infocampus/chromedriver");
	  driver=new ChromeDriver(options);
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().fullscreen();
	  driver.findElement(By.id("email")).sendKeys(Username);
	  driver.findElement(By.id("pass")).sendKeys(password);
	  driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	  Assert.assertTrue(driver.getTitle().contains("(19) Facebook"), "invalid credentials");
System.out.println("login successful");
driver.quit();
  }
  @DataProvider(name="data")
  public Object[][] datalogin()
  {
	  Object[][] data=new Object[2][2];
	  data[0][0]="smrityparul@gmail.com";
	  data[0][1]="Sam@687386";
	  
	  data[1][0]="smrityparul@gmail.com";
			  data[1][1]="Sam@687386";	
			  
			  return data;
  }
}
