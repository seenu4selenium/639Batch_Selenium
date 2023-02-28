package testscenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextSample {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fb.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		System.out.println(driver.findElement(By.className("_8eso")).getText());
		
		driver.get("https://collegeweeklive.com/go-signup/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		//Click on Submit button without fill any data
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("firstNameError")).getText());

		
	}

}
