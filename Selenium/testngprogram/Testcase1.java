package com.testngprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase1 {
	@Test(groups="Smoke")
	public void Test1() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angel\\Downloads\\chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		 dr = new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS)	;
		dr.manage().window().maximize();
		dr.get("https://www.flipkart.com/");
		try {
			dr.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		} catch (Exception e) {
			System.out.println("pop is not displying");
		}
	}
	@Test(groups="Regression")
	public void Test12(){
		
	}

}
