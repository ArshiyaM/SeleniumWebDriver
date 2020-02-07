package com.spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEndSpiceJetApp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rmopuri\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		
		/**
		 * RoundTrip Radio Button 
		 */
		
		//1st way of validation
		WebElement radioText = driver.findElement(By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip_0']//following-sibling::label"));//Xpath for ONEWAY text
		String getRadioText = radioText.getText();
		String expectedRadioText = "One Way";
		Assert.assertEquals(getRadioText, expectedRadioText);
		System.out.println(getRadioText);
				
		/*//2nd way of validation		
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected());//Validation :: Makesure ONEWAY radio button is selected
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();//One Way
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();//Round Trip
		*/
		
		
		/**
		 * From and To AIRPORT selection
		 */
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='IXL']")).click();
		Thread.sleep(3000);
		System.out.println("Leh");
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
		Thread.sleep(3000);
		System.out.println("BLR");
		
		/**
		 * Check-Box selection
		 */
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		//Assert.assertFalse(false);
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		Thread.sleep(3000);
		
		/**
		 * Calender Validation :: Verifying that second calender enabled or not 
		 * when the user selects ROUND TRIP RADIO button
		 */
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("0.5")){
			System.out.println("One way selected");
			Assert.assertTrue(true);
			Thread.sleep(2000);
		} else
		{
			System.out.println("Return Date Calender Not enabled.. Makesure that"
					+ "Round Trip Radio Button has been selected");
			Assert.assertTrue(false);
			Thread.sleep(2000);
		}
		
		/**
		 * No of Passengers selection
		 */
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());//No of passengers displayed before Selecting Passengers
		Select s = new Select(driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_Adult']")));
		s.selectByIndex(3);
		s.selectByValue("4");
		s.selectByVisibleText("4");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());//No of passengers displayed after selecting the passenger
		
		/**
		 * Click Search Button
		 */
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(8000);
	}
	
	
	

}
