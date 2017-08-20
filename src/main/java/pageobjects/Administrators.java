package pageobjects;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static util.DriverManagerV.driver;

public class Administrators {

	

	@FindBy(linkText="Administrators")
	WebElement administrators;
	
	@FindBy(linkText="User Management")
	WebElement userManagement;
	
	@FindBy(xpath=".//*[@type='search']")
	WebElement searchbox;
	
	
	@FindBy(xpath=".//*[@id='example']/tbody/tr")
	List<WebElement> resultsCount;
	
	
	public void clickAdminTab()
	{
		administrators.click();
	}
	
	public void clickUserManagementTab()
	{
		userManagement.click();
	}
	
	public void enterUserName(String username)
	{	
		searchbox.sendKeys(username);
		
	}
	
	
	public String isuserAvailable(String username)
	{
		String name ="";
		
		for(int i=1;i<=resultsCount.size();i++)
		{
			System.out.println(resultsCount);
		
			name = driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+i+"]/td[2]/a")).getText();
			if(name.equalsIgnoreCase(username));
		}
		return name;
		
	}
	
	
}
