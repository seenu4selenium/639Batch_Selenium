package testscenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsInSelenium {

	public static void main(String[] args)  {
		WebDriver driver ;
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/nalla/OneDrive/Desktop/Selenium/Exam_14Oct2022/QE%20-%20index.html");
		driver.manage().window().maximize();
		
		//Thread.sleep(14000);
		
		//implicit wait: wait for page load
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		//Explicit Wait: Wait until test5Button will be clickable?
		WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(20));
		ww.until(ExpectedConditions.elementToBeClickable(By.id("test5-button")));
		
		//Click on Test5 button
		driver.findElement(By.id("test5-button")).click();

	}

}
