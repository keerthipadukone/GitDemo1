package test;

import org.testng.annotations.Test;

public class day4 {
	
	@Test
	public void WebloginHomeLoan()
	{
		//selenium
		System.out.println("webloginhome");
	
	}
	
	@Test
	public void MobileloginHomeLoan()
	{
		//Appium
		System.out.println("MobileloginHome");
	
	}
	
	@Test(groups= {"Smoke"})
	public void LoginAPIHomeLoan()
	{
		//Rest APi automation
		System.out.println("APIloginHome");
	
	}
	


}
