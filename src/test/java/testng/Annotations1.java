package testng;

import org.testng.annotations.Test;

public class Annotations1 {
	@Test(priority = 2)
	public void k() {
		System.out.println("@Test k");
	}

	@Test(priority = 1)
	public void y() {
		System.out.println("@Test y");
	}

	@Test(priority = 3)
	public void b() {
		System.out.println("@Test b");
	}

	@Test(priority = 4)
	public void f() {
		System.out.println("@Test f");
	}

}
