package concurrency.pessimistic.lock;

import java.util.ArrayList;
import java.util.List;

public class Theater {
	
	List<Seat> list = new ArrayList<>();
	
	public Theater(int n) {
		
		for(int i = 0;i<n;i++) {
			list.add(new Seat(i, "AVAILABLE"));
		}
	}
	
	public Seat getSeat(int id) {
		
		return list.stream()
			    .filter(s -> s.getSeatId() == (id))
			    .findFirst()
			    .orElse(null);
	}
	
	public List<Seat> getAvailableSeat(){
		return list.stream().filter( s-> s.Status.equals("AVAILABLE")).toList();
	}

}
