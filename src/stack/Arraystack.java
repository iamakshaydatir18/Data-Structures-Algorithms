package stack;

public class Arraystack {
		
	static final int MAX = 1000;
	int top;
	int[] a = new int[MAX];
	
	Arraystack()
	{
		top = -1;
	}
	
	boolean isEmpty()
	{
		return (top < 0);
	}
	
	void push(int x)
	{
		if(top >= (MAX-1)) {
			System.out.println("Stack is Overflow!!!!!");
		}
		else {
			a[++top] = x;
			System.out.println("Element added to stack is -"+x);
		}
	}
	
	int pop()
	{
		if(top < 0 )
		{
			System.out.println("stack is empty");
			return 0;
		}
		else
		{
			int x = a[top--];
			return x;
		}
	}
	
	int peek() {
		
		if(top < 0)
		{
			System.out.println("stack is underflow!!!!!!");
			return 0;
		}
		else
		{
			return a[top];
		}
	}
	
	void print()
	{
		for(int i=top;i>-1; i--)
		{
			System.out.println(" "+a[i]);
		}
	}
	
	/*
	 * public static void main(String[] args) { System.out.println("hello Akshay");
	 * }
	 */
}
