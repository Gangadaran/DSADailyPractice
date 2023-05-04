package day8_03_05_23;

import org.junit.Test;

public class ShortestDistanceToCharacter {
	/*
	 * 821. Shortest Distance to a Character
	 * https://leetcode.com/problems/shortest-distance-to-a-character/
	 */
	@Test
	public void example1() {
		String s = "loveleetcode";
		char c = 'e';
		findShortestDistance(s,c);

	}

	public int[] findShortestDistance(String s, char c) {
		 int[] arr=new int[s.length()];
	        for(int i=0;i<s.length();i++)
	        {
	            int left=i-1;
	            int right=i+1;
	            while(left>=0 || right <s.length())
	            {
	                if(s.charAt(i)==c)
	                {
	                    arr[i]=0;
	                    break;
	                }
	                
	                if(right < s.length() && s.charAt(right) == c)
	                {
	                    arr[i]=right-i;
	                    break;
	                }
	                if( left >= 0 && s.charAt(left)== c)
	                {
	                    arr[i]=i-left;
	                    break;
	                }
	                left--;
	                right++;
	            }
	        }
	        for (int i : arr) {
				System.out.println(i);
			}
	         return arr;
	    }


}
