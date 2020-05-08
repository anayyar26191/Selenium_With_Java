package assingment_apr25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification_google_send_message {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/macbookpro/Desktop/Selenium/tools//chromedriver");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.gmail.com");
		 Thread.sleep(1000);
		 
		 //Fill Username
		 WebElement e=driver.findElement(By.xpath("//input[@name='identifier']"));
		e.sendKeys("an@gmail.com");
		Thread.sleep(1000);
		 
		 //clear the text from text box
		e.clear();
		 
		 //Fill Username again
		e.sendKeys("selenium.an.26gmail.com");
		Thread.sleep(5000);
		
		//get Text not working
		String x1 =driver.findElement(By.xpath("//button[contains(text(),'Forgot')]/preceding::*[3]")).getText();
		System.out.println(x1);
		Thread.sleep(5000);
		
		
		//getAttribute of value
		String x =e.getAttribute("value");
		System.out.println(x);
		Thread.sleep(5000);
		
		
		//Text
				
		 String y =e.getAttribute("name");
		 System.out.println(y);
		 Thread.sleep(5000);
		 
		/*//get Text
		 String x2 =driver.findElement(By.xpath("//input[@name='identifier']/preceding::*[2]")).getText();
		 System.out.println(x2);
		 Thread.sleep(5000);*/
		 
		//getCSS
		 System.out.println("color="+e.getCssValue("color"));
		 System.out.println("font="+e.getCssValue("font"));
		
						 
		driver.close();
		
	}

}
