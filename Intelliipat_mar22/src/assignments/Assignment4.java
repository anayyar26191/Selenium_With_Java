package assignments;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		//1.	Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:/Users/Ramez/Desktop/java/tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//2.	Navigate to Test URL  https://netbanking.hdfcbank.com/netbanking/
			driver.get("https://netbanking.hdfcbank.com/netbanking/");
		//3.	Maximize the Browser Window
		driver.manage().window().maximize();
		//4.	Get the Title of Page
		String x =driver.getTitle();
		System.out.println(x);
		Thread.sleep(3000);
		
		//5.	Click on know more Link Text Window
		driver.switchTo().frame("login_page");
	
		driver.findElement(By.xpath("(//a[text()='Know More'])[1]")).click();
		Thread.sleep(4000);
		//Handle Window
		ArrayList<String> wins=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(wins);
		Thread.sleep(5000);	
		
		//6.	After Switching Get the Title of Page 
		String t =driver.getCurrentUrl();
		System.out.println(t);
		Thread.sleep(5000);	
		
		
		//7.	Switch from 1st  Window to 2nd  Window
		driver.switchTo().window(wins.get(1));   //IST
		//8.	After Switching Get the Title of Page 
		String r =driver.getTitle();
		System.out.println(r);
		Thread.sleep(5000);	
		
		
		//9. Close all windows of Browser 
		driver.quit();


	}

}
