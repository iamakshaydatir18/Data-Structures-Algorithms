package Recursion;

public class Fibonacci {
	
	public static int fibonacci(int n) {

		int a = 0;
		int b = 1;
		int sum;

		for (int i = 2; i < n; i++) {
			sum = a + b;
			a = b;
			b = sum;

		}

		return b;

	}
	
	public static int Recursive(int n) {
		
		if(n <= 1) {
			return 1;
		}
		
		return Recursive(n- 1)+Recursive(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" " + Recursive(8));
		

	}
	
	
	
	

}
