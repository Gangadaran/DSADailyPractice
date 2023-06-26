package week1.day3;

import org.junit.Test;

public class PowerOfTwo {
	@Test // Positive
	public void example() {
		int num = 6;
		System.out.println(powerOfTwo(num));
	}

	@Test // Edge
	public void example1() {
		int num = -56;
		System.out.println(powerOfTwo(num));
	}

	@Test // Negative
	public void example2() {
		int num = -33;
	powerOfTwo(num);
	}

	private boolean powerOfTwo(int num) {
		if (num < 1) {
			return false;
		}
		int i = 0;
		while (i <= num) {
			if (i == num) {
				return true;
			}
			i = i * 2;
		}
		return false;

	}
	
}
