package day6;

import java.util.Iterator;

import org.junit.Test;

public class HappyNumber {
	/* https://leetcode.com/problems/happy-number/
	 * Write an algorithm to determine if a number n is happy.

     * A happy number is a number defined by the following process:

     * Starting with any positive integer, replace the number by the sum of the squares of its digits.
     * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
     * Those numbers for which this process ends in 1 are happy.
     * Return true if n is a happy number, and false if not.
	 */
	@Test
	public void example() {
		int n = 19;
		System.out.println(solution(n));
	}
	
	private boolean solution(int n) {
		
		while(n>6) {
			int sum = 0;
			int temp = n;
			while(temp>0) {
				sum +=(temp%10)*(temp%10); // sum = sum + (temp%10)*(temp%10);
				temp /=10;                 // temp = temp / 10;
			}
			n=sum;
		}
        return (n==1) ? true : false; // if(n==1){ return true} return false;
        
	}
		
	
	public static void main(String[] args) {
		int[] nums  = {1,2,3,4,5};
		int[] nums1 =new int[5];
		for (int i = 0; i < nums.length; i++) {
			nums1[i] = nums[i];
		}
		for(int c:nums1) {
			System.out.println(c);
		}
		
	}
		
		
		
	}
	
	


