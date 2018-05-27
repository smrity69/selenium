package annotationExamples;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookLogin {
	public static WebDriver driver;
  @BeforeTest
  public void Setup() 
  	{
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--disable-notifications");
	  System.setProperty("webdriver.chrome.driver", "/Users/achint/Infocampus/chromedriver");
	  driver=new ChromeDriver(options);
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().fullscreen();
  	}
  @Test	(priority = 1)
  public void Login()
  	{
	  driver.findElement(By.id("email")).sendKeys("smrityparul@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("Sam@687386");
	  driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
//	  Actions ac = new Actions(driver);
//	  ac.sendKeys(Keys.ESCAPE).build().perform();
  	}
  @Test (priority = 2)
  public void messageAchint() throws InterruptedException
  {
	  driver.findElement(By.xpath(".//*[@id='navItem_217974574879787']/a/div")).click();
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  driver.findElement(By.cssSelector("._58al")).sendKeys("Achint");
	  Thread.sleep(2000);;
	  
  }
  @Test (priority = 3)
  public void Logout() throws InterruptedException
  {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.xpath(".//*[@id='logoutMenu']//div")).click();
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  driver.findElement(By.linkText("Log out")).click();
	  Thread.sleep(2000);
	  driver.close();  
  }
}
