package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
		
	@Test(groups= {"Smoke"})
	public void ploan()
	{
		System.out.println("good");
	
	}

	@BeforeTest
	public void prerequiste()
	{
		System.out.println("I will execute first");
	
	}
	
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
	
	}
	
}
