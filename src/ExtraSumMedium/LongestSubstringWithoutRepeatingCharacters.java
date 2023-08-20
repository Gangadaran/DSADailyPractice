package ExtraSumMedium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharacters {
	
	/*
	 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
	 */
	
	@Test
	public void example() {
		String s ="aab";
		System.out.println(find1(s));

	}

	private int find1(String s) {
		  int maxLength = 0;
	        int left = 0;
	        int right = 0;
	        HashSet<Character> characters = new HashSet<>();

	        while (right < s.length()) {
	            if (!characters.contains(s.charAt(right))) {
	                characters.add(s.charAt(right));
	                maxLength = Math.max(maxLength, characters.size());
	                right++;
	            } else {
	                characters.remove(s.charAt(left));
	                left++;
	            }
	        }

	        return maxLength;
	}

	private int find(String s) {
		List<Character> list = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		int count =1;
		if(s.isEmpty()) return 0;
		if (s.length()==1) return 1;
		
			
		
		
		for(int i=0;i<s.length()-1;) {
			list.add(s.charAt(i));
			if (list.contains(s.charAt(i+1))) {
			  i++;
			  list.clear();
			  count =1;
			  continue;
			}
			i++;
			count++;
			max = Math.max(max, count);  
		}
		return max;
	}

}
