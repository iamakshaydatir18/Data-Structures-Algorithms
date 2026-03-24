package concurrency.volatileExample;

class Worker implements Runnable {

    //private boolean running = true;
    private volatile boolean running = true;

    public void run() {
        while (running) {
        	
        	System.out.println("running...");
        }
        System.out.println("Stopped");
    }

    public void stop() {
        running = false;
    }
}

