package chap02;

import java.util.Scanner;

public class OpenChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("철수 >> ");
		String cheolsu = sc.next();
		
		System.out.print("영희 >> ");
		String yeonghee = sc.next();
		
		if(cheolsu.equals(yeonghee)) {
			System.out.println("비겼습니다.");
		}else if(cheolsu.equals("가위") && yeonghee.equals("바위")) {
			System.out.println("영희가 이겼습니다.");
		}else if(cheolsu.equals("가위") && yeonghee.equals("보")) {
			System.out.println("철수가 이겼습니다.");
		}else if(cheolsu.equals("바위") && yeonghee.equals("보")) {
			System.out.println("영희가 이겼습니다.");
		}else if(cheolsu.equals("바위") && yeonghee.equals("가위")) {
			System.out.println("철수가 이겼습니다.");
		}else if(cheolsu.equals("보") && yeonghee.equals("가위")) {
			System.out.println("영희가 이겼습니다.");
		}else if(cheolsu.equals("보") && yeonghee.equals("바위")) {
			System.out.println("영희가 이겼습니다.");
		}
		
	}

}
