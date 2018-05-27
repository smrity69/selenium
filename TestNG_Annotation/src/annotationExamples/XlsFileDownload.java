package annotationExamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XlsFileDownload {

	public static WebDriver driver;
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		  System.setProperty("webdriver.gecko.driver","/Users/achint/Infocampus/geckodriver");
		  driver=new FirefoxDriver();
		  driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/");
		  driver.manage().window().fullscreen();
		  
		  ((JavascriptExecutor)driver).executeScript("scrool(1,250)");
		  driver.findElement(By.linkText("animatedcolors.xlsm")).click();
		  Robot robo = new Robot();
		  
		  robo.keyPress(KeyEvent.VK_DOWN);
		  Thread.sleep(500);
		  robo.keyRelease(KeyEvent.VK_DOWN);
		  Thread.sleep(500);
		  robo.keyPress(KeyEvent.VK_TAB);
		  Thread.sleep(500);
		  robo.keyRelease(KeyEvent.VK_TAB);
		  Thread.sleep(500);
		  robo.keyPress(KeyEvent.VK_TAB);
		  Thread.sleep(500);
		  robo.keyRelease(KeyEvent.VK_TAB);
		  Thread.sleep(500);
		  robo.keyPress(KeyEvent.VK_TAB);
		  Thread.sleep(500);
		  robo.keyRelease(KeyEvent.VK_TAB);
		  Thread.sleep(500);
		  robo.keyPress(KeyEvent.VK_TAB);
		  Thread.sleep(500);
		  robo.keyRelease(KeyEvent.VK_TAB);
		  Thread.sleep(500);
		  robo.keyPress(KeyEvent.VK_ENTER);
		  Thread.sleep(500);
		  robo.keyRelease(KeyEvent.VK_ENTER);
		  driver.close();
	}

}
