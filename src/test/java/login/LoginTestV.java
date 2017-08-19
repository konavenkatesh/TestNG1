package login;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTestV {
	
	static WebDriver driver;
	static String url="http://54.164.49.250/Focus/login.htm?path=bbdb";
	@BeforeSuite
	public void instantiateDriver(){
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();	
		
		
	}
	
	@Test
	public void validLogin()
	{
		driver.get(url);
		WebElement login_userName = driver.findElement(By.id("userName"));
		login_userName.sendKeys("admin");
		
		WebElement login_passowrd = driver.findElement(By.id("password"));
		login_passowrd.sendKeys("Welcome@100");
		
		WebElement login_Login = driver.findElement(By.xpath("//button[text()='Login']"));
		login_Login.click();
		
		WebElement Dashboard = driver.findElement(By.linkText("Realtime Dashboard"));
		
		String actual = Dashboard.getText();
		
		String expected ="Realtime Dashboard";
		
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void invalidLogin()
	{
		driver.get(url);
		WebElement login_userName = driver.findElement(By.id("userName"));
		login_userName.sendKeys("admin");
		
		WebElement login_passowrd = driver.findElement(By.id("password"));
		login_passowrd.sendKeys("Welcome@10");
		
		WebElement login_Login = driver.findElement(By.xpath("//button[text()='Login']"));
		login_Login.click();
		
		WebElement invalidLoginText = driver.findElement(By.id("message"));
		String actual = invalidLoginText.getText();
		
		String expected  = "Invalid user name/password  ";
		
		Assert.assertEquals(expected, actual);
		
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.close();
	}

}
