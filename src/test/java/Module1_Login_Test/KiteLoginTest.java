package Module1_Login_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import Module1_Login.KiteHomePage;
import Module1_Login.KiteLogin1Page;
import Module1_Login.KiteLogin2Page;

public class KiteLoginTest extends BaseClass
{
	  private static final int TCID = 0;
	KiteLogin1Page login1;
	  KiteLogin2Page login2;
	  KiteHomePage home;
	  
	  
	  
@BeforeClass
public void Openbrowser() throws EncryptedDocumentException, IOException
{
	initializeBrowser();
      login1=new KiteLogin1Page(driver);
       login2=new  KiteLogin2Page(driver);
       home=new KiteHomePage(driver);
       
       
     
	
}
@BeforeMethod
public void LogintoApp() throws EncryptedDocumentException, IOException
{
	login1.intKiteLogin1PageUN(UtilityClass.getTD(0, 0));
	login1.intKiteLoginPagePWD(UtilityClass.getTD(0, 1));
	login1.clickKiteLoginPage1LoginBtn();
	login2.intKiteLogin2PagePIN(UtilityClass.getTD(0, 2));
	login2.intKiteLogin2PageConBtn();
}
@Test
public void VerifyUserID() throws EncryptedDocumentException, IOException
{
	int TCID = 101;
	 String actUserID = home.getactuUserIDHomePageUserID();
	 String expUserID =UtilityClass.getTD(0, 3);
	 Assert.assertEquals(actUserID ,expUserID,"Failed:- both result are DIFF" );
}
@AfterMethod
public void LogoutfromApp(ITestResult s1) throws IOException
{
	if(s1.getStatus()==ITestResult.FAILURE)
	{
		UtilityClass.capturescreenshot(driver, TCID);
	}
	
}
@AfterClass
public void closebrowser()
{
	driver.close();
}

}
