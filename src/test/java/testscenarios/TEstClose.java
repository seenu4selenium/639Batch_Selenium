package testscenarios;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEstClose {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		//Close
		driver.close();
		//driver.quit();		
	}

}
