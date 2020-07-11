package allClassFilesHere;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;
import org.testng.annotations.Test;

public class Test1_Sikuli3 {

	
	@Test
	public void handlefileUpload() throws InterruptedException, FindFailed, IOException
	{
		// Launch Firefox Browser
				 System.setProperty("webdriver.chrome.driver","D:\\March22nd_2020\\chromedriver.exe");
				 WebDriver driver=new ChromeDriver();
				 
				 //Goto Test URL 
				 driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_fileupload_get");
				 //WaitTime
		         Thread.sleep(5000);
		         
		         //Implementing Sikuli
		         Screen s=new Screen();
		    	 //WaitTime
		         Thread.sleep(5000);
		         //To take Screenshot of FullScreen
		         ScreenImage si=s.capture();
		         BufferedImage bi=si.getImage();
		         File f1=new File("D:\\March22nd_2020\\sikuliproject\\src\\sikuli_locators\\FullScreenshot.PNG");
		         ImageIO.write(bi, "PNG", f1);
		         //WaitTime
		         Thread.sleep(5000);
		         
		       
		         
	        driver.close();
		         
		         
		         
	}
	
	
	
}
