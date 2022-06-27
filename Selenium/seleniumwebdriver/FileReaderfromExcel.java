package com.seleniumwebdriver;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//import java.io.FileNotFoundException;
import java.io.IOException;
public class FileReaderfromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		FileInputStream fis =new FileInputStream("F:\\AutomationTesting\\Tq_sel.xlsx");
		//Workbook wb= WorkbookFactory.create(fis);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=(Sheet) wb.getSheet("sheet1");
		Row rw= ((org.apache.poi.ss.usermodel.Sheet) sh).getRow(1);
		String username=rw.getCell(1).getStringCellValue();
		String password=rw.getCell(2).getStringCellValue();
		long l=(long) rw.getCell(4).getNumericCellValue();
		System.out.println(username);
		System.out.println(password);
		System.out.println(l);
		

	}

	
}
