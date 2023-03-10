package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelSupplier {

	public  List<String> readExcelData(String fileName,String sheetName) throws IOException {
		List<String> BandNames = new ArrayList<String>();
		FileInputStream fis = new FileInputStream(fileName);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		int rows = sheet.getLastRowNum();
		int cells = sheet.getRow(0).getLastCellNum();
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < cells; j++) {
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
				BandNames.add(sheet.getRow(i).getCell(j).getStringCellValue());
			}
		}
		workbook.close();
		fis.close();
		return BandNames;
	}
	public  List<String> readBandNames() throws IOException {
		return readExcelData("./src/test/resources/TestData/EATestData.xlsx", "BandNames");
				}
	public  List<String> readFestivalNames() throws IOException {
		return readExcelData("./src/test/resources/TestData/EATestData.xlsx", "FestivalNames");
				}
}
