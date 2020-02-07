package com.rahulshettyacademy;

import org.openqa.selenium.chrome.ChromeDriver;

public class UtilsRS {

	public static void chooseBrowser(String browserName) throws InterruptedException {
		switch (browserName.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\rmopuri\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
			Data.driver = new ChromeDriver();
			Data.driver.manage().window().maximize();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\rmopuri\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
			Data.driver = new ChromeDriver();
			Data.driver.manage().window().maximize();
			break;
		default:
			System.out.println("None of the browser been selected");
			break;
		}
		Data.driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
	}
	
	public static void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}

}
