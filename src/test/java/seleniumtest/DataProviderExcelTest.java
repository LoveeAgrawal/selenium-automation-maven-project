package seleniumtest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcelTest {

	@Test(dataProvider = "dataFromExcel")
	public void test(String firstName, String lastName, String eMail, String address) {
		System.out.println("First Name : " + firstName);
		System.out.println("Last Name : " + lastName);
		System.out.println("Email " + eMail);
		System.out.println("Address : " + address);
	}

	@DataProvider(name = "dataFromExcel")//dataprovider without hashmap
	public Object[][] getDataFromExcel() throws FileNotFoundException, IOException {
		HSSFWorkbook workBook = new HSSFWorkbook(new FileInputStream(
				"C:\\Users\\NITIN\\eclipse-workspace\\Training\\resources\\testdata\\testdata.xls"));
		HSSFSheet sheet = workBook.getSheet("testsheet1");
		int rowCount = sheet.getPhysicalNumberOfRows();
		int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(" Total rows : " + rowCount);
		System.out.println(" Total column : " + columnCount);
		Object[][] object = new Object[rowCount][columnCount];
		for (int r = 0; r < rowCount; r++) {
			HSSFRow row = sheet.getRow(r);
			for (int c = 0; c < columnCount; c++) {

				HSSFCell cell = row.getCell(c);
				String data = cell.getStringCellValue();

				object[r][c] = data;
			}

		}
		return object;
	}

}
