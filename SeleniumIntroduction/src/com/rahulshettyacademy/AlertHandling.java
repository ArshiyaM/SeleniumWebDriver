package com.rahulshettyacademy;

import org.openqa.selenium.By;

public class AlertHandling {
	public static void main(String[] args) throws InterruptedException {
		UtilsRS.chooseBrowser("chrome");
		
		Data.driver.findElement(By.id("name")).sendKeys("Raham");
		UtilsRS.sleep();
		
		/**
		 * Accept alert window
		 */
		Data.driver.findElement(By.id("alertbtn")).click();
		System.out.println(Data.driver.switchTo().alert().getText());
		Data.driver.switchTo().alert().accept();
		UtilsRS.sleep();
		
		/**
		 * Dismiss alert window
		 */
		Data.driver.findElement(By.id("confirmbtn")).click();
		System.out.println(Data.driver.switchTo().alert().getText());
		Data.driver.switchTo().alert().dismiss();
		UtilsRS.sleep();
	}

}
