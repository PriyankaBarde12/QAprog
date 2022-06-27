package com.testngprogram;

public class AmazonDemo {
	
		//public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
			/*FileInputStream fis =new FileInputStream("F:\\AutomationTesting\\Tq_sel.xlsx");
			//Workbook wb= WorkbookFactory.create(fis);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=(Sheet) wb.getSheet("sheet1");
			Row rw= ((org.apache.poi.ss.usermodel.Sheet) sh).getRow(1);
			String username=rw.getCell(1).getStringCellValue();
			String password=rw.getCell(2).getStringCellValue();
			long l=(long) rw.getCell(4).getNumericCellValue();
			System.out.println(username);
			System.out.println(password);
			System.out.println(l);*/
		@beforeclass 
		public void test() {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angel\\Downloads\\chromedriver.exe");
			WebDriver dr = new ChromeDriver();
			dr.navigate().to("https://www.amazon.in/");
			dr.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
			//Thread.sleep(2000);
			//dr.findElement(By.xpath("//div[@class='nav-signin-tooltip-footer']/a[@class='nav-a']")).click();
			dr.findElement(By.id("createAccountSubmit")).click();}
			@Test
			public void test1() {
			dr.findElement(By.id("ap_customer_name")).sendKeys("Priyanka Barde");
			dr.findElement(By.name("email")).sendKeys("8805432096");
			dr.findElement(By.id("ap_password")).sendKeys("priyanka99");
			dr.findElement(By.id("ap_password_check")).sendKeys("priyanka99");
			dr.findElement(By.id("continue"));
			}
			@Test
			public void test2() {
			Thread.sleep(1000);
			dr.findElement(By.id("ap_customer_name")).sendKeys("Priyanka Barde");
			dr.findElement(By.name("email")).sendKeys("8805432096");
			dr.findElement(By.id("ap_password")).sendKeys("priyanka99");
			dr.findElement(By.id("ap_password_check")).sendKeys("priyanka99");
			dr.findElement(By.id("continue"));}
		@Test
		public void test3() {
			Thread.sleep(1000);
			dr.findElement(By.id("ap_customer_name")).sendKeys("Priyanka Barde");
			dr.findElement(By.name("email")).sendKeys("8805432096");
			dr.findElement(By.id("ap_password")).sendKeys("priyanka99");
			dr.findElement(By.id("ap_password_check")).sendKeys("priyanka99");
			dr.findElement(By.id("continue"));}
			
			
			
			/*FileInputStream file= new FileInputStream("F:\\AutomationTesting\\AmazonBook.xlsx");
			Workbook wb= WorkbookFactory.create(file);
			Sheet sh =(Sheet) wb.getSheet("sheet1");
			//Row rw =((Sheet) sh).getRow(1);
			Row rw= ((org.apache.poi.ss.usermodel.Sheet) sh).getRow(1);
			String username= rw.getCell(1).getStringCellValue();
			long l= (long) rw.getCell(2).getNumericCellValue();
			
			//String mobno = rw.getCell(2).getStringCellValue();
			String password=rw.getCell(3).getStringCellValue();
			String confpass =rw.getCell(4).getStringCellValue();
			System.out.println(username);
			System.out.println(l);
			System.out.println(password);
			System.out.println(confpass);
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Angel\\Downloads\\chromedriver.exe");
			WebDriver dr=new ChromeDriver();
			dr.navigate().to("https://www.amazon.in/");
			*/

		}




}
