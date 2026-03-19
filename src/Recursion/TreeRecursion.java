package Recursion;

public class TreeRecursion {
	
	static void TreeRecursion(int n) {
		
		if(n>0) {
			System.out.println(" "+ n);
			
			TreeRecursion(n -1);
			
			
			TreeRecursion(n - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeRecursion.TreeRecursion(3);
	}

}
