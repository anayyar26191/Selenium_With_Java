package test_NG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_MultipleMethods2Priority {
public WebDriver driver;
	
	@Test(priority=1)
	public void launch()
{
		//Launch Chrome Browser
				System.setProperty("webdriver.chrome.driver", "/Users/nayyar/Desktop/Selenium_java/tools//chromedriver");
			driver = new ChromeDriver();
			
	}

	@Test(priority=2)
	public void passURL()
	{
		//Goto Test URL 
	
				driver.get("https://www.facebook.com/");
	}
	
	@Test(priority=3)
	public void waitTime()
	{
	//Wait for 5 sec	
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@Test(priority=4)	
	public void verifyFacebookTitle()
	{
	//Verify the Title
				String atitle=driver.getTitle();
				System.out.println(atitle);
				String ExpTitle="Anj-Facebook - Log In or Sign Up";
		/*		
				if(atitle.equals("Anj-Facebook - Log In or Sign Up"))				
	{
			System.out.println("Facebook Launches-Test Passed");
				}
				else
				{
			System.out.println("Not Launches-Test Failed");

				} */
				
	Assert.assertEquals(atitle, ExpTitle);
	}
	
	@Test(priority=5)
	public void teardown()
	{
	//Close Browser
	driver.close();
			}

			
		
	}
	
	


