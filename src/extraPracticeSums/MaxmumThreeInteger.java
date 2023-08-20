package extraPracticeSums;

public class MaxmumThreeInteger {
	public static void main(String[] args) {
		System.out.println(example());
		
	}
	
	private static String example() {
		int[] nums = {4,8,97,37,44,98,100};
		// output 100,98,97
		
		int firstMax = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
		
		for(int num:nums) {
			if (condition) {
				thirdMax = Math.max(thirdMax, num);
			}
			
			
		}
		
		return firstMax +" "+ secMax +" "+ thirdMax;

	}

}
