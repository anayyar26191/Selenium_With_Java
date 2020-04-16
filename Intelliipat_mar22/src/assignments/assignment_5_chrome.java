package assignments;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_5_chrome {

	public static void main(String[] args) throws InterruptedException {
		//•	Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver",  "C:/Users/Ramez/Desktop/java/tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//•	Navigate to Test URL  https://netbanking.hdfcbank.com/netbanking/
			driver.get("https://netbanking.hdfcbank.com/netbanking/");
		//•	Maximize the Browser Window
		driver.manage().window().maximize();
		//•	Get the Title of Page
				String x =  driver.getTitle();
				System.out.println(x);	
				Thread.sleep(4000);
		
		driver.get("https://bhanusaii.wordpress.com/");
		
		//•	Get the Title of Page
		String y =  driver.getTitle();
		System.out.println(y);	
		Thread.sleep(4000);
		
		//++•	Click on SELENIUM QUIZ-1 Link Text 
		driver.findElement(By.xpath("//a[text()='SELENIUM QUIZ-1']")).click();
		Thread.sleep(3000);
		ArrayList<String> wins = new ArrayList<String>(driver.getWindowHandles());
		
		//•	Switch from 0th Window to 1st Window
		driver.switchTo().window(wins.get(1));
		
		//•	After Switching Get the Title of Page 
		String a =  driver.getTitle();
		System.out.println(a);	
		Thread.sleep(4000);
		//•	Close 2nd Window
		driver.close();
		
		driver.switchTo().window(wins.get(0));
		//•	After Switching Get the Title of Page 
		String c =  driver.getTitle();
		System.out.println(c);	
		Thread.sleep(4000);
		driver.close();
		

	}

}
