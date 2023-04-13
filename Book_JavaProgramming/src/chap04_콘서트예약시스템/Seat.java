package chap04_콘서트예약시스템;

public class Seat {
	
	private String status;

	public String getStatus() {
		if(status == null) {
			return "--- ";
		}
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
