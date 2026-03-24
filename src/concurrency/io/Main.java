package concurrency.io;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
	
	
	public static void main(String args[]) throws InterruptedException, ExecutionException {
		
		
		// simple thread executing without return value
		ThredExecutorClass c = new ThredExecutorClass(3);
		
		TaskWithRunnable t1 =  new TaskWithRunnable(1, "Akshay");
		TaskWithRunnable t2 = new TaskWithRunnable(2, "Vinay");
		TaskWithRunnable t3 = new TaskWithRunnable(3, "Athul");
		
		c.performTask(t1);
		c.performTask(t2);
		c.performTask(t3);
		
		c.shutdown();
		
		
		//for executing a task which return a value
		ExecutorService exe = Executors.newCachedThreadPool();
		
		
		SumTask s1 = new SumTask(2,5);
		SumTask s2 = new SumTask(6,10);
		
		List<SumTask> array = new  ArrayList<>();
		array.add(s1);
		array.add(s2);
		
		List<Future<Integer>> f = exe.invokeAll(array);
		
		for(Future<Integer> a: f) {
			System.out.println(a.get());
			
		}
		
		exe.shutdown();
		
		// shared state counter with multiple threads
		
		ExecutorService counterThreadPool = Executors.newFixedThreadPool(3);
		
		Counter counter = new Counter();
		
		for(int i = 0;i<3;i++) {
			counterThreadPool.submit(new CounterTask(counter));
		}
		
		counterThreadPool.shutdown();
		
		System.out.println("Final count = " + counter.getCount());
		
	}

}
