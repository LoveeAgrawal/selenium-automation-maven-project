package seleniumtest;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderHashMap {
	@Test(dataProvider = "create")
	public void test(HashMap<String,String> testData) {
		System.out.println(testData.get("Name"));
		System.out.println( testData.get("Email"));
		System.out.println( testData.get("Address"));
	}

@DataProvider(name="create")
public Object[][]createData()
{
	HashMap<String,String> testData=new HashMap<String,String>();
	testData.put("Name", "Rama");
	testData.put("Email", "Rama@gmail.com");
	testData.put("Address", "Pune");
	HashMap<String,String> testData2=new HashMap<String,String>();
	testData2.put("Name", "Krishna");
	testData2.put("Email", "Krishna@gmail.com");
	testData2.put("Address", "Delhi");
	/*Object[] object= new Object[2];
	object[0]=testData;
	object[1]=testData2;
	return object;*/
	return new Object[][] {{testData},{testData2}};
	
	}



	


}


