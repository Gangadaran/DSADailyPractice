package assessmentProblems;

import org.junit.Test;

public class MaxDifference {
	/*
	 * Given an array of integers, without reordering, determine the maximum
difference between any element and any prior smaller element. If there
is never a lower prior element, return -1.
Example
arr = [5, 3, 6, 7, 4]
There are no earlier elements than arr[0].
There is no earlier reading with a value lower than arr[1].
There are two lower earlier readings with a value lower than arr[2] = 6:
arr[2] - arr[1] = 6 - 3 = 3
arr[2] - arr[0] = 6 - 5 = 1
There are three lower earlier readings with a lower value than arr[3] = 7:
arr[3] - arr[2] = 7 - 6 = 1
arr[3] - arr[1] = 7 - 3 = 4
arr[3] - arr[0] = 7 - 5 = 2
There is one lower earlier reading with a lower value than arr[4] = 4:
arr[4] - arr[1] = 4 - 3 = 1
The maximum trailing record is arr[3] - arr[1] = 4
	 */
	@Test
	public void example() {
		int[] arr = {5, 3, 6, 7, 4};
		System.out.println(maxDifference(arr));
	}
	
	
	


	private int maxDifference(int[] arr) {
	        int maxDiff = -1;
	        int minElement = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            int diff = arr[i] - minElement;
	            if (diff > maxDiff) {
	                maxDiff = diff;
	            }
	            if (arr[i] < minElement) {
	                minElement = arr[i];
	            }
	        }

	        return maxDiff;
	        }

}
