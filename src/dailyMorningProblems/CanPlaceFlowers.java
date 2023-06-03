package dailyMorningProblems;

import org.junit.Test;

public class CanPlaceFlowers {
	/*
	 * https://leetcode.com/problems/can-place-flowers/
	 */
	@Test
	public void example() {
		int[] arr = { 1,0,0,0,0,1};
		int n = 2;
		System.out.println(canPlaceFlowers1(arr, n));
		System.out.println(canPlaceFlowers(arr, n));
	}

	private boolean canPlaceFlowers1(int[] arr, int n) {
	    int count = 0;
	    int i = 0;
	    while (i < arr.length) {
	        if (arr[i] == 0 && (i == 0 || arr[i - 1] == 0) && (i == arr.length - 1 || arr[i + 1] == 0)) {
	        	arr[i] = 1;
	            count++;
	        }
	        if (count >= n) {
	            return true;
	        }
	        i++;
	    }
	    return false;
	}

	private boolean canPlaceFlowers(int[] arr, int n) {
		for (int i = 0; i < arr.length - 1; i++) {
			if ( arr[i] == 0 && (i == 0 || arr[i - 1] == 0) && (i == arr.length - 1 || arr[i + 1] == 0) ) {
				arr[i] = 1;
				n--;
			}
		}
		return n<=0;
	}
	

}
