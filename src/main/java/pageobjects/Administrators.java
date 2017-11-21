package pageobjects;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static util.DriverManagerV.driver;

public class Administrators {

	//Changes from Local

	//Changes from Git
	
	//This is admin page object comments
	
	//These are comments from GitLab

	
	
	//Updated by venkatesh
	
	
		
	//These are comments from GitLab

	@FindBy(linkText="Administrators")
	WebElement administrators;
	
	@FindBy(linkText="User Management")
	WebElement userManagement;
	
	@FindBy(xpath=".//*[@type='search']")
	WebElement searchbox;
	
	
	@FindBy(xpath=(".//*[@id='example']/tbody/tr"))
	List<WebElement> resultsCount;
	
	@FindBy(xpath=(".//*[@id='example']/tbody/tr[i]/td[2]/a"))
	WebElement resultsTable;
	
	
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
	
	
	public List<String> isUserAvailable()
	{
		List<String> results=new LinkedList<>();
		for(WebElement e: resultsCount){
				System.out.println(e.getText());
				
				String name1=e.getText();
				
				String[] name2= name1.split(" ");
				
				results.add(name2[0]);
			
			}
					
		return results;
		
	}
	
	
}
