package day10;

import org.junit.Test;

public class MergeSortedArray {
   /*
    * 88. Merge Sorted Array
    * https://leetcode.com/problems/merge-sorted-array/
    */
	@Test
	public void example() {
		int[] nums1 = {1,2,3,0,0,0};
		int m = 3;
		int[] nums2 = {2,5,6};
		int n = 3;
        mergeArray(nums1,m,nums2,n);
	}


	private void mergeArray(int[] nums1, int m, int[] nums2, int n) {
	    int[] temp = new int[m];
	    int[] temp1 = new int[n];
		for (int i = 0; i < m; i++) {
		  temp[i] = nums1[i];
	}
		for (int i = 0; i < n; i++, m++) {
			temp1[i]=nums2[i];
			
		}
		
		for(int k:temp) {
			System.out.println(k);
		}
	
}
	
}
