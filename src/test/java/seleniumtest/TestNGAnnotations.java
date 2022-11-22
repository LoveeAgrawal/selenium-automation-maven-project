package seleniumtest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@Test(priority=1)

	public void test1() {
		Reporter.log("Test1() executed ", true);
	}
	@Test(priority=2,enabled=false)
	public void test2() {
		Reporter.log("Test2() executed ", true);
	}
	@Test(priority=4)
	public void test3() {
		Reporter.log("Test3() executed ", true);
		
	}
	@Test(priority=3)
	public void test4() {
		Reporter.log("Test4() executed ", true);
	}


}
