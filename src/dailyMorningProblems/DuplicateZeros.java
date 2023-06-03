package dailyMorningProblems;

import java.util.Arrays;

import org.junit.Test;

public class DuplicateZeros {
	/*
	 * https://leetcode.com/problems/duplicate-zeros/description/
	 */
	@Test
	public void example() {
		int[] arr = {1,0,2,3,0,4,5,0};
		System.out.println(Arrays.toString(duplicateZeros(arr)));

	}

	public int[] duplicateZeros(int[] arr) {
		 int length = arr.length;
		    int zerosCount = 0;

		    // Count the number of zeros and update the length
		    for (int num : arr) {
		        if (num == 0) {
		            zerosCount++;
		            length++;
		        }
		    }

		    // Create a new array with the updated length
		    int[] newArr = new int[length];

		    // Calculate the index of the last element in the modified array
		    int lastIndex = length - zerosCount - 1;

		    // Iterate over the modified array from the last index to the beginning
		    for (int i = lastIndex; i >= 0; i--) {
		        if (arr[i] != 0) {
		            // Shift elements to the right
		            newArr[i + zerosCount] = arr[i];
		        } else {
		            // Duplicate the zero
		            newArr[i + zerosCount] = 0;
		            zerosCount--;
		            newArr[i + zerosCount] = 0;
		        }
		    }

		    return newArr;
	}



}
