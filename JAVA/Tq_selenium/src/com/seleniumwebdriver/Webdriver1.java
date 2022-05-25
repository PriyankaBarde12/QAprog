package com.seleniumwebdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angel\\Downloads\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://online.actitime.com/tcs4/login.do");
		WebElement wb=dr.findElement(By.id("username"));
		wb.sendKeys("bardepn12@gmail.com");
		WebElement wb1=dr.findElement(By.name("pwd"));
		wb1.sendKeys("rPrT3ath");
		//dr.findElement(By.id("loginButton")).click();
	
	}

}
