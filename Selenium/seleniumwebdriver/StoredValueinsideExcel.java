package com.seleniumwebdriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StoredValueinsideExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis =new FileInputStream("F:\\AutomationTesting\\Tq_sel2.xlsx");
		//Workbook wb= WorkbookFactory.create(fis);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("sheet1");
		Row rw=sh.getRow(1);
		Cell cell=rw.createCell(3);
		cell.setCellType(CellType.STRING);
		FileOutputStream fos=new FileOutputStream("F:\\AutomationTesting\\Tq_sel2.xlsx");
		cell.setCellValue("ProjectName1");
		wb.write(fos);
		wb.close();

	}

}
