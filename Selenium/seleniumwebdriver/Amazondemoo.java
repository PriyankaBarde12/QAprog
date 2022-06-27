package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazondemoo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angel\\Downloads\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.navigate().to("https://www.amazon.in/");
		dr.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
		//Thread.sleep(2000);
		//dr.findElement(By.xpath("//div[@class='nav-signin-tooltip-footer']/a[@class='nav-a']")).click();
		dr.findElement(By.id("createAccountSubmit")).click();
		
		dr.findElement(By.id("ap_customer_name")).sendKeys("Priyanka Barde");
		dr.findElement(By.name("email")).sendKeys("8805432096");
		dr.findElement(By.id("ap_password")).sendKeys("admin123");
		dr.findElement(By.id("ap_password_check")).sendKeys("admin123");
		dr.findElement(By.id("continue"));
	
		/*Thread.sleep(1000);
		dr.findElement(By.id("ap_customer_name")).sendKeys("Priya Barde");
		dr.findElement(By.name("email")).sendKeys("8005432096");
		dr.findElement(By.id("ap_password")).sendKeys("priyanka9999");
		dr.findElement(By.id("ap_password_check")).sendKeys("priyanka9999");
		dr.findElement(By.id("continue"));*/
	

	}

}
