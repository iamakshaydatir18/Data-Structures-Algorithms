package Recursion;

public class NestedRecursion {
	
	static int NestedRecursion(int n) {
		
		if(n> 100) {
			
			return n-10;
		}
		
		return NestedRecursion(NestedRecursion(n+11));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" "+ NestedRecursion(95));

	}

}
