package selenium.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_singleonly {
	
	@Test
	public void verifyFacebookTitle(){
		//Launch Chrome Browser
				System.setProperty("webdriver.chrome.driver", "/Users/nayyar/Desktop/Selenium_java/tools//chromedriver");
				WebDriver driver = new ChromeDriver();
				
		//Goto Test URL 
				driver.get("https://www.facebook.com/");
		//Wait for 5 sec	
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
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

			driver.close();
			}

			
		
	}
	
	


