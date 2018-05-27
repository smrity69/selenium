package DataDriverFramework;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoopExcelData extends ReadPropertyFile
{
    public static WebDriver driver;

    static Properties myprop;
    static int i;
    static int j;
    public static void main(String[] args) {

        try {
            File src = new File("/Users/achint/Infocampus/myfiles/TestSheet.xls");
            FileInputStream fis = new FileInputStream(src);
            XSSFWorkbook wb1 = new XSSFWorkbook(fis);
            XSSFSheet sh1 = wb1.getSheetAt(0);
            
            int Row_count=sh1.getLastRowNum();
            System.out.println("Row No is  "+Row_count);
            for(int i=1;i<=Row_count;i++)
            {
                XSSFRow row=sh1.getRow(i);

                int cell=row.getLastCellNum();
                System.out.println("cell value     "+cell);
//                   Row newRow = sh1.createRow(rowcount+1);
                    String UserName=sh1.getRow(i).getCell(0).getStringCellValue();
                    String PassWord=sh1.getRow(i).getCell(1).getStringCellValue();
                    
                    System.out.println("UserName is : "+UserName);
                    System.out.println("PassWord is : "+PassWord);
                    Properties  p = ReadPropertyFile.getValuesFromFile();
                    //System.out.println("p value id"   +myprop);
                    String EURL = p.getProperty("URL");
                    System.out.println(EURL);
                    String Euserloc=p.getProperty("userloc");
                    String ENextbutton=p.getProperty("Nextbutton");
                    String Epassloc=p.getProperty("passloc");
                    String Passwordnext=p.getProperty("Passwordnext");
                    
                    System.setProperty("webdriver.chrome.driver", "/Users/achint/Infocampus/chromedriver");
                    driver = new ChromeDriver ();
                    
                    driver.get(EURL);
                    Thread.sleep(5000);
                    driver.findElement(By.xpath(Euserloc)).sendKeys("smrityparul@gmail.com");
                    driver.findElement(By.xpath(ENextbutton)).click();
                    Thread.sleep(3000);
                    driver.findElement(By.xpath(Epassloc)).sendKeys("Orange@123");
                    Thread.sleep(3000);
                    driver.findElement(By.xpath(Passwordnext)).click();
                    Thread.sleep(3000);
        //            driver.quit();    
                    
                
    
            
            // here we need to specify where you want to save file
            /*String[] value = {"No","YES","NO","YES","NO","YES","NO","YES","NO","YES","NO","YES"};
            
            for (i=1;i<sh1.getLastRowNum()+1;i++)
            {
                Row row = sh1.getRow(i);
               row.createCell(row.getLastCellNum()).setCellValue(value[i]);
            }
*/
            FileOutputStream fout = new FileOutputStream(new File("/Users/achint/Infocampus/myfiles/TestSheet2.xls"));

            // finally write content

            wb1.write(fout);

            // close the file

            fout.close();
            
            
        } 

} 
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}