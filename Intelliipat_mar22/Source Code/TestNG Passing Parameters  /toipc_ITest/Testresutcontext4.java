package toipc_ITest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Testresutcontext4 {
	WebDriver driver;
	@Test(priority=1)
	public void setup(ITestContext testcontext) throws InterruptedException
	{
		
	System.out.println("My setup Methods");
	
	String browser=testcontext.getCurrentXmlTest().getParameter("browser");
	if(browser.equalsIgnoreCase("Chrome"))
	{
		//Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver","D:\\March22nd_2020\\chromedriver.exe");
		 driver=new ChromeDriver();
		 System.out.println("Launched Chrome Browser");
		 driver.get("https://www.way2sms.com/");
		
	}
	else if(browser.equalsIgnoreCase("firefox") )
	{
		
		//Launch Chrome Browser
				System.setProperty("webdriver.gecko.driver","D:\\March22nd_2020\\geckodriver.exe");
				 driver=new FirefoxDriver();
				 System.out.println("Launched Firefox Browser");
				 driver.get("https://www.way2sms.com/");
	}
	

}

	
	
	@Test(priority=2)
	
	public void getTestResult(ITestContext testcontext) throws InterruptedException
	{ 
		String uname=testcontext.getCurrentXmlTest().getParameter("username");
		String pwd=testcontext.getCurrentXmlTest().getParameter("password");
		
		Thread.sleep(5000);
		driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id='mobileNo']")).sendKeys(uname);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='mainErr']/following::*[5]")).click();
	Thread.sleep(5000);
	
 driver.close();
	}
	

	
	
	
	
	
	
	
	
}
