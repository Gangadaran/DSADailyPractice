package Day3;

import org.junit.Test;

public class PowerOfTwo {
    @Test // Positive
	public void example() {
		int num = 1000;
      System.out.println(powerOfTwo(num));
	}
    
    @Test // Edge
	public void example1() {
		int num = -56;
      System.out.println(powerOfTwo(num));
	}
    @Test // Negative
	public void example2() {
		int num = -33 ;
      System.out.println(powerOfTwo(num));
	}

	private boolean powerOfTwo(int num) {
		 if(num ==1) {
			 return true;
		 }
		 
		 if(num%2==0) {
			 return true;
		 }
		return false;
	}
	
}
