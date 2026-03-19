package stack;

public class main {

	public static void main(String[] args) {
		/*
		 * Arraystack s = new Arraystack();
		 * 
		 * s.push(30); s.push(45); s.push(56); s.push(67); s.print();
		 * 
		 * int peek = s.peek(); System.out.println("peek element is - "+peek);
		 * 
		 * s.pop(); s.pop(); s.print();
		 */
		
		
		LinkListStack s = new LinkListStack();
		
		s.push(45);
		s.push(67);
		s.push(2);
		s.push(5);
		
		s.print();
		
		int peek = s.peek();
		System.out.println("peek element is - "+peek);
		
		s.pop();
		s.pop();
		peek = s.peek();
		System.out.println("peek element is - "+peek);
		
		
		s.print();
	}

}
