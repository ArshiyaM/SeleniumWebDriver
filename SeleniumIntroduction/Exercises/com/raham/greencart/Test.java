package com.raham.greencart;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rmopuri\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		
		String[] requiredVegitables = {"Cucumber","Tomato", "Carrot"};
		List<WebElement> listOfVeggies = driver.findElements(By.cssSelector("h4.productName"));
		int j=0;
		
		for(int i=0;i<listOfVeggies.size();i++) {
			String[] vegNames = listOfVeggies.get(i).getText().split("-");
			String formatedVegNames = vegNames[0].trim();
			
			List listOfReqVegtables = Arrays.asList(requiredVegitables);
			
			if(listOfReqVegtables.contains(formatedVegNames)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if(j==3) {
					break;
				}
			}
		
			
		}
	

		

	}
}
