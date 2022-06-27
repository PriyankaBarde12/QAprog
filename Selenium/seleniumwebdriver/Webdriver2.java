package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angel\\Downloads\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.navigate().to("https://www.flipkart.com");
		Thread.sleep(3000);
		String titlepage1= dr.getTitle();
		System.out.println(titlepage1);
		dr.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		
		Thread.sleep(3000);
		dr.findElement(By.xpath("//div[text()='Grocery']"));
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
