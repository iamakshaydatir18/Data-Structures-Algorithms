package concurrency.io;

import java.util.concurrent.Callable;

public class SumTask implements Callable<Integer>{
	
	int a;
	int b;
	
	public SumTask(int a, int b){
		this.a = a;
		this.b = b;
		
	}
	
	@Override
	public Integer call() {
		
		System.out.println("executing - "+ this.a + " + "+ this.b);
		return a + b;
	}

}
