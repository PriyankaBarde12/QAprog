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

public class TaskDetails {
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
	public void taskde() {

		dr.findElement(By.xpath("//div[text()='Tasks']")).click();
		dr.findElement(By.xpath("//div/div[@class='topContainer']/div/div/div[text()='Add Task']")).click();
		dr.findElement(By.id("placeholder")).sendKeys("taskkk");
		dr.findElement(By.xpath("//div[text()='Set up deadline']")).click();
		dr.findElement(By.xpath("//td[@title='May 29, 2022']"));
		dr.findElement(By.xpath("//div[text()='Billable: manufacturing']")).click();
		dr.findElement(By.xpath("//span[text()='Medium']")).click();
		dr.findElement(By.id("placeholder")).sendKeys("4562000");
		dr.findElement(By.id("placeholder")).sendKeys("4675");
		dr.findElement(By.xpath("//div[@class='edit_task_sliding_panel sliding_panel components_panelContainer']/div/div/div/div[@class='taskPanelContent ']/div/div/div[@class='buttonsBox']/div/div[text()='Add Task']")).click();
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
