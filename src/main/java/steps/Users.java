package steps;

import org.openqa.selenium.support.PageFactory;

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
	
	public Users()
	{
		
		loginpage= PageFactory.initElements(DriverManagerV.driver, LoginPageV.class);
		dashboardpage = PageFactory.initElements(DriverManagerV.driver, DashboardPageV.class);
		commonpage = PageFactory.initElements(DriverManagerV.driver, CommonPage.class);
		adminstrators =PageFactory.initElements(DriverManagerV.driver, Administrators.class);
		
	}
	
	public String userSearch(String userName)
	{
		adminstrators.clickAdminTab();
		adminstrators.clickUserManagementTab();
		adminstrators.enterUserName(userName);
		String name=adminstrators.isuserAvailable(userName);
		return name;
		
	}
	
	

}
