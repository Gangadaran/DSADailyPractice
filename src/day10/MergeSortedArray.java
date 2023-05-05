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
	int i = m-1;
	int j = n-1;
	int k = nums1.length-1;
		
		while(j >=0) {
		  if(i >= 0 && nums1[i] > nums2[j]) {
			  nums1[k] = nums1[i]; 
			  i--;
			  k--;
		  } else {
			  nums1[k] = nums2[j];
			  j--;
			  k--;
		  }
		}
	
}
	
}
