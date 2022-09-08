package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{

	@FindBy(xpath="//span[@class='user-id']") private WebElement UserID;
	
	
	
	
	public KiteHomePage(WebDriver driver)
	{
	PageFactory.initElements(driver , this);
	}
	
	
	public String getactuUserIDHomePageUserID()
	{
		String actuUserID = UserID.getText();
		return actuUserID;
		
//		if(actuUserID.equals(ExpeUserID))
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("fail");
//		}
	}
	
}
