package day17;

import java.util.Arrays;

import org.junit.Test;

public class MergeTwoSortedLists {
	/*
	 * 21. Merge Two Sorted Lists
	 * https://leetcode.com/problems/merge-two-sorted-lists/
	 */

	@Test
	public void example() {
		int[] list1 = {1,2,4};
		int[] list2 = {1,3,4};
		mergeTwoSortedL( list1, list2);
		

	}

	private LearnLinkedList mergeTwoSortedL(int[] list1, int[] list2) {
		LearnLinkedList list = new LearnLinkedList();
		int j =0, i =0;
		while(i <= list1.length -1) {
			
			if (list1[i] == list2[j]) {
				list.insertFirst(list1[i]);
				list.insertFirst(list2[j]);
				i++;
				j++;
			}else if(list1[i] < list2[j]){
				list.insertFirst(list1[i]);
				list.insertFirst(list2[j]);
				i++;
				j++;
			}
		}
		list.display();
     return list;
		
	}
	
	
}
