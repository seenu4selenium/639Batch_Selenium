package testscenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_8_3 {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://stqatools.com/demo/Alerts.php");
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		 driver.findElement(By.id("jbalert")).click();
		// When Webdriver click method is not working, we have to use JavascriptExecutor
		// click method
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("arguments[0].click();", driver.findElement(By.id("jbalert")));
		Thread.sleep(2000);

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		driver.findElement((By.id("jcalert"))).click();
		Thread.sleep(2000);

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		driver.findElement(By.id("jpalert")).click();
		Thread.sleep(2000);

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

	}
}
