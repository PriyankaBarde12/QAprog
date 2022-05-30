package com.seleniumwebdriver;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webele {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angel\\Downloads\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		//implicit wait 
		//dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);)
		//dr.navigate().to("https://www.flipkart.com");
		//Thread.sleep(3000);
		String titlepage1= dr.getTitle();
		System.out.println(titlepage1);
		dr.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		
		//Thread.sleep(3000);
		/*WebDriverWait wait=new WebDriverWait(dr,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Grocery']")));
		dr.findElement(By.xpath("//div[text()='Grocery']"));*/
		FluentWait fw=new FluentWait(dr);
		fw.withTimeout(20,TimeUnit.SECONDS);
		fw.pollingEvery(300, TimeUnit.SECONDS);
		fw.ignoring(Exception.class);
		
		String titlepage2= dr.getTitle();
		String url1=dr.getCurrentUrl();
		Thread.sleep(3000);
		System.out.println(url1);
		System.out.println(titlepage2);
		
		dr.navigate().back();
		Thread.sleep(3000);
		String titlepage3= dr.getTitle();
		Thread.sleep(3000);

		
		System.out.println(titlepage3);
		dr.navigate().forward();
		
		String titlepage4= dr.getTitle();
		Thread.sleep(3000);
		System.out.println(titlepage4);
		dr.navigate().refresh();


	


	}

}
