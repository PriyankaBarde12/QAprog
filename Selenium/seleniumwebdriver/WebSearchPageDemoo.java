package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSearchPageDemoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angel\\Downloads\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.navigate().to("https://www.google.com/");
		dr.findElement(By.name("q")).sendKeys("Java");
		dr.findElement(By.xpath("//div[@class='wM6W7d']/span[text()='java']/b[text()='tpoint']")).click();
		dr.findElement(By.xpath("//div/a/h3[text()='Javatpoint: Tutorials List']")).click();
		dr.close();
		//dr.navigate().to("https://www.google.com/");
	}

}
