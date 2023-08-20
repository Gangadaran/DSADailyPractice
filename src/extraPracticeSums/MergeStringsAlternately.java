package extraPracticeSums;

import org.junit.Test;

public class MergeStringsAlternately {
	/*
	 * https://leetcode.com/problems/merge-strings-alternately/
	 */

	@Test
	public void example() {
		String word1 = "abc", word2 = "pqr";
		System.out.println(find(word1,word2));

	}

	private String find(String word1, String word2) {
		StringBuilder sb = new StringBuilder();
		char[] arr = word1.toCharArray();
		char[] arr1 = word2.toCharArray();
	    int i=0,j=0;
	    
	    while(i < arr.length && j < arr1.length) {
	    	sb.append(arr[i++]);
	    	sb.append(arr1[j++]);
	    }
	    
	    while(i < arr.length) {
	    	sb.append(arr[i++]);
	    }
	    while(j < arr1.length) {
	    	sb.append(arr1[j++]);
	    }
	return sb.toString();	
	}
}
