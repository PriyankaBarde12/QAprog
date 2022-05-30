		package com.testngprogram;

		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.testng.annotations.AfterClass;
		import org.testng.annotations.AfterMethod;
		import org.testng.annotations.BeforeClass;
		import org.testng.annotations.BeforeMethod;
		import org.testng.annotations.Test;

		public class UserDetail {
			WebDriver dr;
			@BeforeClass
			public void beforeclass(){
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angel\\Downloads\\chromedriver.exe");
				//Launch Browser
				 dr = new ChromeDriver();
				
			}
			@BeforeMethod
			public void beforemethod() {
				//implicit //div/div[@class='components_button withPlusIcon']
				dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS)	;
				dr.manage().window().maximize();
				//pass url
				dr.get("https://online.actitime.com/pbarde");
				//Identify username field
				dr.findElement(By.id("username")).sendKeys("bardepn12@gmail.com");
				dr.findElement(By.name("pwd")).sendKeys("rPrT3ath",Keys.ENTER);
				//dr.findElement(By.id("loginButton")).click();
				}
			@Test
			public void userde() {
			dr.findElement(By.xpath("//a/div[text()='Users']")).click();
			dr.findElement(By.xpath("//div[text()='New User']")).click();
			dr.findElement(By.id("createUserPanel_firstNameField")).sendKeys("priyankaa");
			dr.findElement(By.id("popup_menu_support_lastNameInviteMenu")).sendKeys("b");
			dr.findElement(By.id("createUserPanel_emailField")).sendKeys("bardepn12@gmail.com");
			dr.findElement(By.xpath("//div[@class='simpleListMenuButton components_userGroupSelectorMenu emptyList notEmpty']")).click();
			dr.findElement(By.id("//div[@class='itemsContainer']/div[text()='Quality Control']")).click();
			dr.findElement(By.id("ext-gen610")).click();
			dr.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
			String ActualResultu = dr.findElement(By.xpath("//div[contains(text(),'The invitation has been sent to the user's email address: bardepn12@gmail.com')]")).getText(); 
			System.out.println("actual : "+ActualResultu);
			dr.findElement(By.xpath("//div[@class='createUserPanel_accountCreatedContainer']/div[@class='closeLink']")).click();
		
			}
			
			
				@AfterMethod
			public void aftermethod() {
				//dr.findElement(By.id("logoutLink")).click();
				dr.close();
			
			}
			@AfterClass
			public void afterclass() {
				dr.close();
			}

		}


