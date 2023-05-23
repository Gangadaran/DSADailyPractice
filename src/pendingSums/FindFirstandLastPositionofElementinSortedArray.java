package pendingSums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindFirstandLastPositionofElementinSortedArray {
	/*
	 * 34. Find First and Last Position of Element in Sorted Array
	 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
	 */
	
	public void example() {
		int[] nums = {5,7,7,8,8,10};
		int target = 8;
		searchRange(nums, target);
	}

	public int[] searchRange(int[] nums, int target) {

	       /* PseudoCode:
	       intialize left and right pointers
	       Temp variable tp store the mid value
	       Initialse a boolean flag 

	       if mid = target check the flag = false 
	       assign the mid value to temp 
	       set mid-1 = right 

	       else set mid+1 = left and update temp value 

	    
	      */
	    
	      int leftIndex = findIndex(nums,target,false);
	      int rightIndex = findIndex(nums,target,true);
	      

	     return new int[]{leftIndex,rightIndex};

	        
	    }

	
	
	
	private int findIndex(int[] nums, int target, boolean flag) {
	
		
	    int left = 0;
	    int right = nums.length - 1;
	    int temp = -1;

	    while (left <= right) {
	        int mid = (left + right) / 2;

	        if (nums[mid] == target) {
	            temp = mid;
	            if (!flag) {
	                right = mid - 1;
	            } else {
	                left = mid + 1;
	            }
	        } else if (nums[mid] > target) {
	            right = mid - 1;
	        } else {
	            left = mid + 1;
	        }
	    }

	    return temp;
	}
	
	// 2 optimation
	public int[] searchRange1(int[] nums, int target) {
	    int left = 0;
	    int right = nums.length - 1;
	    int leftIndex = -1;
	    int rightIndex = -1;

	    while (left <= right) {
	        int mid = left + (right - left) / 2;

	        if (nums[mid] == target) {
	            leftIndex = mid;
	            rightIndex = mid;

	            // Find the leftmost index
	            while (leftIndex > 0 && nums[leftIndex - 1] == target) {
	                leftIndex--;
	            }

	            // Find the rightmost index
	            while (rightIndex < nums.length - 1 && nums[rightIndex + 1] == target) {
	                rightIndex++;
	            }

	            break;
	        } else if (nums[mid] > target) {
	            right = mid - 1;
	        } else {
	            left = mid + 1;
	        }
	    }

	    return new int[]{leftIndex, rightIndex};
	}
// 3 approach
	public int[] searchRange3(int[] nums, int target) {
	    int left = 0;
	    int right = nums.length - 1;
	    int leftIndex = findLeftIndex(nums, target, left, right);
	    int rightIndex = findRightIndex(nums, target, leftIndex, right);
	    return new int[]{leftIndex, rightIndex};
	}

	private int findLeftIndex(int[] nums, int target, int left, int right) {
	    int index = Arrays.binarySearch(nums, left, right + 1, target);
	    return (index >= 0) ? index : -1;
	}

	private int findRightIndex(int[] nums, int target, int left, int right) {
	    int index = Arrays.binarySearch(nums, left, right + 1, target);
	    if (index < 0) {
	        return -1;
	    }
	    while (index < right && nums[index + 1] == target) {
	        index++;
	    }
	    return index;
	}

	// 4th approach
	public int[] searchRange4(int[] nums, int target) {
	    List<Integer> indices = new ArrayList<>();
	    
	    for (int i = 0; i < nums.length; i++) {
	        if (nums[i] == target) {
	            indices.add(i);
	        }
	    }
	    
	    if (indices.isEmpty()) {
	        return new int[]{-1, -1};
	    }
	    
	    int leftIndex = indices.get(0);
	    int rightIndex = indices.get(indices.size() - 1);
	    
	    return new int[]{leftIndex, rightIndex};
	}

	
	    

}
