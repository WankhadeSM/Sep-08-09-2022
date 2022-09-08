package LibraryFiles;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass
{
	public WebDriver driver;
public void  initializeBrowser() 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kakli\\Desktop\\Selenium\\23rdAprC_Maven\\Browsers\\chromedriver.exe");
	
	
	 driver=new ChromeDriver();
	
 
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
    driver.get("https://kite.zerodha.com/");
}
}
