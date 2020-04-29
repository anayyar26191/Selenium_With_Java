package assingment_apr25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification_02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/macbookpro/Desktop/Selenium/tools//chromedriver");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 Thread.sleep(1000);
		 
		 String actTitle=driver.getTitle();
		 System.out.println(actTitle);
		 
		 String eTitle = "Facebook -";
		 if(eTitle.contains("Facebook -")) {
			 System.out.println("LAUNCHED Facebook PAGE-TEST PASSED");
		 }
		 else {
			 System.out.println("LAUNCHED SOMEOTHER PAGE-TEST FAILED");
			 
		 }
		 
		
		 
		// driver.findElement(By.xpath("")).click();
		// Thread.sleep(1000);
		 
		 //driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("anayyar649@gmail.com");
		 //Thread.sleep(1000);
		 driver.close();
		 

	}

}
