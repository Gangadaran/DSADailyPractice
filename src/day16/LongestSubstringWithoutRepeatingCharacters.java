package day16;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharacters {
 /*
  * 3. Longest Substring Without Repeating Characters
  * https://leetcode.com/problems/longest-substring-without-repeating-characters/
  */
	@Test
	public void example() {
	String s = "pwwkew";
    System.out.println(findLongestSub(s));
}
//pwwkew
private int findLongestSub(String s) {
	Set<Character> set = new HashSet<>();
	char[] array = s.toCharArray();
	int count =0;
for (int i = 0; i < array.length; i++) {
	
	set.add(array[i]); count++;
	if (set.contains(array[i])) {
		count =0;
	}
}
	
	return count;
	
}
public static void main(String[] args) {
	String s = "pwwkew";
	char[] array = s.toCharArray();
	Set<Character> set = new LinkedHashSet<>();
	for (Character character : array) {
		set.add(character);
	}
	
	
	System.out.println(set);
}
	
	
}
