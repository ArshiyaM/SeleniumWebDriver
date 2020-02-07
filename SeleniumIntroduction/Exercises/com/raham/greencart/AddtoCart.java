package com.raham.greencart;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddtoCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rmopuri\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);

		String[] requiredVegitables = { "Brocolli", "Cauliflower", "Cucumber" };
		int j=0;

		List<WebElement> vegitables = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < vegitables.size(); i++) {
			String[] vegitableNames = vegitables.get(i).getText().split("-");
			String formattedVegitablesName = vegitableNames[0].trim();
			System.out.println(formattedVegitablesName);
			List listOfRequiredVegitables = Arrays.asList(requiredVegitables);

			if (listOfRequiredVegitables.contains(formattedVegitablesName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==requiredVegitables.length)
					break;
			}
		}
	}

}
