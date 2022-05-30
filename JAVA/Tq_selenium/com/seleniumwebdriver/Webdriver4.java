package com.seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angel\\Downloads\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.navigate().to("https://www.flipkart.com");
		String pagesource = dr.getPageSource();
		System.out.println(pagesource);
		dr.close();
		dr.quit();

	}

}
