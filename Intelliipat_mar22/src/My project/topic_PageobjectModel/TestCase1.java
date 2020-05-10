package topic_PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
//Launch Browser
		System.setProperty("webdriver.chrome.driver","C:/Users/Ramez/Desktop/java/tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		 Thread.sleep(5000);
		 LoginPage login= new LoginPage(driver);


		 //Fill UserName Text
		 login.type_UserName("selenium.an.26@gmail.com");
		 // Click on Next Button
		 login.click_Next();
		 Thread.sleep(5000);
		 //Fill Password TextBox
		 login.type_password("Best-1234");
		 Thread.sleep(4000);
		 login.click_Next();


		 
		 
		 String acturl = driver.getCurrentUrl();
			System.out.println(acturl);
				
				//Expected URL https://mail.google.com/mail/u #inbox
				
				if(acturl.contains("https://mail.google.com/mail/u"))
				{	
					
					System.out.println("Gmail Login Success-Test Passed");
				}
				else 
				{
					System.out.println("Gmail Login Failed-Test Failed ");
				}
				
				login.type_compose();
				Thread.sleep(5000);
				
				driver.close();
				 
	}

}
