package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public void beforeclass()
	{
		//selenium
		System.out.println("I will exe before any method in the class");
	
	}
	
	@AfterClass
	public void afterclass()
	{
		//selenium
		System.out.println("I will exe after any method in the class");
	
	}
	
	
	@BeforeMethod
	public void beforeEvery()
	{
		//selenium
		System.out.println("I will exe before every test method in day 3 class");
	
	}
	
	@AfterMethod
	public void afterEvery()
	{
		//selenium
		System.out.println("I will exe after every test method in day 3 class");
	
	}
	
	@Parameters({"URL"})
	@Test
	public void WebloginCarLoan(String urlname)
	{
		//selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
	
	}
	
	@Test(groups= {"Smoke"})
	public void MobileloginCarLoan()
	{
		//Appium
		System.out.println("Mobilelogin");
	
	}
	
	@Test(enabled=false)
	public void MobilesignInCarLoan()
	{
		//Appium
		System.out.println("MobilesignIN");
	
	}
	//@Test(enabled=true)
	//@Test(timeOut=4000)
	@Test(dataProvider="getData")
	public void MobilesignOutCarLoan(String username, String password)
	{
		//Appium
		System.out.println("Mobilesignout");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(dependsOnMethods={"WebloginCarLoan", "MobilesignOutCarLoan"})
	public void APIcarLoan()
	{
		//Rest APi automation
		System.out.println("APIlogincar");
	
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[3][2];
		data[0][0] = "firstsetusername";
		data[0][1] = "firstpassword";
		
		data[1][0] = "secondsetusername";
		data[1][1] = "secpassword";
		
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdcpassword";
		
		return data;
		
	}

}
