package concurrency.io;

import java.util.concurrent.Callable;

public interface Task extends Runnable, Callable<Integer>{

}
