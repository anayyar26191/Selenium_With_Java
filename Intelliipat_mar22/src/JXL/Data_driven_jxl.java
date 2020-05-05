
package package1;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Data_driven_jxl {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException, RowsExceededException, WriteException {
		//open the Excel file
		
	File f = new File("C:\\Users\\Ramez\\Desktop\\Data_driven_2.xls");
	
	//read operation
	Workbook readwb = Workbook.getWorkbook(f);
	Sheet readsht = readwb.getSheet(0);//sheet1
	
	System.out.println(readsht);
	int numberofr = readsht.getRows();
	
	System.out.println(numberofr);
	
	//open Excel write on Sheet
	WritableWorkbook wwb= Workbook.createWorkbook(f,readwb);
	
	WritableSheet wsh = wwb.getSheet(0);//0 means Sheet1
	for(int i=1;i<numberofr;i++) {
		
		String x= readsht.getCell(0,1).getContents();//Phone No
		String y=readsht.getCell(1,i).getContents();//Password
		
//1.	Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:/Users/Ramez/Desktop/java/tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		//2.	Navigate to Test URL  https://www.facebook.com/
				driver.get("https://www.facebook.com/");
				
		//3.	Maximize the Browser Window
				driver.manage().window().maximize();
		//4.	Get Current URL of Page
				String x1 = driver.getCurrentUrl();
				System.out.println(x1);
				
				Thread.sleep(5000);
		//5. Get the xpath for id
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys(x);//For Phone/email No.
		//6. get the xpath for login
				driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(y);//For password
		//7. get the xpath for login	
			driver.findElement(By.xpath("//input[@aria-label='Log In']")).click();
			//a[@class='uiIconText']
			Thread.sleep(5000);
			System.out.println("Login Success");
			//verifications Points
			String ExpURL = ("https://www.facebook.com/");
			String ActURL = driver.getCurrentUrl();

			System.out.println(ActURL);
			if(ExpURL.equals(ActURL))
			{

			System.out.println("Login Success-Test Passed");
			Label g = new Label(2,i,"Test Passed");   // (import label class from JXL write)
			wsh.addCell(g);
			
			}
			else
			{
			System.out.println("Login Failed-Test Failed");  //(import label class from JXL write)
			Label g = new Label(2,i,"Test Failed");  //why Label class used		
			wsh.addCell(g);
			
			driver.close();
			}
			wwb.write(); //To save Excel
			wwb.close();
			readwb.close();
			
	}

		}
	}

