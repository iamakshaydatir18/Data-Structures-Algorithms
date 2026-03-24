package concurrency.io;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThredExecutorClass {
	
	ExecutorService exe;
	
	public ThredExecutorClass(int thread) {
		this.exe =  Executors.newFixedThreadPool(thread);
	}
	
	public void performTask(TaskWithRunnable t) {
		
		exe.submit(t);
	}
	
	public void shutdown() {
		exe.shutdown();
	}

}
