package concurrency.volatileExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	
	public static void main(String args[]) {
		
		ExecutorService exe = Executors.newFixedThreadPool(3);
		
		Worker w = new Worker();
		
		exe.submit(w);
		
		System.out.println("Stopping....");
		w.stop();
		
		//exe.shutdown();
		
	}

}


