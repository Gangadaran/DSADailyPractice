package extraPracticeSums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class KidsWiththeGreatestNumberofCandies {
	/*
	 * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
	 */
	@Test
	public void example() {
		int [] candies = {2,3,5,1,3}; 
		int		extraCandies = 3;
		System.out.println(find1(candies, extraCandies));
	}

	private List<Boolean> find1(int[] candies, int extraCandies) {
		 int n = candies.length;
		    int maxCandies = 0;
		    List<Boolean> list = new ArrayList<>();;

		    
		    for (int i = 0; i < n; i++) {
		        maxCandies = Math.max(maxCandies, candies[i]);
		    }

		    
		    for (int i = 0; i < n; i++) {
		       
		        list.add((candies[i] + extraCandies) >= maxCandies);
		    }

		    return list;
	}

	private List<Boolean> find(int[] candies, int extraCandies) {
		List<Boolean> list = new ArrayList<>();
		boolean[] arr = new boolean[candies.length];
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < candies.length; i++) {
			int k = candies[i]+extraCandies;
			
				max = Math.max(k, max);
			
		}
		
		for (int i = 0; i < candies.length; i++) {
			arr[i] = (candies[i]+extraCandies)>=max;
		}
		
		for(boolean c:arr) {
			list.add(c);
		}
		
		return list;
	}

}
