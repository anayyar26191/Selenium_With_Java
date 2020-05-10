package topic_PageobjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;
//Specify the object locators
By UserNameFeild =By.xpath("//input[@name='identifier']");
By MovetoNext = By.xpath("//span[text()='Next']");
By PwdField=By.xpath("//input[@name='password']");
By compose = By.xpath("//div[text()='Compose']");

public LoginPage(WebDriver driver)
{
	this.driver=driver;
	
}
//create Individual methods
public void type_UserName(String uname)
{
	 driver.findElement( UserNameFeild).sendKeys(uname);
}
public void click_Next()
{
	driver.findElement(MovetoNext).click();
}
public void type_password(String password)
{
	 driver.findElement( PwdField).sendKeys(password);
	 
}
	 
	 public void type_compose ( )
	 {
	 	 driver.findElement(compose).click();
	 
}

}