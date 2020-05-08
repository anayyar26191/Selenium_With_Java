package test_NG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_MultipleMethods {
public WebDriver driver;
	
	@Test
	public void launch()
{
		//Launch Chrome Browser
				System.setProperty("webdriver.chrome.driver", "/Users/nayyar/Desktop/Selenium_java/tools//chromedriver");
			driver = new ChromeDriver();
			
	}

	@Test
	public void passURL()
	{
		//Goto Test URL 
	
				driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void waitTime()
	{
	//Wait for 5 sec	
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@Test	
	public void verifyFacebookTitle()
	{
	//Verify the Title
				String atitle=driver.getTitle();
				System.out.println(atitle);
				
				if(atitle.equals("AnjFacebook - Log In or Sign Up"))				
	{
			System.out.println("Facebook Launches-Test Passed");
				}
				else
				{
			System.out.println("Not Launches-Test Failed");

				}
	}
	
	@Test
	public void eardown()
	{
	//Close Browser
	driver.close();
			}

			
		
	}
	
	


