package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationMethodsISEnabled {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/nalla/Downloads/QE%20-%20index.html");
		driver.manage().window().maximize();


		if (driver.findElement(By.xpath("//*[@id=\"test-4-div\"]/button[1]")).isEnabled()) {
			System.out.println("First Button is Enabled state");
		} else {
			System.out.println("First Button is Disabled state");
		}
		if (driver.findElement(By.xpath("//*[@id=\"test-4-div\"]/button[2]")).isSelected()) {
			System.out.println("Second Button is Enabled state");
		} else {
			System.out.println("Second Button is Disabled state");
		}
	}

}
