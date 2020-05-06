
package package1;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Caputre_keys {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException, RowsExceededException, WriteException {
		
//1.	Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:/Users/Ramez/Desktop/java/tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(7000);
		
		WebElement e = driver.findElement(By.xpath("//input[@name='q']"));

	//Send textbox
		Actions a = new Actions(driver);
		a.click(e).sendKeys("Anjana").build().perform();
		Thread.sleep(5000);
	//step 1 down
		a.click(e).sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(5000);
	//step 2 down
		a.click(e).sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(5000);
	// Enter Key
		a.click(e).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);


		driver.close();


	}
}	