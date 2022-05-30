package com.seleniumwebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angel\\Downloads\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		//Implicit wait
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.navigate().to("https://www.facebook.com");
		dr.findElement(By.xpath("//a[text()='Create New Account']")).click();
		dr.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Priya");
		dr.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Barde");
		dr.findElement(By.xpath("//input[@aria-label='Email address or phone number']")).sendKeys("priya456@gmail.com");
		dr.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Admin#96");
			Select sel=new Select(dr.findElement(By.id("day")));
			sel.selectByIndex(2);
			Select sel1=new Select(dr.findElement(By.id("month")));
			sel1.selectByIndex(0);
			Select ye=new Select(dr.findElement(By.id("year")));
			ye.selectByVisibleText("1999");
			//System.out.println(ye.isMultiple());


	}

}
