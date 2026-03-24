package concurrency.pessimistic.lock;

public class Seat {
	
	int seatId;
	String Status;
	
	public Seat(int seatId, String status) {
		super();
		this.seatId = seatId;
		Status = status;
	}
	
	public int getSeatId() {
		return seatId;
	}
	
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	
	public String getStatus() {
		return Status;
	}
	
	public void setStatus(String status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", Status=" + Status + "] \n";
	}
	
	
	
}
