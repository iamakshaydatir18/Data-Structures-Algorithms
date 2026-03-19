package LinkList;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

import stack.MinStack;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * LinkList s = new LinkList(); s.push(30);
		 * 
		 * s.push(40); s.push(3); s.push(8);
		 * 
		 * s.print();
		 * 
		 * s.delete(3); s.delete(30);
		 * 
		 * s.print();
		 */
		 
		
		/*
		 * PalidromeLinkedList ls = new PalidromeLinkedList(); ls.push(1); ls.push(2);
		 * ls.push(3); ls.push(4); //ls.push(5);
		 * 
		 * ls.print();
		 * 
		 * ls.reorderList();
		 * 
		 * ls.print();
		 * 
		 * HashSet<Character> s = new HashSet<>(); s.contains('S');
		 * 
		 * 
		 * int a = Integer.MIN_VALUE;
		 */
		
		
		MinStack ms = new MinStack();
		ms.push(0);
		ms.push(-4);
		ms.push(8);
		ms.push(-10);
		  
		System.out.println("peek is - "+ms.peek());
		
		System.out.println("Minimum is - "+ ms.getMin());
		
		ms.pop();
		ms.pop();
		System.out.println("Minimum is - "+ ms.getMin());
		
	}

}
