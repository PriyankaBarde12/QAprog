package com.seleniumwebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angel\\Downloads\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		//implicit
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		dr.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
		//move the control to alertbox
		dr.findElement(By.id("alertBox")).click();
		Alert alt=dr.switchTo().alert();
		String alttext=alt.getText();
		
		//get text on alert
		System.out.println(alttext);
		alt.accept();
		Thread.sleep(3000);
		//click on cancel button alert
		dr.findElement(By.id("confirmBox")).click();
		Alert alt1=dr.switchTo().alert();
		alt1.dismiss();
		dr.findElement(By.id("promptBox")).click();
		Alert alt2=dr.switchTo().alert();
		alt2.sendKeys("SeleniumWeddriver");
		//Thread.sleep(3000);
		alt2.accept();
		
		
		dr.findElement(By.id("confirmBox")).click();

	}

}
