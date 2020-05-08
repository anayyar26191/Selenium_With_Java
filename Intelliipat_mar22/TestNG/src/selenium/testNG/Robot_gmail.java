package selenium.testNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_gmail {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/Users/macbookpro/Desktop/Selenium/tools//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		 Thread.sleep(1000);
		 
		//Fill Username
		 driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("selenium.an@gmail.com");
		 Thread.sleep(1000);
		 
		 //clear the text from text box
		 driver.findElement(By.xpath("//input[@name='identifier']")).clear();
		 
		 //Fill Username again
		 driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("selenium.an.26@gmail.com");
		 Thread.sleep(5000);
		 
		 //Click on Next button
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(6000);

		//Fill PW TextBox
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Best-1234");
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		Thread.sleep(11000);
		//div[text()='Compose']
		//click on compose
		
		driver.findElement(By.xpath("//div[text()='Compose']")).click();
		Thread.sleep(12000);
		 
		//fill to address
		driver.findElement(By.name("to")).sendKeys("selenium.an.26@gmail.com");
		
		//driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("selenium.an.26@gmail.com");
		Thread.sleep(7000);
		
		//fill the Subject
		driver.findElement(By.xpath("//input[@aria-label='Subject']")).sendKeys("wishes");
		//driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("wishes");
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Hi,",Keys.ENTER,"Please place your Order");
		Thread.sleep(7000);
		
		//Add Attachment
	
		driver.findElement(By.xpath("//div[@data-tooltip='Attach files']")).click();
		///Users/macbookpro/Downloads
		Thread.sleep(10000);
		
		
			//click on send button
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		Thread.sleep(10000);
		//Logout
		driver.findElement(By.xpath("//a[contains(@aria-label,'Google Account:')]")).click();
		
		Thread.sleep(10000);
		
		
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		
		Thread.sleep(10000);
		
		
		
		driver.close();
			

		
	}
}