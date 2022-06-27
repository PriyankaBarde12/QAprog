package com.testngprogram;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelFileAmazon {	

public static void main(String args[]) throws EncryptedDocumentException, IOException {
	//String path="";
	FileInputStream fis =new FileInputStream("F:\\AutomationTesting\\Amazon2.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	
	Sheet sh=(Sheet) wb.getSheet("sheet1");
	Row row= ((org.apache.poi.ss.usermodel.Sheet) sh).getRow(1);
	////////////
	String username=row.getCell(1).getStringCellValue();
	//long l=(long) rw.getCell(2).getNumericCellValue();
	String email =row.getCell(3).getStringCellValue();
	String password =row.getCell(4).getStringCellValue();
	String cpassword=row.getCell(5).getStringCellValue();
	
	//long mobile=(long) rw.getCell(2).getNumericCellValue();
	//for()
//String username = rw.getRow(i), email = null,password = null,cpassword = null;
	System.out.println(username);
	System.out.println(email);
	System.out.println(password);
	System.out.println(cpassword);
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angel\\Downloads\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.navigate().to("https://www.amazon.in/");
	dr.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
	//Thread.sleep(2000);
	
	dr.findElement(By.id("createAccountSubmit")).click();
	
	dr.findElement(By.id("ap_customer_name")).sendKeys(username);
	//dr.findElement(By.name("email")).sendKeys(mobile);
	//((long l) dr.findElement(By.name("l"))).getNumericCellValue(l);
	dr.findElement(By.id("ap_email")).sendKeys(email);
	dr.findElement(By.id("ap_password")).sendKeys(password);
	dr.findElement(By.id("ap_password_check")).sendKeys(cpassword);
	dr.findElement(By.id("continue"));
	//dr.close();
	//FileOutputStream fos = new FileOutputStream(path);
	//wb.write(fos);
	

}}
