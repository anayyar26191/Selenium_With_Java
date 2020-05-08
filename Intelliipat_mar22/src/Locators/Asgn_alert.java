package assingment_apr25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asgn_alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/macbookpro/Desktop/Selenium/tools//chromedriver");
		WebDriver driver = new ChromeDriver();
		 driver.get("http://services.ecourts.gov.in/");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//div[@id='leftPaneMenuCS']/child::p")).click();
		 Thread.sleep(2000);
		 
		 String txt = driver.switchTo().alert().getText();
		 System.out.println(txt);
		 Thread.sleep(2000);
		 
		 driver.switchTo().alert().accept();
		 driver.switchTo().alert().getText();
		 Thread.sleep(2000);
		 
		 driver.close();
		 
		 //git@github.com:anayyar26191/Selenium_With_Java.git
		 

	}

}
