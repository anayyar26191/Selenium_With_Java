
package package1;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Synchronization_wait {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException, RowsExceededException, WriteException {
		
//1.	Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:/Users/Ramez/Desktop/java/tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
		Thread.sleep(7000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[(text()='14')]")).click();
		Thread.sleep(5000);
		
		//java wait
		//Thread.sleep(10000);
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(18, TimeUnit.SECONDS);
		//Explicit wait
	//	WebDriverWait  w = new WebDriverWait(driver,100);
	//	w.until(ExpectedConditions.invisibilityOfElementLocated(By.className("raDiv")));
		//Fluent
		Wait<WebDriver> w = new FluentWait <WebDriver>(driver).withTimeout(100,TimeUnit.SECONDS).pollingEvery(10,TimeUnit.SECONDS);
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.className("raDiv")));
		
		
		
		driver.close();

	

	


	}
}	