package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Hyperlink {

	public static void main(String[] args) {
		//Open Browser
		WebDriver driver = new ChromeDriver();
		
		//Type URL into Browser
		driver.get("https://www.facebook.com/");
		
		//Click on Forgot password? hyperlink
		//driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.partialLinkText("ssw")).click();
		

	}

}
