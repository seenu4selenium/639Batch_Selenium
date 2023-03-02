package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandle {
	@Test
	public void f() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
		// Get the alert text
		System.out.println(driver.switchTo().alert().getText());

		// To click on OK button on Alert
		driver.switchTo().alert().accept();

		Thread.sleep(3000);
		System.out.println("****************************");

		// Click on Third clickMe button
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		// Get the alert text
		System.out.println(driver.switchTo().alert().getText());
		// To click on CANCLE button on ConfirmationAlert
		driver.switchTo().alert().dismiss();
	}
}
