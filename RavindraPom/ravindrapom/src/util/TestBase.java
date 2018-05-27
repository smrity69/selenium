package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import pages.ChapterFirstPage;
import pages.ChapterSecondPage;
import pages.HomePage;

public class TestBase 
{
	protected WebDriver driver;
	protected String baseUrl;
	protected HomePage homePage;
	protected ChapterSecondPage chapterSecond;
	protected ChapterFirstPage chapterFirstPage;

	// Method-1.
	@BeforeSuite
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/achint/Infocampus/chromedriver");      
			ChromeOptions options = new ChromeOptions();
		 options.addArguments("--start-maximized");
		 driver = new ChromeDriver(options);
		baseUrl = "http://book.theautomatedtester.co.uk/";
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	// Method-2.
	@AfterSuite
	public void tearDown() throws Exception {
		driver.quit();

	}
	
	
	
}
