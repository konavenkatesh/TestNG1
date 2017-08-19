package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPageV {
	
	@FindBy(linkText="Realtime Dashboard")
	WebElement dashboardTabName;
	
	
	
	
	public String DboardTabName()
	{
		return dashboardTabName.getText();
	}
	
 

}
