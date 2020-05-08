package test_NG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_MultipleMethods_Dependencies {
public WebDriver driver;
	
	@Test
	public void launchBrowser()
{
		//Launch Chrome Browser
				System.setProperty("webdriver.chrome.driver", "/Users/nayyar/Desktop/Selenium_java/tools//chromedriver");
			driver = new ChromeDriver();
			
	}

	@Test(dependsOnMethods="launchBrowser")
	public void passURL()
	{
		//Goto Test URL 
	
				driver.get("https://www.facebook.com/");
	}
	
	@Test(dependsOnMethods="passURL")
	public void waitTime()
	{
	//Wait for 5 sec	
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@Test(dependsOnMethods="waitTime")	
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
	
	@Test(dependsOnMethods="verifyFacebookTitle")
	public void teardown()
	{
	//Close Browser
	driver.close();
			}

			
		
	}
	
	


