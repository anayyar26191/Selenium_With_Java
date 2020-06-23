package toipc_ITest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Testresutcontext {
	WebDriver driver;
	@BeforeTest(alwaysRun=true)
	public void setup(ITestContext testcontext)
	{
		
	System.out.println("My setup Methods");
	
	String browser=testcontext.getCurrentXmlTest().getParameter("browser");
	if(browser.equalsIgnoreCase("Chrome"))
	{
		//Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver","D:\\March22nd_2020\\chromedriver.exe");
		 driver=new ChromeDriver();
		 System.out.println("Launched Chrome Browser");
		 driver.close();
		
	}
	else if(browser.equalsIgnoreCase("firefox") )
	{
		
		//Launch Chrome Browser
				System.setProperty("webdriver.gecko.driver","D:\\March22nd_2020\\\\geckodriver.exe");
				 driver=new FirefoxDriver();
				 System.out.println("Launched Firefox Browser");
				 driver.close();
	}
	

}
	
	@Test(groups="sanity")
	public void testLogin()
	{
		
	}
	
	@Test(groups="sanity")
	public void testCreateAdmin()
	{
		
	}
	
	@Test(groups="regression")
	public void testEditAdmin()
	{
		
	}
	
	
	@Test(groups="sanity")
	public void testCreateUser()
	{
		
	}
	@Test
	public void testDeleteUser()
	{
		Assert.assertEquals(true, false);
	}
	
	
	
	
	@AfterMethod
	public void getTestResult(ITestResult testresult)
	{
		System.out.println("TestCaseName:" +testresult.getName());  //gets the test name displayed in console
		System.out.println("TestCaseResult:" +testresult.getStatus());//Result Integer  Result 1  True/Passed   2 Flase/Failed
	}
	
	
	
	
	
	
	
	
	
}
