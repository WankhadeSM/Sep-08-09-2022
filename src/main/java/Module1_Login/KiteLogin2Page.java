package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page 
{

	@FindBy(xpath="//input[@id='pin']") private WebElement PIN;
	
	@FindBy(xpath="//button[text()='Continue ']") private WebElement ConBtn;
	
	
	public KiteLogin2Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void intKiteLogin2PagePIN(String PINValue)
	{
		PIN.sendKeys(PINValue);
	}
	
	public void intKiteLogin2PageConBtn()
	{
		ConBtn.click();
	}
	
}
