package reworkproblems;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

public class MergeStringsAlternately {
	/*
	 * https://leetcode.com/problems/merge-strings-alternately/description/
	 */
	
	@Test
	public void example() {
		String word1 = "abc", word2 = "pqr";
		find(word1,word2);

	}

	private void find(String word1, String word2) {
		StringBuilder sb = new StringBuilder();
	    int i =0, j=0;
	    while(i < word1.length() || j < word2.length() ) {
	    	sb.append(word1.charAt(i++));
	    	sb.append(word2.charAt(j++));
	    }
		
	    System.out.println(sb);
	}

}
