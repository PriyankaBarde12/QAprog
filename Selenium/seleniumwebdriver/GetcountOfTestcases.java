package com.seleniumwebdriver;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetcountOfTestcases {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis =new FileInputStream("F:\\AutomationTesting\\Tq_sel2.xlsx");
		//Workbook wb= WorkbookFactory.create(fis);
		Workbook wb=WorkbookFactory.create(fis);

		Sheet sh=(Sheet) wb.getSheet("sheet1");
		int rowcount=sh.getLastRowNum();
		System.out.println(rowcount);

	}

}

