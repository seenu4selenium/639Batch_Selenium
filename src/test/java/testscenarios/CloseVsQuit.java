package testscenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuit {

	public static void main(String[] args) throws Exception  {
		WebDriver driver ;
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		//click on New Window button
		driver.findElement(By.id("windowButton")).click();
		
		
		Thread.sleep(4000);
		
		//Close
		//driver.close();
		driver.quit();
		
	}
}
