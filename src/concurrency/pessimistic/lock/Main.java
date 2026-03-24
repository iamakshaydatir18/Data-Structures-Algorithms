package concurrency.pessimistic.lock;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		
		BookingSystem b = new BookingSystem();
		
		List<Seat> availableSeats = b.getAvaialableSeats();
		
		System.out.println(availableSeats.toString());
		
		ExecutorService exe = Executors.newFixedThreadPool(5);
		
		
		System.out.println("Booking same seat with 3 threads...");
		
		for(int i = 0;i<3;i++) {
			exe.submit(() ->{
				
				boolean result = b.BookSeat(1);
				System.out.println("Booking seat - 1 by Thread - "+ Thread.currentThread().getName()+" return is - "+ result);
				
			}
			);
		}
		
		exe.shutdown();

	}

}
