package net.ssqa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import net.ssqa.driver.Driver;

public class BaseTest {
	
	protected BaseTest() {}
	
	@BeforeMethod
	public void setUp() throws Exception
	{
		Driver.initDriver();
	}
	
	@AfterMethod
	public void tearDown()
	{
//		Driver.quitDriver();
	}

}
