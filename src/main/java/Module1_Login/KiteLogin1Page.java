package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page 
{

  @FindBy(xpath="//input[@id='userid']") private WebElement UN;
  
  @FindBy(xpath="//input[@id='password']") private WebElement PWD; 
	
  @FindBy(xpath="//button[text()='Login ']") private WebElement LoginBtn;
  
  
  
  public KiteLogin1Page(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  
  public void intKiteLogin1PageUN(String UserValue)
  {
	  UN.sendKeys(UserValue);
  }
  
  public void intKiteLoginPagePWD(String PWDValue)
  {
	  PWD.sendKeys(PWDValue);
  }
  
  public void clickKiteLoginPage1LoginBtn()
  {
	  LoginBtn.click();
  }
	
}
