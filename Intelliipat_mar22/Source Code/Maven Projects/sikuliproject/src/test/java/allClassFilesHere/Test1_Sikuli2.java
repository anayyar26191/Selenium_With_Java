package allClassFilesHere;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Test1_Sikuli2 {

	
	@Test
	public void handlefileUpload() throws InterruptedException, FindFailed
	{
		/*// Launch Firefox Browser
				 System.setProperty("webdriver.chrome.driver","D:\\March22nd_2020\\chromedriver.exe");
				 WebDriver driver=new ChromeDriver();
				 
				 //Goto Test URL 
				 driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_fileupload_get");
				 //WaitTime
		         Thread.sleep(5000);*/
		         
		         //Implementing Sikuli
		         Screen s=new Screen();
		    	 //WaitTime
		         Thread.sleep(5000);
		         
		         //To perform Click operation click() method
		        s.doubleClick("D:\\March22nd_2020\\sikuliproject\\src\\sikuli_locators\\ImageFile.PNG");
		         
		         //WaitTime
		         Thread.sleep(5000);
		         
		         /*s.click("D:\\March22nd_2020\\sikuliproject\\src\\sikuli_locators\\close.PNG");
		         
		         //WaitTime
		         Thread.sleep(5000);
		         s.click("D:\\March22nd_2020\\sikuliproject\\src\\sikuli_locators\\click_No.PNG");
		         //WaitTime
		     */
		         
		         //To close Application 
		         s.type(Key.F4, Key.ALT);
		         
		         
		       /*  Pattern fileInput=new Pattern("D:\\March22nd_2020\\sikuliproject\\src\\sikuli_locators\\send_Path of Image.PNG");
		         Pattern openButton=new Pattern("D:\\March22nd_2020\\sikuliproject\\src\\sikuli_locators\\click_Open.PNG");
		         //WaitTime
		         Thread.sleep(5000);
		     //to send data into textbox use type()
		         s.type(fileInput,"D:\\March22nd_2020\\sikuliproject\\src\\sikuli_locators\\File.PNG");
		         //WaitTime
		         Thread.sleep(5000);
		         s.click(openButton);
		         Thread.sleep(5000);*/
		         
	/*	         driver.close();*/
		         
		         
		         
	}
	
	
	
}
