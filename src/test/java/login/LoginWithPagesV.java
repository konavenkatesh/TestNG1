package login;


import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import steps.LoginStepsWithPageV;
import util.DriverManagerV;


public class LoginWithPagesV {
	
		
	DriverManagerV dm;
	//private static Logger Log = Logger.getLogger(Log.class.getName());
	LoginStepsWithPageV lswp;
	
	
	
	@BeforeMethod
	public void instantiateBrowser1()
	{
		dm=new DriverManagerV();
		lswp=new LoginStepsWithPageV();
	}
	
	@Test(groups={"Regression"})
	public void validLogin()
	{	
		//DOMConfigurator.configure("log4j.xml");
		String actual=lswp.validLogin("admin", "Welcome@100");
		//Log.info("Called ValidLogin method of LoginStepswithPages class");
		String expected ="Realtime Dashboard";
		
		Assert.assertEquals(expected, actual);
		//Log.info("Matched the actual and expected result");	
	}
	
	
	@Test
	public void invalidLogin()
	{
		
		String actual=lswp.invalidLogin("admin","test@100");
		String expected  = "Invalid user name/password  ";
		Assert.assertEquals(actual, expected);
			
	}
	

	@Test
	public void invalidLogin1()
	{
		
		String actual=lswp.invalidLogin("admin1","Welcome@100");
		String expected  = "Invalid user name/password  ";
		Assert.assertEquals(actual, expected);
			
	}
	
	@Test
	public void invalidLogin2()
	{
		
		String actual=lswp.invalidLogin("admin1","test@100");
		String expected  = "Invalid user name/password  ";
		Assert.assertEquals(actual, expected);
			
	}
	
	@Test
	public void invalidLogin3()
	{
		
		String actual=lswp.invalidLogin("","");
		String expected  = "Please provide user name";
		Assert.assertEquals(actual, expected);
			
	}
	
	
	@Test
	public void clickForgotPasswordLink() throws InterruptedException
	{
		
		String actual = lswp.clickForgotPasswordLink("admin@admin.com");
		String expected = "Your Password has been sent to your Email.";
		Assert.assertEquals(actual, expected);
			
	}
	
	@Test
	public void invalid_EmailId_ForgotPasswordLink() throws InterruptedException
	{
		
		String actual = lswp.enterInvalidEmailId("admin.com");
		String expected = "Please provide valid email";
		Assert.assertEquals(actual, expected);
			
	}
	
	@Test
	public void empty_EmailId_ForgotPasswordLink() throws InterruptedException
	{
		
		String actual = lswp.enterEmptyEmailId("");
		String expected = "Please provide email";
		Assert.assertEquals(actual, expected);
			
	}
	
	
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		dm.closeBrowser();
	}
	
	
	
}
