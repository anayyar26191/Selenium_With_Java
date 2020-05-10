package topic_TestNG_dataprovider;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;

public class DatadrivenWay2sms {
	public WebDriver driver;
	@Test(dataProvider="testData")
	public void loginways2sms(String uname,String passwd) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/Ramez/Desktop/java/tools\\chromedriver.exe");
		driver=new ChromeDriver();
		//Pass the test URL
		driver.get("https://www.sms4india.com/send-sms");
		driver.manage().window().maximize();
		//Sleep 5sec
		Thread.sleep(5000);
		//fill MOBILENUMBER text box
	
		driver.findElement(By.xpath("(//input[@name='mobileNo'])[1]")).sendKeys(uname);
		//Sleep 5sec
		Thread.sleep(5000);
		//Fill PASSWORD text box
		driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys(passwd);
		//Sleep 5sec
		Thread.sleep(5000);
		//Click on LOGIN button
		driver.findElement(By.xpath("(//button)[5]")).click();
		Thread.sleep(5000);
		//Verification Point
		String ExpURL="https://www.sms4india.com/send-sms";
		String ActURL=driver.getCurrentUrl();
		System.out.println(ActURL);
		/*if(ExpURL.equals(ActURL))
		{

		System.out.println("Login Success-Test Passed");
		Label g = new Label(2,i,"Test Passed");   // (import label class from JXL write)
		wsh.addCell(g);
		
		}
		else
		{
		System.out.println("Login Failed-Test Failed");  //(import label class from JXL write)
		Label g = new Label(2,i,"Test Failed");  //why Label class used		
		wsh.addCell(g)
		}
		*/
		Assert.assertEquals(ActURL,ExpURL);
	
	}
	
	@AfterMethod
	public void getTestResult(ITestResult testResult)
	{
		System.out.println("TestCase Name :"+testResult.getName());
		System.out.println("TestCase Result:"+testResult.getStatus());  //Results Integer value 1 --Test passed, 2---Test Failed
		int status=testResult.getStatus();
	if(status==1){
		
		driver.close();
	}
	else
	{
		
		File outfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(outfile, new File("C:\\Users\\Ramez\\Desktop\\java\\selenium\\demo\\src\\topic_TestNG_dataprovider\\DatadrivenWay2sms.java"+testResult.getParameters()[0]+"Defect.jpeg"));
		} catch (IOException e) {
			

			e.printStackTrace();
		}
		driver.close();
	}
	}
	

	@DataProvider(name="testData")
	public Object readExcel() throws BiffException, IOException
	{
	//open Excel for read and write is available in same package
		File f= new File("C:\\Users\\Ramez\\Desktop\\java\\selenium\\demo\\src\\topic_TestNG_dataprovider\\Data_driven_2.xls");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet(0);
		int noofRows=s.getRows();
		int noofColu =s.getColumns();
		String inputData[][] =new String[noofRows-1][noofColu];
		int count = 0;
		for(int i=1;i<noofRows;i++)
		{
			for(int j=0;j<noofColu;j++)
			{
				Cell c= s.getCell(j, i);
				System.out.println(s.getCell(j, i));
				
				inputData[count][j]=c.getContents();
				System.out.println(c.getContents());
			}
			count++;
		}
		return inputData;
		
		
}
	
}