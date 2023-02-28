package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethodsSample {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("email")).sendKeys("adgsdjhglsdgnsld");
		Thread.sleep(2000);

		//click on Refresh icon
		driver.navigate().refresh();
		Thread.sleep(2000);
		//Click on Back icon
		driver.navigate().back();
		Thread.sleep(2000);
		//Click on forward icon
		driver.navigate().forward();
		
	}

}
