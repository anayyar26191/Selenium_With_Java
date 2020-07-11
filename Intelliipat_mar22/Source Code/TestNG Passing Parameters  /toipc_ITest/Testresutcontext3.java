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


public class Testresutcontext3 {
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
		 driver.navigate().to("https://www.way2sms.com/");
		
	}
	else if(browser.equalsIgnoreCase("firefox") )
	{
		
		//Launch Chrome Browser
				System.setProperty("webdriver.gecko.driver","D:\\March22nd_2020\\geckodriver.exe");
				 driver=new FirefoxDriver();
				 System.out.println("Launched Firefox Browser");
				 driver.navigate().to("https://www.way2sms.com/");
	}
	

}

	
	@Parameters({"username","password"})
	@Test(priority=2)
	
	public void getTestResult(String username,String password) throws InterruptedException
	{ 

		Thread.sleep(5000);
		driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id='mobileNo']")).sendKeys(username);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='mainErr']/following::*[5]")).click();
	Thread.sleep(5000);
	
 driver.close();
	}
	

	
	
	
	
	
	
	
	
}
