package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsInTestNG {
	@Test
	public void f() throws Exception {
//		int a = 23;
//		int b = 89;

		System.out.println("Begining of program");

		// Hard Assertion
		// Assert.assertEquals(a, b);

		WebDriver driver = new ChromeDriver();
//		driver.get("https://collegeweeklive.com/go-signup/");
//		Thread.sleep(6000);
//		// Click on Submit button without fill any data and get the firstname error
//		// message
//		driver.findElement(By.id("submit")).click();
//		Thread.sleep(2000);
//
//		// Check FirstName error meg is as expected
//		Assert.assertEquals("Please enter your first name.",
//				driver.findElement(By.className("formValidationMessage")).getText());
//		// Assert.assertEquals(ExpectedResults, ActualResults);
//
//		System.out.println("End of program, Test case is PASS");

		// Verify Paul home page has displayed?
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(6000);
		String abc = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).getText();
		System.out.println(abc);
		
		String expectedName = "Paul Collingss";
		
		//Assert.assertEquals(expectedName, abc);
		
		SoftAssert s = new SoftAssert();
		s.assertEquals(expectedName, abc);
		
		System.out.println("Test case pass");
		
		s.assertAll();

	}
}
