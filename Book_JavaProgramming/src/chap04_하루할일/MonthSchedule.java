package chap04_하루할일;

import java.util.Scanner;

public class MonthSchedule {
	
	private int days;
	private int mode;
	private Day[] d;
	
	public MonthSchedule(int days) {
		this.days = days;
		d = new Day[days];
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);	
		System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
		mode = sc.nextInt();
		
	}
	
	public void view() {
		
	}
	
	public void finish() {
		
	}
	
	public void run() {
		
	}
	
	
	
	
	
	
	
	
	
	

	
	

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
		

	}

}
