package assingment_apr25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification_google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/macbookpro/Desktop/Selenium/tools//chromedriver");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		 Thread.sleep(1000);
		 
		 boolean LinkExistence = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isDisplayed();
		 System.out.println(LinkExistence);
		 	
		 if(LinkExistence==true) {
			 System.out.println("LAUNCHED Google PAGE-TEST PASSED");
		 }
		 else {
			 System.out.println("LAUNCHED SOMEOTHER PAGE-TEST FAILED");
			 
		 }
		 
		 driver.close();
		 

	}

}
