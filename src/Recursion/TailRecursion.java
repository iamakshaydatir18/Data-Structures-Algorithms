package Recursion;

public class TailRecursion {
	
	
	static void tailRecursion(int n) {
		
		if(n > 0) {
			System.out.println(" "+n);
			
			tailRecursion(n - 1);
		}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		TailRecursion.tailRecursion(5);
	}

}
