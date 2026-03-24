package concurrency.pessimistic.lock;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class BookingSystem {
	
	Theater t;
	Map<Integer,  ReentrantLock> lock;
	
	public BookingSystem() {
		t = new Theater(5);
		lock = new ConcurrentHashMap<>();
	}
	
	public List<Seat> getAvaialableSeats(){
		
		List<Seat>  seats = t.getAvailableSeat();
		
		return seats;

	}
	
	public boolean BookSeat(int i) {
		
		if(lock.get(i) == null) {
			lock.put(i ,  new ReentrantLock());
		}
		
		ReentrantLock l = lock.get(i);
		
		l.lock();
		
		try {
			
			Seat s = t.getSeat(i);
			
			if(s.Status.equals("AVAILABLE")) {
				s.setStatus("HOLD");
				return true;
			}else return false;

		}finally {
			l.unlock();
		}
		
	}
	

}
