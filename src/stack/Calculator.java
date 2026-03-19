package stack;

import java.util.Stack;

public class Calculator {
	
	private static int opration(String s) {
		int curr =0;
		int sign =1;
		int ans =0;
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			
			if(Character.isDigit(s.charAt(i))) {
				
				curr = s.charAt(i) - '0';
				
				while(i+1 < s.length() && Character.isDigit(s.charAt(i+1))) {
					curr = 10 * curr + s.charAt(i+1) - '0';
					i++;
				}
				curr = curr *sign;
				ans+= curr;
				curr =0;
				
			}else if(s.charAt(i) == '+') {
				sign = 1;
			}else if(s.charAt(i) == '-') {
				sign = -1;
			}else if(s.charAt(i) == '(') {
				stack.push(ans);
				stack.push(sign);
				
				sign=1;
				ans =0;
			}else if(s.charAt(i) == ')') {
				int prevSign = stack.pop();
				ans = prevSign * ans;
				int prevAns = stack.pop();
				ans = ans +prevAns;
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		String s ="(1+(4+5+2)-3)+(6+8)";
		
		System.out.println(" result is "+Calculator.opration(s));
	}


}
