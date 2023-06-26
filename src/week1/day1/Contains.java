package week1.day1;

import org.junit.Test;

public class Contains {
	@Test // positive
	public void example1() {
		int [] nums = {1,2,3,4,5};
		int noToFind = 3;
		
		aNumberToFind(nums, noToFind);
		System.out.println(aNumberToFind(nums, noToFind));

	}
	@Test // Edge
	public void example2() {
		int [] nums = {1,2,3,4,5};
		int noToFind = 6;
		
		aNumberToFind(nums, noToFind);

	}
	@Test // Negative
	public void example3() {
		int [] nums = {};
		int noToFind = 3;
		
		aNumberToFind(nums, noToFind);

	}

	private boolean aNumberToFind(int[] nums, int noToFind) {
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]== noToFind) {
				return true;
			}
		}
		return false;
	}

}
