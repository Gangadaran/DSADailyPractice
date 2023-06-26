package extraPracticeSums;

import org.junit.Test;

public class CandySum {

	@Test
	public void example() {
		int[] nums = { 5, 5, 5, 10, 10, 20,10 };
		System.out.println(find(nums));

	}

	private boolean find(int[] nums) {
		int fCount = 0;
		int tCount = 0;
		int twCount = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 5) {
				fCount++;
			} else if (nums[i] == 10) {
				if (fCount > 0) {
					fCount--;
					tCount++;
				} else {
					return false; 
				}
			} else if (nums[i] == 20) {
				if (tCount > 0 && fCount > 0) {
					tCount--;
					fCount--;
				} else if (fCount >= 3) {
					fCount -= 3;
				} else {
					return false; 
				}
			}
		}
		return true;
	}

}
