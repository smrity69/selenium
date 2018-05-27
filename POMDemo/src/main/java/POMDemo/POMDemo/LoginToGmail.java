package POMDemo.POMDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToGmail {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/achint/Infocampus/chromedriver");
		driver = new ChromeDriver() ;
		
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("smrityparul@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("Orange@123");
		
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.close();
		System.out.println("executed");
	}

}
