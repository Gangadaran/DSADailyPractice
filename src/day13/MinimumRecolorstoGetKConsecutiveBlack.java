package day13;



import org.junit.Test;

public class MinimumRecolorstoGetKConsecutiveBlack {
	/*
	 * 2379. Minimum Recolors to Get K Consecutive Black
	 * https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/
	 */
	
//	@Test
//	public void example() {
//		String blocks = "WBBWWBBWBW";
//		int k =7;
//		System.out.println(recolorsToGetK(blocks, k));
//		
//		
//
//	}
	@Test
	public void example1() {
		String blocks = "WBWBBBW";
		int k =2;
		System.out.println(recolorsToGetK(blocks, k));
		
		

	}

	private int recolorsToGetK(String blocks, int k) {
	    int count = 0;
	   

	    for (int i = 0; i < k; i++) {
	        if (blocks.charAt(i) == 'B') {
	            count++;
	        }
	    }

	    if (count == k) {
	        return 0;
	    }

	    char[] arr = blocks.toCharArray();
	   int count1 =0;
	   for (int i = 0; i < k; i++) {
		if (arr[i]!='B') {
			arr[i] ='B';
			count1++;
		}
	}
	   
	   return count1;
	}


}
