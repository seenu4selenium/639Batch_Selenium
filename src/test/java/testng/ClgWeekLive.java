package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClgWeekLive {
	WebDriver driver;

	@Parameters("browserName")
	@BeforeClass
	public void browser(String browserName) {
		// compare the browser name
		if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else {
			System.out.println("Please give browser data only edge/chrome/firefox");
		}
		driver.manage().window().maximize();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

	@Test
	public void f() throws Exception {

		driver.get("https://collegeweeklive.com/go-signup/");
		// Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		driver.findElement(By.id("firstName")).sendKeys("uvy");
		driver.findElement(By.id("firstName")).sendKeys("uvy");
		Thread.sleep(2000);

		driver.findElement(By.id("lastName")).sendKeys("patel");
		Thread.sleep(2000);

		driver.findElement(By.id("emailAddress")).sendKeys("asfrfgv@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.id("phoneNumber")).sendKeys("9876234312");
		Thread.sleep(2000);

		driver.findElement(By.id("password")).sendKeys("safrgasade");
		Thread.sleep(2000);

		driver.findElement(By.id("ConfirmPassword")).sendKeys("safrgasade");
		Thread.sleep(2000);
		driver.findElement(By.id("questions[q_135]")).click();
		driver.findElement(By.id("questions[q_136]")).click();
		driver.findElement(By.id("questions[q_137]")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
	}

}
