package assingment_apr25;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_java_download {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "/Users/macbookpro/Desktop/Selenium/tools//geckodriver");
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.selenium.dev/downloads/");
		 Thread.sleep(5000);
		 
		// click on Download		
		 
		 driver.findElement(By.xpath("//div[@class='container basic dark-background']/table[1]/tbody[1]/tr[2]/td[6]/a[1]")).click();
		 Thread.sleep(3000);
		//Handling File Download using JavaRobot
		 
		 Robot r = new Robot();
		 
		 
		
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);	
		 
		 
		 r.keyPress(KeyEvent.VK_META);
		 r.keyPress(KeyEvent.VK_TAB);
		 
		 r.keyRelease(KeyEvent.VK_META);
		 r.keyRelease(KeyEvent.VK_TAB);
		 Thread.sleep(5000);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 
		Thread.sleep(5000);
		
		 driver.close();
		 
		 
		 }		 				 

	}

