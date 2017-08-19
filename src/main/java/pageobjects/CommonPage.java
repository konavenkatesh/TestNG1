package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonPage {
	
	@FindBy(linkText="Logout")
	WebElement logout;
	
	public void clickLogout()
	{
		logout.click();
	}
	

}
