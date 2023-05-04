package day10;

import org.junit.Test;

public class ReverseWordsinaStringIII {
	/*
	 * 557. Reverse Words in a String III
	 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
	 */
	@Test
	public void example() {
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWordInString(s));

	}

	private String reverseWordInString(String s) {
		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			  char[] arr1 = arr[i].toCharArray();
			  int j =0, k =arr1.length-1;
			  while (j < k ) {
				char temp = arr1[j];
				arr1[j] = arr1[k];
				arr1[k] = temp;
				j++;
				k--;
			}
			  arr[i] = new String(arr1);
		}
		return String.join(" ", arr);
	}

}
