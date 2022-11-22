package seleniumtest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcelWithHashMap {
	@Test(dataProvider = "dataFromExcel")
	public void test(HashMap<String, String> testData) {
		
		if (testData.get("LastName").equals("Sharma")) {
			System.out.println("First Name : " + testData.get("FirstName"));
			System.out.println("Last Name : " + testData.get("LastName"));
			System.out.println("Email : " + testData.get("Email"));
			System.out.println("Address : " + testData.get("Address"));
		}
		//Assert.assertEquals(testData.get("LastName"), "Sharma");
	}

	@DataProvider(name = "dataFromExcel") // dataprovider without hashmap
	public Object[] getDataFromExcel() throws FileNotFoundException, IOException {
		HSSFWorkbook workBook = new HSSFWorkbook(new FileInputStream(
				"C:\\Users\\NITIN\\eclipse-workspace\\Training\\resources\\testdata\\testdata.xls"));
		HSSFSheet sheet = workBook.getSheet("testsheet1");
		int rowCount = sheet.getPhysicalNumberOfRows();
		int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(" Total rows : " + rowCount);
		System.out.println(" Total column : " + columnCount);
		Object[] object = new Object[rowCount - 1];
		for (int r = 1; r < rowCount; r++) {
			HashMap<String, String> testData = new HashMap<String, String>();
			HSSFRow rowHeader = sheet.getRow(0);
			HSSFRow row = sheet.getRow(r);
			for (int c = 0; c < columnCount; c++) {
				HSSFCell cellHeader = rowHeader.getCell(c);
				String header = cellHeader.getStringCellValue();
				HSSFCell cell = row.getCell(c);
				String data = cell.getStringCellValue();
				testData.put(header, data);

			}
			object[r - 1] = testData;
		}
		return object;
	}

}
