package seleniumtest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGClass2 extends BaseTestClass {
	@Test(priority=1,groups="SmokeTest")

	public void test1() {
		Reporter.log("Smoke testing class 2 Test1() executed ", true);
	}
	@Test(priority=2,enabled=false)
	public void test2() {
		Reporter.log("Test2() executed ", true);
	}
	@Test(priority=4,groups="SmokeTest")
	public void test3() {
		Reporter.log("Smoke testing class 2 Test3() executed ", true);
		
	}
	@Test(priority=3)
	public void test4() {
		Reporter.log("Test4() executed ", true);
	}


}
