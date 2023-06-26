package extraPracticeSums;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FizzBuzz {
	/*
	 * https://leetcode.com/problems/fizz-buzz/
	 */
	
	@Test
	public void example() {
		int n =3;
		System.out.println(find(n));

	}

	// Using array
	private List<String> find(int n) {
		List<String> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
               list.add("FizzBuzz");
            }else if(i%3==0){
                list.add("Fizz");
            }else if(i%5==0){
                list.add("Buzz");
            }else{
                list.add(String.valueOf(i));
            }
        }
        return list;
		
	}

}
