

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

	public class TaskDemo {
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
		public void NewTask() {
			
		
			dr.findElement(By.xpath("//div[text()='Tasks']")).click();
			dr.findElement(By.xpath("//div[text()='Add New']")).click();	
			dr.findElement(By.xpath("//div[text()='+ New Tasks']")).click();
			
			dr.findElement(By.xpath("//div/div/div[@class='comboboxButton']/div[text()='Cust111']")).click();
			dr.findElement(By.xpath("//div[text()='- Select Project -']")).click();
			dr.findElement(By.xpath("//div[text()='- ALL ACTIVE PROJECTS -']")).click();
			dr.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder error']")).sendKeys("Task01");
			dr.findElement(By.id("ext-gen23")).sendKeys("Jul 28, 2022");
			dr.findElement(By.xpath("//th/div/label/span[@class='checkmark checkMark']")).click();
			dr.findElement(By.xpath("//div[text()='Create Tasks']")).click();

			String ActualResult3 = dr.findElement(By.xpath("//span[contains(text(),'has been created')]")).getText(); 
			System.out.println("actual : "+ActualResult3);
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
