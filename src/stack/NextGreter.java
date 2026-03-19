package stack;

import java.util.Stack;

public class NextGreter {
	
	public static int[] NextGreaterElelemet(int[] heights) {
		
		int[] nextArray = new int[heights.length];
		Stack<Integer> s = new Stack<>();
		for(int i=(heights.length)-1;i>=0;i--){
			
			while(!s.isEmpty() && heights[s.peek()] >= heights[i]) {
				s.pop();
			}
			
			if(s.isEmpty()) {
				nextArray[i] = - 1;
			}else
			{
				nextArray[i] = s.peek();
			}
			
			s.push(i);
		}
		
		  //stack print
        System.out.println("Stack for before small right");
        for(int a:s) {
        	System.out.println(" "+a);
        }
        //smallLeftprint
        System.out.println("small right array ");
        for(int a:nextArray) {
        	System.out.println(" "+a);
        }
		
		return heights;
		
	}

	 public static void main(String[] args) {
	    	int[] heights = {2,1,5,6,2,3};
	    	//System.out.println("Height Length is - "+heights.length);
	        System.out.println("Largest rectangle is "+NextGreter.NextGreaterElelemet(heights));
	    }

}
