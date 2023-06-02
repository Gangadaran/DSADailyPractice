package assessmentProblems;

import java.util.Arrays;

import org.junit.Test;

public class MergeTwoArrays {
	@Test
	public void example() {
		int[] a = {1, 2, 3};
		int[] b = {2, 5, 5};
		System.out.println(Arrays.toString(merge(a,b)));


	}

	private int[] merge(int[] a, int[] b) {
		int left =0, right =0;
		int k =0;
		int[] temp = new int[a.length+b.length];
		while(left < a.length && right < b.length) {
			if (a[left] <= b[right]) {
				temp[k++] = a[left++];
				
				
			}else {
				temp[k++] = b[right++];
				
			}
		}
		
		while(left < a.length) {
			temp[k++] = a[left++];
		}
		while(right < b.length) {
			temp[k++] = b[right++];
		}
		
		return temp;
	}

}
