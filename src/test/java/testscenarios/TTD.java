package testscenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TTD {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tirupatibalaji.ap.gov.in/#/login");
		// to maximize the screen when the command is executed.
		driver.manage().window().maximize();
		// implicit wait: wait for page load.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(5000);

		// DOB calender
		driver.findElement(By.id("regdob")).click();
		Thread.sleep(2000);

		// Year
		new Select(driver.findElement(By.xpath("/html/body/div[18]/div/div[2]/div/div/select[2]")))
				.selectByVisibleText("2021");
		// month
		new Select(driver.findElement(By.xpath("/html/body/div[18]/div/div[2]/div/div/select[1]")))
				.selectByVisibleText("November");

		// DAte
		driver.findElement(By.linkText("14")).click();

	}

}
