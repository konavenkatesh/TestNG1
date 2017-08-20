package Users;

import org.testng.Assert;
import org.testng.annotations.Test;

import steps.Users;

public class UsersSearch {
	
	
	@Test
	public void searchUser()
	{
		
		Users user=new Users();
		
		String name=user.userSearch("venkatesh");
		
		String actual="venkatesh";
		
		Assert.assertEquals(name, actual);
	}
	

}
