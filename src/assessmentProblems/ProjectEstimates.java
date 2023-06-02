package assessmentProblems;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ProjectEstimates {
	/*
	 * A number of bids are being taken for a project. Determine the number of
	 * distinct pairs of project costs where their absolute difference is some
	 * target value. Two pairs are distinct if they differ in at least one value.
	 */

	@Test
	public void example() {
		int[] costs = { 1, 3, 5 };
		int target = 2;
		System.out.println(findDistinct(costs, target));

	}

	private int findDistinct(int[] costs, int target) {
		Map<Integer, Integer> mp = new HashMap<>();
		int count = 0;
		for (int cost : costs) {
			int diff1 = cost - target;
			int diff2 = cost + target;

			if (mp.containsKey(diff1)) {
                count += mp.get(diff1);
			}
			if (mp.containsKey(diff2) && diff1 != diff2) {
				count += mp.get(diff2);
			}
			mp.put(cost, mp.getOrDefault(cost, 0) + 1);

		}
		return count;

	}

}
