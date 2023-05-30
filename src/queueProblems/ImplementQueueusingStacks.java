package queueProblems;

import java.util.Stack;

public class ImplementQueueusingStacks {
	/*
	 * https://leetcode.com/problems/implement-queue-using-stacks/
	 */
	/*
	 * void push(int x) Pushes element x to the back of the queue. int pop() Removes
	 * the element from the front of the queue and returns it. int peek() Returns
	 * the element at the front of the queue. boolean empty() Returns true if the
	 * queue is empty, false otherwise.
	 */
	
	
	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();
	
	 public MyQueue() {
	        
	    }
	    
	    public void push(int x) {
	    	while (!stack1.isEmpty()) {
			   stack2.push(stack1.pop());
			}
	    	stack1.push(x);
	    	while (!stack2.isEmpty()) {
				stack1.push(stack2.pop());
			}
	    	
	        
	    }
	    
	    public int pop() {
	        
	    }
	    
	    public int peek() {
	        
	    }
	    
	    public boolean empty() {
	        
	    }

}
