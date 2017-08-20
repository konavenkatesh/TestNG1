package util;


import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomListener extends TestListenerAdapter{
	
	private int m_c=0;
	
	@Override
	public void onTestFailure(ITestResult tr)
	{
		log(tr.getName()+"---Test Method Failed\n");
	}
	
	@Override
	public void onTestSkipped(ITestResult tr)
	{
		log(tr.getName()+"---Test Method Skipped\n");
	}
	
	@Override
	public void onTestSuccess(ITestResult tr)
	{
		log(tr.getName()+"---Test Method Success\n");
	}
	
	public void log(String string)
	{
		System.out.println(string);
		
				
		
	}
	
}
