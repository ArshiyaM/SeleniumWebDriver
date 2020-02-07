import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rmopuri\\Desktop\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/");
		//Thread.sleep(3000);
		//System.out.println(driver.getTitle());
		//driver.findElement(By.id("email")).sendKeys("Raham483@outlook.com");
		//driver.findElement(By.name("pass")).sendKeys("abdc$");
		//driver.findElement(By.linkText("Forgotten account?")).click();
		//driver.findElement(By.xpath("//*[@id='main-nav-top']//following-sibling::li/a[contains(text(),'Demo')]")).click();
		driver.findElement(By.linkText("Demo")).click();
		System.out.println("Clicked on DEMO");

	}

}
