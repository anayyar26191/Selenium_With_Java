package webDriver1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_2 {

	public static void main(String[] args) throws InterruptedException {
	
		//14. Launch Firefox Browser
		 System.setProperty("webdriver.gecko.driver", "/Users/nayyar/Desktop/Selenium_java/tools//geckodriver");
		 WebDriver driver = new FirefoxDriver();
		 
		//15. Navigate to Test URL https://bhanusaii.wordpress.com/
		driver.get("https://bhanusaii.wordpress.com/");
		//16. Maximize the Browser Window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//17. Get the Title of Page
		String x = driver.getTitle();
		System.out.println(x);
		
		//18. Click on SELENIUM QUIZ-1 Link Text
		driver.findElement(By.xpath("//a[text()='SELENIUM QUIZ-1']")).click();
		Thread.sleep(5000);	
		//Handle Window
		ArrayList<String> wins=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(wins);
		Thread.sleep(5000);	
		
		//19. switch from 0th window to 1st window
		driver.switchTo().window(wins.get(1)); //2nd Window in Browser
		
		Thread.sleep(5000);
		//20. After Switching Get the Title of Page
		String t = driver.getTitle();
		System.out.println(t);
		//21. Switch from 1 st Tab to 2 nd Tab
		driver.switchTo().window(wins.get(0)); //2nd Window in Browser
		
		Thread.sleep(5000);	
		//22. After Switching Get the Title of Page
		String r = driver.getTitle();
		System.out.println(r);
		//23. Close all windows of Browser
		driver.quit();
	}

}
