package com.spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rmopuri\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		
//		/**
//		 * DYNAMIC DROP_DOWN selection with INDEX
//		 */
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		driver.findElement(By.xpath("//a[@value='IXL']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		
		/**
		 * DYNAMIC DROP_DOWN selection with PARENT-CHILD RELATIONSHIP XAPTH(Video-51)
		 */
		
		//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='COK']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='IXL']")).click();
		Thread.sleep(3000);
		System.out.println("HYD");
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
		Thread.sleep(3000);
		System.out.println("BLR");
		
		
		driver.close();
		
		
	}

}
