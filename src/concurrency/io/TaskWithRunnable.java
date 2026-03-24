package concurrency.io;

public class TaskWithRunnable implements Runnable{
	
	int  id;
	String name;
	
	public TaskWithRunnable(int i ,String n) {
		this.id = i;
		this.name = n;
	}
	
    @Override
    public void run() {
        System.out.println(
            "Running task - " + id +
            " | name - " + name +
            " | thread - " + Thread.currentThread().getName()
        );
    }
	
	
}
