package testscenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllHyperLinks {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		// Findelements

		List<WebElement> allHyperLinks = driver.findElements(By.tagName("a"));
		System.out.println(allHyperLinks.size());

		// Print all Hyper Links from Google page
		for (int i = 0; i < allHyperLinks.size(); i++) {
			System.out.println(allHyperLinks.get(i).getText());
		}

	}

}
