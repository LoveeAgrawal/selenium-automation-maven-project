package seleniumtest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class RetryAnalyzer implements IRetryAnalyzer {
	int retryCounter = 0;
	int retryLimit = 3;
@Override
	public boolean retry(ITestResult result)
	{
		if(retryCounter<retryLimit)
		{
			retryCounter++;
			return true;//rerun the failed testcase
		}
		else
		{
			return false;//stop running the failed test case
		}
	}

	

}
