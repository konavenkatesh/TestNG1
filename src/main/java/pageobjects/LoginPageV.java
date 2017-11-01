package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//by venki
public class LoginPageV {
	
	//This is master branch venki 111 ###################################################
	///hello
	@FindBy(id="userName")
	WebElement user;
	//pass
	@FindBy(id="password")
	WebElement password;
	//login
	@FindBy(xpath="//button[text()='Login']")
	WebElement login;
	
	@FindBy(id="message")
	WebElement invalidLoginMsg;
	
	@FindBy(id="forgotpwdlinkId")
	WebElement forgotPasswordLink;
	
	@FindBy(id="email")
	WebElement emailId;
	
	@FindBy(id ="submitId")
	WebElement sendMeLoginDetails;
	
	@FindBy(xpath="//div[@class='login-title']/span[1]")
	WebElement forgot_EmailConfirmation_Message;
	
	@FindBy(xpath=".//*[@id='message']")
	WebElement invalidEmailMsg;
	
	//setters getters
	public void enterUserName(String userName)
	{
		user.sendKeys(userName);
	}
	
	
	public void clearUserName()
	{
		user.clear();
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
	
	public void clickForgotPasswordLink()
	{
		forgotPasswordLink.click();
	}
	
	public void enterEmailID(String emailid)
	{
		emailId.sendKeys(emailid);
	}
	
	public void clearEmailID()
	{
		emailId.clear();
	}
	
	public void clickSendMeLoginDetails()
	{
		sendMeLoginDetails.click();
	}

	
	public String getForgotEmailConfirmationMessage()
	{
		return forgot_EmailConfirmation_Message.getText();
	}
	
	
	public String getInvalidEmailText()
	{
		return invalidEmailMsg.getText();
	}
	
	public void test()
	{
		System.out.println("");
	}
	
}
