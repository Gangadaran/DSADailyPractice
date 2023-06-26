package extraPracticeSums;

import org.junit.Test;

public class MaximumNumberofWordsFoundinSentences {

	/*
	 * https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
	 */
	
	@Test
	public void example() {
		String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(find(sentences));
	}

	private int find(String[] sentences) {
		int max = 0;
		for (String string : sentences) {
			String[] split = string.split(" ");
			max = Math.max(split.length, max);
		}
		
		return max;
	}
}
