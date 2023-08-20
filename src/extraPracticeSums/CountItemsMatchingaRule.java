package extraPracticeSums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CountItemsMatchingaRule {
	
	/*
	 * https://leetcode.com/problems/count-items-matching-a-rule/
	 */
	
	@Test
	public void example() {
		List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));
        String ruleKey = "color", ruleValue = "silver";
        System.out.println(find(items, ruleKey, ruleValue));
	}

	private int find(List<List<String>> items, String ruleKey, String ruleValue) {
		int count =0;
		for(List<String> c: items ) {
			String type = c.get(0);
			String color = c.get(1);
			String name = c.get(2);
			
			if ((ruleKey.equals("type") && ruleValue.equals(type))
	                || (ruleKey.equals("color") && ruleValue.equals(color))
	                || (ruleKey.equals("name") && ruleValue.equals(name))) {
	                count++;
	            }
		}
		return count;
	}

	

}
