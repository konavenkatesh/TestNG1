package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManagerV {

	public static WebDriver driver;
		public DriverManagerV()
		{
						
			String url="http:\\butterball.myfocusportal.com";
			System.setProperty("webdriver.chrome.driver", "D:\\VENKAT_BACKUP\\Selenium_July\\LIB\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();	
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		
		public void closeBrowser()
		{
			driver.close();
		}

	

}
