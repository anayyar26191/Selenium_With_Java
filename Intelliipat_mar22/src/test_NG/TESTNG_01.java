package test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TESTNG_01 {

	public static void main(String[] args) throws InterruptedException {
//Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/Users/nayyar/Desktop/Selenium_java/tools//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
//Goto Test URL 
		driver.get("https://www.facebook.com/");
//Wait for 5 sec	
		Thread.sleep(5000);
//Verify the Title
		String atitle=driver.getTitle();
		System.out.println(atitle);
		if(atitle.equals("Anj Facebook - Log In or Sign Up"))
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
