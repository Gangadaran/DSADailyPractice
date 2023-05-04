package day9;

 

import org.junit.Test;



public class DuplicateZeros {
/*
 * 1089. Duplicate Zeros
 * https://leetcode.com/problems/duplicate-zeros/description/
 */
	@Test
	public void example1() {
		int[] arr = {1,0,2,3,0,4,5,0};
		zeros(arr);

	}

  private void zeros(int[] arr) {
	  int[] output = new int[arr.length];
	  int prev = 0;
	 for(int i = 0 ; i<arr.length;i++){
	     if(prev>=arr.length) break;
	     if(arr[i] != 0){
	         output[prev++] = arr[i];            
	     }else{
	         output[prev++] = 0;
	     if(prev>=arr.length) break;
	       output[prev++] = 0;
	     }
	     int k =0;
	     for (int j : output) {
			arr[k] = j;
			k++;
		}
	     
	     
	
}

	
	
  }
  public static void main(String[] args) {
	
}}
