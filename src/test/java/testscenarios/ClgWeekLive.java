package testscenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClgWeekLive {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();

		// WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
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
