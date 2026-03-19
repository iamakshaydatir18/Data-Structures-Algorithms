package stack;

import java.util.Stack;

public class PrevGreater {
	
	private static String PrevGreaterElement(int[] heights) {
		
		int[] prevGreater = new int[heights.length];
		Stack<Integer> s = new Stack<>();
		
		for(int i=0;i<heights.length;i++) {
			
			while(!s.isEmpty() && heights[s.peek()] <= heights[i] ) {
				s.pop();
			}
			
			if(s.isEmpty()) {
				prevGreater[i] = -1;
			}else {
				prevGreater[i] = s.peek();
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
        for(int a:prevGreater) {
        	System.out.println(" "+a);
        }
		
		
		return null;
	}

	public static void main(String[] args) {
    	int[] heights = {2,1,5,6,2,3};
    	//System.out.println("Height Length is - "+heights.length);
        System.out.println("Largest rectangle is "+PrevGreater.PrevGreaterElement(heights));
    }

	
}
