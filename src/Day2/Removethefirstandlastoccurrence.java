package Day2;

import java.util.Arrays;

import org.junit.Test;

public class Removethefirstandlastoccurrence {
	@Test
	public void Example1() {
		int[] arr = {1,2,3,4,5,1};
		int num = 1;
		
		System.out.println(Arrays.toString(removeFirstLastOccurrence(arr, num)));
		
      
	}
	/*
	 * find the first and last occurrence of the given number using for loop
	 * the number is not found in the array, return the array
	 * Create the new array to store the first and last occurence of 1
	 * copy all the elements except for the first and last occurrence of the given number using for loop
	 * and finally return the new array 
	 */
	

	public static int[] removeFirstLastOccurrence(int[] arr, int num) {
		int firstIndex = -1;
		int lastIndex = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				if (firstIndex == -1) {
					firstIndex = i;
				}
				lastIndex = i;
			}
		}

		if (firstIndex == -1 || lastIndex == -1) {

			return arr;
		}

		int[] result = new int[arr.length - 2];
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i != firstIndex && i != lastIndex) {
				result[index++] = arr[i];
			}
		}

		return result;
	}




	    
	}



