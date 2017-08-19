package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManagerV {

	public static WebDriver driver;
		public DriverManagerV()
		{
						
			String url="http://butterball.myfocusportal.com";
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Lib\\chromedriver.exe");
			driver = new ChromeDriver();	
			driver.get(url);
			
		}
		
		public void closeBrowser()
		{
			driver.close();
		}

	

}
