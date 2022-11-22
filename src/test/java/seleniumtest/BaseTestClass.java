package seleniumtest;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.BeforeTest;

public class BaseTestClass {

	@BeforeMethod
	public void beforeMethod()
	{
Reporter.log("Before method executed",true);
}
	@AfterMethod
	public void afterMethod()
	{
Reporter.log("After method executed",true);
}
	@BeforeClass
	public void beforeClass()
	{
Reporter.log("Before class executed",true);
}
	@AfterClass
	public void afterClass()
	{
Reporter.log("After class executed",true);
}
	@BeforeTest
	public void beforeTest()
	{
Reporter.log("Before test executed",true);
}
	@AfterTest
	public void afterTest()
	{
Reporter.log("After test executed",true);
}

	@AfterSuite
	public void afterSuite()
	{
Reporter.log("After suite executed",true);
}
}