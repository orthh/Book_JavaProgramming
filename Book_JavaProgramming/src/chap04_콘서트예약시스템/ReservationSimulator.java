package chap04_콘서트예약시스템;

public class ReservationSimulator {
	
	SeatTable st;
	
	public ReservationSimulator(int s, int a, int b) {
		st = new SeatTable(s,a,b);
	}

	public void run() {
		System.out.println("명품 콘서트홀 예약 시스템입니다.");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		ReservationSimulator rs = new ReservationSimulator(10,10,10);
		rs.run();

	}

}
