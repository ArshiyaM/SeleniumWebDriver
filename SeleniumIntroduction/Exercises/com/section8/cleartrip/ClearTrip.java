package com.section8.cleartrip;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ClearTrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rmopuri\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");

		// Create a map to store preferences
		Map<String, Object> prefs = new HashMap<String, Object>();

		// add key and value to map as follow to switch off browser notification
		// Pass the argument 1 to allow and 2 to block
		prefs.put("profile.default_content_setting_values.notifications", 2);

		// Create an instance of ChromeOptions
		ChromeOptions options = new ChromeOptions();

		// set ExperimentalOption - prefs
		options.setExperimentalOption("prefs", prefs);

		// Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize
		// chrome driver which will switch off this browser notification on the chrome
		// browser
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com");
		Thread.sleep(3000);
		/**
		 * Radio Button Selection
		 */
		driver.findElement(By.xpath("//*[@id='OneWay']")).click();
		WebElement radioText = driver.findElement(By.xpath("//*[@id='OneWay']//following-sibling::strong"));
		String getOnewayRadioText = radioText.getText();
		String expectedOnewayText = "One way";
		Assert.assertEquals(getOnewayRadioText, expectedOnewayText);
		System.out.println("Selected Radio Button  = " + getOnewayRadioText);

		/**
		 * From
		 */
		WebElement from = driver.findElement(By.xpath("//*[@id='FromTag']"));
		from.sendKeys("Hyd");
		Thread.sleep(5000);
		from.sendKeys(Keys.ENTER);
		// System.out.println("From Value = " +
		// driver.findElement(By.xpath("//*[@id='From']")).getAttribute("value"));

		WebElement originName = driver.findElement(By.xpath("//*[@id='From']"));
		String getOriginName = originName.getAttribute("value");
		String expectedOriginName = "HYD";
		Assert.assertEquals(getOriginName, expectedOriginName);
		System.out.println("From Value = " + getOriginName);

		/**
		 * TO
		 */
		WebElement to = driver.findElement(By.id("ToTag"));
		to.sendKeys("New");
		Thread.sleep(4000);
		to.sendKeys(Keys.ENTER);
		// System.out.println("To Value = " +
		// driver.findElement(By.xpath("//*[@id='To']")).getAttribute("value"));

		WebElement destName = driver.findElement(By.xpath("//*[@id='To']"));
		String getDestName = destName.getAttribute("value");
		String expectedDestName = "DEL";
		Assert.assertEquals(getDestName, expectedDestName);
		System.out.println("To Value = " + getDestName);

		/**
		 * Calender:: Today date selection
		 */
		// driver.findElement(By.xpath("//*[@id='DepartDate']")).click();
		// driver.findElement(By.id("DepartDate")).sendKeys(Keys.ENTER);
		// Thread.sleep(2000);
		// System.out.println("Departure Date = " +
		// driver.findElement(By.id("FromDate")).getAttribute("value"));

		/**
		 * Calender :: Next Day date selection
		 */

		WebElement departDate = driver.findElement(By.xpath("//*[@id='DepartDate']"));
		departDate.sendKeys(Keys.ARROW_RIGHT);
		departDate.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		System.out.println("Departure Date = " + driver.findElement(By.id("FromDate")).getAttribute("value"));

		/**
		 * Adults selection from drop-down
		 */
		WebElement adultDropDown = driver.findElement(By.id("Adults"));
		adultDropDown.click();
		Select adultSelection = new Select(adultDropDown);

		// WebElement test = adultSelection.getFirstSelectedOption();
		// String selectedValue = test.getText();
		// System.out.println("No of adults selected = " +selectedValue);

		adultSelection.selectByIndex(4);
		System.out.println("No of adults selected = " + driver.findElement(By.xpath("//*[text()='5']")).getText());

		/**
		 * Search Flight
		 */
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println("Clicked on Search Flights button");
	}

}
