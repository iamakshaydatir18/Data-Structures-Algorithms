package concurrency.io;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	
	//int count = 0;
	AtomicInteger count = new AtomicInteger(0);
	
	public void increment() {

		//this.count++;
		this.count.getAndIncrement();
	}
	
	public int getCount() {
		return this.count.get();
	}

}
