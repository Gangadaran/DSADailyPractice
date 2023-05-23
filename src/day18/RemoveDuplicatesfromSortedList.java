package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import day17.LearnLinkedList;

public class RemoveDuplicatesfromSortedList {
	/*
	 * 83. Remove Duplicates from Sorted List
	 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
	 */
	@Test
	public void example() {
		int[] nums = { 1, 1, 2, 3, 3 };
		remove(nums);

	}

	private LearnLinkedList remove(int[] nums) {
		LearnLinkedList list = new LearnLinkedList();
		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
			set.add(num);
		}

		List<Integer> l = new ArrayList<>(set);

		for (int i = 0; i < l.size(); i++) {
			list.insertLast(l.get(i));
		}

		list.display();
		return list;

	}
}
