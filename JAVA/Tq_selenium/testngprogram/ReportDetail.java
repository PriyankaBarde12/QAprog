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

	public class ReportDetail {
		WebDriver dr;
		@BeforeClass
		public void beforeclass(){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angel\\Downloads\\chromedriver.exe");
			//Launch Browser
			 dr = new ChromeDriver();
			
		}
		@BeforeMethod
		public void beforemethod() {
			//implicit //div/div[@class='components_button withPlusIcon']
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
		public void reportde() {
			dr.findElement(By.xpath("//a/div[text()='Reports']")).click();
			dr.findElement(By.xpath("//a/div[text()='Time Balance & Overtime']")).click();
			dr.findElement(By.id("ext-gen41")).sendKeys("Current & previous week");
			dr.findElement(By.id("ext-gen62")).click();
			dr.findElement(By.id("ext-gen62")).sendKeys("Users");
			dr.findElement(By.id("ext-gen81")).sendKeys("HR & Finance");
			dr.findElement(By.id("ext-gen92")).sendKeys("Time Balance & Overtime");
			dr.findElement(By.xpath("//span[text()='Generate HTML Report']")).click();
			dr.findElement(By.id("reportLeaveExportSelector")).click();
			
		}
		
		
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

