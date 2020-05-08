package assingment_apr25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_web_Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/macbookpro/Desktop/Selenium/tools//chromedriver");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.jquery-az.com/javascript/demo.php?ex=151.1_1");
		 Thread.sleep(1000);
		  
		 driver.findElement(By.xpath("//button[contains(text(),'Click here to show')]")).click();
		 Thread.sleep(2000);
		 
		 String s =driver.switchTo().alert().getText();
		 System.out.println(s);
		 
		 Thread.sleep(2000);
		 driver.switchTo().alert().accept();
		 Thread.sleep(2000);
		 
		 String r = driver.switchTo().alert().getText();
		 System.out.println(r);
		 
		 
		 Thread.sleep(2000);
		 driver.switchTo().alert().accept();
		 Thread.sleep(2000);
		 
		 driver.close();
		 

	}

}
