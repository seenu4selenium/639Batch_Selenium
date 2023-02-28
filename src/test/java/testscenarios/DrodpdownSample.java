package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DrodpdownSample {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Click on Create new account button/link
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		
		//drodpdown code
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Mar");
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("18");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("1984");
	}

}
