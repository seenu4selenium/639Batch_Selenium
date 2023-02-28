package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_login {

	public static void main(String[] args) {
		//Open Browser
		WebDriver driver = new ChromeDriver();
		
		//Type URL into Browser
		driver.get("https://www.facebook.com/");
		
		
		//Send dummy data into email and password editboxes
		driver.findElement(By.id("email")).sendKeys("Hi639BatchPpl@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("asdfdsgsf");
		
		//Click on Login button
		driver.findElement(By.name("login")).click();
		

	}

}
