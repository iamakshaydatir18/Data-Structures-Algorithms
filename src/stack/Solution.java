package stack;

import java.util.Stack;

class Solution {
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int smallleft[] = new int[n];
        int smallright[] = new int[n];
        Stack<Integer> s = new Stack<>();
       

        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                smallleft[i] = -1;
            }
            else{
                smallleft[i] = s.peek();
            }

            s.push(i);
        }
        //stack print
        System.out.println("Stack for before small Left");
        for(int a:s) {
        	System.out.println(" "+a);
        }
        //smallLeftprint
        System.out.println("small left array ");
        for(int a:smallleft) {
        	System.out.println(" "+a);
        }
        
        s = new Stack<>();
        for(int i=heights.length-1; i>=0; i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                smallright[i] = heights.length;
            }
            else{
                smallright[i] = s.peek();
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
        for(int a:smallright) {
        	System.out.println(" "+a);
        }
        int largeRectangle = 0;
        for(int i=0; i<heights.length; i++){
            int height = heights[i];
            int width = smallright[i] -smallleft[i]-1;
            int currRectangle = height * width;
            largeRectangle = Math.max(currRectangle, largeRectangle);
        }

        return largeRectangle;


    }
    
    public static void main(String[] args) {
    	int[] heights = {2,1,5,6,2,3};
    	System.out.println("Height Length is - "+heights.length);
        System.out.println("Largest rectangle is "+Solution.largestRectangleArea(heights));
    }
}