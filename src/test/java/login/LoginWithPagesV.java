package login;


import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import steps.LoginStepsWithPageV;
import util.DriverManagerV;

public class LoginWithPagesV {
	
	//This is the second commit changes
	//This is the third
	
	DriverManagerV dm;
	private static Logger Log = Logger.getLogger(Log.class.getName());
	
	@BeforeSuite(alwaysRun=true)
	public void instantiateBrowser()
	{
		 dm=new DriverManagerV();
	}

	
	@Test(groups={"Regression"})
	public void validLogin()
	{	
		DOMConfigurator.configure("log4j.xml");
		LoginStepsWithPageV lswp=new LoginStepsWithPageV();
		String actual=lswp.validLogin("admin", "Welcome@100");
		Log.info("Called ValidLogin method of LoginStepswithPages class");
		String expected ="Realtime Dashboard";
		
		Assert.assertEquals(expected, actual);
		Log.info("Matched the actual and expected result");	
	}
	
	
	@Test
	public void invalidLogin()
	{
		LoginStepsWithPageV lswp=new LoginStepsWithPageV();
		String actual=lswp.invalidLogin("admin","Test@100");
		
		String expected  = "Invalid user name/password  ";
		Assert.assertEquals(actual, expected);
			
	}
	
	
	/*@AfterSuite
	public void closeBrowser()
	{
		dm.closeBrowser();
	}
	*/
	
	
}
