package Day2;

import org.junit.Test;

public class Removethefirstandlastoccurrence {
	@Test
	public void Example1() {
		int[] nums = {1,2,3,4,5,1};
		int noToRemove = 1;
		RemoveOccurrence(nums, noToRemove);
      
	}

	private int[] RemoveOccurrence(int[] nums, int noToRemove) {
		int[] temp = new int[nums.length-2];
		for (int i = 0; i <= nums.length-1; i++) {
			if(nums[i]!=noToRemove) {
				temp[i-1] = nums[i];
			}
			
		}
		for (int i = 0; i <= temp.length-1; i++) {
			System.out.println(temp[i]);
		}
		return temp;
	}

}
