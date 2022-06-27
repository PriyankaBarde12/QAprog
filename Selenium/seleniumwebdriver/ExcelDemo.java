package com.seleniumwebdriver;
//package excelRead_Write;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//short org.apache.poi.xssf.usermodel.XSSFRow.getLastCellNum()

//import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDemo {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream inputstream =new FileInputStream("F:\\AutomationTesting\\Amazon2.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(inputstream);
		XSSFSheet sheet=wb.getSheet("LoginDetails");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angel\\Downloads\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();

		dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		dr.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&prevRID=SC2Y119A79YWTWXMXBBS&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		XSSFRow row=null;
		  XSSFCell cell=null;
		  String userName=null;
		  String password=null;
		  String mobno=null;
		  
		  for (int i=1; i<=sheet.getLastRowNum();i++)
		  {
		   row=sheet.getRow(i);
		   for ( int j=0;j<row.getLastCellNum();j++)
		   {
		    cell=row.getCell(j);
		    
		     userName=cell.getStringCellValue();
		    
			
		     password=cell.getStringCellValue();
		      mobno=cell.getStringCellValue();
		    		  
		
		}
		   System.out.println("User Name : " + userName + " ----  " + "Password : "  + password);
		   // We can pass this values in to web application for testing Test user Accounts.
			dr.findElement(By.id("ap_customer_name")).sendKeys(userName);

			dr.findElement(By.id("ap_password")).sendKeys(password);
			dr.findElement(By.id("ap_phone_number")).sendKeys(mobno);
			dr.findElement(By.id("continue")).click();
			dr.findElement(By.id("createAccountSubmit")).click();

		
	}
		 
	}
}
	
	
