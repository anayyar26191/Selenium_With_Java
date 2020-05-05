package assingment_apr25;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_java_download {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "C:/Users/Ramez/Desktop/java/tools\\geckodriver.exe");;
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.selenium.dev/downloads/");
		 Thread.sleep(5000);
		 driver.manage().window().maximize();
		// click on Download		
		 
		 driver.findElement(By.xpath("//div[@class='container basic dark-background']/table[1]/tbody[1]/tr[2]/td[6]/a[1]")).click();
		 Thread.sleep(3000);
		//Handling File Download using JavaRobot
		 
		 Robot robot = new Robot();
		 
		 
		//Cmd+Tab
		 
<<<<<<< HEAD
		// r.keyPress(KeyEvent.VK_META);
		 //r.keyPress(KeyEvent.VK_TAB);
		 
		 //r.keyRelease(KeyEvent.VK_META);
		// r.keyRelease(KeyEvent.VK_TAB);
		 Thread.sleep(5000);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
=======
			//This launches java applet, so we are using cmd+tab to shift the focus
		    robot.keyPress(KeyEvent.VK_META);
		    robot.keyPress(KeyEvent.VK_TAB);
		    robot.keyRelease(KeyEvent.VK_META);
		    robot.keyRelease(KeyEvent.VK_TAB);
		    Thread.sleep(7000);

		//Open Goto window
		    robot.keyPress(KeyEvent.VK_META);
		    robot.keyPress(KeyEvent.VK_TAB);		   
		    robot.keyRelease(KeyEvent.VK_META);
		    robot.keyRelease(KeyEvent.VK_TAB);
		 
		    Thread.sleep(7000);
		    
		    
		//NAVIGATE to save radio button
		    robot.keyPress(KeyEvent.VK_DOWN);   
		    robot.keyRelease(KeyEvent.VK_DOWN);	    
		    Thread.sleep(7000);
		//CLICK OK BUTTON
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);
		//NAVIGATE TO COMMAND+J FOR 'Show all Downloads
		    robot.keyPress(KeyEvent.VK_META);
		    robot.keyPress(KeyEvent.VK_J);		   
		    robot.keyRelease(KeyEvent.VK_META);
		    robot.keyRelease(KeyEvent.VK_J);
		  
		    
		//Press Enter key to close the Goto window and Upload window
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);
		
		
>>>>>>> 4cf244ee98b1489c62a3bb433e105eab1ba67966
		 
		Thread.sleep(5000);
		
		 driver.close();
		 
		 
		 }		 				 

	}

