package DataDriverFramework;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
int i, j;
	public void ReadExl(String exlpath, String sheetName, int rowNum, int colNum)
	{
		try {
            File src = new File(exlpath);
            FileInputStream fis = new FileInputStream(src);
            XSSFWorkbook wb1 = new XSSFWorkbook(fis);
            XSSFSheet sh1 = wb1.getSheet(sheetName);
		}
		catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

	}
	
}
