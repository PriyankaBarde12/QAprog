package com.seleniumwebdriver;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multipletag1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angel\\Downloads\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.navigate().to("https://www.flipkart.com");
		dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		dr.navigate().to("https://www.naukri.com/");
		WebElement wb=dr.findElement(By.xpath("//div[text()='Companies']"));  
		Actions act=new Actions(dr);
		act.moveToElement(wb).build().perform();
		dr.findElement(By.linkText("Product based")).click();
		//dr.findElement(By.xpath("//div[text()='Login']")).click();

		
			Set<String> windowid=dr.getWindowHandles();
				Iterator<String> itr=windowid.iterator();
				String Parentid=itr.next();
				String childid1=itr.next();
				dr.switchTo().window(childid1);
				dr.findElement(By.xpath("//span[text()='Indian MNC (37)']/preceding-sibling::i")).click();
				dr.close();
				dr.switchTo().window(Parentid);
				dr.findElement(By.xpath("//div[text()='Login']")).click();
				WebElement ee= dr.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
				ee.sendKeys("bardepn1234@gmail.com");

		

	}

	private static void click() {
		// TODO Auto-generated method stub
		
	}

}
