package com.testngprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Actitimeapp {
	WebDriver dr;
	@BeforeClass
	public void beforeclass(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angel\\Downloads\\chromedriver.exe");
		//Launch Browser
		 dr = new ChromeDriver();
		
	}
	@BeforeMethod
	public void beforemethod() {
		//implicit
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS)	;
		dr.manage().window().maximize();
		//pass url
		dr.get("https://online.actitime.com/pbarde");
		//Identify username field
		dr.findElement(By.id("username")).sendKeys("bardepn12@gmail.com");
		dr.findElement(By.name("pwd")).sendKeys("rPrT3ath",Keys.ENTER);
		//dr.findElement(By.id("loginButton")).click();
		}
	@Test
	public void CreateNewCustomer() {

		String ExpectedResult="has been created";
		dr.findElement(By.xpath("//div[text()='Tasks']")).click();
		dr.findElement(By.xpath("//div[text()='Add New']")).click();
		dr.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		dr.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("Customer2");
		dr.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("abvhshgah");
		dr.findElement(By.xpath("//div[@class='emptySelection']")).click();
		dr.findElement(By.xpath("//div[div[div[@class='emptySelection']]]/following-sibling::div/div/div/div/div[text()='Our company']")).click();
		dr.findElement(By.xpath("//div[text()='Create Customer']")).click();
		String ActualResult = dr.findElement(By.xpath("//span[contains(text(),'has been created')]")).getText(); 
		 
		System.out.println("Actual Result : "+ActualResult);
		if(ActualResult.contains(ExpectedResult)) {
			System.out.println("test case passed==true");
		}else {
			System.out.println("test case passed==false");
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
/*	public void AddNewProject() {
		dr.findElement(By.xpath("//div[text()='Add New']")).click();
		dr.findElement(By.xpath("//div[text()=//div[text()='+ New Project']")).click();
		//dr.findElement(By.xpath("//div[div[div[text()='Create Project']]]/following-sibling::div")).click();
		dr.findElement(By.id("placeholder")).sendKeys("Tq2");
		
	}*/
	@AfterMethod
	public void aftermethod() {
		//dr.findElement(By.id("logoutLink")).click();
		dr.close();
	
	}
	@AfterClass
	public void afterclass() {
		dr.close();
	}

}
