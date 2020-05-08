package test_NG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_BefM_AftM {
	public WebDriver driver;
	
	
	@BeforeMethod
	public void launchBrowser()
	{
		//Launch Chrome Browser
				System.setProperty("webdriver.chrome.driver", "/Users/nayyar/Desktop/Selenium_java/tools//chromedriver");
				driver = new ChromeDriver();
				
	}
	//Test Scenario 1
	@Test(priority=1)
	//public void verifyBhanuSaiPage()  dynamic page
	public void verifyGooglePage() 
	{		
		//Goto Test URL 
		driver.get("https:google.com/");
		//Wait for 5 sec	
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//Verify the Title
		String expected="Google";
		String atitle=driver.getTitle();
		System.out.println(atitle);
		Assert.assertEquals(atitle, expected);
		}	
	
	
	//Test Scenario 2
	@Test(priority=2)
	public void verifyIntelliipatPage(){		
		//Goto Test URL 
		driver.get("https://intellipaat.com/");
		//Wait for 5 sec	
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//Verify the Title
		String expected="Online Professional Training Courses and Certification - Intellipaat";
		String atitle=driver.getTitle();
		System.out.println(atitle);
		Assert.assertEquals(atitle, expected);
		}
	//Test Scenario 3
	@Test(priority=3)
	public void verifyFacebookPage(){		
	//Goto Test URL 
				driver.get("https://www.facebook.com/");
	//Wait for 5 sec	
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	//Verify the Title
		String expected="Facebook - Log In or Sign Up";
		String atitle=driver.getTitle();
		System.out.println(atitle);
		Assert.assertEquals(atitle, expected);
		}
	
	//close Browser
		@AfterMethod
		public void teardown(){
			{
			driver.close();
			}

	}
		
	}
	
	


