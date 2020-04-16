package webDriver1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Assignment_3 {

	public static void main(String[] args) throws InterruptedException {
		//1.	Launch SafariDriver Browser
		WebDriver driver = new SafariDriver();
		
		//2.	Navigate to Test URL  https://bhanusaii.wordpress.com/
		driver.get("https://bhanusaii.wordpress.com/");
		//3.	Maximize the Browser Window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//4.	Get the Title of Page
		String x = driver.getTitle();
		System.out.println(x);
		
		//5.	Click on SELENIUM QUIZ-1 Link Text 
		driver.findElement(By.xpath("//a[text()='SELENIUM QUIZ-1']")).click();
		Thread.sleep(5000);
		ArrayList<String> wins= new ArrayList<String>(driver.getWindowHandles());
		System.out.println(wins);
		
		//6.	Switch from 0th Tab to 1st Tab
		driver.switchTo().window(wins.get(1));
		Thread.sleep(5000);
		
		//7.	After Switching Get the Title of Page 
		String y = driver.getTitle();
		System.out.println(y);
		//8.	Switch from 1st  Tab to 2nd  Tab
		driver.switchTo().window(wins.get(1));
		//9.	After Switching Get the Title of Page 
		String t = driver.getTitle();
		System.out.println(t);
		//10.	Close 2nd Tab
		driver.close();
		//11.	Close 1st Tab 
		driver.switchTo().window(wins.get(0));
		String s = driver.getTitle();
		System.out.println(s);
		driver.close();

		
	}

}
