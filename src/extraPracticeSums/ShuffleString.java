package extraPracticeSums;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ShuffleString {
	/*
	 * https://leetcode.com/problems/shuffle-string/
	 */
	@Test
	public void example() {
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,2,1,3};
		System.out.println(find(s,indices));
	}

	private String find(String s, int[] indices) {
		
		Map<Integer,Character> map = new HashMap<>();
		for (int i = 0; i < indices.length; i++) {
			map.put(indices[i], s.charAt(i));
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < indices.length; i++) {
			sb.append(map.get(i));
		}
		
		return sb.toString();
	}

}
