package testscenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSample2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		driver.manage().window().maximize();
		//Wait for page load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//first name code
		
		//Wait for page load and check country drop down is visible or not?
		//until country drop down is visible, you have to wait...
		
		new Select(driver.findElement(By.id("country"))).selectByVisibleText("BANGLADESH");
	}

}
