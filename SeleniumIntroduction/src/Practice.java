import org.openqa.selenium.By;

public class Practice {


	public static void main(String[] args) throws InterruptedException {
		
		Utils.chooseBrowser("chrome");
		/*
		 * Check Box
		 */
		Utils.checkBoxSelection("option1","Clikcing the check box one");
		Utils.checkBoxSelection("option2","Clikcing the check box two");
		Utils.checkBoxSelection("option3","Clikcing the check box third");
		
		/**
		 * Radio Button
		 */
		/*
		 * Utils.clickRadioButton("radio1"); Utils.clickRadioButton("radio2");
		 */
		
		Utils.radioTest();
		
		/**
		 * Clicking Link on top-right corner
		 */
		//Utils.clickWebElement(By.xpath("//*[@class='blinkingText']"));
		
		Utils.closeBrowse();
	}

	
}
/*
 * WebElement ele = driver.findElement(By.xpath("//*[@id='checkBoxOption1']"));
 * if(ele.isSelected()) {
 * System.out.println("Validation :: Element is selected"); } else {
 * System.out.println("Validation :: Element is un-selected"); }
 * 
 * 
 * WebElement ele1 = driver.findElement(By.xpath("//*[@id='checkBoxOption1']"));
 * if(ele1.isSelected()!=true) {
 * 
 * ele1.click(); System.out.println("Element is selected");
 * 
 * }else { System.out.println("Element is not selected"); } Thread.sleep(3000);
 * 
 * 
 * Assert.assertTrue(driver.findElement(By.xpath("//*[@id='checkBoxOption2']")).
 * isEnabled());
 * driver.findElement(By.xpath("//*[@id='checkBoxOption2']")).click();
 * Thread.sleep(3000);
 * 
 * Assert.assertFalse(driver.findElement(By.xpath("//*[@id='checkBoxOption3']"))
 * .isEnabled()!=true);
 * driver.findElement(By.xpath("//*[@id='checkBoxOption3']")).click();
 */
