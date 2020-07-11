package allClassFile;

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
		System.setProperty("webdriver.chrome.driver", "C:/Users/Ramez/Desktop/java/tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(5000);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_fileupload_get");
		Thread.sleep(5000);
		
		//Implementing Sikuli-image capturing tool
		Screen s =new Screen();
		Thread.sleep(5000);
		
		//To perform Click operation click()method
		
		s.click("C:C:\\Users\\Ramez\\Desktop\\java\\Sikuili_lat\\src\\LocatorsSikuil\\click_choosefile.PNG");
		Thread.sleep(5000);
		Pattern fileInput = new Pattern("C:\\Users\\Ramez\\Desktop\\java\\Sikuili_lat\\src\\LocatorsSikuil\\send_path_image.PNG");
		Pattern openButton = new Pattern("C:\\Users\\Ramez\\Desktop\\java\\Sikuili_lat\\src\\LocatorsSikuil\\click_open.PNG");
		Thread.sleep(5000);
		//to send data into text box use type()
		
		s.type(fileInput, "C:\\Users\\Ramez\\Desktop\\java\\Sikuili_lat\\src\\LocatorsSikuil\\filesend.PNG");
		Thread.sleep(5000);
		s.click(openButton);
		Thread.sleep(5000);
		
		driver.close();
	}
	
}