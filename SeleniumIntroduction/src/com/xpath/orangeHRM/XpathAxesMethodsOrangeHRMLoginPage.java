package com.xpath.orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesMethodsOrangeHRMLoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rmopuri\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		
		//Login page- Finding text :: Finding XPath with text() method
		driver.findElement(By.xpath("//div[text()='LOGIN Panel']"));
		
		//Login page-Username :: Finding XPath with attributes
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin"); //Finding xpath with single attribute
		driver.findElement(By.xpath("//input[@id='txtUsername'][@type='text']")).sendKeys("Admin");//Finding xpath with multiple attributes
		
		//Login page-Forgot password? :: Finding XPath with contains() method
		driver.findElement(By.xpath("//*[contains(text(),'Forgot')]")).click();
		driver.findElement(By.xpath("")).sendKeys("");
		
		//Login page-Username :: Finding XPath with 'and' & 'or' methods
		driver.findElement(By.xpath("//input[@id='txtUsername' and @type='text']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtUsername' or @type='text']")).sendKeys("Admin");
		driver.findElement(By.xpath("")).sendKeys("");
		
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");

		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");

	}

}
