package Recursion;

public class factorial {

	 static int fact(int n) {
		 
		 if(n>0) {
			 return n*fact(n-1);
		 }
		 return 1;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("factorial of number is - "+fact(5));
	}

}
