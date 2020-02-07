package com.spicejet;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rmopuri\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		
		/**
		 *FROM 
		 */
		driver.findElement(By.xpath("//*[@id='fromCity']")).click();
		WebElement from = driver.findElement(By.xpath("//*[@placeholder='From']"));
		from.sendKeys("Hyderabad, India");
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//*[@class='code makeRelative']")).getText());
		//Thread.sleep(10000);
		
		/**
		 * TO
		 */
		driver.findElement(By.xpath("//*[@id='toCity']"));
		//Thread.sleep(5000);
		WebElement to = driver.findElement(By.xpath("//*[@placeholder='To']"));
		to.sendKeys("Delhi");
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//System.out.println(driver.findElement(By.xpath("//*[@class='fsw_inputField font30 lineHeight36 latoBlack']")).getText());
		//System.out.println(driver.findElement(By.xpath("//*[@class='code makeRelative']")).getText());
		Thread.sleep(10000);
		
		
		
		//driver.close();
	}

}
