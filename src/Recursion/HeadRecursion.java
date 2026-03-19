package Recursion;

public class HeadRecursion {
	
	static void Headresursion(int n) {
		
		 if(n> 0) {
			 
			 Headresursion(n -1);
			 
			 System.out.println(" "+n);
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HeadRecursion.Headresursion(5);

	}

}
