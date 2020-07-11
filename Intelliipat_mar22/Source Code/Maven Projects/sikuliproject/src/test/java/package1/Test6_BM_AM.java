package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test6_BM_AM {
	
	public WebDriver driver;
//Launch Chrome Browser	
	@BeforeMethod
	public void launchBrowser()
	{

		System.setProperty("webdriver.chrome.driver","D:\\March22nd_2020\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
	
	
//TestScenario1	
	
	@Test(priority=1)
public void verfiyGooglePage()
{
//Goto Test URL https://www.facebook.com
	driver.get("https://www.google.com");
//Wait for 5  sec
	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	 

//Verify Title of Page 
			
		String expected="Google";	
	String atitle=driver.getTitle();
	System.out.println(atitle);


	Assert.assertEquals(atitle, expected);
}

	
	
//TestScenario2	
@Test(priority=2)
public void verfiyIntellipaatPage()
{
//Goto Test URL https://www.facebook.com
	driver.get("https://intellipaat.com/");
//Wait for 5  sec
	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	 

//Verify Title of Page 
			
		String expected="Online Professional Training Courses and Certification - Intellipaat";	
	String atitle=driver.getTitle();
	System.out.println(atitle);


	Assert.assertEquals(atitle, expected);
}

	
	
	
	
//TestScenario3	
	
@Test(priority=3)
	public void verfiyFacebookPage()
	{
//	Goto Test URL https://www.facebook.com
		driver.get("https://www.facebook.com");
//	Wait for 5  sec
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 

//Verify Title of Page 
				
			String expected="Facebook – log in or sign up";	
		String atitle=driver.getTitle();
		System.out.println(atitle);


		Assert.assertEquals(atitle, expected);
	}
	
	
	
	
	
//Close Browser	 
@AfterMethod
	public void teardown()
	 {
     driver.close();		
	}
	
	
	
}
