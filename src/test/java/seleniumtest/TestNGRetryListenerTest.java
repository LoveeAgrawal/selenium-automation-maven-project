package seleniumtest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryListenerTest {
@Test
	public void failingTest()
	{
	System.out.println("Step 1");
	Assert.assertEquals("Ram", "Shyam");
	System.out.println("Step 3");
	
}
}