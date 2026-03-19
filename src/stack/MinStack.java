package stack;

import java.util.Stack;

public class MinStack {
	
	Stack<Integer> stack,min;
	int max = Integer.MAX_VALUE;

	public MinStack() {
		stack = new Stack<>();
		min = new Stack<>();
	}
	
	
	public void push(int x) {
		System.out.println(" Max is - "+max);
		stack.push(x);
		if(x<= max) {
			min.push(max);
			max = x;
		}
		
	}
	
	public int peek() {
		return stack.peek();
	}
	
	public void pop() {
		int peek = stack.pop();
		if(max == peek) {
			max= min.pop();
		}
	}
	
	public int getMin() {
		return max;
	}

}
