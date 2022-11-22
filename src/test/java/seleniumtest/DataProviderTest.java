package seleniumtest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@Test(dataProvider = "create")
	public void test(String name, int age,String eMail) {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Email : " + eMail);
	}

@DataProvider(name="create")
public Object[][] createData()
{
return  new Object[][]{{"Rama",20,"rama@gmail.com"},{"Krishna",30,"Krishna@gmail.com"},{"Shiv",30,"shiv@gmail.com"}};


	


}
}