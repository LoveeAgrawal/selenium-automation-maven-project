package seleniumtest;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;



public class TestNGDependanciesTest extends BaseTestClass {


		@Test()

		public void test1() {
			Reporter.log("Test1() executed ", true);
		}
		@Test(dependsOnMethods= "test1")//hard dependency
		public void test2() {
			Reporter.log("Test2() executed ", true);
		}
		@Test(dependsOnMethods="test4",alwaysRun=true)//soft dependency
		public void test3() {
			Reporter.log("Test3() executed ", true);
			
		}
		@Test()
		public void test4() {
			Reporter.log("Test4() executed ", true);
			String expectedTitle="Google";
			String actualTitle="google";
		
			assertEquals(expectedTitle,actualTitle,"Verifying Name");
		}

		@Test(dependsOnMethods="test4")//hard dependency
		public void test5() {
			Reporter.log("Test5() executed ", true);
			
		}
		
	}



