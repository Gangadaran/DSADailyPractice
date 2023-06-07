package extraPracticeSums;

import org.junit.Test;

public class MinimumRecolorstoGetKConsecutiveBlack {
	/*
	 * https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/
	 */
	
	@Test
	public void example() {
		String s = "WBBWWBBWBW";
		int k =7;
        System.out.println(find(s,k));
	}

	private int find(String s, int k) {
		StringBuilder sb = new StringBuilder();
		int count =0;
		for(char c:s.toCharArray()) {
			if (c=='W') {
				count++;
				sb.append("B");
				continue;
			}
			sb.append(c);
			int innerCount =0;
			for (int i = 0; i < sb.length(); i++) {
				
				if (sb.charAt(i)=='B') {
					innerCount++;
				}
				if (innerCount==k) {
					return count;
				}
			}
			
			
		}
		
		return -1;
		
	}
	public static void main(String[] args) {
		String s = "Ganga";
		s.replace('G', 'T');
		System.out.println(s);
	}

}
