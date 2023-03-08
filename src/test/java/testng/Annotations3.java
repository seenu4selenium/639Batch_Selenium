package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Annotations3 {
	@Test // Actual test functional step
	public void f() {
		System.out.println(" @Test f");
	}

	@BeforeClass // Pre-condition of @Test Annotation
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}

	@AfterClass // Post-condition of @Test Annotation
	public void afterClass() {
		System.out.println("@AfterClass");
	}

}
