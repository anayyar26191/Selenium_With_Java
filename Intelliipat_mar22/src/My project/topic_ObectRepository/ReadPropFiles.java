package topic_ObectRepository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ReadPropFiles {

	static WebDriver driver;
	
	@Test
	public void dummyGmail() throws IOException, InterruptedException
	{
		//import from
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:/Users/Ramez/Desktop/java/selenium/demo/src/topic_ObectRepository/config.properties");
		
		prop.load(ip);
		System.out.println("name");
		//Name
		String Name =prop.getProperty("name");
	System.out.println(Name);
	//Age
	String AGE= prop.getProperty("age");
	System.out.println(AGE);
	//URL
	String URL=prop.getProperty("url");
	System.out.println(URL);
	//Browser
	String BrowserName=prop.getProperty("browser");
	System.out.println(BrowserName);
	
	if(BrowserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/Ramez/Desktop/java/tools\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Google Chrome Browser");
	}
	else if(BrowserName.equals("firefox"))
	{
		System.setProperty("webdriver.geckodriver.driver","C:/Users/Ramez/Desktop/java/tools\\geckodriverr.exe");
		driver = new FirefoxDriver();
		System.out.println("FireFox Browser");
	}

	else if(BrowserName.equals("IE"))
	{
		System.setProperty("webdriver.ie.driver","C:/Users/Ramez/Desktop/java/tools\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		System.out.println("IE Browser");
	}
	driver.get(URL);
	Thread.sleep(7000);
	
driver.findElement(By.xpath(prop.getProperty("UserNameFeild"))).sendKeys(prop.getProperty("username"));
Thread.sleep(7000);
driver.findElement(By.xpath(prop.getProperty(" MovetoNext"))).click();
Thread.sleep(7000);
driver.findElement(By.xpath(prop.getProperty("PwdField"))).sendKeys(prop.getProperty("password"));
Thread.sleep(7000);
driver.findElement(By.xpath(prop.getProperty(" MovetoNext"))).click();
Thread.sleep(7000);
driver.close();
	}
}
