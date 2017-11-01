package steps;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageobjects.Administrators;
import pageobjects.CommonPage;
import pageobjects.DashboardPageV;
import pageobjects.LoginPageV;
import util.DriverManagerV;

public class Users {
	
	
	LoginPageV loginpage;
	DashboardPageV dashboardpage;
	CommonPage commonpage;
	Administrators adminstrators;
	private static Logger Log = Logger.getLogger(Log.class.getName());
	
	public Users()
	{
		
		loginpage= PageFactory.initElements(DriverManagerV.driver, LoginPageV.class);
		dashboardpage = PageFactory.initElements(DriverManagerV.driver, DashboardPageV.class);
		commonpage = PageFactory.initElements(DriverManagerV.driver, CommonPage.class);
		adminstrators =PageFactory.initElements(DriverManagerV.driver, Administrators.class);
		
	}
	
	public void userSearch(String userName)
	{
		adminstrators.clickAdminTab();
		adminstrators.clickUserManagementTab();
		adminstrators.enterUserName(userName);
		List<String> results=adminstrators.isUserAvailable();

		for(String rname:results)
		{
			if(rname.equals(userName))
			{
				Assert.assertTrue(true);
				Log.info("User is available");
			}
			else
			{
				Assert.assertFalse(false);
				Log.info("User is not available");
				
			}
			
		}
		
			
		
	}
	
	

}
