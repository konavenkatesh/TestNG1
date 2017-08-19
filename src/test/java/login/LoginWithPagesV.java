package login;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import steps.LoginStepsWithPageV;
import util.DriverManagerV;

public class LoginWithPagesV {
	
	//This is the second commit changes
	
	DriverManagerV dm;
	@BeforeSuite
	public void instantiateBrowser()
	{
		 dm=new DriverManagerV();
	}

	
	@Test
	public void validLogin()
	{
		LoginStepsWithPageV lswp=new LoginStepsWithPageV();
		String actual=lswp.validLogin("admin", "Welcome@100");
		String expected ="Realtime Dashboard";
		Assert.assertEquals(expected, actual);
			
	}
	
	
	@Test
	public void invalidLogin()
	{
		LoginStepsWithPageV lswp=new LoginStepsWithPageV();
		String actual=lswp.invalidLogin("admin","Test@100");
		String expected  = "Invalid user name/password  ";
		Assert.assertEquals(actual, expected);
			
	}
	
	
	@AfterSuite
	public void closeBrowser()
	{
		dm.closeBrowser();
	}
	
	
	
}
