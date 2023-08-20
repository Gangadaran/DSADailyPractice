package extraPracticeSums;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeros {
	@Test
	public void example() {
		int[] nums = {0,1,0,3,12};
		System.out.println(Arrays.toString(find(nums)));

	}

	private void find1(int[] nums) {
	     int left = 0;
	        int right = 0;

	        while (right < nums.length) {
	            if (nums[right] != 0) {
	                int temp = nums[left];
	                nums[left] = nums[right];
	                nums[right] = temp;
	                left++;
	            }
	            right++;
	        }
	}

	private int[] find(int[] nums) {
		int[] temp = new int[nums.length];
		int j =0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]!=0) {
				temp[j++] = nums[i];
			}
		}
		return temp;
	}

}
