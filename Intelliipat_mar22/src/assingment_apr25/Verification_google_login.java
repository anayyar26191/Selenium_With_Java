package assingment_apr25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification_google_login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/macbookpro/Desktop/Selenium/tools//chromedriver");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.gmail.com");
		 Thread.sleep(1000);
		 
		 //Fill Username
		 driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("selenium@gmail.com");
		 Thread.sleep(1000);
		 
		 //clear the text from text box
		 driver.findElement(By.xpath("//input[@name='identifier']")).clear();
		 
		 //Fill Username aggain
		 driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("selenium@gmail.com");
		 Thread.sleep(5000);
		 
		 //Click on Next button
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(6000);

		//Fill PW TextBox
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password");
		Thread.sleep(7000);
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		Thread.sleep(12000);
		
		/*String acturl = driver.getCurrentUrl();
		System.out.println(acturl);
		
		
		
		if(acturl.contains("https://mail.google.com/mail/u"))
		{	
			
			System.out.println("Gmail Login Success-Test Passed");
		}
		else 
		{
			System.out.println("Gmail Login Failed-Test Failed ");
		}
		*/
		//Get Title---Inbox (1) - selenium.an.26@gmail.com - Gmail
		
		String atitle = driver.getTitle();
		System.out.println(atitle);
		
		if(atitle.contains("Inbox"))
		{	
			
			System.out.println("Gmail Login Success-Test Passed");
		}
		else 
		{
			System.out.println("Gmail Login Failed-Test Failed ");
		}
		
		driver.close();
		
	}

}
