package allClassfilehere;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Test1_Sikuli1 {
	
	@Test
	public void handlefileUpload() throws InterruptedException, FindFailed
	{
		System.setProperty("webdriver.chrome.driver", "/Users/nayyar/Desktop/Selenium_java/tools//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(5000);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_fileupload_get");
		Thread.sleep(5000);
		
		//Implementing Sikuli-image capturing tool
		Screen s =new Screen();
		Thread.sleep(5000);
		
		//To perform Click operation click()method
		
		s.click("\\Users\\nayyar\\Desktop\\Selenium_java\\workspace1\\sikuiliproject\\src\\sikuili_locators\\Click_ChooseFile.png");
		
		Pattern fileInput = new Pattern("\\Users\\nayyar\\Desktop\\Selenium_java\\workspace1\\sikuiliproject\\src\\sikuili_locators\\send_pathoffile.png");
		Pattern openButton = new Pattern("\\Users\\nayyar\\Desktop\\Selenium_java\\workspace1\\sikuiliproject\\src\\sikuili_locators\\Click_open.png");
		Thread.sleep(5000);
		//to send data into text box use type()
		
		s.type(fileInput, "\\Users\\nayyar\\Desktop\\Selenium_java\\workspace1\\sikuiliproject\\src\\sikuili_locators\\file_cap.png");
		Thread.sleep(5000);
		s.click(openButton);
		Thread.sleep(5000);
		
		driver.close();
	}
	
}