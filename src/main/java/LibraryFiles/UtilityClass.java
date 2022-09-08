package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	
	// Author Name:-  Sumedh Wankhede
	// This method is used to get test data from Excel sheet
	// Need to pass two input :- 1. RowIndex   2. ColIndex
public static String getTD(int rowIndex,int collIndex) throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("C:\\Users\\kakli\\Desktop\\Selenium\\23rdAprC_Maven\\TestData\\Sheet1.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	String value = sh.getRow(rowIndex).getCell(collIndex).getStringCellValue();
	return value;
}

public static void capturescreenshot(WebDriver driver, int TCID) throws IOException
{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest = new File("C:\\Users\\kakli\\Desktop\\Selenium\\23rdAprC_Maven\\Screenshot\\TestCaseID"+TCID+".jpg");
	
	FileHandler.copy(src, dest);
}
}

