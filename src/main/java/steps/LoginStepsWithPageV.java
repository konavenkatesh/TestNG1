package steps;

import org.openqa.selenium.support.PageFactory;

import pageobjects.LoginPageV;
import pageobjects.DashboardPageV;
import pageobjects.CommonPage;
import util.DriverManagerV;

public class LoginStepsWithPageV {
	
	LoginPageV loginpage;
	DashboardPageV dashboardpage;
	CommonPage commonpage;
	
	
	public LoginStepsWithPageV()
	{
		
		loginpage= PageFactory.initElements(DriverManagerV.driver, LoginPageV.class);
		dashboardpage = PageFactory.initElements(DriverManagerV.driver, DashboardPageV.class);
		commonpage = PageFactory.initElements(DriverManagerV.driver, CommonPage.class);
		
	}
	
	
	public String validLogin(String userName,String password)
	{
		loginpage.enterUserName(userName);
		loginpage.enterPassword(password);
		loginpage.login();
		String actual=dashboardpage.DboardTabName();
		//commonpage.clickLogout();
		return actual;
		
	}
	
	
	public String invalidLogin(String userName,String password)
	{
		loginpage.enterUserName(userName);
		loginpage.enterPassword(password);
		loginpage.login();
		String actual=loginpage.getInvalidLoginText();
		return actual;
	}
	
	

}
