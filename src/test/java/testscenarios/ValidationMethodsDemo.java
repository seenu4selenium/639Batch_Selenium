package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationMethodsDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignUp.aspx");
		driver.manage().window().maximize();

		// Validate the checkbox is selected or not?
		if (driver.findElement(By.id("checkbox1")).isSelected()) {
			System.out.println("Subscribe for monthly newsletters checkbox is selected by default");
		} else {
			System.out.println("Subscribe for monthly newsletters checkbox is NOT selected by default");
		}
		//terms & conditions checkbox is selected or not?
		if (driver.findElement(By.id("checkbox")).isSelected()) {
			System.out.println("terms & conditions  checkbox is selected by default");
		} else {
			System.out.println("terms & conditions  checkbox is NOT selected by default");
		}
	}

}
