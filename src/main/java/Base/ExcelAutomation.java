package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAutomation {
	public void excelauto() throws IOException
	{
		System.out.println("H");
		FileInputStream fis=new FileInputStream("X:\\Cucumber\\Restapi.xlsx");
		XSSFWorkbook excelWorkbook = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = excelWorkbook.getSheetAt(0);
		int row = sheet1.getLastRowNum();
		int cellcount = sheet1.getRow(0).getLastCellNum();
		System.out.println(row+""+cellcount);
		for (int i =0;i<=row;i++)
		{
			for (int j=0;j<=cellcount;j++) {
				System.out.println(sheet1.getRow(i).getCell(j));
			}
			
		}
	}
	public static void main(String[] args) throws IOException
	{
		ExcelAutomation auto = new ExcelAutomation();
		auto.excelauto();

	}
	
}
