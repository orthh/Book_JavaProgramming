package chap04_하루할일;

import java.util.Scanner;

public class MonthSchedule {
	Scanner sc = new Scanner(System.in);
	
	private int days;
	private int mode;
	private Day[] d;
	private int day;
	
	public MonthSchedule(int days) {
		this.days = days;
		d = new Day[days];
		for(int i=0; i<days; i++) {
			d[i] = new Day();
		}
	}
	
	public void toDoPrint() {
		System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
		mode = sc.nextInt();
		System.out.print("날짜(1~" + days + ")?");
		day = sc.nextInt();
	}
	
	public void input() {
		System.out.print("할일(빈칸없이입력)?");
		d[day - 1].set(sc.next());
	}
	
	public void view() {
		d[day - 1].show();
	}
	
	public void finish() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램");
		while(true) {
			toDoPrint();
			if(mode == 1) {
				input();
			}else if(mode == 2) {
				view();
			}else if(mode == 3) {
				finish();
				break;
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	

	
	

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
		

	}

}
