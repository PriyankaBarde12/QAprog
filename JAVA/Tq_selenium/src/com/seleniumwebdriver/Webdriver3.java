package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angel\\Downloads\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://online.actitime.com/tcs4/login.do");
		WebElement wb=dr.findElement(By.id("username"));
		wb.sendKeys("bardepn12@gmail.com");
		Thread.sleep(4000);
		wb.clear();

	}

}
