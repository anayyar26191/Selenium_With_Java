package training_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assinment1 {

	public static void main(String[] args) throws InterruptedException {
	
//1.	Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:/Users/Ramez/Desktop/java/tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//2.	Navigate to Test URL  https://www.google.com/
		driver.get("https://www.google.com/");
		
//3.	Maximize the Browser Window
		driver.manage().window().maximize();
//4.	Get Current URL of Page
		String x= driver.getCurrentUrl();
		System.out.println(x);
		
		Thread.sleep(5000);

//5.	Navigate to Test URL  https://bhanusaii.wordpress.com/
	driver.get("https://bhanusaii.wordpress.com/");
//6.	Get Current URL of Page
	driver.getCurrentUrl();
	String y= driver.getCurrentUrl();
	System.out.println(y);
	Thread.sleep(5000);


//7.	Navigate back to Base URL  https://www.google.com/
	driver.navigate().back();
	Thread.sleep(5000);
	
	
 
//8.	Get Current URL of Page
	String z= driver.getCurrentUrl();
	System.out.println(z);
	Thread.sleep(5000);
	
	
//9.	Navigate forward Test URL  https://bhanusaii.wordpress.com/
	driver.navigate().forward();
	System.out.println("Naviate to Forward");

//10.	Get Current URL of Page
	driver.getCurrentUrl();
	Thread.sleep(5000);
	
	
//11.	Refresh the Current Page
	driver.navigate().refresh();
//12.	Get Current URL of Page*/
	driver.getCurrentUrl();
	Thread.sleep(5000);

//13.	Close the  Browser
	driver.close();


	}

}
