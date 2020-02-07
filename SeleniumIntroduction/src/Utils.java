import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {
	/**
	 * Code for Check Box
	 * 
	 * @param strVal
	 */
	public static void checkBoxSelection(String strVal,String stepName) {

		List<WebElement> list = Data.driver.findElements(By.xpath("//*[@type='checkbox']"));
		int checkBoxSize = list.size();

		for (int i = 0; i <checkBoxSize; i++) {

			String str = list.get(i).getAttribute("value");

			if (strVal.equalsIgnoreCase(str)) {

				list.get(i).click();
				System.out.println(stepName);
			}
			
		}
	}
	/**
	 * Radio Button
	 * @param by
	 * @throws InterruptedException 
	 */
	public static void clickRadioButton(String radioBtn) throws InterruptedException {
		List<WebElement> radioBtnList = Data.driver.findElements(By.xpath("//*[@type='radio']"));
		int noOfRadioButtons = radioBtnList.size();
		
		for(int i=0;i<=noOfRadioButtons-1;i++) {
			String strVal = radioBtnList.get(i).getAttribute("value");
			if(radioBtn.equalsIgnoreCase(strVal)) {
				radioBtnList.get(i).click();
				Thread.sleep(2000);
			}
			
		}
	}
	
	public static void radioTest() throws InterruptedException {
		String btnName = "radio";
		// Spelling creation for each radio button: radio1,radio2,radio3.
		for (int i = 1; i <= 3; i++) {
			String valueAttrName = btnName + i;
			//Thread.sleep(3000);
			System.out.println("Arshu :: Dynamic Radio Name " + valueAttrName);
			List<WebElement> radioBtnList = Data.driver.findElements(By.xpath("//*[@type='radio']"));
			int noOfRadioButtons = radioBtnList.size();
			System.out.println("Arshu :: No of elements " + noOfRadioButtons);
			Thread.sleep(3000);
			// For each radio, do the click and sleep
			for (int j = 0; j < noOfRadioButtons; j++) {
				String strVal = radioBtnList.get(j).getAttribute("value");
				if (valueAttrName.equalsIgnoreCase(strVal)) {
					radioBtnList.get(j).click();
					Thread.sleep(2000);
				}
			}
		}

	}
	

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

	public static void clickWebElement(By by) {
		WebElement element = Data.driver.findElement(by);
		if (element.isEnabled() && element.isDisplayed() && element != null) {
			element.click();
		} else {
			System.out.println("Element not found");
		}
	}
	
	public static void closeBrowse() {
		Data.driver.close();
	}

}
