package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static util.DriverManagerV.driver;

public class LoginStepsV {

	public String Login(String userName,String password)
	{
		WebElement login_userName = driver.findElement(By.id("userName"));
		login_userName.sendKeys(userName);
		
		WebElement login_passowrd = driver.findElement(By.id("password"));
		login_passowrd.sendKeys(password);
		
		WebElement login_Login = driver.findElement(By.xpath("//button[text()='Login']"));
		login_Login.click();
		
		WebElement Dashboard = driver.findElement(By.linkText("Realtime Dashboard"));
		
		String actual = Dashboard.getText();
		
		return actual;
	}
	
	public String InvalidLogin(String userName,String password)
	{
		
		WebElement login_userName = driver.findElement(By.id("userName"));
		login_userName.sendKeys(userName);
		
		WebElement login_passowrd = driver.findElement(By.id("password"));
		login_passowrd.sendKeys(password);
		
		WebElement login_Login = driver.findElement(By.xpath("//button[text()='Login']"));
		login_Login.click();
		
		WebElement invalidLoginText = driver.findElement(By.id("message"));
		String actual = invalidLoginText.getText();
		
		return actual;
	}

}
