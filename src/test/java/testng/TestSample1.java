package testng;

import org.testng.annotations.Test;

public class TestSample1 {
	int i = 30;
	int j = 25;

	@Test
	public void findLargeNumber() {

		if (i > j) {
			System.out.println("i is large value");
		} else {
			System.out.println("j is large value");
		}
	}

	@Test
	public void addNum() {
		System.out.println(i + j);
	}

	@Test
	public void subNum() {
		System.out.println(i - j);
	}

	@Test
	public void mulNum() {
		System.out.println(i * j);
	}

}
