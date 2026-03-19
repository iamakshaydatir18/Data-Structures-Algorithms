package queue;

import java.util.LinkedList;
import java.util.Queue;

public class MonotonicQueue {
         
     
     static void Monotonic(int[] array, int l) {
    	 LinkedList<Integer> q = new LinkedList<>();
    	 
    	 for(int i=0;i<l;i++) {
    		 
    		 while(!q.isEmpty() && q.getLast() < array[i]) {
    			 q.removeLast();
    		 }
    		 
    		 q.addLast(array[i]);
    	 }

    	 System.out.println(" queue after operations");
    	 while(!q.isEmpty()) {
    		 System.out.println(" "+q.poll());
    	 }
    	 
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {9,7,5,3,2,1};
		
		MonotonicQueue.Monotonic(array, array.length);
	}

}
