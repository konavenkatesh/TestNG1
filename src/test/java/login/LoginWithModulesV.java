package login;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import steps.LoginStepsV;
import util.DriverManagerV;

public class LoginWithModulesV {

	
	
	DriverManagerV dm;
	@BeforeSuite
	public void instanceDriver()
	{
		 dm=new DriverManagerV();
	}
	
	
	@Test
	public void verifyValidLogin()
	{
		LoginStepsV lsv=new LoginStepsV();
		String actual=lsv.Login("admin", "Welcome@100");
		String expected ="Realtime Dashboard";
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void invalidLogin()
	{
		LoginStepsV lsv=new LoginStepsV();
		String actaul =lsv.InvalidLogin("admin", "Test@123");
		String expected  = "Invalid user name/password  ";
		Assert.assertEquals(actaul, expected);
		
	}
	
	
	@AfterSuite
	public void closeBrowser()
	{
		dm.closeBrowser();
	}
	
	
	
}
