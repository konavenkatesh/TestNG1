package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageV {
	
	
	@FindBy(id="userName")
	WebElement user;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement login;
	
	@FindBy(id="message")
	WebElement invalidLoginMsg;
	
	
	public void enterUserName(String userName)
	{
		user.sendKeys(userName);
	}
	
	
	public void enterPassword(String password)
	{
		this.password.sendKeys(password);
	}
	
	public void login()
	{
		login.click();
	}
	
	public String getInvalidLoginText()
	{
		return invalidLoginMsg.getText();
	}
	

}
