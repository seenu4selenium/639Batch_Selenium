package testng;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TakeScreenshotSample {
	@Test
	public void f() throws InterruptedException, Exception {

		WebDriver driver = new ChromeDriver();
		//driver.get("https://fb.com");

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("Admin");

		
		//timeStamp
		Date currentDate = new Date();
		DateFormat df = new SimpleDateFormat("MMMddyyyy_HHmmss");
		System.out.println(df.format(currentDate));
		
		// TakesScreenshot is an interface developed by selenium people
		// : Capture the screenshot and store it in the specified location.
		// Take screenshot and store it into RAM location
		File abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// send screenshot to specified location.
		FileHandler.copy(abc, new File(".\\Screenshots\\test"+df.format(currentDate)+".png"));
//testMar022023_212832.png
	}
}
