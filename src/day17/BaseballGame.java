package day17;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

public class BaseballGame {
	/*
	 * 682. Baseball Game
	 * https://leetcode.com/problems/baseball-game/
	 */
	
	@Test
	public void example() {
	String[] ops = {"5","2","C","D","+"};
	System.out.println(calPoints(ops));

	}

	private int calPoints(String[] ops) {
		Stack<Integer> record = new Stack<>();
		int sum =0;
		for (int i = 0; i < ops.length; i++) {
			if(ops[i].equals("C") && !record.empty()) {
				record.pop();
			} else if(ops[i].equals("D") && !record.empty()) {
				
				record.push(2*record.peek());
			} else if(ops[i].equals("+") && !record.empty()) {
				int temp = record.pop();
				int temp1 = temp + record.peek();
				record.push(temp);
				record.push(temp1);
			}else {
				record.push(Integer.parseInt(ops[i]));
			}
		}
		
		for (Integer out : record) {
			sum +=out;
		}
		
		return sum;
		
	}
	
	private int calPoints1(String[] ops) {
		 List<Integer> list = new ArrayList<>();
		    int sum = 0;
		       for (int i = 0; i < ops.length; i++) {
		        if (ops[i].equals("C") && !list.isEmpty()) {
		            list.remove(list.size()-1);
		        } else if (ops[i].equals("D") && !list.isEmpty()) {
		            list.add(2 * list.get(list.size()-1));
		        } else if (ops[i].equals("+") && list.size() >= 2) {
		            
		            list.add(list.get(list.size()-1) + list.get(list.size()-2));
		        } else {
		            try {
		                list.add(Integer.parseInt(ops[i]));
		            } catch (NumberFormatException e) {
		                // Invalid input, ignore it
		            }
		        }
		         }

		    for (int score : list) {
		        sum += score;
		    }
		    return sum;

	}

}
