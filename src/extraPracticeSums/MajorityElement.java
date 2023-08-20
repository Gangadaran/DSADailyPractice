package extraPracticeSums;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class MajorityElement {
	
	@Test
	public void example() {
		int[] nums = {3,2,3};
		System.out.println(find(nums));

	}

	private int find(int[] nums) {
		  Map<Integer,Integer> map = new HashMap<>();
		   for(int num:nums){
		       map.put(num,map.getOrDefault(num,0)+1);
		   }
		   
		    Iterator<Entry<Integer,Integer>> entries = map.entrySet().iterator();
		    int max =Integer.MIN_VALUE;
		    Entry<Integer,Integer> entry = null;
		    while(entries.hasNext()){
		         entry = entries.next();
		        max = Math.max(max,entry.getValue());
		        
		       
		        
		    }
		    
	     System.out.println(entry);
		    
		    
		    
		return max;
	}

}
