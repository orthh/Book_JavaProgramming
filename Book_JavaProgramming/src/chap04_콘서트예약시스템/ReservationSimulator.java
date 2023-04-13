package chap04_콘서트예약시스템;

import java.util.Scanner;

public class ReservationSimulator {
	Scanner sc = new Scanner(System.in);
	
	SeatTable st;
	
	public ReservationSimulator(int s, int a, int b) {
		st = new SeatTable(s,a,b);
	}
	
	public void reservationView() {
		System.out.print("좌석구분 s, a, b>>");
		String selectedSeatDivision = sc.next();
		System.out.println(st.getSeatTable(selectedSeatDivision));
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("번호 >> ");
		int num = sc.nextInt();
		
		st.setSeatTable(selectedSeatDivision, name, num);
	}
	
	public void checkSeatView() {
		System.out.println(st.getSeatTable("s"));
		System.out.println(st.getSeatTable("a"));
		System.out.println(st.getSeatTable("b"));
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	
	public void cancelView() {
		System.out.print("좌석 s, a, b>>");
		String selectedSeatDivision = sc.next();
		System.out.println(st.getSeatTable(selectedSeatDivision));
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.println(st.calcelSeatTable(selectedSeatDivision, name));
	}
	
	public void run() {
		System.out.println("명품 콘서트홀 예약 시스템입니다.");
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
			int mode = sc.nextInt();
			if(mode == 1) {
				reservationView();
			}else if(mode == 2) {
				checkSeatView();
			}else if(mode == 3){
				cancelView();
			}else if(mode == 4){
				System.out.println("종료합니다.");
				break;
			}
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		ReservationSimulator rs = new ReservationSimulator(10,10,10);
		rs.run();

	}

}
