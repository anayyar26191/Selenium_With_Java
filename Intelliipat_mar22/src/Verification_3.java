package webDriver1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification_3 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/Users/nayyar/Desktop/Selenium_java/tools//chromedriver");
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
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test-1234");
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
		
		//Put the DATA into clipboard
		//image.jpg 
		//Users/macbookpro/Desktop/Selenium
		//import the Robot class from Awt package
		
		
		StringSelection s= new StringSelection("Desktop/tulip.jpg");
		//Users/macbookpro/Desktop/Selenium
		//System.out.println(s);
		
		Thread.sleep(10000);
		//Send the Data from Clipboard to screen
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		
		
		//Paste operation cmdV and Press Enter and release
		
		Robot r = new Robot();
		//CMD +Tab needed
		r.keyPress(KeyEvent.VK_META);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_META);
		r.keyRelease(KeyEvent.VK_TAB);
		r.delay(500);
		
		//open Go to window
		r.keyPress(KeyEvent.VK_META);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_G);
		r.keyRelease(KeyEvent.VK_META);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_G);
		
		r.keyPress(KeyEvent.VK_META);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_META);
		r.keyRelease(KeyEvent.VK_V);
		
		
		//Press Enter Key to close the window and upload the window
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.delay(500);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
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